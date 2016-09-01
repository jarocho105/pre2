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

import com.bydan.erp.nomina.util.ReligionConstantesFunciones;
import com.bydan.erp.nomina.util.ReligionParameterReturnGeneral;
//import com.bydan.erp.nomina.util.ReligionParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.ReligionBean;
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
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ReligionBeanSwingJInternalFrame extends ReligionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ReligionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Religion> religionValidator = new ClassValidator<Religion>(Religion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Religion religion;	
	public Religion religionAux;
	public Religion religionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Religion religionTotales;
	public Long idReligionActual;
	public Long iIdNuevoReligion=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosEmpleado=false;

	public Boolean getIsTienePermisosEmpleado() {
		return isTienePermisosEmpleado;
	}

	public void setIsTienePermisosEmpleado(Boolean isTienePermisosEmpleado) {
		this.isTienePermisosEmpleado= isTienePermisosEmpleado;
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
	
	public Boolean isPermisoTodoReligion;
	public Boolean isPermisoNuevoReligion;
	public Boolean isPermisoActualizarReligion;
	public Boolean isPermisoActualizarOriginalReligion;
	public Boolean isPermisoEliminarReligion;
	public Boolean isPermisoGuardarCambiosReligion;
	public Boolean isPermisoConsultaReligion;
	public Boolean isPermisoBusquedaReligion;
	public Boolean isPermisoReporteReligion;
	public Boolean isPermisoPaginacionMedioReligion;
	public Boolean isPermisoPaginacionAltoReligion;
	public Boolean isPermisoPaginacionTodoReligion;
	public Boolean isPermisoCopiarReligion;
	public Boolean isPermisoVerFormReligion;
	public Boolean isPermisoDuplicarReligion;
	public Boolean isPermisoOrdenReligion;
	
	
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
	
	public ReligionParameterReturnGeneral religionReturnGeneral;
	public ReligionParameterReturnGeneral religionParameterGeneral;
	
	

	public EmpleadoLogic empleadoLogic=null;

	public EmpleadoLogic getEmpleadoLogic() {
		return empleadoLogic;
	}

	public void setEmpleadoLogic(EmpleadoLogic empleadoLogic) {
		this.empleadoLogic = empleadoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoReligion=false;
	public Boolean esParaAccionDesdeFormularioReligion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ReligionSessionBeanAdditional religionSessionBeanAdditional=null;
	
	public ReligionSessionBeanAdditional getReligionSessionBeanAdditional() {
		return this.religionSessionBeanAdditional;
	}
	
	public void setReligionSessionBeanAdditional(ReligionSessionBeanAdditional religionSessionBeanAdditional) {
		try {
			this.religionSessionBeanAdditional=religionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ReligionBeanSwingJInternalFrameAdditional religionBeanSwingJInternalFrameAdditional=null;
	//public class ReligionBeanSwingJInternalFrame
	
	public ReligionBeanSwingJInternalFrameAdditional getReligionBeanSwingJInternalFrameAdditional() {
		return this.religionBeanSwingJInternalFrameAdditional;
	}
	
	public void setReligionBeanSwingJInternalFrameAdditional(ReligionBeanSwingJInternalFrameAdditional religionBeanSwingJInternalFrameAdditional) {
		try {
			this.religionBeanSwingJInternalFrameAdditional=religionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ReligionLogic religionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Religion religionBean;
	public ReligionConstantesFunciones religionConstantesFunciones;
	//public ReligionParameterReturnGeneral religionReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<Religion> religions;	
	//public List<Religion> religionsEliminados;
	//public List<Religion> religionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoReligion=false;
	public Boolean isVisibilidadCeldaDuplicarReligion=true;
	public Boolean isVisibilidadCeldaCopiarReligion=true;
	public Boolean isVisibilidadCeldaVerFormReligion=true;
	public Boolean isVisibilidadCeldaOrdenReligion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesReligion=false;
	public Boolean isVisibilidadCeldaModificarReligion=false;
	public Boolean isVisibilidadCeldaActualizarReligion=false;
	public Boolean isVisibilidadCeldaEliminarReligion=false;
	public Boolean isVisibilidadCeldaCancelarReligion=false;
	public Boolean isVisibilidadCeldaGuardarReligion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosReligion=false;	
	
	
	
	public Long getiIdNuevoReligion() {
		return this.iIdNuevoReligion;
	}

	public void setiIdNuevoReligion(Long iIdNuevoReligion) {
		this.iIdNuevoReligion = iIdNuevoReligion;
	}
	
	public Long getidReligionActual() {
		return this.idReligionActual;
	}

	public void setidReligionActual(Long idReligionActual) {
		this.idReligionActual = idReligionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Religion getreligion() {
		return this.religion;
	}

	public void setreligion(Religion religion) {
		this.religion = religion;
	}
	
	public Religion getreligionAux() {
		return this.religionAux;
	}

	public void setreligionAux(Religion religionAux) {
		this.religionAux = religionAux;
	}				
	
	public Religion getreligionAnterior() {
		return this.religionAnterior;
	}

	public void setreligionAnterior(Religion religionAnterior) {
		this.religionAnterior = religionAnterior;
	}	
	
	public Religion getreligionTotales() {
		return this.religionTotales;
	}

	public void setreligionTotales(Religion religionTotales) {
		this.religionTotales = religionTotales;
	}	
	
	public Religion getreligionBean() {
		return this.religionBean;
	}

	public void setreligionBean(Religion religionBean) {
		this.religionBean = religionBean;
	}	
	
	public ReligionParameterReturnGeneral getreligionReturnGeneral() {
		return this.religionReturnGeneral;
	}

	public void setreligionReturnGeneral(ReligionParameterReturnGeneral religionReturnGeneral) {
		this.religionReturnGeneral = religionReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ReligionLogic getReligionLogic()	{		
		return religionLogic;
	}

	public void setReligionLogic(ReligionLogic religionLogic) {
		this.religionLogic = religionLogic;
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
	
	public Boolean getIsEsNuevoReligion() {
		return isEsNuevoReligion;
	}

	public void setIsEsNuevoReligion(Boolean isEsNuevoReligion) {
		this.isEsNuevoReligion = isEsNuevoReligion;
	}

	public Boolean getEsParaAccionDesdeFormularioReligion() {
		return esParaAccionDesdeFormularioReligion;
	}
	
	public void setEsParaAccionDesdeFormularioReligion(Boolean esParaAccionDesdeFormularioReligion) {
		this.esParaAccionDesdeFormularioReligion = esParaAccionDesdeFormularioReligion;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesReligion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ReligionConstantesFunciones.refrescarForeignKeysDescripcionesReligion(this.religionLogic.getReligions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ReligionConstantesFunciones.refrescarForeignKeysDescripcionesReligion(this.religions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//religionLogic.setReligions(this.religions);
			religionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ReligionParameterReturnGeneral getReligionParameterGeneral() {
		return this.religionParameterGeneral;
	}
	
	public void setReligionParameterGeneral(ReligionParameterReturnGeneral religionParameterGeneral) {
		this.religionParameterGeneral = religionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoReligion() {
		return isPermisoTodoReligion;
	}

	public void setIsPermisoTodoReligion(Boolean isPermisoTodoReligion) {
		this.isPermisoTodoReligion = isPermisoTodoReligion;
	}

	public Boolean getIsPermisoNuevoReligion() {
		return isPermisoNuevoReligion;
	}

	public void setIsPermisoNuevoReligion(Boolean isPermisoNuevoReligion) {
		this.isPermisoNuevoReligion = isPermisoNuevoReligion;
	}

	public Boolean getIsPermisoActualizarReligion() {
		return isPermisoActualizarReligion;
	}

	public void setIsPermisoActualizarReligion(Boolean isPermisoActualizarReligion) {
		this.isPermisoActualizarReligion = isPermisoActualizarReligion;
	}

	public Boolean getIsPermisoEliminarReligion() {
		return isPermisoEliminarReligion;
	}

	public void setIsPermisoEliminarReligion(Boolean isPermisoEliminarReligion) {
		this.isPermisoEliminarReligion = isPermisoEliminarReligion;
	}

	public Boolean getIsPermisoGuardarCambiosReligion() {
		return isPermisoGuardarCambiosReligion;
	}

	public void setIsPermisoGuardarCambiosReligion(Boolean isPermisoGuardarCambiosReligion) {
		this.isPermisoGuardarCambiosReligion = isPermisoGuardarCambiosReligion;
	}
	
	public Boolean getIsPermisoConsultaReligion() {
		return isPermisoConsultaReligion;
	}

	public void setIsPermisoConsultaReligion(Boolean isPermisoConsultaReligion) {
		this.isPermisoConsultaReligion = isPermisoConsultaReligion;
	}

	public Boolean getIsPermisoBusquedaReligion() {
		return isPermisoBusquedaReligion;
	}

	public void setIsPermisoBusquedaReligion(Boolean isPermisoBusquedaReligion) {
		this.isPermisoBusquedaReligion = isPermisoBusquedaReligion;
	}

	public Boolean getIsPermisoReporteReligion() {
		return isPermisoReporteReligion;
	}

	public void setIsPermisoReporteReligion(Boolean isPermisoReporteReligion) {
		this.isPermisoReporteReligion = isPermisoReporteReligion;
	}
	
	public Boolean getIsPermisoPaginacionMedioReligion() {
		return isPermisoPaginacionMedioReligion;
	}

	public void setIsPermisoPaginacionMedioReligion(Boolean isPermisoPaginacionMedioReligion) {
		this.isPermisoPaginacionMedioReligion = isPermisoPaginacionMedioReligion;
	}
	
	public Boolean getIsPermisoPaginacionTodoReligion() {
		return isPermisoPaginacionTodoReligion;
	}

	public void setIsPermisoPaginacionTodoReligion(Boolean isPermisoPaginacionTodoReligion) {
		this.isPermisoPaginacionTodoReligion = isPermisoPaginacionTodoReligion;
	}
	
	public Boolean getIsPermisoPaginacionAltoReligion() {
		return isPermisoPaginacionAltoReligion;
	}

	public void setIsPermisoPaginacionAltoReligion(Boolean isPermisoPaginacionAltoReligion) {
		this.isPermisoPaginacionAltoReligion = isPermisoPaginacionAltoReligion;
	}
	
	public Boolean getIsPermisoCopiarReligion() {
		return isPermisoCopiarReligion;
	}

	public void setIsPermisoCopiarReligion(Boolean isPermisoCopiarReligion) {
		this.isPermisoCopiarReligion = isPermisoCopiarReligion;
	}
	
	public Boolean getIsPermisoVerFormReligion() {
		return isPermisoVerFormReligion;
	}

	public void setIsPermisoVerFormReligion(Boolean isPermisoVerFormReligion) {
		this.isPermisoVerFormReligion = isPermisoVerFormReligion;
	}
	
	public Boolean getIsPermisoDuplicarReligion() {
		return isPermisoDuplicarReligion;
	}

	public void setIsPermisoDuplicarReligion(Boolean isPermisoDuplicarReligion) {
		this.isPermisoDuplicarReligion = isPermisoDuplicarReligion;
	}
	
	public Boolean getIsPermisoOrdenReligion() {
		return isPermisoOrdenReligion;
	}

	public void setIsPermisoOrdenReligion(Boolean isPermisoOrdenReligion) {
		this.isPermisoOrdenReligion = isPermisoOrdenReligion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoReligion() {
		return isVisibilidadCeldaNuevoReligion;
	}

	public void setIsVisibilidadCeldaNuevoReligion(Boolean isVisibilidadCeldaNuevoReligion) {
		this.isVisibilidadCeldaNuevoReligion = isVisibilidadCeldaNuevoReligion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarReligion() {
		return isVisibilidadCeldaDuplicarReligion;
	}

	public void setIsVisibilidadCeldaDuplicarReligion(Boolean isVisibilidadCeldaDuplicarReligion) {
		this.isVisibilidadCeldaDuplicarReligion = isVisibilidadCeldaDuplicarReligion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarReligion() {
		return isVisibilidadCeldaCopiarReligion;
	}

	public void setIsVisibilidadCeldaCopiarReligion(Boolean isVisibilidadCeldaCopiarReligion) {
		this.isVisibilidadCeldaCopiarReligion = isVisibilidadCeldaCopiarReligion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormReligion() {
		return isVisibilidadCeldaVerFormReligion;
	}

	public void setIsVisibilidadCeldaVerFormReligion(Boolean isVisibilidadCeldaVerFormReligion) {
		this.isVisibilidadCeldaVerFormReligion = isVisibilidadCeldaVerFormReligion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenReligion() {
		return isVisibilidadCeldaOrdenReligion;
	}

	public void setIsVisibilidadCeldaOrdenReligion(Boolean isVisibilidadCeldaOrdenReligion) {
		this.isVisibilidadCeldaOrdenReligion = isVisibilidadCeldaOrdenReligion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesReligion() {
		return isVisibilidadCeldaNuevoRelacionesReligion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesReligion(Boolean isVisibilidadCeldaNuevoRelacionesReligion) {
		this.isVisibilidadCeldaNuevoRelacionesReligion = isVisibilidadCeldaNuevoRelacionesReligion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarReligion() {
		return isVisibilidadCeldaModificarReligion;
	}

	public void setIsVisibilidadCeldaModificarReligion(Boolean isVisibilidadCeldaModificarReligion) {
		this.isVisibilidadCeldaModificarReligion = isVisibilidadCeldaModificarReligion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarReligion() {
		return isVisibilidadCeldaActualizarReligion;
	}

	public void setIsVisibilidadCeldaActualizarReligion(Boolean isVisibilidadCeldaActualizarReligion) {
		this.isVisibilidadCeldaActualizarReligion = isVisibilidadCeldaActualizarReligion;
	}

	public Boolean getIsVisibilidadCeldaEliminarReligion() {
		return isVisibilidadCeldaEliminarReligion;
	}

	public void setIsVisibilidadCeldaEliminarReligion(Boolean isVisibilidadCeldaEliminarReligion) {
		this.isVisibilidadCeldaEliminarReligion = isVisibilidadCeldaEliminarReligion;
	}

	public Boolean getIsVisibilidadCeldaCancelarReligion() {
		return isVisibilidadCeldaCancelarReligion;
	}

	public void setIsVisibilidadCeldaCancelarReligion(Boolean isVisibilidadCeldaCancelarReligion) {
		this.isVisibilidadCeldaCancelarReligion = isVisibilidadCeldaCancelarReligion;
	}

	public Boolean getIsVisibilidadCeldaGuardarReligion() {
		return isVisibilidadCeldaGuardarReligion;
	}

	public void setIsVisibilidadCeldaGuardarReligion(Boolean isVisibilidadCeldaGuardarReligion) {
		this.isVisibilidadCeldaGuardarReligion = isVisibilidadCeldaGuardarReligion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosReligion() {
		return isVisibilidadCeldaGuardarCambiosReligion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosReligion(Boolean isVisibilidadCeldaGuardarCambiosReligion) {
		this.isVisibilidadCeldaGuardarCambiosReligion = isVisibilidadCeldaGuardarCambiosReligion;
	}
		
	public ReligionSessionBean getreligionSessionBean() {
		return this.religionSessionBean;
	}
	
	public void setreligionSessionBean(ReligionSessionBean religionSessionBean) {
		this.religionSessionBean=religionSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysReligion(Religion religion)throws Exception {
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
	
	public void bugActualizarReferenciaActual(Religion religion,Religion religionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalReligion(religion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		religionAux.setId(religion.getId());
		religionAux.setVersionRow(religion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessReligion();
		
			int intSelectedRow = this.jTableDatosReligion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.religion =(Religion) this.religionLogic.getReligions().toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.religion =(Religion) this.religions.toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ReligionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualReligion(this.religion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysReligion(this.religion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = religionValidator.getInvalidValues(this.religion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			religionLogic.setDatosCliente(datosCliente);
			religionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				religionAux=new  Religion();
				
				religionAux.setIsNew(true);
				religionAux.setIsChanged(true);
				
				religionAux.setReligionOriginal(this.religion);
				
				religionAux.setId(this.religion.getId());	
				religionAux.setVersionRow(this.religion.getVersionRow());	
				religionAux.setcodigo(this.religion.getcodigo());	
				religionAux.setnombre(this.religion.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.religionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.religionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(religionAux,religionLogic.getReligions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(religionAux,religions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.religionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.religionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						religionLogic.saveReligions();//WithConnection
						//religionLogic.getSetVersionRowReligions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.religion,religionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.religionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados().addAll(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleados.addAll(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleadosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.religionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								religionLogic.saveReligionRelaciones(religionAux,this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());//WithConnection
								//religionLogic.getSetVersionRowReligions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.religion,religionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(new ArrayList<Empleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleados= new ArrayList<Empleado>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							religionAux.setEmpleados(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.religionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.religionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(religionAux,religionLogic.getReligions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(religionAux,religions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.religion,religionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				religionAux=new  Religion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.religionSessionBean.getEsGuardarRelacionado() 
					|| (this.religionSessionBean.getEsGuardarRelacionado() && this.religion.getId()>=0)) {
						
					religionAux.setIsNew(false);
				}
				
				religionAux.setIsDeleted(false);
			
				religionAux.setId(this.religion.getId());	
				religionAux.setVersionRow(this.religion.getVersionRow());	
				religionAux.setcodigo(this.religion.getcodigo());	
				religionAux.setnombre(this.religion.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(religionAux,religionLogic.getReligions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(religionAux,religions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.religionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.religionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						religionLogic.saveReligions();//WithConnection
						//religionLogic.getSetVersionRowReligions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.religion,religionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.religionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados().addAll(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleados.addAll(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleadosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.religionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								religionLogic.saveReligionRelaciones(religionAux,this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());//WithConnection
								//religionLogic.getSetVersionRowReligions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.religion,religionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(new ArrayList<Empleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleados= new ArrayList<Empleado>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							religionAux.setEmpleados(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.religionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.religionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(religionAux,religionLogic.getReligions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(religionAux,religions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.religion,religionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				religionAux=new  Religion();
				
				religionAux.setIsNew(false);
				religionAux.setIsChanged(false);
				
				religionAux.setIsDeleted(true);
				
				religionAux.setId(this.religion.getId());	
				religionAux.setVersionRow(this.religion.getVersionRow());	
				religionAux.setcodigo(this.religion.getcodigo());	
				religionAux.setnombre(this.religion.getnombre());	
				
				if(this.religionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.religionAux.getId()>=0) {	
						this.religionsEliminados.add(religionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(religionAux,religionLogic.getReligions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(religionAux,religions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.religionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.religionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						religionLogic.saveReligions();//WithConnection
						//religionLogic.getSetVersionRowReligions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.religionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados().addAll(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleados.addAll(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleadosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.religionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								religionLogic.saveReligionRelaciones(religionAux,this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());//WithConnection
								//religionLogic.getSetVersionRowReligions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(new ArrayList<Empleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleados= new ArrayList<Empleado>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							religionAux.setEmpleados(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.religionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.religionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(religionAux,religionLogic.getReligions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(religionAux,religions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.religionLogic.getReligions().addAll(this.religionsEliminados);
					
					religionLogic.saveReligions();//WithConnection
					//religionLogic.getSetVersionRowReligions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.religionsEliminados= new ArrayList<Religion>();		
			}
			
			if(this.religionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.religionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Religion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Religion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.religion=religionAux;
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
      		//this.finishProcessReligion();
      	}
		
	}	
	
	public void actualizarRelaciones(Religion religionLocal) throws Exception {
		
		if(this.religionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				religionLocal.setEmpleados(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
			
			} else {
			
				religionLocal.setEmpleados(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleados);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Religion religionLocal) throws Exception {	
		if(this.religionSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarReligionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosReligion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.religion =(Religion) this.religionLogic.getReligions().toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.religion =(Religion) this.religions.toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = religionValidator.getInvalidValues(this.religion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Religion religion,List<Religion> religions) throws Exception {
		try	{		
			ReligionConstantesFunciones.actualizarLista(religion,religions,this.religionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Religion religion,List<Religion> religions) throws Exception {
		try	{			
			ReligionConstantesFunciones.actualizarSelectedLista(religion,religions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Religion> religionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				religionsLocal=this.religionLogic.getReligions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				religionsLocal=this.religions;
			}
			//ARCHITECTURE
		
			for(Religion religionLocal:religionsLocal) {
				if(this.permiteMantenimiento(religionLocal) && religionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ReligionConstantesFunciones.getReligionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ReligionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReligion.jLabelcodigoReligion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReligionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReligion.jLabelnombreReligion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormReligion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReligion.jLabelcodigoReligion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReligion.jLabelnombreReligion,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Empleado")) {
			if(this.religion==null) {
				this.religion= new Religion();
			}

			if(this.religionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoReligion
				this.setVariablesFormularioToObjetoActualReligion(this.religion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysReligion(this.religion);

				this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.getempleado().setReligion(this.religion);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoReligion--;	
		
		
		this.religionAux=new Religion();
		
		this.religionAux.setId(this.iIdNuevoReligion);
		this.religionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.religionLogic.getReligions().add(this.religionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.religions.add(this.religionAux);
		}
		//ARCHITECTURE
		
		this.religion=this.religionAux;
		
		if(ReligionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioReligion(this.religion);
			this.setVariablesObjetoActualToFormularioForeignKeyReligion(this.religion);
		}
				
		//this.setDefaultControlesReligion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyReligion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyReligion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyReligion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualReligion(this.religionBean,this.religion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysReligion(this.religion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ReligionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.religionSessionBean.getConGuardarRelaciones()) {
			classes=ReligionConstantesFunciones.getClassesRelationshipsOfReligion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.religionReturnGeneral=religionLogic.procesarEventosReligionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.religionLogic.getReligions(),this.religion,this.religionParameterGeneral,this.isEsNuevoReligion,classes);//this.religionLogic.getReligion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanReligion(this.religionReturnGeneral,this.religionBean,false);
		
		if(this.religionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyReligion(this.religionReturnGeneral.getReligion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioReligion(this.religionReturnGeneral.getReligion());
		}
		
		if(this.religionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioReligion(this.religionReturnGeneral.getReligion(),classes);//this.religionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualReligion(this.religion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyReligion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyReligion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ReligionBeanSwingJInternalFrameAdditional.RecargarFormReligion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingReligion(false);
						
			if(religionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado() && EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(ReligionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualReligion();
			}
			
			this.actualizarVisualTableDatosReligion();
			
			this.jTableDatosReligion.setRowSelectionInterval(this.getIndiceNuevoReligion(), this.getIndiceNuevoReligion());
			
			this.seleccionarFilaTablaReligionActual();
						
			this.actualizarEstadoCeldasBotonesReligion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesReligion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormReligion.jTextFieldcodigoReligion.setEnabled(isHabilitar && this.religionConstantesFunciones.activarcodigoReligion);
		this.jInternalFrameDetalleFormReligion.jTextAreanombreReligion.setEnabled(isHabilitar && this.religionConstantesFunciones.activarnombreReligion);	
		
	};
	
	public void setDefaultControlesReligion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoReligion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.religionSessionBean.setConGuardarRelaciones(true);			
			this.religionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormReligion.jTabbedPaneRelacionesReligion.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.religionSessionBean.setConGuardarRelaciones(false);			
			this.religionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormReligion.jTabbedPaneRelacionesReligion.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoReligion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Religion religionAux:this.religionLogic.getReligions()) {
				if(religionAux.getId().equals(this.iIdNuevoReligion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Religion religionAux:this.religions) {
				if(religionAux.getId().equals(this.iIdNuevoReligion)) {
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
	
	public int getIndiceActualReligion(Religion religion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Religion religionAux:this.religionLogic.getReligions()) {
				if(religionAux.getId().equals(religion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Religion religionAux:this.religions) {
				if(religionAux.getId().equals(religion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalReligion(Religion religionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Religion religionAux:this.religionLogic.getReligions()) {
				if(religionAux.getReligionOriginal().getId().equals(religionOriginal.getId())) {
					existe=true;
					religionOriginal.setId(religionAux.getId());
					religionOriginal.setVersionRow(religionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Religion religionAux:this.religions) {
				if(religionAux.getReligionOriginal().getId().equals(religionOriginal.getId())) {
					existe=true;
					religionOriginal.setId(religionAux.getId());
					religionOriginal.setVersionRow(religionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosReligion(Boolean esParaCancelar) throws Exception {
		religionsAux=new ArrayList<Religion>();
		religionAux=new Religion();
		
		if(!this.religionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Religion religionAux:this.religionLogic.getReligions()) {
					if(religionAux.getId()<0) {
						religionsAux.add(religionAux);
					}		
				}
				this.iIdNuevoReligion=0L;
				this.religionLogic.getReligions().removeAll(religionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Religion religionAux:this.religions) {
					if(religionAux.getId()<0) {
						religionsAux.add(religionAux);
					}		
				}
				this.iIdNuevoReligion=0L;
				this.religions.removeAll(religionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoReligion 
					&& this.religionLogic.getReligions().size()>0
					) {
					religionAux=this.religionLogic.getReligions().get(this.religionLogic.getReligions().size() - 1);
				
					if(religionAux.getId()<0) {
						this.religionLogic.getReligions().remove(religionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoReligion && this.religions.size()>0) {
					religionAux=this.religions.get(this.religions.size() - 1);
				
					if(religionAux.getId()<0) {
						this.religions.remove(religionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoReligion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(religion.getId()<0) {
				this.religionLogic.getReligions().remove(this.religion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(religion.getId()<0) {
				this.religions.remove(this.religion);
			}
		}			
	}
	
	public void setEstadosInicialesReligion(List<Religion> religionsAux) throws Exception {
		ReligionConstantesFunciones.setEstadosInicialesReligion(religionsAux);
	}
	
	public void setEstadosInicialesReligion(Religion religionAux) throws Exception {
		ReligionConstantesFunciones.setEstadosInicialesReligion(religionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarReligionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesReligion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarReligionActual()) {
				if(!this.isEsNuevoReligion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesReligion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoReligion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarReligionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Religion ?", "MANTENIMIENTO DE Religion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesReligion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Religion religion) throws Exception {
		ReligionConstantesFunciones.seleccionarAsignar(this.religion,religion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarReligion=this.isPermisoActualizarOriginalReligion;
			
			
			this.seleccionarAsignar(religion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ReligionConstantesFunciones.quitarEspaciosReligion(this.religion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesReligion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.religionSessionBean.setsFuncionBusquedaRapida(this.religionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoReligion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosReligion(esParaCancelar);				
				this.cancelarNuevoReligion(esParaCancelar);								
			}
			
			this.religion=new Religion();
			
			this.inicializarReligion();
			
			this.actualizarEstadoCeldasBotonesReligion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarReligion() throws Exception {
		try {
			ReligionConstantesFunciones.inicializarReligion(this.religion);
			
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
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.religionLogic.getReligions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteReligions(String sAccionBusqueda,List<Religion> religionsParaReportes) throws Exception {
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
					sPathReporteFinal="Religion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ReligionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ReligionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Religion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Religiones");		
		parameters.put("busquedapor", ReligionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Empleado.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					ReligionLogic religionLogicAuxiliar=new ReligionLogic();
					religionLogicAuxiliar.setDatosCliente(religionLogic.getDatosCliente());				
					religionLogicAuxiliar.setReligions(religionsParaReportes);
					
					religionLogicAuxiliar.cargarRelacionesLoteForeignKeyReligionWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					religionsParaReportes=religionLogicAuxiliar.getReligions();
					
					//religionLogic.getNewConnexionToDeep();
					
					//for (Religion religion:religionsParaReportes) {
					//	religionLogic.deepLoad(religion, false, DeepLoadType.INCLUDE, classes);
					//}						
					//religionLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//religionLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileEmpleado = AuxiliarReportes.class.getResourceAsStream("EmpleadoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_empleado", reportFileEmpleado);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceReligion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ReligionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ReligionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceReligion=new JRBeanArrayDataSource(ReligionJInternalFrame.TraerReligionBeans(religionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceReligion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ReligionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ReligionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ReligionBean.TraerReligionBeans(religionsParaReportes).toArray()));
							
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
				this.generarExcelReporteReligions(sAccionBusqueda,sTipoArchivoReporte,religionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalReligions(sAccionBusqueda,sTipoArchivoReporte,religionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoReligionActionPerformed(null);
					//this.generarExcelReporteReligions(sAccionBusqueda,sTipoArchivoReporte,religionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalReligions(sAccionBusqueda,sTipoArchivoReporte,religionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesReligions(sAccionBusqueda,sTipoArchivoReporte,religionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesReligions(sAccionBusqueda,sTipoArchivoReporte,religionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteReligions(String sAccionBusqueda,String sTipoArchivoReporte,List<Religion> religionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"religion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Religions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderReligion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Religion religion : religionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ReligionConstantesFunciones.generarExcelReporteDataReligion("NORMAL",row,workbook,religion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.religionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Religion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderReligion(String sTipo,Row row,Workbook workbook) {
		
		ReligionConstantesFunciones.generarExcelReporteHeaderReligion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalReligions(String sAccionBusqueda,String sTipoArchivoReporte,List<Religion> religionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"religion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Religions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Religion religion : religionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ReligionConstantesFunciones.getReligionDescripcion(religion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReligionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReligionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(religion.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReligionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReligionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(religion.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.religionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Religion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesReligions(String sAccionBusqueda,String sTipoArchivoReporte,List<Religion> religionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Religion> religionsRespaldo=null;
		
		classes=ReligionConstantesFunciones.getClassesRelationshipsOfReligion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.religionLogic.setDatosCliente(this.datosCliente);
		this.religionLogic.setDatosDeep(this.datosDeep);
		this.religionLogic.setIsConDeep(true);
		
		religionsRespaldo=this.religionLogic.getReligions();
		
		this.religionLogic.setReligions(religionsParaReportes);	
		this.religionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		religionsParaReportes=this.religionLogic.getReligions();
		this.religionLogic.setReligions(religionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"religion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Religions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderReligion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Religion religion : religionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderReligion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ReligionConstantesFunciones.generarExcelReporteDataReligion("NORMAL",row,workbook,religion,cellStyleDataAux);
		
			
			


				//Empleado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(EmpleadoConstantesFunciones.SCLASSWEBTITULO))) {

				if(religion.getEmpleados()!=null && religion.getEmpleados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(EmpleadoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					EmpleadoConstantesFunciones.generarExcelReporteHeaderEmpleado("RELACIONADO",row,workbook);
				}

				if(religion.getEmpleados()!=null) {
					i2=0;
					for(Empleado empleado : religion.getEmpleados()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						EmpleadoConstantesFunciones.generarExcelReporteDataEmpleado("RELACIONADO",row,workbook,empleado,cellStyleDataAuxHijo);
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
		cell.setCellValue(ReligionConstantesFunciones.getReligionDescripcion(religion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.religionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Religion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoReligion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReligion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoReligion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReligion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessReligion() throws Exception {		
		this.startProcessReligion(true);
	}
	
	public void startProcessReligion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesReligion, this.jScrollPanelDatosReligion,this.jPanelPaginacionReligion, this.jScrollPanelDatosEdicionReligion, this.jPanelAccionesReligion,this.jPanelAccionesFormularioReligion,this.jmenuBarReligion,this.jmenuBarDetalleReligion,this.jTtoolBarReligion,this.jTtoolBarDetalleReligion);		
		
		final JTabbedPane jTabbedPaneBusquedasReligion=null; 
		
		final JPanel jPanelParametrosReportesReligion=this.jPanelParametrosReportesReligion;
		//final JScrollPane jScrollPanelDatosReligion=this.jScrollPanelDatosReligion;
		final JTable jTableDatosReligion=this.jTableDatosReligion;		
		final JPanel jPanelPaginacionReligion=this.jPanelPaginacionReligion;
		//final JScrollPane jScrollPanelDatosEdicionReligion=this.jScrollPanelDatosEdicionReligion;
		final JPanel jPanelAccionesReligion=this.jPanelAccionesReligion;
		
		JPanel jPanelCamposAuxiliarReligion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarReligion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormReligion!=null) {
			jPanelCamposAuxiliarReligion=this.jInternalFrameDetalleFormReligion.jPanelCamposReligion;
			jPanelAccionesFormularioAuxiliarReligion=this.jInternalFrameDetalleFormReligion.jPanelAccionesFormularioReligion;
		}
		
		final JPanel jPanelCamposReligion=jPanelCamposAuxiliarReligion;
		final JPanel jPanelAccionesFormularioReligion=jPanelAccionesFormularioAuxiliarReligion;
		
		
		final JMenuBar jmenuBarReligion=this.jmenuBarReligion;
		final JToolBar jTtoolBarReligion=this.jTtoolBarReligion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarReligion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarReligion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormReligion!=null) {
			jmenuBarDetalleAuxiliarReligion=this.jInternalFrameDetalleFormReligion.jmenuBarDetalleReligion;
			jTtoolBarDetalleAuxiliarReligion=this.jInternalFrameDetalleFormReligion.jTtoolBarDetalleReligion;
		}
		
		final JMenuBar jmenuBarDetalleReligion=jmenuBarDetalleAuxiliarReligion;
		final JToolBar jTtoolBarDetalleReligion=jTtoolBarDetalleAuxiliarReligion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasReligion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesReligion;
			processRunnable.jTableDatos=jTableDatosReligion;
			processRunnable.jPanelCampos=jPanelCamposReligion;
			processRunnable.jPanelPaginacion=jPanelPaginacionReligion;
			processRunnable.jPanelAcciones=jPanelAccionesReligion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioReligion;
			
			
			processRunnable.jmenuBar=jmenuBarReligion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleReligion;
			processRunnable.jTtoolBar=jTtoolBarReligion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleReligion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasReligion ,jPanelParametrosReportesReligion,jTableDatosReligion, /*jScrollPanelDatosReligion,*/jPanelCamposReligion,jPanelPaginacionReligion, /*jScrollPanelDatosEdicionReligion,*/ jPanelAccionesReligion,jPanelAccionesFormularioReligion,jmenuBarReligion,jmenuBarDetalleReligion,jTtoolBarReligion,jTtoolBarDetalleReligion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesReligion, jScrollPanelDatosReligion,jPanelPaginacionReligion, jScrollPanelDatosEdicionReligion, jPanelAccionesReligion,jPanelAccionesFormularioReligion,jmenuBarReligion,jmenuBarDetalleReligion,jTtoolBarReligion,jTtoolBarDetalleReligion);
						
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
	
	public void finishProcessReligion() {// throws Exception 
		this.finishProcessReligion(true);
	}
	
	public void finishProcessReligion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesReligion, this.jScrollPanelDatosReligion,this.jPanelPaginacionReligion, this.jScrollPanelDatosEdicionReligion, this.jPanelAccionesReligion,this.jPanelAccionesFormularioReligion,this.jmenuBarReligion,this.jmenuBarDetalleReligion,this.jTtoolBarReligion,this.jTtoolBarDetalleReligion);		
		
		final JTabbedPane jTabbedPaneBusquedasReligion=null; 
		
		final JPanel jPanelParametrosReportesReligion=this.jPanelParametrosReportesReligion;
		//final JScrollPane jScrollPanelDatosReligion=this.jScrollPanelDatosReligion;
		final JTable jTableDatosReligion=this.jTableDatosReligion;		
		final JPanel jPanelPaginacionReligion=this.jPanelPaginacionReligion;
		//final JScrollPane jScrollPanelDatosEdicionReligion=this.jScrollPanelDatosEdicionReligion;
		final JPanel jPanelAccionesReligion=this.jPanelAccionesReligion;
		
		JPanel jPanelCamposAuxiliarReligion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarReligion=new JPanel();
		
		if(this.jInternalFrameDetalleFormReligion!=null) {
			jPanelCamposAuxiliarReligion=this.jInternalFrameDetalleFormReligion.jPanelCamposReligion;
			jPanelAccionesFormularioAuxiliarReligion=this.jInternalFrameDetalleFormReligion.jPanelAccionesFormularioReligion;
		}
		
		final JPanel jPanelCamposReligion=jPanelCamposAuxiliarReligion;
		final JPanel jPanelAccionesFormularioReligion=jPanelAccionesFormularioAuxiliarReligion;
		
		
		final JMenuBar jmenuBarReligion=this.jmenuBarReligion;		
		final JToolBar jTtoolBarReligion=this.jTtoolBarReligion;
				
		JMenuBar jmenuBarDetalleAuxiliarReligion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarReligion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormReligion!=null) {
			jmenuBarDetalleAuxiliarReligion=this.jInternalFrameDetalleFormReligion.jmenuBarDetalleReligion;
			jTtoolBarDetalleAuxiliarReligion=this.jInternalFrameDetalleFormReligion.jTtoolBarDetalleReligion;		
		}
		
		final JMenuBar jmenuBarDetalleReligion=jmenuBarDetalleAuxiliarReligion;
		final JToolBar jTtoolBarDetalleReligion=jTtoolBarDetalleAuxiliarReligion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasReligion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesReligion;
			processRunnable.jTableDatos=jTableDatosReligion;
			processRunnable.jPanelCampos=jPanelCamposReligion;
			processRunnable.jPanelPaginacion=jPanelPaginacionReligion;
			processRunnable.jPanelAcciones=jPanelAccionesReligion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioReligion;
			
			
			processRunnable.jmenuBar=jmenuBarReligion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleReligion;
			processRunnable.jTtoolBar=jTtoolBarReligion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleReligion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasReligion ,jPanelParametrosReportesReligion, jTableDatosReligion,/*jScrollPanelDatosReligion,*/jPanelCamposReligion,jPanelPaginacionReligion, /*jScrollPanelDatosEdicionReligion,*/ jPanelAccionesReligion,jPanelAccionesFormularioReligion,jmenuBarReligion,jmenuBarDetalleReligion,jTtoolBarReligion,jTtoolBarDetalleReligion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesReligion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarReligion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuReligion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarReligion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarReligion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleReligion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuReligion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarReligion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleReligion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.religionConstantesFunciones.getsFinalQueryReligion();
		String  finalQueryPaginacionTodos=this.religionConstantesFunciones.getsFinalQueryReligion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ReligionConstantesFunciones.getArrayColumnasGlobalesNoReligion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ReligionConstantesFunciones.getArrayColumnasGlobalesReligion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ReligionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.religionsEliminados= new ArrayList<Religion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessReligion();
		
				///*ReligionSessionBean*/this.religionSessionBean=new ReligionSessionBean();
			
			if(this.religionSessionBean==null) {
				this.religionSessionBean=new ReligionSessionBean();
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
					this.iNumeroPaginacion=ReligionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ReligionConstantesFunciones.getClassesForeignKeysOfReligion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/religion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			religionsAux= new ArrayList<Religion>();
			
				
			religionLogic.setDatosCliente(this.datosCliente);
			religionLogic.setDatosDeep(this.datosDeep);
			religionLogic.setIsConDeep(true);
			
			
			religionLogic.getReligionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					religionLogic.getTodosReligions(finalQueryGlobal,pagination);
					
					//religionLogic.getTodosReligionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(religionLogic.getReligions()==null|| religionLogic.getReligions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							religionsAux= new ArrayList<Religion>();
							religionsAux.addAll(religionLogic.getReligions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							religionsAux= new ArrayList<Religion>();
							religionsAux.addAll(religions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							religionLogic.getTodosReligions(finalQueryGlobal+"",this.pagination);												
							
							//religionLogic.getTodosReligionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteReligions("Todos",religionLogic.getReligions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							religionLogic.setReligions(new ArrayList<Religion>());					
							religionLogic.getReligions().addAll(religionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							religions=new ArrayList<Religion>();
							religions.addAll(religionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idReligion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idReligion=this.idActual;
				
				} else if(this.idReligionActual!=null && this.idReligionActual!=0L) {
					idReligion=idReligionActual;
				}
				
					
				this.sDetalleReporte=ReligionConstantesFunciones.getDetalleIndicePorId(idReligion);
				
				this.religions=new ArrayList<Religion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					religionLogic.getEntity(idReligion);
					
					//religionLogic.getEntityWithConnection(idReligion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					religionLogic.setReligions(new ArrayList<Religion>());
					religionLogic.getReligions().add(religionLogic.getReligion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.religions=new ArrayList<Religion>();
					this.religions.add(religion);
				}
				
				if(religionLogic.getReligion()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesReligion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessReligion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=religionLogic.getReligions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=religions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=religionLogic.getReligions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=religions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Religion religion) {
		Boolean permite=true;
		
		if(this.religion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ReligionConstantesFunciones.getOrderByListaReligion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ReligionConstantesFunciones.getOrderByListaReligion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Religion religion:religionLogic.getReligions()) {
				if(religion.getsType().equals(Constantes2.S_TOTALES)) {
					religionTotales=religion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Religion religion:this.religions) {
				if(religion.getsType().equals(Constantes2.S_TOTALES)) {
					religionTotales=religion;
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
			this.religionAux=new Religion();
			this.religionAux.setsType(Constantes2.S_TOTALES);
			this.religionAux.setIsNew(false);
			this.religionAux.setIsChanged(false);
			this.religionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ReligionConstantesFunciones.TotalizarValoresFilaReligion(this.religionLogic.getReligions(),this.religionAux);
				
				this.religionLogic.getReligions().add(this.religionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ReligionConstantesFunciones.TotalizarValoresFilaReligion(this.religions,this.religionAux);
				
				this.religions.add(this.religionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		religionTotales=new Religion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.religionLogic.getReligions().remove(religionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.religions.remove(religionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		religionTotales=new Religion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Religion religion:religionLogic.getReligions()) {
				if(religion.getsType().equals(Constantes2.S_TOTALES)) {
					religionTotales=religion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ReligionConstantesFunciones.TotalizarValoresFilaReligion(this.religionLogic.getReligions(),religionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Religion religion:this.religions) {
				if(religion.getsType().equals(Constantes2.S_TOTALES)) {
					religionTotales=religion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ReligionConstantesFunciones.TotalizarValoresFilaReligion(this.religions,religionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosReligion() {
		this.isPermisoTodoReligion=false;
		this.isPermisoNuevoReligion=false;
		this.isPermisoActualizarReligion=false;
		this.isPermisoActualizarOriginalReligion=false;
		this.isPermisoEliminarReligion=false;
		this.isPermisoGuardarCambiosReligion=false;
		this.isPermisoConsultaReligion=false;
		this.isPermisoBusquedaReligion=false;
		this.isPermisoReporteReligion=false;		
		this.isPermisoOrdenReligion=false;		
		this.isPermisoPaginacionMedioReligion=false;		
		this.isPermisoPaginacionAltoReligion=false;
		this.isPermisoPaginacionTodoReligion=false;
		this.isPermisoCopiarReligion=false;		
		this.isPermisoVerFormReligion=false;		
		this.isPermisoDuplicarReligion=false;		
		this.isPermisoOrdenReligion=false;		
	}
	
	public void setPermisosUsuarioReligion(Boolean isPermiso) {
		this.isPermisoTodoReligion=isPermiso;
		this.isPermisoNuevoReligion=isPermiso;
		this.isPermisoActualizarReligion=isPermiso;
		this.isPermisoActualizarOriginalReligion=isPermiso;
		this.isPermisoEliminarReligion=isPermiso;
		this.isPermisoGuardarCambiosReligion=isPermiso;
		this.isPermisoConsultaReligion=isPermiso;
		this.isPermisoBusquedaReligion=isPermiso;
		this.isPermisoReporteReligion=isPermiso;
		this.isPermisoOrdenReligion=isPermiso;		
		this.isPermisoPaginacionMedioReligion=isPermiso;		
		this.isPermisoPaginacionAltoReligion=isPermiso;		
		this.isPermisoPaginacionTodoReligion=isPermiso;		
		this.isPermisoCopiarReligion=isPermiso;		
		this.isPermisoVerFormReligion=isPermiso;		
		this.isPermisoDuplicarReligion=isPermiso;
		this.isPermisoOrdenReligion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioReligion(Boolean isPermiso) {
		//this.isPermisoTodoReligion=isPermiso;
		this.isPermisoNuevoReligion=isPermiso;
		this.isPermisoActualizarReligion=isPermiso;
		this.isPermisoActualizarOriginalReligion=isPermiso;
		this.isPermisoEliminarReligion=isPermiso;
		this.isPermisoGuardarCambiosReligion=isPermiso;
		//this.isPermisoConsultaReligion=isPermiso;
		//this.isPermisoBusquedaReligion=isPermiso;
		//this.isPermisoReporteReligion=isPermiso;
		//this.isPermisoOrdenReligion=isPermiso;		
		//this.isPermisoPaginacionMedioReligion=isPermiso;		
		//this.isPermisoPaginacionAltoReligion=isPermiso;		
		//this.isPermisoPaginacionTodoReligion=isPermiso;		
		//this.isPermisoCopiarReligion=isPermiso;		
		//this.isPermisoDuplicarReligion=isPermiso;
		//this.isPermisoOrdenReligion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioReligionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(EmpleadoConstantesFunciones.SNOMBREOPCION);
		
		if(ReligionJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosEmpleado=false;
		this.isTienePermisosEmpleado=this.verificarGetPermisosUsuarioOpcionReligionClaseRelacionada(this.opcionsRelacionadas,EmpleadoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebReligion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioReligionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosEmpleado=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioReligionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionReligionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioReligionClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosEmpleado && this.jInternalFrameDetalleFormReligion!=null && this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormReligion.jTabbedPaneRelacionesReligion.remove(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioReligion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ReligionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.religionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ReligionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoReligion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarReligion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalReligion=this.isPermisoActualizarReligion;
			this.isPermisoEliminarReligion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosReligion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaReligion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaReligion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoReligion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteReligion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenReligion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioReligion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoReligion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoReligion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarReligion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormReligion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarReligion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenReligion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.religionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosReligion.setToolTipText(this.jTableDatosReligion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioReligion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioReligion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ReligionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ReligionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioReligion() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosEmpleado && this.religionConstantesFunciones.mostrarEmpleadoReligion && !ReligionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Empleado");
			reporte.setsDescripcion("Empleado");
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
	
		
	public void inicializarCombosForeignKeyReligionListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyReligionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ReligionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyReligionListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyReligionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyReligion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyReligion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyReligion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyReligion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyReligion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyReligion(Religion religion)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyReligion(Religion religion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyReligion()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyReligion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyReligion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyReligion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroReligion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyReligion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyReligion(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyReligion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public ReligionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ReligionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ReligionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.religionSessionBean=new ReligionSessionBean(); 
		this.religionConstantesFunciones=new ReligionConstantesFunciones(); 
		this.religionBean=new Religion();//(this.religionConstantesFunciones); 		
		this.religionReturnGeneral=new ReligionParameterReturnGeneral(); 
		
		this.religionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.religionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ReligionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ReligionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ReligionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessReligion(true);
			
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
			
			this.religionConstantesFunciones=new ReligionConstantesFunciones(); 
			this.religionBean=new Religion();//this.religionConstantesFunciones); 			
			this.religionReturnGeneral=new ReligionParameterReturnGeneral(); 
		
			ReligionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Religion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.religion=new Religion();
			this.religions = new ArrayList<Religion>();
			this.religionsAux = new ArrayList<Religion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic=new ReligionLogic();
				this.religionLogic.getNewConnexionToDeep("");
			}
			
			//this.religionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.religionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormReligion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoReligion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoReligion);	
					}
					
					if(this.jInternalFrameImportacionReligion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionReligion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByReligion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByReligion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormReligion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormReligion);
				this.jInternalFrameDetalleFormReligion.setVisible(false);
				this.jInternalFrameDetalleFormReligion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoReligion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoReligion);
					this.jInternalFrameReporteDinamicoReligion.setVisible(false);
					this.jInternalFrameReporteDinamicoReligion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionReligion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionReligion);
					this.jInternalFrameImportacionReligion.setVisible(false);
					this.jInternalFrameImportacionReligion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByReligion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByReligion);
					this.jInternalFrameOrderByReligion.setVisible(false);
					this.jInternalFrameOrderByReligion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idReligionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ReligionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.religionReturnGeneral=new ReligionParameterReturnGeneral();
			
			this.religionParameterGeneral=new ReligionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.religionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.religionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ReligionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.religionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(EmpleadoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ReligionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.religionSessionBean.getEsGuardarRelacionado(),this.religionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ReligionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.religionSessionBean.getEsGuardarRelacionado(),this.religionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoReligion=false;
			this.isVisibilidadCeldaDuplicarReligion=true;
			this.isVisibilidadCeldaCopiarReligion=true;
			this.isVisibilidadCeldaVerFormReligion=true;
			this.isVisibilidadCeldaOrdenReligion=true;
			this.isVisibilidadCeldaNuevoRelacionesReligion=false;
			this.isVisibilidadCeldaModificarReligion=false;
			this.isVisibilidadCeldaActualizarReligion=false;
			this.isVisibilidadCeldaEliminarReligion=false;
			this.isVisibilidadCeldaCancelarReligion=false;
			this.isVisibilidadCeldaGuardarReligion=false;
			this.isVisibilidadCeldaGuardarCambiosReligion=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesReligion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosReligion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioReligion(false);
			
			this.setPermisosUsuarioReligion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.religionSessionBean.getEsGuardarRelacionado() 
				|| (this.religionSessionBean.getEsGuardarRelacionado() && this.religionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioReligionClasesRelacionadas();
			}
			
			if(this.religionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioReligionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ReligionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosReligion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualReligion();
			}
			
			if(!this.isPermisoBusquedaReligion) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.religionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioReligion,this.isPermisoPaginacionMedioReligion,this.isPermisoPaginacionTodoReligion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ReligionConstantesFunciones.getTiposSeleccionarReligion());
				
				this.tiposColumnasSelect=ReligionConstantesFunciones.getTiposSeleccionarReligion(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectReligion();				
				//this.tiposRelacionesSelect=ReligionConstantesFunciones.getTiposRelacionesReligion(true);
				
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
			//if(!this.religionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioReligion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioReligion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioReligion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesReligion() ;
			
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
			
			
			this.empleadoLogic=new EmpleadoLogic(); 
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
				religionImplementable= (ReligionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ReligionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				religionImplementableHome= (ReligionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ReligionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.religions= new ArrayList<Religion>();
			this.religionsEliminados= new ArrayList<Religion>();
						
			this.isEsNuevoReligion=false;
			this.esParaAccionDesdeFormularioReligion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyReligion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroReligion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.religionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ReligionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ReligionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesReligion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingReligion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormReligion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioReligion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioReligion();
			}
			
			ReligionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessReligion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Religion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectReligion() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(EmpleadoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(EmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesReligion")) {
				iIndex=this.jInternalFrameDetalleFormReligion.jTabbedPaneRelacionesReligion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormReligion.jTabbedPaneRelacionesReligion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosReligion.getSelectedRow();	
				
				

				if(sTitle.equals("Empleados")) {
					if(!EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessReligion();

						this.cargarParteTabPanelRelacionadaEmpleado(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessReligion();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaEmpleado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormReligion.cargarSessionConBeanSwingJInternalFrameEmpleado(false,true,iIndex);
		this.jButtonEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaEmpleado();

		//this.jTabbedPaneRelacionesReligion.updateUI();
		//this.jTabbedPaneRelacionesReligion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesReligion.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Empleado")) {
				int row=this.jTableDatosReligion.getSelectedRow();
				jButtonEmpleadoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.religionSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Empleado")) {

					if(this.isTienePermisosEmpleado && this.religionConstantesFunciones.mostrarEmpleadoReligion && !ReligionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Empleados"+"("+EmpleadoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Empleados");

						if(religionConstantesFunciones.resaltarEmpleadoReligion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(religionConstantesFunciones.resaltarEmpleadoReligion);
						}

						jmenuItem.setEnabled(this.religionConstantesFunciones.activarEmpleadoReligion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Empleado"));

						

						this.jInternalFrameDetalleFormReligion.jmenuDetalleReligion.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyReligion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyReligion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyReligion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyReligionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyReligion();
		
		this.cargarCombosFrameForeignKeyReligion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyReligion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyReligion();
		}
	}
	
	
	
	public void jButtonNuevoReligionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.religionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormReligion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
			
			
			if(jTableDatosReligion.getRowCount()>=1) {
				jTableDatosReligion.removeRowSelectionInterval(0, jTableDatosReligion.getRowCount()-1);						
			}
			
			this.isEsNuevoReligion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoReligion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesReligion(true);			
			//this.religion=new Religion();
			//this.religion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesReligion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReligion() ;
			
			if(ReligionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleReligion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.religion);	
			this.actualizarInformacion("INFO_PADRE",false,this.religion);				
			
			ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
			
			if(this.religionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Religion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarReligionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Religion> religionsSeleccionados=new ArrayList<Religion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosReligion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosReligion.getSelectedRows().length;			
			}
			
			religionsSeleccionados=this.getReligionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoReligion--;			
				//Religion religionAux= new Religion();			
				//religionAux.setId(this.iIdNuevoReligion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Religion religionOrigen=new Religion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Religion religionOrigen : religionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosReligion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							religionOrigen =(Religion) this.religionLogic.getReligions().toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							religionOrigen =(Religion) this.religions.toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaReligion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.religion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosReligion(religionOrigen,this.religion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysReligion(this.religion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.religionLogic.getReligions().add(this.religionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.religions.add(this.religionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaReligion(false);
				
				this.jTableDatosReligion.setRowSelectionInterval(this.getIndiceNuevoReligion(), this.getIndiceNuevoReligion());
				
				int iLastRow =  this.jTableDatosReligion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosReligion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosReligion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaReligion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarReligionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Religion> religionsSeleccionados=new ArrayList<Religion>();									
		
			Religion religionOrigen=new Religion();
			Religion religionDestino=new Religion();
				
			religionsSeleccionados=this.getReligionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosReligion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || religionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosReligion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						religionOrigen =(Religion) this.religionLogic.getReligions().toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						religionOrigen =(Religion) this.religions.toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						religionDestino =(Religion) this.religionLogic.getReligions().toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						religionDestino =(Religion) this.religions.toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				religionOrigen =religionsSeleccionados.get(0);
				religionDestino =religionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosReligion(religionOrigen,religionDestino,true,false);
				
				religionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(religionDestino,religionLogic.getReligions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(religionDestino,religions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaReligion(false);
				
				//this.jTableDatosReligion.setRowSelectionInterval(this.getIndiceNuevoReligion(), this.getIndiceNuevoReligion());
				
				int iLastRow =  this.jTableDatosReligion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosReligion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosReligion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaReligion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormReligionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormReligion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormReligion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarReligionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesReligion.isVisible();
			
			
			this.jPanelParametrosReportesReligion.setVisible(!isVisible);
			this.jPanelPaginacionReligion.setVisible(!isVisible);
			this.jPanelAccionesReligion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReligionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameReligion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoReligionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoReligion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionReligionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionReligion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByReligionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByReligion();
			
			this.abrirFrameOrderByReligion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByReligionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByReligion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleReligion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormReligion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormReligion.isMaximum()) {
					this.jInternalFrameDetalleFormReligion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormReligion.setSize(this.jInternalFrameDetalleFormReligion.iWidthFormulario,this.jInternalFrameDetalleFormReligion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormReligion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormReligion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormReligion.isMaximum()) {
						this.jInternalFrameDetalleFormReligion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormReligion.jContentPaneDetalleReligion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormReligion.jTabbedPaneRelacionesReligion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormReligion.jContentPaneDetalleReligion.getWidth(),ReligionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormReligion.jTabbedPaneRelacionesReligion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormReligion.jContentPaneDetalleReligion.getWidth(),ReligionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormReligion.jTabbedPaneRelacionesReligion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormReligion.jContentPaneDetalleReligion.getWidth(),ReligionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaEmpleado();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormReligion.setVisible(true);
	        this.jInternalFrameDetalleFormReligion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByReligion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByReligion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByReligion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReligion,false,this);
				} else {
					this.jInternalFrameOrderByReligion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReligion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByReligion);
				this.jInternalFrameOrderByReligion.setVisible(false);
				this.jInternalFrameOrderByReligion.setSelected(false);
				
				this.jInternalFrameOrderByReligion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByReligion"));
				
				this.inicializarActualizarBindingTablaOrderByReligion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionReligion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionReligion==null) {
				
				this.jInternalFrameImportacionReligion=new ImportacionJInternalFrame(ReligionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionReligion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionReligion);
				this.jInternalFrameImportacionReligion.setVisible(false);
				this.jInternalFrameImportacionReligion.setSelected(false);


				this.jInternalFrameImportacionReligion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionReligion"));
				this.jInternalFrameImportacionReligion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionReligion"));
				this.jInternalFrameImportacionReligion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionReligion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoReligion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoReligion==null) {
				this.jInternalFrameReporteDinamicoReligion=new ReporteDinamicoJInternalFrame(ReligionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoReligion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoReligion);
				this.jInternalFrameReporteDinamicoReligion.setVisible(false);
				this.jInternalFrameReporteDinamicoReligion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoReligion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoReligion"));
				this.jInternalFrameReporteDinamicoReligion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoReligion"));
				this.jInternalFrameReporteDinamicoReligion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoReligion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualReligion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaEmpleado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormReligion.jContentPaneDetalleReligion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleReligion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormReligion);
			
	       	this.jInternalFrameDetalleFormReligion.setVisible(false);
	        this.jInternalFrameDetalleFormReligion.setSelected(false);
			
			//this.jInternalFrameDetalleFormReligion.dispose();
			//this.jInternalFrameDetalleFormReligion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoReligion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoReligion.setVisible(true);
	        this.jInternalFrameReporteDinamicoReligion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionReligion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionReligion.setVisible(true);
	        this.jInternalFrameImportacionReligion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByReligion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByReligion.setVisible(true);
	        this.jInternalFrameOrderByReligion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByReligion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByReligion.setVisible(false);
	        this.jInternalFrameOrderByReligion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoReligion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoReligion.setVisible(false);
	        this.jInternalFrameReporteDinamicoReligion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionReligion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionReligion.setVisible(false);
	        this.jInternalFrameImportacionReligion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarReligionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarReligion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarReligion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosReligion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesReligion(true);
			//this.isEsNuevoReligion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religion =(Religion) this.religionLogic.getReligions().toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.religion =(Religion) this.religions.toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesReligion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesReligion(false) ;
			
			if(religionSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado() && EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(ReligionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleReligion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReligion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaReligionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosReligion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.religion =(Religion) this.religionLogic.getReligions().toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.religion =(Religion) this.religions.toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarReligion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormReligion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosReligion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesReligion(true);
			//this.isEsNuevoReligion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religion =(Religion) this.religionLogic.getReligions().toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.religion =(Religion) this.religions.toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.religion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesReligion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesReligion(false) ;
			
			if(ReligionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleReligion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReligion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarReligionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesReligion(false);
			
			//if(!this.isEsNuevoReligion) {								
				int intSelectedRow = this.jTableDatosReligion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.religion =(Religion) this.religionLogic.getReligions().toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.religion =(Religion) this.religions.toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ReligionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualReligion(this.religion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysReligion(this.religion);
				
			}
			
			if(this.permiteMantenimiento(this.religion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.religionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoReligion=true;
					this.inicializarActualizarBindingTablaReligion(false);
					this.isEsNuevoReligion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoReligion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoReligion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesReligion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualReligion(false);
				
				this.habilitarDeshabilitarControlesReligion(false);
			
												
				
				if(ReligionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleReligion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoReligionActionPerformed(evt,religionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualReligion(this.religion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosReligion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,religionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.religion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Religion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Religion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarReligionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosReligion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religion =(Religion) this.religionLogic.getReligions().toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
				this.religion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.religion =(Religion) this.religions.toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
				this.religion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.religion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.religionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ReligionModel) this.jTableDatosReligion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoReligion=true;
				this.inicializarActualizarBindingTablaReligion(false);
				this.isEsNuevoReligion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesReligion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualReligion(false);
				
				this.habilitarDeshabilitarControlesReligion(false);
				
				
				
				if(ReligionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleReligion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarReligionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosReligion.getRowCount()>=1) {
				jTableDatosReligion.removeRowSelectionInterval(0, jTableDatosReligion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesReligion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaReligion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesReligion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReligion(false) ;
			
			this.isEsNuevoReligion=false;
			
			if(ReligionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleReligion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosReligionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingReligion(false);
				
				//SI ES MANUAL
				if(ReligionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualReligion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosReligionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoReligion--;			
			//Religion religionAux= new Religion();			
			//religionAux.setId(this.iIdNuevoReligion);
			
			if(this.jInternalFrameDetalleFormReligion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaReligion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysReligion(this.religion);
			
			this.religion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.religionLogic.getReligions().add(this.religionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.religions.add(this.religionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaReligion(false);
			
			this.jTableDatosReligion.setRowSelectionInterval(this.getIndiceNuevoReligion(), this.getIndiceNuevoReligion());
			
			int iLastRow =  this.jTableDatosReligion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosReligion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosReligion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaReligion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionReligionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingReligion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReligion(false);
			
			//SI ES MANUAL
			if(ReligionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualReligion();
			}
			
			//this.abrirFrameTreeReligion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionReligionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE ReligionES ?", "MANTENIMIENTO DE Religion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionReligion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralReligion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.religionReturnGeneral=religionLogic.procesarImportacionReligionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.religionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarReligionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionReligionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionReligion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionReligion.setFileImportacion(this.jInternalFrameImportacionReligion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionReligion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionReligion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionReligion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionReligion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoReligionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Religion> religionsSeleccionados=new ArrayList<Religion>();		

		religionsSeleccionados=this.getReligionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReligion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReligion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ReligionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ReligionBaseDesign.jrxml";
			
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
			
			this.generarReporteReligions("Todos",religionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.religionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Religion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoReligion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReligion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ReligionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReligionConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoReligion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoReligion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoReligion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ReligionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ReligionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoReligion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ReligionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ReligionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoReligion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReligion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ReligionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ReligionConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoReligionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Religion> religionsSeleccionados=new ArrayList<Religion>();		
		
		religionsSeleccionados=this.getReligionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"religion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Religions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoReligion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoReligion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ReligionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReligionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Religion religion:religionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(religion.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReligionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReligionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Religion religion:religionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(religion.getnombre());
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
			//	this.getFilaCabeceraExportarExcelReligion(row);				
			//	iRow++;
			//}				
			
			//for(Religion religionAux:religionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelReligion(religionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.religionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Religion",JOptionPane.INFORMATION_MESSAGE);
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
				this.religionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReligion(false);
			
			//SI ES MANUAL
			if(ReligionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualReligion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresReligionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReligion(false);
			
			//SI ES MANUAL
			if(ReligionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualReligion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesReligionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReligion(false);
			
			//SI ES MANUAL
			if(ReligionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualReligion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.religionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaReligion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosReligion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosReligion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosReligion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosReligion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosReligion.setMinimumSize(dimensionMinimum);
		this.jTableDatosReligion.setMaximumSize(dimensionMaximum);
		this.jTableDatosReligion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingReligion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingReligion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingReligion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaReligion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesReligion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.religionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasReligion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesReligion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesReligion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ReligionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ReligionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualReligion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaReligion();
		
		this.inicializarActualizarBindingBotonesManualReligion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.religionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualReligion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesReligion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualReligion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualReligion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosReligion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosReligion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteReligion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormReligion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormReligion.jCheckBoxPostAccionNuevoReligion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormReligion.jCheckBoxPostAccionSinCerrarReligion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormReligion.jCheckBoxPostAccionSinMensajeReligion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosReligion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosReligion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteReligion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormReligion!=null) {
				this.jInternalFrameDetalleFormReligion.jCheckBoxPostAccionNuevoReligion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormReligion.jCheckBoxPostAccionSinCerrarReligion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormReligion.jCheckBoxPostAccionSinMensajeReligion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionReligion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionReligion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormReligion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormReligion.jComboBoxTiposAccionesFormularioReligion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesReligion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoReligion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReligion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesReligion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesReligion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarReligion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesReligion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoReligion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReligion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesReligion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralReligion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesReligion(Boolean esInicializar) throws Exception {
		try	{	
			if(ReligionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualReligion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesReligion() throws Exception {
		try	{
			if(ReligionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualReligion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleReligion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormReligion.jComboBoxTiposAccionesFormularioReligion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormReligion.jComboBoxTiposAccionesFormularioReligion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualReligion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesReligion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesReligion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesReligion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesReligion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesReligion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesReligion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionReligion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionReligion.addItem(reporte);
			}
			
			
			if(!this.religionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionReligion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionReligion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesReligion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesReligion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesReligion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesReligion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormReligion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormReligion.jComboBoxTiposAccionesFormularioReligion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormReligion.jComboBoxTiposAccionesFormularioReligion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarReligion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarReligion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarReligion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualReligion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualReligion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoReligion!=null) {
				this.jInternalFrameReporteDinamicoReligion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoReligion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoReligion!=null) {
				this.jInternalFrameReporteDinamicoReligion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoReligion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoReligion!=null) {
				
				if(this.jInternalFrameReporteDinamicoReligion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoReligion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoReligion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoReligion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoReligion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoReligion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualReligion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasReligion(Boolean esInicializar) throws Exception {				
		if(ReligionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualReligion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaReligion() throws Exception {
		this.inicializarActualizarBindingTablaReligion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByReligion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByReligion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByReligion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByReligion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ReligionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByReligion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByReligion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ReligionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosReligionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReligionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ReligionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByReligion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByReligion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ReligionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByReligion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaReligion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=religionLogic.getReligions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=religions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ReligionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosReligion.setModel(new ReligionModel(this.religionLogic.getReligions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosReligion.setModel(new ReligionModel(this.religions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByReligion!=null && this.jInternalFrameOrderByReligion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByReligion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosReligion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReligion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ReligionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ReligionConstantesFunciones.SCLASSWEBTITULO,religionConstantesFunciones.resaltarSeleccionarReligion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ReligionConstantesFunciones.SCLASSWEBTITULO,religionConstantesFunciones.resaltarSeleccionarReligion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosReligion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReligion,ReligionConstantesFunciones.LABEL_ID));

		if(this.religionConstantesFunciones.mostraridReligion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReligionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.religionConstantesFunciones.resaltaridReligion,this.religionConstantesFunciones.activaridReligion,this,true,"idReligion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.religionConstantesFunciones.resaltaridReligion,this.religionConstantesFunciones.activaridReligion,this,true,"idReligion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReligion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReligion,ReligionConstantesFunciones.LABEL_CODIGO));

		if(this.religionConstantesFunciones.mostrarcodigoReligion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReligionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.religionConstantesFunciones.resaltarcodigoReligion,this.religionConstantesFunciones.activarcodigoReligion,this,true,"codigoReligion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.religionConstantesFunciones.resaltarcodigoReligion,this.religionConstantesFunciones.activarcodigoReligion,this,true,"codigoReligion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReligionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReligion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReligion,ReligionConstantesFunciones.LABEL_NOMBRE));

		if(this.religionConstantesFunciones.mostrarnombreReligion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReligionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.religionConstantesFunciones.resaltarnombreReligion,this.religionConstantesFunciones.activarnombreReligion,this,true,"nombreReligion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.religionConstantesFunciones.resaltarnombreReligion,this.religionConstantesFunciones.activarnombreReligion,this,true,"nombreReligion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReligionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.religionSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosEmpleado && this.religionConstantesFunciones.mostrarEmpleadoReligion && !ReligionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Empleados");
				tableColumn.setHeaderValue("Empleados");
				tableColumn.setCellRenderer(new EmpleadoTableCell(religionConstantesFunciones.resaltarEmpleadoReligion,this,this.religionConstantesFunciones.activarEmpleadoReligion));
				tableColumn.setCellEditor(new EmpleadoTableCell(religionConstantesFunciones.resaltarEmpleadoReligion,this,this.religionConstantesFunciones.activarEmpleadoReligion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosReligion.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.religionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.religionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosReligion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.religionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.religionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosReligion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarReligion && this.isPermisoGuardarCambiosReligion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.religionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.religionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosReligion.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.religionSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosReligion.addColumn(tableColumn);
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
			
			this.jTableDatosReligion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarReligion && this.isPermisoGuardarCambiosReligion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.religionSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarReligion && this.isPermisoGuardarCambiosReligion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosReligion.moveColumn(this.jTableDatosReligion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosReligion.moveColumn(this.jTableDatosReligion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.religionSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosReligion.moveColumn(this.jTableDatosReligion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosReligion.moveColumn(this.jTableDatosReligion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosReligion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosReligion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosReligion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ReligionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosReligion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosReligion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ReligionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ReligionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosReligion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosReligion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosReligion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=religionLogic.getReligions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=religions.size()-1;
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
		//this.jTableDatosReligion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosReligion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosReligion();
			
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
				
				//this.isEsNuevoReligion=false;
					
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
			
				if(this.religionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormReligion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosReligion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosReligion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.religion =(Religion) this.religionLogic.getReligions().toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.religion =(Religion) this.religions.toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.religion.getsType().equals("DUPLICADO")
				   || this.religion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoReligion=true;
				
				} else {
					this.isEsNuevoReligion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.religionSessionBean.getEsGuardarRelacionado()) {
					if(this.religion.getId()>=0 && !this.religion.getIsNew()) {						
						this.isEsNuevoReligion=false;
						
					} else {
						this.isEsNuevoReligion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoReligion(esRelaciones);						
				
				this.seleccionarReligion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.religion.getId()<0) {
					this.isEsNuevoReligion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarReligion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarReligion(evt,rowIndex);
				}	
				
				if(this.religionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Religion: " + this.dDif); 
					}
				}								
				
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarReligion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.religion)) {
					if(this.religion.getId()>0) {
						this.religion.setIsDeleted(true);
						
						this.religionsEliminados.add(this.religion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.religionLogic.getReligions().remove(this.religion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.religions.remove(this.religion);				
					}
					
					
					((ReligionModel) this.jTableDatosReligion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaReligion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarReligion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoReligion) {
			
			if(this.jInternalFrameDetalleFormReligion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosReligion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosReligion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.religion =(Religion) this.religionLogic.getReligions().toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.religion =(Religion) this.religions.toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ReligionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioReligion(this.religion);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesReligion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesReligion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualReligion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoReligion(Religion religion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoReligion(religion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoReligion(Religion religion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioReligion(religion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyReligion(religion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyReligion(religion);
	}
	
	public void setVariablesObjetoActualToFormularioReligion(Religion religion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormReligion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormReligion.jLabelidReligion.setText(religion.getId().toString());
			this.jInternalFrameDetalleFormReligion.jTextFieldcodigoReligion.setText(religion.getcodigo());
			this.jInternalFrameDetalleFormReligion.jTextAreanombreReligion.setText(religion.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Religion religionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,religionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Religion religionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				religionLocal=this.religion;
			} else {
				religionLocal=this.religionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(religionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoReligion(religionLocal,true);
					
					if(religionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(religionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.religionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(religionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoReligion(Religion religion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualReligion(religion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysReligion(religion);
	}
	
	public void setVariablesFormularioToObjetoActualReligion(Religion religion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualReligion(religion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualReligion(Religion religion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormReligion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormReligion.jLabelidReligion.getText()==null || this.jInternalFrameDetalleFormReligion.jLabelidReligion.getText()=="" || this.jInternalFrameDetalleFormReligion.jLabelidReligion.getText()=="Id") {
				this.jInternalFrameDetalleFormReligion.jLabelidReligion.setText("0");
			}

			if(conColumnasBase) {religion.setId(Long.parseLong(this.jInternalFrameDetalleFormReligion.jLabelidReligion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReligionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReligion.jLabelIdReligion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			religion.setcodigo(this.jInternalFrameDetalleFormReligion.jTextFieldcodigoReligion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReligionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReligion.jLabelcodigoReligion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			religion.setnombre(this.jInternalFrameDetalleFormReligion.jTextAreanombreReligion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReligionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReligion.jLabelnombreReligion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualReligion(Religion religionBean,Religion religion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosReligion(Religion religionOrigen,Religion religion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && religionOrigen.getId()!=null && !religionOrigen.getId().equals(0L))) {religion.setId(religionOrigen.getId());}}
			if(conDefault || (!conDefault && religionOrigen.getcodigo()!=null && !religionOrigen.getcodigo().equals(""))) {religion.setcodigo(religionOrigen.getcodigo());}
			if(conDefault || (!conDefault && religionOrigen.getnombre()!=null && !religionOrigen.getnombre().equals(""))) {religion.setnombre(religionOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioReligion(Religion religion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormReligion.jLabelidReligion.setText(religion.getId().toString());
			this.jInternalFrameDetalleFormReligion.jTextFieldcodigoReligion.setText(religion.getcodigo());
			this.jInternalFrameDetalleFormReligion.jTextAreanombreReligion.setText(religion.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioReligion(ReligionBean religionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormReligion.jLabelidReligion.setText(religionBean.getId().toString());
			this.jInternalFrameDetalleFormReligion.jTextFieldcodigoReligion.setText(religionBean.getcodigo());
			this.jInternalFrameDetalleFormReligion.jTextAreanombreReligion.setText(religionBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanReligion(ReligionParameterReturnGeneral religionReturnGeneral,ReligionBean religionBean,Boolean conDefault) throws Exception { 
		try {
			Religion religionLocal=new Religion();
			
			religionLocal=religionReturnGeneral.getReligion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && religionLocal.getId()!=null && !religionLocal.getId().equals(0L))) {religionBean.setId(religionLocal.getId());}}
			if(conDefault || (!conDefault && religionLocal.getcodigo()!=null && !religionLocal.getcodigo().equals(""))) {religionBean.setcodigo(religionLocal.getcodigo());}
			if(conDefault || (!conDefault && religionLocal.getnombre()!=null && !religionLocal.getnombre().equals(""))) {religionBean.setnombre(religionLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxReligionGenerico(Long idReligionSeleccionado,JComboBox jComboBoxReligion,List<Religion> religionsLocal)throws Exception {
		try {
			Religion  religionTemp=null;

			for(Religion religionAux:religionsLocal) {
				if(religionAux.getId()!=null && religionAux.getId().equals(idReligionSeleccionado)) {
					religionTemp=religionAux;
					break;
				}
			}

			jComboBoxReligion.setSelectedItem(religionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxReligionGenerico(JComboBox jComboBoxReligion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxReligion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxReligion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxReligion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxReligion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxReligion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxReligion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxReligion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxReligion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxReligion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxReligion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Empleado")) {
			jButtonEmpleadoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			religion=(Religion) religionLogic.getReligions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			religion =(Religion) religions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Religion religionRow=new Religion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			religionRow=(Religion) religionLogic.getReligions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			religionRow=(Religion) religions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonEmpleadoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Religion religion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormReligion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.religionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.religion = (Religion)this.religionLogic.getReligions().toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.religion = (Religion)this.religions.toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(religion!=null) {
						this.religion = religion;
					} else {
						this.religion = new Religion();
					}
				}

				if(this.isTienePermisosEmpleado && this.permiteMantenimiento(this.religion)) {
					EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFramePopup=new EmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						empleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFramePopup;
					} else {
						empleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame;
					}

					List<Religion> religions=new ArrayList<Religion>();
					religions.add(this.religion);
					if(!esRelacionado) {
						//empleadoBeanSwingJInternalFrame.empleadoSessionBean.setConGuardarRelaciones(false);
						//empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					empleadoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormReligion.cargarEmpleadoBeanSwingJInternalFrame(religions,this.religion,empleadoBeanSwingJInternalFrame,/*conInicializar,*/empleadoBeanSwingJInternalFrame.empleadoSessionBean.getConGuardarRelaciones(),empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado());
					empleadoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("no_relacionado");

						empleadoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(EmpleadoConstantesFunciones.ITAMANIOFILATABLA + (EmpleadoConstantesFunciones.ITAMANIOFILATABLA/2));

						empleadoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderReligion=(TitledBorder)this.jScrollPanelDatosReligion.getBorder();
						TitledBorder titledBorderEmpleado=(TitledBorder)empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

						titledBorderEmpleado.setTitle(titledBorderReligion.getTitle() + " -> Empleado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,empleadoBeanSwingJInternalFrame);
						}

						empleadoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(empleadoBeanSwingJInternalFrame);

						empleadoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.religionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Empleado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.religionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.religionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.religionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualReligion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoReligion.setVisible((this.isVisibilidadCeldaNuevoReligion && this.isPermisoNuevoReligion));			
			this.jButtonDuplicarReligion.setVisible((this.isVisibilidadCeldaDuplicarReligion && this.isPermisoDuplicarReligion));			
			this.jButtonCopiarReligion.setVisible((this.isVisibilidadCeldaCopiarReligion && this.isPermisoCopiarReligion));
			this.jButtonVerFormReligion.setVisible((this.isVisibilidadCeldaVerFormReligion && this.isPermisoVerFormReligion));
			
			this.jButtonAbrirOrderByReligion.setVisible((this.isVisibilidadCeldaOrdenReligion && this.isPermisoOrdenReligion));			
			
			this.jButtonNuevoRelacionesReligion.setVisible((this.isVisibilidadCeldaNuevoRelacionesReligion && this.isPermisoNuevoReligion));			
			this.jButtonNuevoGuardarCambiosReligion.setVisible((this.isVisibilidadCeldaNuevoReligion && this.isPermisoNuevoReligion && this.isPermisoGuardarCambiosReligion));
			
			if(this.jInternalFrameDetalleFormReligion!=null) {
			this.jInternalFrameDetalleFormReligion.jButtonModificarReligion.setVisible((this.isVisibilidadCeldaModificarReligion && this.isPermisoActualizarReligion));	
			this.jInternalFrameDetalleFormReligion.jButtonActualizarReligion.setVisible((this.isVisibilidadCeldaActualizarReligion && this.isPermisoActualizarReligion));	
			this.jInternalFrameDetalleFormReligion.jButtonEliminarReligion.setVisible((this.isVisibilidadCeldaEliminarReligion && this.isPermisoEliminarReligion));
			this.jInternalFrameDetalleFormReligion.jButtonCancelarReligion.setVisible(this.isVisibilidadCeldaCancelarReligion);							
			this.jInternalFrameDetalleFormReligion.jButtonGuardarCambiosReligion.setVisible((this.isVisibilidadCeldaGuardarReligion && this.isPermisoGuardarCambiosReligion));			
			
			}
						
			this.jButtonGuardarCambiosTablaReligion.setVisible((this.isVisibilidadCeldaGuardarCambiosReligion && this.isPermisoGuardarCambiosReligion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarReligion.setVisible((this.isVisibilidadCeldaNuevoReligion && this.isPermisoNuevoReligion));						
			this.jButtonDuplicarToolBarReligion.setVisible((this.isVisibilidadCeldaDuplicarReligion && this.isPermisoDuplicarReligion));						
			this.jButtonCopiarToolBarReligion.setVisible((this.isVisibilidadCeldaCopiarReligion && this.isPermisoCopiarReligion));			
			this.jButtonVerFormToolBarReligion.setVisible((this.isVisibilidadCeldaVerFormReligion && this.isPermisoVerFormReligion));			
			this.jButtonAbrirOrderByToolBarReligion.setVisible((this.isVisibilidadCeldaOrdenReligion && this.isPermisoOrdenReligion));
			this.jButtonNuevoRelacionesToolBarReligion.setVisible((this.isVisibilidadCeldaNuevoRelacionesReligion && this.isPermisoNuevoReligion));			
			this.jButtonNuevoGuardarCambiosToolBarReligion.setVisible((this.isVisibilidadCeldaNuevoReligion && this.isPermisoNuevoReligion && this.isPermisoGuardarCambiosReligion));			
			
			if(this.jInternalFrameDetalleFormReligion!=null) {
			this.jInternalFrameDetalleFormReligion.jButtonModificarToolBarReligion.setVisible((this.isVisibilidadCeldaModificarReligion && this.isPermisoActualizarReligion));	
			this.jInternalFrameDetalleFormReligion.jButtonActualizarToolBarReligion.setVisible((this.isVisibilidadCeldaActualizarReligion  && this.isPermisoActualizarReligion));	
			this.jInternalFrameDetalleFormReligion.jButtonEliminarToolBarReligion.setVisible((this.isVisibilidadCeldaEliminarReligion && this.isPermisoEliminarReligion));
			this.jInternalFrameDetalleFormReligion.jButtonCancelarToolBarReligion.setVisible(this.isVisibilidadCeldaCancelarReligion);				
			this.jInternalFrameDetalleFormReligion.jButtonGuardarCambiosToolBarReligion.setVisible((this.isVisibilidadCeldaGuardarReligion && this.isPermisoGuardarCambiosReligion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarReligion.setVisible((this.isVisibilidadCeldaGuardarCambiosReligion && this.isPermisoGuardarCambiosReligion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoReligion.setVisible((this.isVisibilidadCeldaNuevoReligion && this.isPermisoNuevoReligion));			
			this.jMenuItemDuplicarReligion.setVisible((this.isVisibilidadCeldaDuplicarReligion && this.isPermisoDuplicarReligion));			
			this.jMenuItemCopiarReligion.setVisible((this.isVisibilidadCeldaCopiarReligion && this.isPermisoCopiarReligion));			
			this.jMenuItemVerFormReligion.setVisible((this.isVisibilidadCeldaVerFormReligion && this.isPermisoVerFormReligion));			
			this.jMenuItemAbrirOrderByReligion.setVisible((this.isVisibilidadCeldaOrdenReligion && this.isPermisoOrdenReligion));			
			//this.jMenuItemMostrarOcultarReligion.setVisible((this.isVisibilidadCeldaOrdenReligion && this.isPermisoOrdenReligion));
			this.jMenuItemDetalleAbrirOrderByReligion.setVisible((this.isVisibilidadCeldaOrdenReligion && this.isPermisoOrdenReligion));			
			//this.jMenuItemDetalleMostrarOcultarReligion.setVisible((this.isVisibilidadCeldaOrdenReligion && this.isPermisoOrdenReligion));			
			this.jMenuItemNuevoRelacionesReligion.setVisible((this.isVisibilidadCeldaNuevoRelacionesReligion && this.isPermisoNuevoReligion));			
			this.jMenuItemNuevoGuardarCambiosReligion.setVisible((this.isVisibilidadCeldaNuevoReligion && this.isPermisoNuevoReligion && this.isPermisoGuardarCambiosReligion));									
			
			if(this.jInternalFrameDetalleFormReligion!=null) {
			this.jInternalFrameDetalleFormReligion.jMenuItemModificarReligion.setVisible((this.isVisibilidadCeldaModificarReligion && this.isPermisoActualizarReligion));	
			this.jInternalFrameDetalleFormReligion.jMenuItemActualizarReligion.setVisible((this.isVisibilidadCeldaActualizarReligion && this.isPermisoActualizarReligion));	
			this.jInternalFrameDetalleFormReligion.jMenuItemEliminarReligion.setVisible((this.isVisibilidadCeldaEliminarReligion && this.isPermisoEliminarReligion));
			this.jInternalFrameDetalleFormReligion.jMenuItemCancelarReligion.setVisible(this.isVisibilidadCeldaCancelarReligion);				
			}
			
			this.jMenuItemGuardarCambiosReligion.setVisible((this.isVisibilidadCeldaGuardarReligion && this.isPermisoGuardarCambiosReligion));						
			this.jMenuItemGuardarCambiosTablaReligion.setVisible((this.isVisibilidadCeldaGuardarCambiosReligion && this.isPermisoGuardarCambiosReligion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoReligion=this.jButtonNuevoReligion.isVisible();
			this.isVisibilidadCeldaDuplicarReligion=this.jButtonDuplicarReligion.isVisible();
			this.isVisibilidadCeldaCopiarReligion=this.jButtonCopiarReligion.isVisible();
			this.isVisibilidadCeldaVerFormReligion=this.jButtonVerFormReligion.isVisible();
			
			this.isVisibilidadCeldaOrdenReligion=this.jButtonAbrirOrderByReligion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesReligion=this.jButtonNuevoRelacionesReligion.isVisible();
			this.isVisibilidadCeldaModificarReligion=this.jButtonModificarReligion.isVisible();
			
			if(this.jInternalFrameDetalleFormReligion!=null) {
			this.isVisibilidadCeldaActualizarReligion=this.jInternalFrameDetalleFormReligion.jButtonActualizarReligion.isVisible();
			this.isVisibilidadCeldaEliminarReligion=this.jInternalFrameDetalleFormReligion.jButtonEliminarReligion.isVisible();
			this.isVisibilidadCeldaCancelarReligion=this.jInternalFrameDetalleFormReligion.jButtonCancelarReligion.isVisible();
			this.isVisibilidadCeldaGuardarReligion=this.jInternalFrameDetalleFormReligion.jButtonGuardarCambiosReligion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosReligion=this.jButtonGuardarCambiosTablaReligion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoReligion=this.jButtonNuevoToolBarReligion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesReligion=this.jButtonNuevoRelacionesToolBarReligion.isVisible();
			
			if(this.jInternalFrameDetalleFormReligion!=null) {
			this.isVisibilidadCeldaModificarReligion=this.jInternalFrameDetalleFormReligion.jButtonModificarToolBarReligion.isVisible();
			this.isVisibilidadCeldaActualizarReligion=this.jInternalFrameDetalleFormReligion.jButtonActualizarToolBarReligion.isVisible();
			this.isVisibilidadCeldaEliminarReligion=this.jInternalFrameDetalleFormReligion.jButtonEliminarToolBarReligion.isVisible();
			this.isVisibilidadCeldaCancelarReligion=this.jInternalFrameDetalleFormReligion.jButtonCancelarToolBarReligion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarReligion=this.jButtonGuardarCambiosToolBarReligion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosReligion=this.jButtonGuardarCambiosTablaToolBarReligion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoReligion=this.jMenuItemNuevoReligion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesReligion=this.jMenuItemNuevoRelacionesReligion.isVisible();
			
			if(this.jInternalFrameDetalleFormReligion!=null) {
			this.isVisibilidadCeldaModificarReligion=this.jInternalFrameDetalleFormReligion.jMenuItemModificarReligion.isVisible();
			this.isVisibilidadCeldaActualizarReligion=this.jInternalFrameDetalleFormReligion.jMenuItemActualizarReligion.isVisible();
			this.isVisibilidadCeldaEliminarReligion=this.jInternalFrameDetalleFormReligion.jMenuItemEliminarReligion.isVisible();
			this.isVisibilidadCeldaCancelarReligion=this.jInternalFrameDetalleFormReligion.jMenuItemCancelarReligion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarReligion=this.jMenuItemGuardarCambiosReligion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosReligion=this.jMenuItemGuardarCambiosTablaReligion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesReligion(Boolean esInicializar) {
		if(ReligionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.religionSessionBean.getConGuardarRelaciones()) {
				//if(this.religionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesReligion();
			}
			
			this.inicializarActualizarBindingBotonesManualReligion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualReligion() {
		this.jButtonNuevoReligion.setVisible(this.isPermisoNuevoReligion);			
		this.jButtonDuplicarReligion.setVisible(this.isPermisoDuplicarReligion);			
		this.jButtonCopiarReligion.setVisible(this.isPermisoCopiarReligion);			
		this.jButtonVerFormReligion.setVisible(this.isPermisoVerFormReligion);			
		
		this.jButtonAbrirOrderByReligion.setVisible(this.isPermisoOrdenReligion);					
		
		this.jButtonNuevoRelacionesReligion.setVisible(this.isPermisoNuevoReligion);			
		
		if(this.jInternalFrameDetalleFormReligion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReligion.jButtonModificarReligion.setVisible(this.isPermisoActualizarReligion);	
			this.jInternalFrameDetalleFormReligion.jButtonActualizarReligion.setVisible(this.isPermisoActualizarReligion);	
			this.jInternalFrameDetalleFormReligion.jButtonEliminarReligion.setVisible(this.isPermisoEliminarReligion);
			this.jInternalFrameDetalleFormReligion.jButtonCancelarReligion.setVisible(this.isVisibilidadCeldaCancelarReligion);						
			this.jInternalFrameDetalleFormReligion.jButtonGuardarCambiosReligion.setVisible(this.isPermisoGuardarCambiosReligion);							
		}
		
		this.jButtonGuardarCambiosTablaReligion.setVisible(this.isPermisoActualizarReligion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleReligion() {
		this.jInternalFrameDetalleFormReligion.jButtonModificarReligion.setVisible(this.isPermisoActualizarReligion);	
		this.jInternalFrameDetalleFormReligion.jButtonActualizarReligion.setVisible(this.isPermisoActualizarReligion);	
		this.jInternalFrameDetalleFormReligion.jButtonEliminarReligion.setVisible(this.isPermisoEliminarReligion);
		this.jInternalFrameDetalleFormReligion.jButtonCancelarReligion.setVisible(this.isVisibilidadCeldaCancelarReligion);							
		this.jInternalFrameDetalleFormReligion.jButtonGuardarCambiosReligion.setVisible((this.isVisibilidadCeldaGuardarReligion && this.isPermisoGuardarCambiosReligion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosReligion() {
		if(ReligionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualReligion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesReligion() {
	}
	
	public void jTableDatosReligionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarReligion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidReligionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.religionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReligion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReligion(this.getreligion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReligion(this.religion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.religion =(Religion) this.religionLogic.getReligions().toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.religion =(Religion) this.religions.toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.religion==null) {
						this.religion = new Religion();
					}

					this.setVariablesFormularioToObjetoActualReligion(this.religion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReligion(this.religion);
				}

				if(this.religion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.religion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReligion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.religionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.religionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.religionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoReligionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.religionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReligion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReligion(this.getreligion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReligion(this.religion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.religion =(Religion) this.religionLogic.getReligions().toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.religion =(Religion) this.religions.toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.religion==null) {
						this.religion = new Religion();
					}

					this.setVariablesFormularioToObjetoActualReligion(this.religion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReligion(this.religion);
				}

				if(this.religion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.religion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReligion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.religionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.religionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.religionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreReligionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.religionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReligion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReligion(this.getreligion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReligion(this.religion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.religion =(Religion) this.religionLogic.getReligions().toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.religion =(Religion) this.religions.toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.religion==null) {
						this.religion = new Religion();
					}

					this.setVariablesFormularioToObjetoActualReligion(this.religion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReligion(this.religion);
				}

				if(this.religion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.religion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReligion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.religionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.religionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.religionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameReligion() {
		if(this.jInternalFrameDetalleFormReligion!=null) {
		

		if(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormReligion!=null) {
			this.jInternalFrameDetalleFormReligion.setVisible(false);	    			
			this.jInternalFrameDetalleFormReligion.dispose();
			this.jInternalFrameDetalleFormReligion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoReligion!=null) {
			this.jInternalFrameReporteDinamicoReligion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoReligion.dispose();
			this.jInternalFrameReporteDinamicoReligion=null;
		}
		
		if(this.jInternalFrameImportacionReligion!=null) {
			this.jInternalFrameImportacionReligion.setVisible(false);	    			
			this.jInternalFrameImportacionReligion.dispose();
			this.jInternalFrameImportacionReligion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessReligion();
			
			ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
			
			
			if(sTipo.equals("NuevoReligion")) {
				jButtonNuevoReligionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarReligion")) {
				jButtonDuplicarReligionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarReligion")) {
				jButtonCopiarReligionActionPerformed(evt);
			} else if(sTipo.equals("VerFormReligion")) {
				jButtonVerFormReligionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarReligion")) {
				jButtonNuevoReligionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarReligion")) {
				jButtonDuplicarReligionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoReligion")) {
				jButtonNuevoReligionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarReligion")) {
				jButtonDuplicarReligionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesReligion")) {
				jButtonNuevoReligionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarReligion")) {
				jButtonNuevoReligionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesReligion")) {
				jButtonNuevoReligionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarReligion")) {
				jButtonModificarReligionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarReligion")) {
				jButtonModificarReligionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarReligion")) {
				jButtonModificarReligionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarReligion")) {
				jButtonActualizarReligionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarReligion")) {
				jButtonActualizarReligionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarReligion")) {
				jButtonActualizarReligionActionPerformed(evt);
			} else if(sTipo.equals("EliminarReligion")) {
				jButtonEliminarReligionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarReligion")) {
				jButtonEliminarReligionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarReligion")) {
				jButtonEliminarReligionActionPerformed(evt);
			} else if(sTipo.equals("CancelarReligion")) {
				jButtonCancelarReligionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarReligion")) {
				jButtonCancelarReligionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarReligion")) {
				jButtonCancelarReligionActionPerformed(evt);
			} else if(sTipo.equals("CerrarReligion")) {
				jButtonCerrarReligionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarReligion")) {
				jButtonCerrarReligionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarReligion")) {
				jButtonCerrarReligionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarReligion")) {
				jButtonMostrarOcultarReligionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarReligion")) {
				jButtonCancelarReligionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosReligion")) {
				jButtonGuardarCambiosReligionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarReligion")) {
				jButtonGuardarCambiosReligionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarReligion")) {
				jButtonCopiarReligionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarReligion")) {
				jButtonVerFormReligionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosReligion")) {
				jButtonGuardarCambiosReligionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarReligion")) {
				jButtonCopiarReligionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormReligion")) {
				jButtonVerFormReligionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaReligion")) {
				jButtonGuardarCambiosReligionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarReligion")) {
				jButtonGuardarCambiosReligionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaReligion")) {
				jButtonGuardarCambiosReligionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionReligion")) {
				jButtonRecargarInformacionReligionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarReligion")) {
				jButtonRecargarInformacionReligionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionReligion")) {
				jButtonRecargarInformacionReligionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresReligion")) {
				jButtonAnterioresReligionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarReligion")) {
				jButtonAnterioresReligionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreReligion")) {
				jButtonAnterioresReligionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesReligion")) {
				jButtonSiguientesReligionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarReligion")) {
				jButtonSiguientesReligionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesReligion")) {
				jButtonSiguientesReligionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByReligion") || sTipo.equals("MenuItemDetalleAbrirOrderByReligion")) {
				jButtonAbrirOrderByReligionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarReligion") || sTipo.equals("MenuItemDetalleMostrarOcultarReligion")) {
				jButtonMostrarOcultarReligionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosReligion")) {
				jButtonNuevoGuardarCambiosReligionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarReligion")) {
				jButtonNuevoGuardarCambiosReligionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosReligion")) {
				jButtonNuevoGuardarCambiosReligionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoReligion")) {
				jButtonCerrarReporteDinamicoReligionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoReligion")) {
				jButtonGenerarReporteDinamicoReligionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoReligion")) {
				
				jButtonGenerarExcelReporteDinamicoReligionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionReligion")) {
				jButtonCerrarImportacionReligionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionReligion")) {
				
				jButtonGenerarImportacionReligionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionReligion")) {
				
				jButtonAbrirImportacionReligionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesReligion")) {
				jComboBoxTiposAccionesReligionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesReligion")) {
				jComboBoxTiposRelacionesReligionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioReligion")) {
				jComboBoxTiposAccionesReligionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarReligion")) {
				
				jComboBoxTiposSeleccionarReligionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralReligion")) {
				jTextFieldValorCampoGeneralReligionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByReligion")) {
				jButtonAbrirOrderByReligionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarReligion")) {
				jButtonAbrirOrderByReligionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByReligion")) {
				jButtonCerrarOrderByReligionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idReligionBusqueda")) {
				this.jButtonidReligionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoReligionBusqueda")) {
				this.jButtoncodigoReligionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreReligionBusqueda")) {
				this.jButtonnombreReligionBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessReligion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReligionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.religion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.religion);
				
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
				
				


				
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Religion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Religion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Religion religionLocal=null;
			
			if(!this.getEsControlTabla()) {
				religionLocal=this.religion;
			} else {
				religionLocal=this.religionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.religion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.religion);
				
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
							
				
				


				
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Religion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Religion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReligionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReligion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.religionAnterior =(Religion) this.religionLogic.getReligions().toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.religionAnterior =(Religion) this.religions.toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
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
			
			ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
			
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
			
			


			
			ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReligionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.religion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.religion);
				
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
								
						
				


				
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Religion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Religion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.religion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.religion);
				
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
								
				
				


				
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Religion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Religion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReligionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReligion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.religionAnterior =(Religion) this.religionLogic.getReligions().toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.religionAnterior =(Religion) this.religions.toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.religion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.religion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReligionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReligion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.religionAnterior =(Religion) this.religionLogic.getReligions().toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.religionAnterior =(Religion) this.religions.toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReligionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.religion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.religion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.religion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.religion);
				
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
							
				
				


				
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Religion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Religion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReligionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosReligion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.religionAnterior =(Religion) this.religionLogic.getReligions().toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.religionAnterior =(Religion) this.religions.toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
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
			
			ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
			
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
			
			


			
			ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReligionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.religion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.religion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.religion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.religion);
				
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
								
				
				


				
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Religion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Religion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReligionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReligion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.religionAnterior =(Religion) this.religionLogic.getReligions().toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.religionAnterior =(Religion) this.religions.toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReligionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.religion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.religion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReligionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.religion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.religion);
				
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosReligion")) {
					jCheckBoxSeleccionarTodosReligionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosReligion")) {
					jCheckBoxSeleccionadosReligionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarReligion")) {
					
				}
				
				


				
				
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Religion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Religion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.religion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.religion);
				
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
												
				
				


				
				
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Religion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Religion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReligionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosReligion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.religionAnterior =(Religion) this.religionLogic.getReligions().toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.religionAnterior =(Religion) this.religions.toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReligionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.religion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.religion);
				
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
				
				
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
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
			
			ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
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
			
			


			
			ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReligionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.religion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.religion);
				
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Religion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Religion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.religion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.religion);
				
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
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
				
				


				
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Religion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Religion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReligionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReligion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.religionAnterior =(Religion) this.religionLogic.getReligions().toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.religionAnterior =(Religion) this.religions.toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarReligion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosReligionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosReligion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.religion =(Religion) this.religionLogic.getReligions().toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.religion =(Religion) this.religions.toArray()[this.jTableDatosReligion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.religion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarReligion")) {
				
				}
				
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarReligion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosReligion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarReligion")) {
			
			}
			
			ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessReligion();
			
			ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
			
			if(sTipo.equals("NuevoReligion")) {
				jButtonNuevoReligionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarReligion")) {
				jButtonDuplicarReligionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarReligion")) {
				jButtonCopiarReligionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormReligion")) {
				jButtonVerFormReligionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesReligion")) {
				jButtonNuevoReligionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarReligion")) {
				jButtonModificarReligionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarReligion")) {
				jButtonActualizarReligionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarReligion")) {
				jButtonEliminarReligionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaReligion")) {
				jButtonGuardarCambiosReligionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarReligion")) {
				jButtonCancelarReligionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarReligion")) {
				jButtonCerrarReligionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosReligion")) {
				jButtonGuardarCambiosReligionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosReligion")) {
				jButtonNuevoGuardarCambiosReligionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByReligion")) {
				jButtonAbrirOrderByReligionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionReligion")) {
				jButtonRecargarInformacionReligionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresReligion")) {
				jButtonAnterioresReligionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesReligion")) {
				jButtonSiguientesReligionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idReligionBusqueda")) {
				this.jButtonidReligionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoReligionBusqueda")) {
				this.jButtoncodigoReligionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreReligionBusqueda")) {
				this.jButtonnombreReligionBusquedaActionPerformed(evt);
			}
			
			ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessReligion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameReligion")) {
				closingInternalFrameReligion();
				
			} else if(sTipo.equals("jButtonCancelarReligion")) {
				JInternalFrameBase jInternalFrameDetalleFormReligion = (JInternalFrameBase)evt.getSource();
	            	
	            ReligionBeanSwingJInternalFrame jInternalFrameParent=(ReligionBeanSwingJInternalFrame)jInternalFrameDetalleFormReligion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarReligionActionPerformed(null);
			}
			
			ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.religion,new Object(),this.religionParameterGeneral,this.religionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormReligion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormReligion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormReligion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.religion)) {
			if(!esControlTabla) {
				if(ReligionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualReligion(this.religion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysReligion(this.religion);			
				}
				
				if(this.religionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualReligion(this.religion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.religionReturnGeneral=religionLogic.procesarEventosReligionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.religionLogic.getReligions(),this.religion,this.religionParameterGeneral,this.isEsNuevoReligion,classes);//this.religionLogic.getReligion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanReligion(this.religionReturnGeneral,this.religionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.religionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanReligion(classes,this.religionReturnGeneral,this.religionBean,false);
					}
						
					if(this.religionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyReligion(this.religionReturnGeneral.getReligion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioReligion(this.religionReturnGeneral.getReligion());	
					}
						
					if(this.religionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioReligion(this.religionReturnGeneral.getReligion(),classes);//this.religionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioReligion(this.religion,classes);//this.religionBean);									
				}
			
				if(ReligionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualReligion(this.religion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysReligion(this.religion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.religionAnterior!=null) {
						this.religion=this.religionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.religionReturnGeneral=religionLogic.procesarEventosReligionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.religionLogic.getReligions(),this.religion,this.religionParameterGeneral,this.isEsNuevoReligion,classes);//this.religionLogic.getReligion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.religionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.religionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.religionReturnGeneral.getReligion(),religionLogic.getReligions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.religionReturnGeneral.getReligion(),this.religions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosReligion.repaint();
				
				//((AbstractTableModel) this.jTableDatosReligion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosReligion();
			}
		}
	}
	
	public void actualizarVisualTableDatosReligion() throws Exception {
		
		ReligionModel religionModel=(ReligionModel)this.jTableDatosReligion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			religionModel.religions=this.religionLogic.getReligions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			religionModel.religions=this.religions;
		}
		
		
		((ReligionModel) this.jTableDatosReligion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaReligion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getreligionAnterior(),this.religionLogic.getReligions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getreligionAnterior(),this.religions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosReligion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioReligion(Religion religion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(religion.getEmpleados());
					this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
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
										
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.religion,new Object(),generalEntityParameterGeneral,this.religionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.religionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ReligionConstantesFunciones.getClassesRelationshipsOfReligion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ReligionConstantesFunciones.getClassesRelationshipsFromStringsOfReligion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormReligion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ReligionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.religion,new Object(),generalEntityParameterGeneral,this.religionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioReligion(ReligionBean religionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(religion.getEmpleados());
					this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanReligion(ArrayList<Classe> classes,ReligionReturnGeneral religionReturnGeneral,ReligionBean religionBean,Boolean conDefault) throws Exception {
		
			this.religionBean.setEmpleados(religionReturnGeneral.getReligion().getEmpleados());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualReligion(Religion religion,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					religion.setEmpleados(this.jInternalFrameDetalleFormReligion.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
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
		if(!paraTabla && !this.permiteMantenimiento(this.religion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormReligion = new ReligionDetalleFormJInternalFrame(jDesktopPane,this.religionSessionBean.getConGuardarRelaciones(),this.religionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormReligion);
		this.jInternalFrameDetalleFormReligion.setVisible(false);
		this.jInternalFrameDetalleFormReligion.setSelected(false);						
		
		this.jInternalFrameDetalleFormReligion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormReligion.religionLogic=this.religionLogic;
		
		this.cargarCombosFrameForeignKeyReligion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleReligion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleReligion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyReligion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyReligion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormReligion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarReligion"));
		
		this.jInternalFrameDetalleFormReligion.jButtonModificarReligion.addActionListener(new ButtonActionListener(this,"ModificarReligion"));

		
		this.jInternalFrameDetalleFormReligion.jButtonModificarToolBarReligion.addActionListener(new ButtonActionListener(this,"ModificarToolBarReligion"));
					
		this.jInternalFrameDetalleFormReligion.jMenuItemModificarReligion.addActionListener(new ButtonActionListener(this,"MenuItemModificarReligion"));		
		
		
		
		this.jInternalFrameDetalleFormReligion.jButtonActualizarReligion.addActionListener (new ButtonActionListener(this,"ActualizarReligion"));
		
		
		this.jInternalFrameDetalleFormReligion.jButtonActualizarToolBarReligion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarReligion"));
						
		this.jInternalFrameDetalleFormReligion.jMenuItemActualizarReligion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarReligion"));		
		
		
		
		this.jInternalFrameDetalleFormReligion.jButtonEliminarReligion.addActionListener (new ButtonActionListener(this,"EliminarReligion"));
		
		
		this.jInternalFrameDetalleFormReligion.jButtonEliminarToolBarReligion.addActionListener (new ButtonActionListener(this,"EliminarToolBarReligion"));
								
		this.jInternalFrameDetalleFormReligion.jMenuItemEliminarReligion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarReligion"));		
		
		
		
		this.jInternalFrameDetalleFormReligion.jButtonCancelarReligion.addActionListener (new ButtonActionListener(this,"CancelarReligion"));
		
		
		this.jInternalFrameDetalleFormReligion.jButtonCancelarToolBarReligion.addActionListener (new ButtonActionListener(this,"CancelarToolBarReligion"));
					
		this.jInternalFrameDetalleFormReligion.jMenuItemCancelarReligion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarReligion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormReligion.jMenuItemDetalleCerrarReligion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarReligion"));		
		
		
		
		this.jInternalFrameDetalleFormReligion.jButtonGuardarCambiosToolBarReligion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarReligion"));
		
		
		
		this.jInternalFrameDetalleFormReligion.jButtonGuardarCambiosToolBarReligion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarReligion"));
		
		
		
		this.jInternalFrameDetalleFormReligion.jComboBoxTiposAccionesFormularioReligion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioReligion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReligion.jButtonidReligionBusqueda.addActionListener(new ButtonActionListener(this,"idReligionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReligion.jButtoncodigoReligionBusqueda.addActionListener(new ButtonActionListener(this,"codigoReligionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReligion.jButtonnombreReligionBusqueda.addActionListener(new ButtonActionListener(this,"nombreReligionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormReligion.jTabbedPaneRelacionesReligion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesReligion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameReligion"));
		
		if(this.jInternalFrameDetalleFormReligion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReligion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarReligion"));
		}
		
		this.jTableDatosReligion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarReligion"));
		
		this.jTableDatosReligion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarReligion"));
		
		this.jButtonNuevoReligion.addActionListener(new ButtonActionListener(this,"NuevoReligion"));
		
		this.jButtonDuplicarReligion.addActionListener(new ButtonActionListener(this,"DuplicarReligion"));
		
		this.jButtonCopiarReligion.addActionListener(new ButtonActionListener(this,"CopiarReligion"));
		
		this.jButtonVerFormReligion.addActionListener(new ButtonActionListener(this,"VerFormReligion"));
		
		
		this.jButtonNuevoToolBarReligion.addActionListener(new ButtonActionListener(this,"NuevoToolBarReligion"));
			
		this.jButtonDuplicarToolBarReligion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarReligion"));
			
		this.jMenuItemNuevoReligion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoReligion"));
			
		this.jMenuItemDuplicarReligion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarReligion"));		
		
		
		this.jButtonNuevoRelacionesReligion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesReligion"));
		
		
		this.jButtonNuevoRelacionesToolBarReligion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarReligion"));
			
		this.jMenuItemNuevoRelacionesReligion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesReligion"));		
		
		
		if(this.jInternalFrameDetalleFormReligion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReligion.jButtonModificarReligion.addActionListener(new ButtonActionListener(this,"ModificarReligion"));
		}
		
		
		if(this.jInternalFrameDetalleFormReligion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReligion.jButtonModificarToolBarReligion.addActionListener(new ButtonActionListener(this,"ModificarToolBarReligion"));
			
			this.jInternalFrameDetalleFormReligion.jMenuItemModificarReligion.addActionListener(new ButtonActionListener(this,"MenuItemModificarReligion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReligion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormReligion.jButtonActualizarReligion.addActionListener (new ButtonActionListener(this,"ActualizarReligion"));
		}
		
		
		if(this.jInternalFrameDetalleFormReligion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReligion.jButtonActualizarToolBarReligion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarReligion"));
				
			this.jInternalFrameDetalleFormReligion.jMenuItemActualizarReligion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarReligion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReligion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReligion.jButtonEliminarReligion.addActionListener (new ButtonActionListener(this,"EliminarReligion"));
		}
		
		
		if(this.jInternalFrameDetalleFormReligion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReligion.jButtonEliminarToolBarReligion.addActionListener (new ButtonActionListener(this,"EliminarToolBarReligion"));
						
			this.jInternalFrameDetalleFormReligion.jMenuItemEliminarReligion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarReligion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReligion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReligion.jButtonCancelarReligion.addActionListener (new ButtonActionListener(this,"CancelarReligion"));
		}
		
		
		if(this.jInternalFrameDetalleFormReligion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReligion.jButtonCancelarToolBarReligion.addActionListener (new ButtonActionListener(this,"CancelarToolBarReligion"));
			
			this.jInternalFrameDetalleFormReligion.jMenuItemCancelarReligion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarReligion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarReligion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarReligion"));		
		
		
		this.jButtonCerrarReligion.addActionListener (new ButtonActionListener(this,"CerrarReligion"));
		
		
		this.jButtonCerrarToolBarReligion.addActionListener (new ButtonActionListener(this,"CerrarToolBarReligion"));
			
		this.jMenuItemCerrarReligion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarReligion"));
			
		if(this.jInternalFrameDetalleFormReligion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReligion.jMenuItemDetalleCerrarReligion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarReligion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReligion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReligion.jButtonGuardarCambiosReligion.addActionListener (new ButtonActionListener(this,"GuardarCambiosReligion"));
		}
		
		
		if(this.jInternalFrameDetalleFormReligion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReligion.jButtonGuardarCambiosToolBarReligion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarReligion"));
		}
		
		this.jButtonCopiarToolBarReligion.addActionListener (new ButtonActionListener(this,"CopiarToolBarReligion"));
			
		this.jButtonVerFormToolBarReligion.addActionListener (new ButtonActionListener(this,"VerFormToolBarReligion"));
		
		this.jMenuItemGuardarCambiosReligion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosReligion"));
			
		this.jMenuItemCopiarReligion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarReligion"));		
		
		this.jMenuItemVerFormReligion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormReligion"));		
		
		
		this.jButtonGuardarCambiosTablaReligion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaReligion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarReligion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarReligion"));
			
		this.jMenuItemGuardarCambiosTablaReligion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaReligion"));		
		
		
		
		this.jButtonRecargarInformacionReligion.addActionListener (new ButtonActionListener(this,"RecargarInformacionReligion"));
					
		this.jButtonRecargarInformacionToolBarReligion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarReligion"));
		
		this.jMenuItemRecargarInformacionReligion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionReligion"));		
		
		
		
		this.jButtonAnterioresReligion.addActionListener (new ButtonActionListener(this,"AnterioresReligion"));
		
		
		this.jButtonAnterioresToolBarReligion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarReligion"));
		
		this.jMenuItemAnterioresReligion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresReligion"));		
		
		
		this.jButtonSiguientesReligion.addActionListener (new ButtonActionListener(this,"SiguientesReligion"));
		
		
		this.jButtonSiguientesToolBarReligion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarReligion"));
			
		this.jMenuItemSiguientesReligion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesReligion"));
			
		this.jMenuItemAbrirOrderByReligion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByReligion"));
			
		this.jMenuItemMostrarOcultarReligion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarReligion"));
			
		this.jMenuItemDetalleAbrirOrderByReligion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByReligion"));
			
		this.jMenuItemDetalleMostarOcultarReligion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarReligion"));		
		
		
		this.jButtonNuevoGuardarCambiosReligion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosReligion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarReligion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarReligion"));
			
		this.jMenuItemNuevoGuardarCambiosReligion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosReligion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosReligion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosReligion"));

		this.jCheckBoxSeleccionadosReligion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosReligion"));
		
		if(this.jInternalFrameDetalleFormReligion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReligion.jComboBoxTiposAccionesFormularioReligion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioReligion"));
		}
		
		
		this.jComboBoxTiposRelacionesReligion.addActionListener (new ButtonActionListener(this,"TiposRelacionesReligion"));
			
		this.jComboBoxTiposAccionesReligion.addActionListener (new ButtonActionListener(this,"TiposAccionesReligion"));
					
		this.jComboBoxTiposSeleccionarReligion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarReligion"));
			
		this.jTextFieldValorCampoGeneralReligion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralReligion"));		
		
		
		if(this.jInternalFrameDetalleFormReligion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReligion.jButtonidReligionBusqueda.addActionListener(new ButtonActionListener(this,"idReligionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReligion.jButtoncodigoReligionBusqueda.addActionListener(new ButtonActionListener(this,"codigoReligionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReligion.jButtonnombreReligionBusqueda.addActionListener(new ButtonActionListener(this,"nombreReligionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoReligion!=null) {
				this.jInternalFrameReporteDinamicoReligion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoReligion"));
				this.jInternalFrameReporteDinamicoReligion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoReligion"));
				this.jInternalFrameReporteDinamicoReligion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoReligion"));
			}
			
			//this.jButtonCerrarReporteDinamicoReligion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoReligion"));				
			//this.jButtonGenerarReporteDinamicoReligion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoReligion"));
			//this.jButtonGenerarExcelReporteDinamicoReligion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoReligion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionReligion!=null) {
				this.jInternalFrameImportacionReligion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionReligion"));
				this.jInternalFrameImportacionReligion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionReligion"));
				this.jInternalFrameImportacionReligion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionReligion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByReligion.addActionListener (new ButtonActionListener(this,"AbrirOrderByReligion"));
			
			this.jButtonAbrirOrderByToolBarReligion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarReligion"));			
			
			if(this.jInternalFrameOrderByReligion!=null) {
				this.jInternalFrameOrderByReligion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByReligion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormReligion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormReligion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReligion.jTabbedPaneRelacionesReligion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesReligion"));
		
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
            		closingInternalFrameReligion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormReligion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormReligion = (JInternalFrameBase)event.getSource();
	            	
	            ReligionBeanSwingJInternalFrame jInternalFrameParent=(ReligionBeanSwingJInternalFrame)jInternalFrameDetalleFormReligion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarReligionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosReligion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosReligionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosReligion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosReligion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReligionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReligionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReligionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoReligion";
		inputMap = this.jButtonNuevoReligion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoReligion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoReligionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReligionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReligionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReligionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesReligion";
		inputMap = this.jButtonNuevoRelacionesReligion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesReligion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoReligionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarReligion";
		inputMap = this.jButtonModificarReligion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarReligion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarReligionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarReligion";
		inputMap = this.jButtonActualizarReligion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarReligion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarReligionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarReligion";
		inputMap = this.jButtonEliminarReligion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarReligion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarReligionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarReligion";
		inputMap = this.jButtonCancelarReligion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarReligion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarReligionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarReligion";
		inputMap = this.jButtonCerrarReligion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarReligion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarReligionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormReligion.jButtonGuardarCambiosReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosReligion";
		inputMap = this.jInternalFrameDetalleFormReligion.jButtonGuardarCambiosReligion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormReligion.jButtonGuardarCambiosReligion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosReligionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosReligion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosReligionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesReligion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesReligionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarReligion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarReligionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralReligion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralReligionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReligion.jButtonidReligionBusqueda.addActionListener(new ButtonActionListener(this,"idReligionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReligion.jButtoncodigoReligionBusqueda.addActionListener(new ButtonActionListener(this,"codigoReligionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReligion.jButtonnombreReligionBusqueda.addActionListener(new ButtonActionListener(this,"nombreReligionBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionReligion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionReligionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarReligionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarReligion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosReligion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Religion religionAux:this.religionLogic.getReligions()) {
					religionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Religion religionAux:religions) {
					religionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosReligionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingReligion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Religion religionAux:this.religionLogic.getReligions()) {
						religionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Religion religionAux:religions) {
						religionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Religion religionAux:this.religionLogic.getReligions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Religion religionAux:religions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaReligion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosReligion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosReligion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosReligion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosReligionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingReligion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosReligion.getSelectedRows();
			
			Religion religionLocal=new Religion();
			
			//this.seleccionarTodosReligion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					religionLocal =(Religion) this.religionLogic.getReligions().toArray()[this.jTableDatosReligion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					religionLocal =(Religion) this.religions.toArray()[this.jTableDatosReligion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				religionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Religion religionAux:this.religionLogic.getReligions()) {
						religionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Religion religionAux:religions) {
						religionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaReligion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosReligion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosReligion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosReligion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualReligionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarReligionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralReligionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingReligion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralReligion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Religion religionAux:this.religionLogic.getReligions()) {
				
						if(sTipoSeleccionar.equals(ReligionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							religionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReligionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							religionAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Religion religionAux:religions) {
					
						if(sTipoSeleccionar.equals(ReligionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							religionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReligionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							religionAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaReligion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesReligionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingReligion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioReligion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesReligion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormReligion.jComboBoxTiposAccionesFormularioReligion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteReligion) {				
					conSplash=true;//false;										
					
					//this.startProcessReligion(conSplash);
				
					this.generarReporteReligionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReligion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReligion.jComboBoxTiposAccionesFormularioReligion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoReligionsSeleccionados();
				//this.jComboBoxTiposAccionesReligion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoReligionsSeleccionados(false);
				//this.jComboBoxTiposAccionesReligion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoReligionsSeleccionados(true);
				//this.jComboBoxTiposAccionesReligion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessReligion();
				
				this.exportarReligionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReligion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReligion.jComboBoxTiposAccionesFormularioReligion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionReligions();
				//this.importarReligions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReligion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReligion.jComboBoxTiposAccionesFormularioReligion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessReligion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelReligionsSeleccionados();
				//this.jComboBoxTiposAccionesReligion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Religion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessReligion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoReligion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyReligion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Religion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReligion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReligion.jComboBoxTiposAccionesFormularioReligion.setSelectedIndex(0);					
				}	
			} 			
			else if(ReligionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteReligion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessReligion(conSplash);
					
						//this.actualizarParametrosGeneralReligion();
						
						this.generarReporteProcesoAccionReligionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesReligion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormReligion.jComboBoxTiposAccionesFormularioReligion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ReligionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO ReligionES SELECCIONADOS?", "MANTENIMIENTO DE Religion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessReligion();
				
						this.actualizarParametrosGeneralReligion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.religionReturnGeneral=religionLogic.procesarAccionReligionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.religionLogic.getReligions(),this.religionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarReligionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesReligion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormReligion.jComboBoxTiposAccionesFormularioReligion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralReligion();
					
					ReligionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarReligionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesReligion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormReligion.jComboBoxTiposAccionesFormularioReligion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessReligion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesReligionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessReligion();
			
			if(this.jInternalFrameDetalleFormReligion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Religion> religionsSeleccionados=new ArrayList<Religion>();		
			Religion religion=new Religion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingReligion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesReligion.getSelectedItem();
			
			
			
			
			religionsSeleccionados=this.getReligionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(religionsSeleccionados.size()==1) {
				for(Religion religionAux:religionsSeleccionados) {
					religion=religionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Empleado")) {
					jButtonEmpleadoActionPerformed(null,rowIndex,true,false,religion);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessReligion();
			
      		//this.finishProcessReligion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarReligionReturnGeneral() throws Exception {
		if(this.religionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.religionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.religionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.religionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.religionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.religionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingReligion(false);
		}
		
		if(this.religionReturnGeneral.getConRetornoLista() || this.religionReturnGeneral.getConRetornoObjeto()) {
			if(this.religionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.religionLogic.setReligions(this.religionReturnGeneral.getReligions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.religionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.religionLogic.setReligion(this.religionReturnGeneral.getReligion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingReligion(false);
		}
	}
	
	public void actualizarParametrosGeneralReligion() throws Exception {
		
		
	}
	
	public ArrayList<Religion> getReligionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Religion> religionsSeleccionados=new ArrayList<Religion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioReligion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Religion religionAux:religionLogic.getReligions()) {
					if(religionAux.getIsSelected()) {
						religionsSeleccionados.add(religionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Religion religionAux:this.religions) {
					if(religionAux.getIsSelected()) {
						religionsSeleccionados.add(religionAux);				
					}
				}
			}
			
			if(religionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						religionsSeleccionados.addAll(this.religionLogic.getReligions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						religionsSeleccionados.addAll(this.religions);				
					}
				}
			}
		} else {
			religionsSeleccionados.add(this.religion);
		}
		
		return religionsSeleccionados;
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
	
	public void generarReporteReligionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalReligionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoReligionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoReligionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoReligionsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesReligionsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Religion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesReligionsSeleccionados() throws Exception {
		ArrayList<Religion> religionsSeleccionados=new ArrayList<Religion>();		
		
		religionsSeleccionados=this.getReligionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteReligions("Todos",religionsSeleccionados);
		
	}	
	
	public void generarReporteNormalReligionsSeleccionados() throws Exception {
		ArrayList<Religion> religionsSeleccionados=new ArrayList<Religion>();		
		
		religionsSeleccionados=this.getReligionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteReligions("Todos",religionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionReligionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Religion> religionsSeleccionados=new ArrayList<Religion>();
		
		religionsSeleccionados=this.getReligionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteReligions("Todos",religionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoReligionsSeleccionados() throws Exception {
		ArrayList<Religion> religionsSeleccionados=new ArrayList<Religion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoReligion();
		
		
		religionsSeleccionados=this.getReligionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoReligion();
		
		
		//this.generarReporteReligions("Todos",religionsSeleccionados ,religionImplementable,religionImplementableHome);
	}
	
	public void mostrarImportacionReligions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionReligion();
		
		this.abrirFrameImportacionReligion();		
		
			
		//this.generarReporteReligions("Todos",religionsSeleccionados ,religionImplementable,religionImplementableHome);
	}
	
	public void importarReligions() throws Exception {		
	
	}
	
	public void exportarReligionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelReligionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoReligionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlReligionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Religion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoReligionsSeleccionados() throws Exception {
		ArrayList<Religion> religionsSeleccionados=new ArrayList<Religion>();		
		
		religionsSeleccionados=this.getReligionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"religion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarReligion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Religion religionAux:religionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarReligion(religionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//religionAux.setsDetalleGeneralEntityReporte(religionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.religionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Religion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarReligion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ReligionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReligionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReligionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReligionConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarReligion(Religion religion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=religion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=religion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=religion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=religion.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelReligionsSeleccionados() throws Exception {
		ArrayList<Religion> religionsSeleccionados=new ArrayList<Religion>();		
		
		religionsSeleccionados=this.getReligionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"religion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Religions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelReligion(row);				
				iRow++;
			}				
			
			for(Religion religionAux:religionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelReligion(religionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.religionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Religion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlReligionsSeleccionados() throws Exception {
		ArrayList<Religion> religionsSeleccionados=new ArrayList<Religion>();		
		
		religionsSeleccionados=this.getReligionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"religion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("religions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("religion");
			//elementRoot.appendChild(element);
		
			for(Religion religionAux:religionsSeleccionados) {
				element = document.createElement("religion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlReligion(religionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.religionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Religion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelReligion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ReligionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ReligionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ReligionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ReligionConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelReligion(Religion religion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(religion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(religion.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(religion.getnombre());				
	}
	
	public void setFilaDatosExportarXmlReligion(Religion religion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ReligionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(religion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ReligionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(religion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(ReligionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(religion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(ReligionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(religion.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoReligionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Religion> religionsSeleccionados=new ArrayList<Religion>();
		
		religionsSeleccionados=this.getReligionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoReligion(religionsSeleccionados);
		
		this.generarReporteReligions("Todos",religionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoReligion(ArrayList<Religion> religionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Religion religionAux:religionsSeleccionados) {
				religionAux.setsDetalleGeneralEntityReporte(religionAux.toString());
			
				if(sTipoSeleccionar.equals(ReligionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					religionAux.setsDescripcionGeneralEntityReporte1(religionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ReligionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					religionAux.setsDescripcionGeneralEntityReporte1(religionAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReligionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesReligion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoReligion=true;
				this.isVisibilidadCeldaNuevoRelacionesReligion=true;
				this.isVisibilidadCeldaGuardarCambiosReligion=true;
			}
			
			this.isVisibilidadCeldaModificarReligion=false;
			this.isVisibilidadCeldaActualizarReligion=false;
			this.isVisibilidadCeldaEliminarReligion=false;
			this.isVisibilidadCeldaCancelarReligion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReligion=true;
				} else {
					this.isVisibilidadCeldaGuardarReligion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoReligion=false;
			this.isVisibilidadCeldaNuevoRelacionesReligion=false;
			this.isVisibilidadCeldaGuardarCambiosReligion=false;
			this.isVisibilidadCeldaModificarReligion=false;
			this.isVisibilidadCeldaActualizarReligion=true;
			this.isVisibilidadCeldaEliminarReligion=false;
			this.isVisibilidadCeldaCancelarReligion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReligion=true;
				} else {
					this.isVisibilidadCeldaGuardarReligion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoReligion=false;
			this.isVisibilidadCeldaNuevoRelacionesReligion=false;
			this.isVisibilidadCeldaGuardarCambiosReligion=false;
			this.isVisibilidadCeldaModificarReligion=false;
			this.isVisibilidadCeldaActualizarReligion=true;
			this.isVisibilidadCeldaEliminarReligion=true;
			this.isVisibilidadCeldaCancelarReligion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReligion=true;
				} else {
					this.isVisibilidadCeldaGuardarReligion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoReligion=false;
			this.isVisibilidadCeldaNuevoRelacionesReligion=false;
			this.isVisibilidadCeldaGuardarCambiosReligion=false;
			this.isVisibilidadCeldaModificarReligion=false;
			this.isVisibilidadCeldaActualizarReligion=true;
			this.isVisibilidadCeldaEliminarReligion=false;
			this.isVisibilidadCeldaCancelarReligion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReligion=false;
				} else {
					this.isVisibilidadCeldaGuardarReligion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoReligion=true;
			this.isVisibilidadCeldaNuevoRelacionesReligion=true;
			this.isVisibilidadCeldaGuardarCambiosReligion=true;
			this.isVisibilidadCeldaModificarReligion=false;
			this.isVisibilidadCeldaActualizarReligion=false;
			this.isVisibilidadCeldaEliminarReligion=false;
			this.isVisibilidadCeldaCancelarReligion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReligion=true;
				} else {
					this.isVisibilidadCeldaGuardarReligion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoReligion=false;
			this.isVisibilidadCeldaNuevoRelacionesReligion=false;
			this.isVisibilidadCeldaGuardarCambiosReligion=false;
			this.isVisibilidadCeldaActualizarReligion=false;
			this.isVisibilidadCeldaEliminarReligion=false;
			this.isVisibilidadCeldaCancelarReligion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReligion=false;
				} else {
					this.isVisibilidadCeldaGuardarReligion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoReligion=false;
			this.isVisibilidadCeldaNuevoRelacionesReligion=false;
			this.isVisibilidadCeldaGuardarCambiosReligion=false;
			this.isVisibilidadCeldaModificarReligion=true;
			this.isVisibilidadCeldaActualizarReligion=false;
			this.isVisibilidadCeldaEliminarReligion=false;
			this.isVisibilidadCeldaCancelarReligion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReligion=false;
				} else {
					this.isVisibilidadCeldaGuardarReligion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ReligionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoReligion=true;
			this.isVisibilidadCeldaNuevoRelacionesReligion=true;
			this.isVisibilidadCeldaGuardarCambiosReligion=true;
		} else {
			this.actualizarEstadoPanelsReligion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarReligion=false;
			//this.isVisibilidadCeldaVerFormReligion=false;
			this.isVisibilidadCeldaDuplicarReligion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!religionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesReligion=false;
		} else {
			this.isVisibilidadCeldaNuevoReligion=false;
			this.isVisibilidadCeldaGuardarCambiosReligion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(religionSessionBean.getEsGuardarRelacionado()) {
			if(!religionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesReligion=false;												
			}
			
			this.jButtonCerrarReligion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesReligion=false;
		}
		
		if(!this.permiteMantenimiento(this.religion)) {
			this.isVisibilidadCeldaActualizarReligion=false;
			this.isVisibilidadCeldaEliminarReligion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesReligion() {
		this.isVisibilidadCeldaNuevoReligion=false;
		this.isVisibilidadCeldaGuardarCambiosReligion=false;
	}
	
	public void actualizarEstadoPanelsReligion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionReligion!=null) {
				this.jScrollPanelDatosEdicionReligion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosReligion!=null) {
				this.jScrollPanelDatosReligion.setVisible(true);
			}
			
			if(this.jPanelPaginacionReligion!=null) {
				this.jPanelPaginacionReligion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReligion!=null) {
				this.jPanelParametrosReportesReligion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionReligion!=null) {
				this.jScrollPanelDatosEdicionReligion.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosReligion!=null) {
				this.jScrollPanelDatosReligion.setVisible(false);
			}
			
			if(this.jPanelPaginacionReligion!=null) {
				this.jPanelPaginacionReligion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesReligion!=null) {
				this.jPanelParametrosReportesReligion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionReligion!=null) {
				this.jScrollPanelDatosEdicionReligion.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosReligion!=null) {
				this.jScrollPanelDatosReligion.setVisible(false);
			}
			
			if(this.jPanelPaginacionReligion!=null) {
				this.jPanelPaginacionReligion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesReligion!=null) {
				this.jPanelParametrosReportesReligion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionReligion!=null) {
				this.jScrollPanelDatosEdicionReligion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosReligion!=null) {
				this.jScrollPanelDatosReligion.setVisible(false);
			}
			
			if(this.jPanelPaginacionReligion!=null) {
				this.jPanelPaginacionReligion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesReligion!=null) {
				this.jPanelParametrosReportesReligion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionReligion!=null) {
				this.jScrollPanelDatosEdicionReligion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosReligion!=null) {
				this.jScrollPanelDatosReligion.setVisible(true);
			}
			
			if(this.jPanelPaginacionReligion!=null) {
				this.jPanelPaginacionReligion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReligion!=null) {
				this.jPanelParametrosReportesReligion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionReligion!=null) {
				this.jScrollPanelDatosEdicionReligion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosReligion!=null) {
				this.jScrollPanelDatosReligion.setVisible(true);
			}
			
			if(this.jPanelPaginacionReligion!=null) {
				this.jPanelPaginacionReligion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReligion!=null) {
				this.jPanelParametrosReportesReligion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionReligion!=null) {
				this.jScrollPanelDatosEdicionReligion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosReligion!=null) {
				this.jScrollPanelDatosReligion.setVisible(true);
			}
			
			if(this.jPanelPaginacionReligion!=null) {
				this.jPanelPaginacionReligion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReligion!=null) {
				this.jPanelParametrosReportesReligion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.religionSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.religionSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionReligionParaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(this.religionSessionBean==null) {
				this.religionSessionBean=new ReligionSessionBean();
			}

			if(this.jInternalFrameDetalleFormReligion.empleadoSessionBean==null) {
				this.jInternalFrameDetalleFormReligion.empleadoSessionBean=new EmpleadoSessionBean();
			}

			this.jInternalFrameDetalleFormReligion.empleadoSessionBean.setsPathNavegacionActual(religionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormReligion.empleadoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupEmpleado=this.jInternalFrameDetalleFormReligion.empleadoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormReligion.empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			this.jInternalFrameDetalleFormReligion.empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(ReligionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormReligion.empleadoSessionBean.setisBusquedaDesdeForeignKeySesionReligion(true);
			this.jInternalFrameDetalleFormReligion.empleadoSessionBean.setlidReligionActual(this.idReligionActual);

			religionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyReligion(true);
			religionSessionBean.setlIdReligionActualForeignKey(this.idReligionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ReligionSessionBean religionSessionBean=new ReligionSessionBean();
		
		if(this.religionSessionBean==null) {
			this.religionSessionBean=new ReligionSessionBean();
		}
		
		this.religionSessionBean.setsUltimaBusquedaReligion(this.getsAccionBusqueda());
		this.religionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.religionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ReligionSessionBean religionSessionBean=new ReligionSessionBean();
		
		if(this.religionSessionBean==null) {
			this.religionSessionBean=new ReligionSessionBean();
		}
		
		if(this.religionSessionBean.getsUltimaBusquedaReligion()!=null&&!this.religionSessionBean.getsUltimaBusquedaReligion().equals("")) {
			this.setsAccionBusqueda(religionSessionBean.getsUltimaBusquedaReligion());
			this.setiNumeroPaginacion(religionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(religionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.religionSessionBean.setsUltimaBusquedaReligion("");
		this.religionSessionBean.setiNumeroPaginacion(ReligionConstantesFunciones.INUMEROPAGINACION);
		this.religionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaReligion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioReligion() {
		this.updateBorderResaltarBusquedasFormularioReligion();
		this.updateVisibilidadBusquedasFormularioReligion();
		this.updateHabilitarBusquedasFormularioReligion();
	}
	
	public void updateBorderResaltarBusquedasFormularioReligion() {					
	}
	
	public void updateVisibilidadBusquedasFormularioReligion() {
	}
	
	public void updateHabilitarBusquedasFormularioReligion() {
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
	
	public void updateControlesFormularioReligion() throws Exception {

		if(this.jInternalFrameDetalleFormReligion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioReligion();
		this.updateVisibilidadResaltarControlesFormularioReligion();
		this.updateHabilitarResaltarControlesFormularioReligion();
		
	}
	
	public void updateBorderResaltarControlesFormularioReligion() throws Exception {
		if(this.jInternalFrameDetalleFormReligion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.religionConstantesFunciones.resaltaridReligion!=null && this.jInternalFrameDetalleFormReligion!=null) {this.jInternalFrameDetalleFormReligion.jLabelidReligion.setBorder(this.religionConstantesFunciones.resaltaridReligion);}
		if(this.religionConstantesFunciones.resaltarcodigoReligion!=null && this.jInternalFrameDetalleFormReligion!=null) {this.jInternalFrameDetalleFormReligion.jTextFieldcodigoReligion.setBorder(this.religionConstantesFunciones.resaltarcodigoReligion);}
		if(this.religionConstantesFunciones.resaltarnombreReligion!=null && this.jInternalFrameDetalleFormReligion!=null) {this.jInternalFrameDetalleFormReligion.jTextAreanombreReligion.setBorder(this.religionConstantesFunciones.resaltarnombreReligion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioReligion() throws Exception {		
		if(this.jInternalFrameDetalleFormReligion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormReligion!=null) {
	
		//this.jInternalFrameDetalleFormReligion.jLabelidReligion.setVisible(this.religionConstantesFunciones.mostraridReligion);
		this.jInternalFrameDetalleFormReligion.jPanelidReligion.setVisible(this.religionConstantesFunciones.mostraridReligion);
		//this.jInternalFrameDetalleFormReligion.jTextFieldcodigoReligion.setVisible(this.religionConstantesFunciones.mostrarcodigoReligion);
		this.jInternalFrameDetalleFormReligion.jPanelcodigoReligion.setVisible(this.religionConstantesFunciones.mostrarcodigoReligion);
		//this.jInternalFrameDetalleFormReligion.jTextAreanombreReligion.setVisible(this.religionConstantesFunciones.mostrarnombreReligion);
		this.jInternalFrameDetalleFormReligion.jPanelnombreReligion.setVisible(this.religionConstantesFunciones.mostrarnombreReligion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioReligion() throws Exception {
		if(this.jInternalFrameDetalleFormReligion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormReligion!=null) {
	
		this.jInternalFrameDetalleFormReligion.jLabelidReligion.setEnabled(this.religionConstantesFunciones.activaridReligion);
		this.jInternalFrameDetalleFormReligion.jTextFieldcodigoReligion.setEnabled(this.religionConstantesFunciones.activarcodigoReligion);
		this.jInternalFrameDetalleFormReligion.jTextAreanombreReligion.setEnabled(this.religionConstantesFunciones.activarnombreReligion);
		}
	}
	
		
}