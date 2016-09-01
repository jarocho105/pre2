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

import com.bydan.erp.nomina.util.TipoLibretaMiliConstantesFunciones;
import com.bydan.erp.nomina.util.TipoLibretaMiliParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoLibretaMiliParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoLibretaMiliBean;
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
public class TipoLibretaMiliBeanSwingJInternalFrame extends TipoLibretaMiliJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoLibretaMiliBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoLibretaMili> tipolibretamiliValidator = new ClassValidator<TipoLibretaMili>(TipoLibretaMili.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoLibretaMili tipolibretamili;	
	public TipoLibretaMili tipolibretamiliAux;
	public TipoLibretaMili tipolibretamiliAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoLibretaMili tipolibretamiliTotales;
	public Long idTipoLibretaMiliActual;
	public Long iIdNuevoTipoLibretaMili=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosDatoGeneralEmpleado=false;

	public Boolean getIsTienePermisosDatoGeneralEmpleado() {
		return isTienePermisosDatoGeneralEmpleado;
	}

	public void setIsTienePermisosDatoGeneralEmpleado(Boolean isTienePermisosDatoGeneralEmpleado) {
		this.isTienePermisosDatoGeneralEmpleado= isTienePermisosDatoGeneralEmpleado;
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
	
	public Boolean isPermisoTodoTipoLibretaMili;
	public Boolean isPermisoNuevoTipoLibretaMili;
	public Boolean isPermisoActualizarTipoLibretaMili;
	public Boolean isPermisoActualizarOriginalTipoLibretaMili;
	public Boolean isPermisoEliminarTipoLibretaMili;
	public Boolean isPermisoGuardarCambiosTipoLibretaMili;
	public Boolean isPermisoConsultaTipoLibretaMili;
	public Boolean isPermisoBusquedaTipoLibretaMili;
	public Boolean isPermisoReporteTipoLibretaMili;
	public Boolean isPermisoPaginacionMedioTipoLibretaMili;
	public Boolean isPermisoPaginacionAltoTipoLibretaMili;
	public Boolean isPermisoPaginacionTodoTipoLibretaMili;
	public Boolean isPermisoCopiarTipoLibretaMili;
	public Boolean isPermisoVerFormTipoLibretaMili;
	public Boolean isPermisoDuplicarTipoLibretaMili;
	public Boolean isPermisoOrdenTipoLibretaMili;
	
	
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
	
	public TipoLibretaMiliParameterReturnGeneral tipolibretamiliReturnGeneral;
	public TipoLibretaMiliParameterReturnGeneral tipolibretamiliParameterGeneral;
	
	

	public DatoGeneralEmpleadoLogic datogeneralempleadoLogic=null;

	public DatoGeneralEmpleadoLogic getDatoGeneralEmpleadoLogic() {
		return datogeneralempleadoLogic;
	}

	public void setDatoGeneralEmpleadoLogic(DatoGeneralEmpleadoLogic datogeneralempleadoLogic) {
		this.datogeneralempleadoLogic = datogeneralempleadoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoLibretaMili=false;
	public Boolean esParaAccionDesdeFormularioTipoLibretaMili=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoLibretaMiliSessionBeanAdditional tipolibretamiliSessionBeanAdditional=null;
	
	public TipoLibretaMiliSessionBeanAdditional getTipoLibretaMiliSessionBeanAdditional() {
		return this.tipolibretamiliSessionBeanAdditional;
	}
	
	public void setTipoLibretaMiliSessionBeanAdditional(TipoLibretaMiliSessionBeanAdditional tipolibretamiliSessionBeanAdditional) {
		try {
			this.tipolibretamiliSessionBeanAdditional=tipolibretamiliSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoLibretaMiliBeanSwingJInternalFrameAdditional tipolibretamiliBeanSwingJInternalFrameAdditional=null;
	//public class TipoLibretaMiliBeanSwingJInternalFrame
	
	public TipoLibretaMiliBeanSwingJInternalFrameAdditional getTipoLibretaMiliBeanSwingJInternalFrameAdditional() {
		return this.tipolibretamiliBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoLibretaMiliBeanSwingJInternalFrameAdditional(TipoLibretaMiliBeanSwingJInternalFrameAdditional tipolibretamiliBeanSwingJInternalFrameAdditional) {
		try {
			this.tipolibretamiliBeanSwingJInternalFrameAdditional=tipolibretamiliBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoLibretaMiliLogic tipolibretamiliLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoLibretaMili tipolibretamiliBean;
	public TipoLibretaMiliConstantesFunciones tipolibretamiliConstantesFunciones;
	//public TipoLibretaMiliParameterReturnGeneral tipolibretamiliReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoLibretaMili> tipolibretamilis;	
	//public List<TipoLibretaMili> tipolibretamilisEliminados;
	//public List<TipoLibretaMili> tipolibretamilisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoLibretaMili=false;
	public Boolean isVisibilidadCeldaDuplicarTipoLibretaMili=true;
	public Boolean isVisibilidadCeldaCopiarTipoLibretaMili=true;
	public Boolean isVisibilidadCeldaVerFormTipoLibretaMili=true;
	public Boolean isVisibilidadCeldaOrdenTipoLibretaMili=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoLibretaMili=false;
	public Boolean isVisibilidadCeldaModificarTipoLibretaMili=false;
	public Boolean isVisibilidadCeldaActualizarTipoLibretaMili=false;
	public Boolean isVisibilidadCeldaEliminarTipoLibretaMili=false;
	public Boolean isVisibilidadCeldaCancelarTipoLibretaMili=false;
	public Boolean isVisibilidadCeldaGuardarTipoLibretaMili=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoLibretaMili=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoLibretaMili() {
		return this.iIdNuevoTipoLibretaMili;
	}

	public void setiIdNuevoTipoLibretaMili(Long iIdNuevoTipoLibretaMili) {
		this.iIdNuevoTipoLibretaMili = iIdNuevoTipoLibretaMili;
	}
	
	public Long getidTipoLibretaMiliActual() {
		return this.idTipoLibretaMiliActual;
	}

	public void setidTipoLibretaMiliActual(Long idTipoLibretaMiliActual) {
		this.idTipoLibretaMiliActual = idTipoLibretaMiliActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoLibretaMili gettipolibretamili() {
		return this.tipolibretamili;
	}

	public void settipolibretamili(TipoLibretaMili tipolibretamili) {
		this.tipolibretamili = tipolibretamili;
	}
	
	public TipoLibretaMili gettipolibretamiliAux() {
		return this.tipolibretamiliAux;
	}

	public void settipolibretamiliAux(TipoLibretaMili tipolibretamiliAux) {
		this.tipolibretamiliAux = tipolibretamiliAux;
	}				
	
	public TipoLibretaMili gettipolibretamiliAnterior() {
		return this.tipolibretamiliAnterior;
	}

	public void settipolibretamiliAnterior(TipoLibretaMili tipolibretamiliAnterior) {
		this.tipolibretamiliAnterior = tipolibretamiliAnterior;
	}	
	
	public TipoLibretaMili gettipolibretamiliTotales() {
		return this.tipolibretamiliTotales;
	}

	public void settipolibretamiliTotales(TipoLibretaMili tipolibretamiliTotales) {
		this.tipolibretamiliTotales = tipolibretamiliTotales;
	}	
	
	public TipoLibretaMili gettipolibretamiliBean() {
		return this.tipolibretamiliBean;
	}

	public void settipolibretamiliBean(TipoLibretaMili tipolibretamiliBean) {
		this.tipolibretamiliBean = tipolibretamiliBean;
	}	
	
	public TipoLibretaMiliParameterReturnGeneral gettipolibretamiliReturnGeneral() {
		return this.tipolibretamiliReturnGeneral;
	}

	public void settipolibretamiliReturnGeneral(TipoLibretaMiliParameterReturnGeneral tipolibretamiliReturnGeneral) {
		this.tipolibretamiliReturnGeneral = tipolibretamiliReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoLibretaMiliLogic getTipoLibretaMiliLogic()	{		
		return tipolibretamiliLogic;
	}

	public void setTipoLibretaMiliLogic(TipoLibretaMiliLogic tipolibretamiliLogic) {
		this.tipolibretamiliLogic = tipolibretamiliLogic;
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
	
	public Boolean getIsEsNuevoTipoLibretaMili() {
		return isEsNuevoTipoLibretaMili;
	}

	public void setIsEsNuevoTipoLibretaMili(Boolean isEsNuevoTipoLibretaMili) {
		this.isEsNuevoTipoLibretaMili = isEsNuevoTipoLibretaMili;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoLibretaMili() {
		return esParaAccionDesdeFormularioTipoLibretaMili;
	}
	
	public void setEsParaAccionDesdeFormularioTipoLibretaMili(Boolean esParaAccionDesdeFormularioTipoLibretaMili) {
		this.esParaAccionDesdeFormularioTipoLibretaMili = esParaAccionDesdeFormularioTipoLibretaMili;
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
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.tipolibretamiliSessionBean==null) {
				this.tipolibretamiliSessionBean=new TipoLibretaMiliSessionBean();
			}

			if(!this.tipolibretamiliSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(tipolibretamiliSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
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

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.tipolibretamili!=null) {
						this.tipolibretamili.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) {
						this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxid_empresaTipoLibretaMili.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoLibretaMili.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) {
						if(this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxid_empresaTipoLibretaMili.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxid_empresaTipoLibretaMili.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoLibretaMiliGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaTipoLibretaMiliGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoLibretaMiliGenerico!=null && jComboBoxid_empresaTipoLibretaMiliGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoLibretaMiliGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoLibretaMili tipolibretamili,JComboBox jComboBoxid_empresaTipoLibretaMiliGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoLibretaMiliGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxid_empresaTipoLibretaMili.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoLibretaMiliGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipolibretamili.setid_empresa(empresaAux.getId());
				tipolibretamili.setempresa_descripcion(TipoLibretaMiliConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipolibretamili.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoLibretaMiliJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) { 
							this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxid_empresaTipoLibretaMili.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxid_empresaTipoLibretaMili.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) { 
					}

					if(!TipoLibretaMiliJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) {
							this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxid_empresaTipoLibretaMili.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) {
							this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxid_empresaTipoLibretaMili.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoLibretaMili() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoLibretaMiliConstantesFunciones.refrescarForeignKeysDescripcionesTipoLibretaMili(this.tipolibretamiliLogic.getTipoLibretaMilis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoLibretaMiliConstantesFunciones.refrescarForeignKeysDescripcionesTipoLibretaMili(this.tipolibretamilis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipolibretamiliLogic.setTipoLibretaMilis(this.tipolibretamilis);
			tipolibretamiliLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoLibretaMiliParameterReturnGeneral getTipoLibretaMiliParameterGeneral() {
		return this.tipolibretamiliParameterGeneral;
	}
	
	public void setTipoLibretaMiliParameterGeneral(TipoLibretaMiliParameterReturnGeneral tipolibretamiliParameterGeneral) {
		this.tipolibretamiliParameterGeneral = tipolibretamiliParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoLibretaMili() {
		return isPermisoTodoTipoLibretaMili;
	}

	public void setIsPermisoTodoTipoLibretaMili(Boolean isPermisoTodoTipoLibretaMili) {
		this.isPermisoTodoTipoLibretaMili = isPermisoTodoTipoLibretaMili;
	}

	public Boolean getIsPermisoNuevoTipoLibretaMili() {
		return isPermisoNuevoTipoLibretaMili;
	}

	public void setIsPermisoNuevoTipoLibretaMili(Boolean isPermisoNuevoTipoLibretaMili) {
		this.isPermisoNuevoTipoLibretaMili = isPermisoNuevoTipoLibretaMili;
	}

	public Boolean getIsPermisoActualizarTipoLibretaMili() {
		return isPermisoActualizarTipoLibretaMili;
	}

	public void setIsPermisoActualizarTipoLibretaMili(Boolean isPermisoActualizarTipoLibretaMili) {
		this.isPermisoActualizarTipoLibretaMili = isPermisoActualizarTipoLibretaMili;
	}

	public Boolean getIsPermisoEliminarTipoLibretaMili() {
		return isPermisoEliminarTipoLibretaMili;
	}

	public void setIsPermisoEliminarTipoLibretaMili(Boolean isPermisoEliminarTipoLibretaMili) {
		this.isPermisoEliminarTipoLibretaMili = isPermisoEliminarTipoLibretaMili;
	}

	public Boolean getIsPermisoGuardarCambiosTipoLibretaMili() {
		return isPermisoGuardarCambiosTipoLibretaMili;
	}

	public void setIsPermisoGuardarCambiosTipoLibretaMili(Boolean isPermisoGuardarCambiosTipoLibretaMili) {
		this.isPermisoGuardarCambiosTipoLibretaMili = isPermisoGuardarCambiosTipoLibretaMili;
	}
	
	public Boolean getIsPermisoConsultaTipoLibretaMili() {
		return isPermisoConsultaTipoLibretaMili;
	}

	public void setIsPermisoConsultaTipoLibretaMili(Boolean isPermisoConsultaTipoLibretaMili) {
		this.isPermisoConsultaTipoLibretaMili = isPermisoConsultaTipoLibretaMili;
	}

	public Boolean getIsPermisoBusquedaTipoLibretaMili() {
		return isPermisoBusquedaTipoLibretaMili;
	}

	public void setIsPermisoBusquedaTipoLibretaMili(Boolean isPermisoBusquedaTipoLibretaMili) {
		this.isPermisoBusquedaTipoLibretaMili = isPermisoBusquedaTipoLibretaMili;
	}

	public Boolean getIsPermisoReporteTipoLibretaMili() {
		return isPermisoReporteTipoLibretaMili;
	}

	public void setIsPermisoReporteTipoLibretaMili(Boolean isPermisoReporteTipoLibretaMili) {
		this.isPermisoReporteTipoLibretaMili = isPermisoReporteTipoLibretaMili;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoLibretaMili() {
		return isPermisoPaginacionMedioTipoLibretaMili;
	}

	public void setIsPermisoPaginacionMedioTipoLibretaMili(Boolean isPermisoPaginacionMedioTipoLibretaMili) {
		this.isPermisoPaginacionMedioTipoLibretaMili = isPermisoPaginacionMedioTipoLibretaMili;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoLibretaMili() {
		return isPermisoPaginacionTodoTipoLibretaMili;
	}

	public void setIsPermisoPaginacionTodoTipoLibretaMili(Boolean isPermisoPaginacionTodoTipoLibretaMili) {
		this.isPermisoPaginacionTodoTipoLibretaMili = isPermisoPaginacionTodoTipoLibretaMili;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoLibretaMili() {
		return isPermisoPaginacionAltoTipoLibretaMili;
	}

	public void setIsPermisoPaginacionAltoTipoLibretaMili(Boolean isPermisoPaginacionAltoTipoLibretaMili) {
		this.isPermisoPaginacionAltoTipoLibretaMili = isPermisoPaginacionAltoTipoLibretaMili;
	}
	
	public Boolean getIsPermisoCopiarTipoLibretaMili() {
		return isPermisoCopiarTipoLibretaMili;
	}

	public void setIsPermisoCopiarTipoLibretaMili(Boolean isPermisoCopiarTipoLibretaMili) {
		this.isPermisoCopiarTipoLibretaMili = isPermisoCopiarTipoLibretaMili;
	}
	
	public Boolean getIsPermisoVerFormTipoLibretaMili() {
		return isPermisoVerFormTipoLibretaMili;
	}

	public void setIsPermisoVerFormTipoLibretaMili(Boolean isPermisoVerFormTipoLibretaMili) {
		this.isPermisoVerFormTipoLibretaMili = isPermisoVerFormTipoLibretaMili;
	}
	
	public Boolean getIsPermisoDuplicarTipoLibretaMili() {
		return isPermisoDuplicarTipoLibretaMili;
	}

	public void setIsPermisoDuplicarTipoLibretaMili(Boolean isPermisoDuplicarTipoLibretaMili) {
		this.isPermisoDuplicarTipoLibretaMili = isPermisoDuplicarTipoLibretaMili;
	}
	
	public Boolean getIsPermisoOrdenTipoLibretaMili() {
		return isPermisoOrdenTipoLibretaMili;
	}

	public void setIsPermisoOrdenTipoLibretaMili(Boolean isPermisoOrdenTipoLibretaMili) {
		this.isPermisoOrdenTipoLibretaMili = isPermisoOrdenTipoLibretaMili;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoLibretaMili() {
		return isVisibilidadCeldaNuevoTipoLibretaMili;
	}

	public void setIsVisibilidadCeldaNuevoTipoLibretaMili(Boolean isVisibilidadCeldaNuevoTipoLibretaMili) {
		this.isVisibilidadCeldaNuevoTipoLibretaMili = isVisibilidadCeldaNuevoTipoLibretaMili;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoLibretaMili() {
		return isVisibilidadCeldaDuplicarTipoLibretaMili;
	}

	public void setIsVisibilidadCeldaDuplicarTipoLibretaMili(Boolean isVisibilidadCeldaDuplicarTipoLibretaMili) {
		this.isVisibilidadCeldaDuplicarTipoLibretaMili = isVisibilidadCeldaDuplicarTipoLibretaMili;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoLibretaMili() {
		return isVisibilidadCeldaCopiarTipoLibretaMili;
	}

	public void setIsVisibilidadCeldaCopiarTipoLibretaMili(Boolean isVisibilidadCeldaCopiarTipoLibretaMili) {
		this.isVisibilidadCeldaCopiarTipoLibretaMili = isVisibilidadCeldaCopiarTipoLibretaMili;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoLibretaMili() {
		return isVisibilidadCeldaVerFormTipoLibretaMili;
	}

	public void setIsVisibilidadCeldaVerFormTipoLibretaMili(Boolean isVisibilidadCeldaVerFormTipoLibretaMili) {
		this.isVisibilidadCeldaVerFormTipoLibretaMili = isVisibilidadCeldaVerFormTipoLibretaMili;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoLibretaMili() {
		return isVisibilidadCeldaOrdenTipoLibretaMili;
	}

	public void setIsVisibilidadCeldaOrdenTipoLibretaMili(Boolean isVisibilidadCeldaOrdenTipoLibretaMili) {
		this.isVisibilidadCeldaOrdenTipoLibretaMili = isVisibilidadCeldaOrdenTipoLibretaMili;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoLibretaMili() {
		return isVisibilidadCeldaNuevoRelacionesTipoLibretaMili;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoLibretaMili(Boolean isVisibilidadCeldaNuevoRelacionesTipoLibretaMili) {
		this.isVisibilidadCeldaNuevoRelacionesTipoLibretaMili = isVisibilidadCeldaNuevoRelacionesTipoLibretaMili;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoLibretaMili() {
		return isVisibilidadCeldaModificarTipoLibretaMili;
	}

	public void setIsVisibilidadCeldaModificarTipoLibretaMili(Boolean isVisibilidadCeldaModificarTipoLibretaMili) {
		this.isVisibilidadCeldaModificarTipoLibretaMili = isVisibilidadCeldaModificarTipoLibretaMili;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoLibretaMili() {
		return isVisibilidadCeldaActualizarTipoLibretaMili;
	}

	public void setIsVisibilidadCeldaActualizarTipoLibretaMili(Boolean isVisibilidadCeldaActualizarTipoLibretaMili) {
		this.isVisibilidadCeldaActualizarTipoLibretaMili = isVisibilidadCeldaActualizarTipoLibretaMili;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoLibretaMili() {
		return isVisibilidadCeldaEliminarTipoLibretaMili;
	}

	public void setIsVisibilidadCeldaEliminarTipoLibretaMili(Boolean isVisibilidadCeldaEliminarTipoLibretaMili) {
		this.isVisibilidadCeldaEliminarTipoLibretaMili = isVisibilidadCeldaEliminarTipoLibretaMili;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoLibretaMili() {
		return isVisibilidadCeldaCancelarTipoLibretaMili;
	}

	public void setIsVisibilidadCeldaCancelarTipoLibretaMili(Boolean isVisibilidadCeldaCancelarTipoLibretaMili) {
		this.isVisibilidadCeldaCancelarTipoLibretaMili = isVisibilidadCeldaCancelarTipoLibretaMili;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoLibretaMili() {
		return isVisibilidadCeldaGuardarTipoLibretaMili;
	}

	public void setIsVisibilidadCeldaGuardarTipoLibretaMili(Boolean isVisibilidadCeldaGuardarTipoLibretaMili) {
		this.isVisibilidadCeldaGuardarTipoLibretaMili = isVisibilidadCeldaGuardarTipoLibretaMili;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoLibretaMili() {
		return isVisibilidadCeldaGuardarCambiosTipoLibretaMili;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoLibretaMili(Boolean isVisibilidadCeldaGuardarCambiosTipoLibretaMili) {
		this.isVisibilidadCeldaGuardarCambiosTipoLibretaMili = isVisibilidadCeldaGuardarCambiosTipoLibretaMili;
	}
		
	public TipoLibretaMiliSessionBean gettipolibretamiliSessionBean() {
		return this.tipolibretamiliSessionBean;
	}
	
	public void settipolibretamiliSessionBean(TipoLibretaMiliSessionBean tipolibretamiliSessionBean) {
		this.tipolibretamiliSessionBean=tipolibretamiliSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoLibretaMili(TipoLibretaMili tipolibretamili)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipolibretamili,null);
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
	
	public void bugActualizarReferenciaActual(TipoLibretaMili tipolibretamili,TipoLibretaMili tipolibretamiliAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoLibretaMili(tipolibretamili);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipolibretamiliAux.setId(tipolibretamili.getId());
		tipolibretamiliAux.setVersionRow(tipolibretamili.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoLibretaMili();
		
			int intSelectedRow = this.jTableDatosTipoLibretaMili.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamili =(TipoLibretaMili) this.tipolibretamiliLogic.getTipoLibretaMilis().toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipolibretamili =(TipoLibretaMili) this.tipolibretamilis.toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoLibretaMiliJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoLibretaMili(this.tipolibretamili,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoLibretaMili(this.tipolibretamili);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipolibretamiliValidator.getInvalidValues(this.tipolibretamili);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipolibretamiliLogic.setDatosCliente(datosCliente);
			tipolibretamiliLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipolibretamiliAux=new  TipoLibretaMili();
				
				tipolibretamiliAux.setIsNew(true);
				tipolibretamiliAux.setIsChanged(true);
				
				tipolibretamiliAux.setTipoLibretaMiliOriginal(this.tipolibretamili);
				
				tipolibretamiliAux.setId(this.tipolibretamili.getId());	
				tipolibretamiliAux.setVersionRow(this.tipolibretamili.getVersionRow());	
				tipolibretamiliAux.setid_empresa(this.tipolibretamili.getid_empresa());	
				tipolibretamiliAux.setcodigo(this.tipolibretamili.getcodigo());	
				tipolibretamiliAux.setnombre(this.tipolibretamili.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipolibretamiliSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipolibretamiliSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipolibretamiliAux,tipolibretamiliLogic.getTipoLibretaMilis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipolibretamiliAux,tipolibretamilis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipolibretamiliSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipolibretamiliSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolibretamiliLogic.saveTipoLibretaMilis();//WithConnection
						//tipolibretamiliLogic.getSetVersionRowTipoLibretaMilis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipolibretamili,tipolibretamiliAux);
					
					this.refrescarForeignKeysDescripcionesTipoLibretaMili();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipolibretamiliSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados().addAll(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados.addAll(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipolibretamiliLogic.saveTipoLibretaMiliRelaciones(tipolibretamiliAux,this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());//WithConnection
								//tipolibretamiliLogic.getSetVersionRowTipoLibretaMilis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipolibretamili,tipolibretamiliAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(new ArrayList<DatoGeneralEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados= new ArrayList<DatoGeneralEmpleado>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipolibretamiliAux.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipolibretamiliSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipolibretamiliSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipolibretamiliAux,tipolibretamiliLogic.getTipoLibretaMilis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipolibretamiliAux,tipolibretamilis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipolibretamili,tipolibretamiliAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipolibretamiliAux=new  TipoLibretaMili();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipolibretamiliSessionBean.getEsGuardarRelacionado() 
					|| (this.tipolibretamiliSessionBean.getEsGuardarRelacionado() && this.tipolibretamili.getId()>=0)) {
						
					tipolibretamiliAux.setIsNew(false);
				}
				
				tipolibretamiliAux.setIsDeleted(false);
			
				tipolibretamiliAux.setId(this.tipolibretamili.getId());	
				tipolibretamiliAux.setVersionRow(this.tipolibretamili.getVersionRow());	
				tipolibretamiliAux.setid_empresa(this.tipolibretamili.getid_empresa());	
				tipolibretamiliAux.setcodigo(this.tipolibretamili.getcodigo());	
				tipolibretamiliAux.setnombre(this.tipolibretamili.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipolibretamiliAux,tipolibretamiliLogic.getTipoLibretaMilis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipolibretamiliAux,tipolibretamilis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipolibretamiliSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipolibretamiliSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolibretamiliLogic.saveTipoLibretaMilis();//WithConnection
						//tipolibretamiliLogic.getSetVersionRowTipoLibretaMilis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipolibretamili,tipolibretamiliAux);
					
					this.refrescarForeignKeysDescripcionesTipoLibretaMili();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipolibretamiliSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados().addAll(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados.addAll(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipolibretamiliLogic.saveTipoLibretaMiliRelaciones(tipolibretamiliAux,this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());//WithConnection
								//tipolibretamiliLogic.getSetVersionRowTipoLibretaMilis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipolibretamili,tipolibretamiliAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(new ArrayList<DatoGeneralEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados= new ArrayList<DatoGeneralEmpleado>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipolibretamiliAux.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipolibretamiliSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipolibretamiliSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipolibretamiliAux,tipolibretamiliLogic.getTipoLibretaMilis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipolibretamiliAux,tipolibretamilis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipolibretamili,tipolibretamiliAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipolibretamiliAux=new  TipoLibretaMili();
				
				tipolibretamiliAux.setIsNew(false);
				tipolibretamiliAux.setIsChanged(false);
				
				tipolibretamiliAux.setIsDeleted(true);
				
				tipolibretamiliAux.setId(this.tipolibretamili.getId());	
				tipolibretamiliAux.setVersionRow(this.tipolibretamili.getVersionRow());	
				tipolibretamiliAux.setid_empresa(this.tipolibretamili.getid_empresa());	
				tipolibretamiliAux.setcodigo(this.tipolibretamili.getcodigo());	
				tipolibretamiliAux.setnombre(this.tipolibretamili.getnombre());	
				
				if(this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipolibretamiliAux.getId()>=0) {	
						this.tipolibretamilisEliminados.add(tipolibretamiliAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipolibretamiliAux,tipolibretamiliLogic.getTipoLibretaMilis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipolibretamiliAux,tipolibretamilis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipolibretamiliSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipolibretamiliSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolibretamiliLogic.saveTipoLibretaMilis();//WithConnection
						//tipolibretamiliLogic.getSetVersionRowTipoLibretaMilis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipolibretamiliSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados().addAll(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados.addAll(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipolibretamiliLogic.saveTipoLibretaMiliRelaciones(tipolibretamiliAux,this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());//WithConnection
								//tipolibretamiliLogic.getSetVersionRowTipoLibretaMilis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(new ArrayList<DatoGeneralEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados= new ArrayList<DatoGeneralEmpleado>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipolibretamiliAux.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipolibretamiliSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipolibretamiliSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipolibretamiliAux,tipolibretamiliLogic.getTipoLibretaMilis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipolibretamiliAux,tipolibretamilis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamiliLogic.getTipoLibretaMilis().addAll(this.tipolibretamilisEliminados);
					
					tipolibretamiliLogic.saveTipoLibretaMilis();//WithConnection
					//tipolibretamiliLogic.getSetVersionRowTipoLibretaMilis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoLibretaMili();
				
				this.tipolibretamilisEliminados= new ArrayList<TipoLibretaMili>();		
			}
			
			if(this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Libreta Mili GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Libreta Mili",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipolibretamili=tipolibretamiliAux;
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
      		//this.finishProcessTipoLibretaMili();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoLibretaMili tipolibretamiliLocal) throws Exception {
		
		if(this.tipolibretamiliSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipolibretamiliLocal.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());
			
			} else {
			
				tipolibretamiliLocal.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoLibretaMili tipolibretamiliLocal) throws Exception {	
		if(this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipolibretamiliLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoLibretaMiliActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoLibretaMili.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipolibretamili =(TipoLibretaMili) this.tipolibretamiliLogic.getTipoLibretaMilis().toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipolibretamili =(TipoLibretaMili) this.tipolibretamilis.toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipolibretamiliValidator.getInvalidValues(this.tipolibretamili);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoLibretaMili tipolibretamili,List<TipoLibretaMili> tipolibretamilis) throws Exception {
		try	{		
			TipoLibretaMiliConstantesFunciones.actualizarLista(tipolibretamili,tipolibretamilis,this.tipolibretamiliSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoLibretaMili tipolibretamili,List<TipoLibretaMili> tipolibretamilis) throws Exception {
		try	{			
			TipoLibretaMiliConstantesFunciones.actualizarSelectedLista(tipolibretamili,tipolibretamilis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoLibretaMili> tipolibretamilisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipolibretamilisLocal=this.tipolibretamiliLogic.getTipoLibretaMilis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipolibretamilisLocal=this.tipolibretamilis;
			}
			//ARCHITECTURE
		
			for(TipoLibretaMili tipolibretamiliLocal:tipolibretamilisLocal) {
				if(this.permiteMantenimiento(tipolibretamiliLocal) && tipolibretamiliLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoLibretaMiliConstantesFunciones.getTipoLibretaMiliLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoLibretaMiliConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoLibretaMili.jLabelid_empresaTipoLibretaMili,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoLibretaMiliConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoLibretaMili.jLabelcodigoTipoLibretaMili,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoLibretaMiliConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoLibretaMili.jLabelnombreTipoLibretaMili,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoLibretaMili.jLabelid_empresaTipoLibretaMili,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoLibretaMili.jLabelcodigoTipoLibretaMili,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoLibretaMili.jLabelnombreTipoLibretaMili,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DatoGeneralEmpleado")) {
			if(this.tipolibretamili==null) {
				this.tipolibretamili= new TipoLibretaMili();
			}

			if(this.tipolibretamiliSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoLibretaMili
				this.setVariablesFormularioToObjetoActualTipoLibretaMili(this.tipolibretamili,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoLibretaMili(this.tipolibretamili);

				this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.getdatogeneralempleado().setTipoLibretaMili(this.tipolibretamili);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoLibretaMili--;	
		
		
		this.tipolibretamiliAux=new TipoLibretaMili();
		
		this.tipolibretamiliAux.setId(this.iIdNuevoTipoLibretaMili);
		this.tipolibretamiliAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipolibretamiliLogic.getTipoLibretaMilis().add(this.tipolibretamiliAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipolibretamilis.add(this.tipolibretamiliAux);
		}
		//ARCHITECTURE
		
		this.tipolibretamili=this.tipolibretamiliAux;
		
		if(TipoLibretaMiliJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoLibretaMili(this.tipolibretamili);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoLibretaMili(this.tipolibretamili);
		}
				
		//this.setDefaultControlesTipoLibretaMili();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoLibretaMili();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoLibretaMili();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoLibretaMili();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoLibretaMili(this.tipolibretamiliBean,this.tipolibretamili,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoLibretaMili(this.tipolibretamili);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipolibretamiliSessionBean.getConGuardarRelaciones()) {
			classes=TipoLibretaMiliConstantesFunciones.getClassesRelationshipsOfTipoLibretaMili(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipolibretamiliReturnGeneral=tipolibretamiliLogic.procesarEventosTipoLibretaMilisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipolibretamiliLogic.getTipoLibretaMilis(),this.tipolibretamili,this.tipolibretamiliParameterGeneral,this.isEsNuevoTipoLibretaMili,classes);//this.tipolibretamiliLogic.getTipoLibretaMili()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoLibretaMili(this.tipolibretamiliReturnGeneral,this.tipolibretamiliBean,false);
		
		if(this.tipolibretamiliReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoLibretaMili(this.tipolibretamiliReturnGeneral.getTipoLibretaMili());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoLibretaMili(this.tipolibretamiliReturnGeneral.getTipoLibretaMili());
		}
		
		if(this.tipolibretamiliReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoLibretaMili(this.tipolibretamiliReturnGeneral.getTipoLibretaMili(),classes);//this.tipolibretamiliBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoLibretaMili(this.tipolibretamili,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoLibretaMili();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoLibretaMili();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoLibretaMiliBeanSwingJInternalFrameAdditional.RecargarFormTipoLibretaMili(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoLibretaMili(false);
						
			if(tipolibretamiliSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getEsGuardarRelacionado() && DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDatoGeneralEmpleadoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoLibretaMiliJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoLibretaMili();
			}
			
			this.actualizarVisualTableDatosTipoLibretaMili();
			
			this.jTableDatosTipoLibretaMili.setRowSelectionInterval(this.getIndiceNuevoTipoLibretaMili(), this.getIndiceNuevoTipoLibretaMili());
			
			this.seleccionarFilaTablaTipoLibretaMiliActual();
						
			this.actualizarEstadoCeldasBotonesTipoLibretaMili("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoLibretaMili(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoLibretaMili.jTextFieldcodigoTipoLibretaMili.setEnabled(isHabilitar && this.tipolibretamiliConstantesFunciones.activarcodigoTipoLibretaMili);
		this.jInternalFrameDetalleFormTipoLibretaMili.jTextAreanombreTipoLibretaMili.setEnabled(isHabilitar && this.tipolibretamiliConstantesFunciones.activarnombreTipoLibretaMili);	
		//
		this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxid_empresaTipoLibretaMili.setEnabled(isHabilitar && this.tipolibretamiliConstantesFunciones.activarid_empresaTipoLibretaMili);
	};
	
	public void setDefaultControlesTipoLibretaMili() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoLibretaMili(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipolibretamiliSessionBean.setConGuardarRelaciones(true);			
			this.tipolibretamiliSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoLibretaMili.jTabbedPaneRelacionesTipoLibretaMili.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipolibretamiliSessionBean.setConGuardarRelaciones(false);			
			this.tipolibretamiliSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoLibretaMili.jTabbedPaneRelacionesTipoLibretaMili.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoLibretaMili() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoLibretaMili tipolibretamiliAux:this.tipolibretamiliLogic.getTipoLibretaMilis()) {
				if(tipolibretamiliAux.getId().equals(this.iIdNuevoTipoLibretaMili)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoLibretaMili tipolibretamiliAux:this.tipolibretamilis) {
				if(tipolibretamiliAux.getId().equals(this.iIdNuevoTipoLibretaMili)) {
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
	
	public int getIndiceActualTipoLibretaMili(TipoLibretaMili tipolibretamili,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoLibretaMili tipolibretamiliAux:this.tipolibretamiliLogic.getTipoLibretaMilis()) {
				if(tipolibretamiliAux.getId().equals(tipolibretamili.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoLibretaMili tipolibretamiliAux:this.tipolibretamilis) {
				if(tipolibretamiliAux.getId().equals(tipolibretamili.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoLibretaMili(TipoLibretaMili tipolibretamiliOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoLibretaMili tipolibretamiliAux:this.tipolibretamiliLogic.getTipoLibretaMilis()) {
				if(tipolibretamiliAux.getTipoLibretaMiliOriginal().getId().equals(tipolibretamiliOriginal.getId())) {
					existe=true;
					tipolibretamiliOriginal.setId(tipolibretamiliAux.getId());
					tipolibretamiliOriginal.setVersionRow(tipolibretamiliAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoLibretaMili tipolibretamiliAux:this.tipolibretamilis) {
				if(tipolibretamiliAux.getTipoLibretaMiliOriginal().getId().equals(tipolibretamiliOriginal.getId())) {
					existe=true;
					tipolibretamiliOriginal.setId(tipolibretamiliAux.getId());
					tipolibretamiliOriginal.setVersionRow(tipolibretamiliAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoLibretaMili(Boolean esParaCancelar) throws Exception {
		tipolibretamilisAux=new ArrayList<TipoLibretaMili>();
		tipolibretamiliAux=new TipoLibretaMili();
		
		if(!this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoLibretaMili tipolibretamiliAux:this.tipolibretamiliLogic.getTipoLibretaMilis()) {
					if(tipolibretamiliAux.getId()<0) {
						tipolibretamilisAux.add(tipolibretamiliAux);
					}		
				}
				this.iIdNuevoTipoLibretaMili=0L;
				this.tipolibretamiliLogic.getTipoLibretaMilis().removeAll(tipolibretamilisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoLibretaMili tipolibretamiliAux:this.tipolibretamilis) {
					if(tipolibretamiliAux.getId()<0) {
						tipolibretamilisAux.add(tipolibretamiliAux);
					}		
				}
				this.iIdNuevoTipoLibretaMili=0L;
				this.tipolibretamilis.removeAll(tipolibretamilisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoLibretaMili 
					&& this.tipolibretamiliLogic.getTipoLibretaMilis().size()>0
					) {
					tipolibretamiliAux=this.tipolibretamiliLogic.getTipoLibretaMilis().get(this.tipolibretamiliLogic.getTipoLibretaMilis().size() - 1);
				
					if(tipolibretamiliAux.getId()<0) {
						this.tipolibretamiliLogic.getTipoLibretaMilis().remove(tipolibretamiliAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoLibretaMili && this.tipolibretamilis.size()>0) {
					tipolibretamiliAux=this.tipolibretamilis.get(this.tipolibretamilis.size() - 1);
				
					if(tipolibretamiliAux.getId()<0) {
						this.tipolibretamilis.remove(tipolibretamiliAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoLibretaMili(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipolibretamili.getId()<0) {
				this.tipolibretamiliLogic.getTipoLibretaMilis().remove(this.tipolibretamili);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipolibretamili.getId()<0) {
				this.tipolibretamilis.remove(this.tipolibretamili);
			}
		}			
	}
	
	public void setEstadosInicialesTipoLibretaMili(List<TipoLibretaMili> tipolibretamilisAux) throws Exception {
		TipoLibretaMiliConstantesFunciones.setEstadosInicialesTipoLibretaMili(tipolibretamilisAux);
	}
	
	public void setEstadosInicialesTipoLibretaMili(TipoLibretaMili tipolibretamiliAux) throws Exception {
		TipoLibretaMiliConstantesFunciones.setEstadosInicialesTipoLibretaMili(tipolibretamiliAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoLibretaMiliActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoLibretaMili("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoLibretaMiliActual()) {
				if(!this.isEsNuevoTipoLibretaMili) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoLibretaMili("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoLibretaMili=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoLibretaMiliActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Libreta Mili ?", "MANTENIMIENTO DE Tipo Libreta Mili", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoLibretaMili("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoLibretaMili tipolibretamili) throws Exception {
		TipoLibretaMiliConstantesFunciones.seleccionarAsignar(this.tipolibretamili,tipolibretamili);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoLibretaMili=this.isPermisoActualizarOriginalTipoLibretaMili;
			
			
			this.seleccionarAsignar(tipolibretamili);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoLibretaMiliConstantesFunciones.quitarEspaciosTipoLibretaMili(this.tipolibretamili,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoLibretaMili("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipolibretamiliSessionBean.setsFuncionBusquedaRapida(this.tipolibretamiliSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoLibretaMili) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoLibretaMili(esParaCancelar);				
				this.cancelarNuevoTipoLibretaMili(esParaCancelar);								
			}
			
			this.tipolibretamili=new TipoLibretaMili();
			
			this.inicializarTipoLibretaMili();
			
			this.actualizarEstadoCeldasBotonesTipoLibretaMili("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoLibretaMili() throws Exception {
		try {
			TipoLibretaMiliConstantesFunciones.inicializarTipoLibretaMili(this.tipolibretamili);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipolibretamiliLogic.getTipoLibretaMilis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoLibretaMilis(String sAccionBusqueda,List<TipoLibretaMili> tipolibretamilisParaReportes) throws Exception {
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
					sPathReporteFinal="TipoLibretaMili"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoLibretaMiliMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoLibretaMiliMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoLibretaMili"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Libreta Milis");		
		parameters.put("busquedapor", TipoLibretaMiliConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DatoGeneralEmpleado.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoLibretaMiliLogic tipolibretamiliLogicAuxiliar=new TipoLibretaMiliLogic();
					tipolibretamiliLogicAuxiliar.setDatosCliente(tipolibretamiliLogic.getDatosCliente());				
					tipolibretamiliLogicAuxiliar.setTipoLibretaMilis(tipolibretamilisParaReportes);
					
					tipolibretamiliLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoLibretaMiliWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipolibretamilisParaReportes=tipolibretamiliLogicAuxiliar.getTipoLibretaMilis();
					
					//tipolibretamiliLogic.getNewConnexionToDeep();
					
					//for (TipoLibretaMili tipolibretamili:tipolibretamilisParaReportes) {
					//	tipolibretamiliLogic.deepLoad(tipolibretamili, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipolibretamiliLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipolibretamiliLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDatoGeneralEmpleado = AuxiliarReportes.class.getResourceAsStream("DatoGeneralEmpleadoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_datogeneralempleado", reportFileDatoGeneralEmpleado);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoLibretaMili=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoLibretaMiliConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoLibretaMiliConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoLibretaMili=new JRBeanArrayDataSource(TipoLibretaMiliJInternalFrame.TraerTipoLibretaMiliBeans(tipolibretamilisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoLibretaMili);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoLibretaMiliConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoLibretaMiliConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoLibretaMiliBean.TraerTipoLibretaMiliBeans(tipolibretamilisParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoLibretaMilis(sAccionBusqueda,sTipoArchivoReporte,tipolibretamilisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoLibretaMilis(sAccionBusqueda,sTipoArchivoReporte,tipolibretamilisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoLibretaMiliActionPerformed(null);
					//this.generarExcelReporteTipoLibretaMilis(sAccionBusqueda,sTipoArchivoReporte,tipolibretamilisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoLibretaMilis(sAccionBusqueda,sTipoArchivoReporte,tipolibretamilisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoLibretaMilis(sAccionBusqueda,sTipoArchivoReporte,tipolibretamilisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoLibretaMilis(sAccionBusqueda,sTipoArchivoReporte,tipolibretamilisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoLibretaMilis(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoLibretaMili> tipolibretamilisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolibretamili";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoLibretaMilis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoLibretaMili("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoLibretaMili tipolibretamili : tipolibretamilisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoLibretaMiliConstantesFunciones.generarExcelReporteDataTipoLibretaMili("NORMAL",row,workbook,tipolibretamili,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Libreta Mili",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoLibretaMili(String sTipo,Row row,Workbook workbook) {
		
		TipoLibretaMiliConstantesFunciones.generarExcelReporteHeaderTipoLibretaMili(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoLibretaMilis(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoLibretaMili> tipolibretamilisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolibretamili_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoLibretaMilis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoLibretaMili tipolibretamili : tipolibretamilisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoLibretaMiliConstantesFunciones.getTipoLibretaMiliDescripcion(tipolibretamili));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoLibretaMiliConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoLibretaMiliConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipolibretamili.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoLibretaMiliConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoLibretaMiliConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipolibretamili.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoLibretaMiliConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoLibretaMiliConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipolibretamili.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Libreta Mili",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoLibretaMilis(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoLibretaMili> tipolibretamilisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoLibretaMili> tipolibretamilisRespaldo=null;
		
		classes=TipoLibretaMiliConstantesFunciones.getClassesRelationshipsOfTipoLibretaMili(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipolibretamiliLogic.setDatosCliente(this.datosCliente);
		this.tipolibretamiliLogic.setDatosDeep(this.datosDeep);
		this.tipolibretamiliLogic.setIsConDeep(true);
		
		tipolibretamilisRespaldo=this.tipolibretamiliLogic.getTipoLibretaMilis();
		
		this.tipolibretamiliLogic.setTipoLibretaMilis(tipolibretamilisParaReportes);	
		this.tipolibretamiliLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipolibretamilisParaReportes=this.tipolibretamiliLogic.getTipoLibretaMilis();
		this.tipolibretamiliLogic.setTipoLibretaMilis(tipolibretamilisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolibretamili_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoLibretaMilis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoLibretaMili("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoLibretaMili tipolibretamili : tipolibretamilisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoLibretaMili("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoLibretaMiliConstantesFunciones.generarExcelReporteDataTipoLibretaMili("NORMAL",row,workbook,tipolibretamili,cellStyleDataAux);
		
			
			


				//DatoGeneralEmpleado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipolibretamili.getDatoGeneralEmpleados()!=null && tipolibretamili.getDatoGeneralEmpleados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DatoGeneralEmpleadoConstantesFunciones.generarExcelReporteHeaderDatoGeneralEmpleado("RELACIONADO",row,workbook);
				}

				if(tipolibretamili.getDatoGeneralEmpleados()!=null) {
					i2=0;
					for(DatoGeneralEmpleado datogeneralempleado : tipolibretamili.getDatoGeneralEmpleados()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DatoGeneralEmpleadoConstantesFunciones.generarExcelReporteDataDatoGeneralEmpleado("RELACIONADO",row,workbook,datogeneralempleado,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoLibretaMiliConstantesFunciones.getTipoLibretaMiliDescripcion(tipolibretamili));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Libreta Mili",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoLibretaMili.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoLibretaMili.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoLibretaMili.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoLibretaMili.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoLibretaMili() throws Exception {		
		this.startProcessTipoLibretaMili(true);
	}
	
	public void startProcessTipoLibretaMili(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoLibretaMili ,this.jPanelParametrosReportesTipoLibretaMili, this.jScrollPanelDatosTipoLibretaMili,this.jPanelPaginacionTipoLibretaMili, this.jScrollPanelDatosEdicionTipoLibretaMili, this.jPanelAccionesTipoLibretaMili,this.jPanelAccionesFormularioTipoLibretaMili,this.jmenuBarTipoLibretaMili,this.jmenuBarDetalleTipoLibretaMili,this.jTtoolBarTipoLibretaMili,this.jTtoolBarDetalleTipoLibretaMili);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoLibretaMili=this.jTabbedPaneBusquedasTipoLibretaMili; 
		
		final JPanel jPanelParametrosReportesTipoLibretaMili=this.jPanelParametrosReportesTipoLibretaMili;
		//final JScrollPane jScrollPanelDatosTipoLibretaMili=this.jScrollPanelDatosTipoLibretaMili;
		final JTable jTableDatosTipoLibretaMili=this.jTableDatosTipoLibretaMili;		
		final JPanel jPanelPaginacionTipoLibretaMili=this.jPanelPaginacionTipoLibretaMili;
		//final JScrollPane jScrollPanelDatosEdicionTipoLibretaMili=this.jScrollPanelDatosEdicionTipoLibretaMili;
		final JPanel jPanelAccionesTipoLibretaMili=this.jPanelAccionesTipoLibretaMili;
		
		JPanel jPanelCamposAuxiliarTipoLibretaMili=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoLibretaMili=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) {
			jPanelCamposAuxiliarTipoLibretaMili=this.jInternalFrameDetalleFormTipoLibretaMili.jPanelCamposTipoLibretaMili;
			jPanelAccionesFormularioAuxiliarTipoLibretaMili=this.jInternalFrameDetalleFormTipoLibretaMili.jPanelAccionesFormularioTipoLibretaMili;
		}
		
		final JPanel jPanelCamposTipoLibretaMili=jPanelCamposAuxiliarTipoLibretaMili;
		final JPanel jPanelAccionesFormularioTipoLibretaMili=jPanelAccionesFormularioAuxiliarTipoLibretaMili;
		
		
		final JMenuBar jmenuBarTipoLibretaMili=this.jmenuBarTipoLibretaMili;
		final JToolBar jTtoolBarTipoLibretaMili=this.jTtoolBarTipoLibretaMili;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoLibretaMili=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoLibretaMili=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) {
			jmenuBarDetalleAuxiliarTipoLibretaMili=this.jInternalFrameDetalleFormTipoLibretaMili.jmenuBarDetalleTipoLibretaMili;
			jTtoolBarDetalleAuxiliarTipoLibretaMili=this.jInternalFrameDetalleFormTipoLibretaMili.jTtoolBarDetalleTipoLibretaMili;
		}
		
		final JMenuBar jmenuBarDetalleTipoLibretaMili=jmenuBarDetalleAuxiliarTipoLibretaMili;
		final JToolBar jTtoolBarDetalleTipoLibretaMili=jTtoolBarDetalleAuxiliarTipoLibretaMili;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoLibretaMili;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoLibretaMili;
			processRunnable.jTableDatos=jTableDatosTipoLibretaMili;
			processRunnable.jPanelCampos=jPanelCamposTipoLibretaMili;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoLibretaMili;
			processRunnable.jPanelAcciones=jPanelAccionesTipoLibretaMili;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoLibretaMili;
			
			
			processRunnable.jmenuBar=jmenuBarTipoLibretaMili;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoLibretaMili;
			processRunnable.jTtoolBar=jTtoolBarTipoLibretaMili;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoLibretaMili;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoLibretaMili ,jPanelParametrosReportesTipoLibretaMili,jTableDatosTipoLibretaMili, /*jScrollPanelDatosTipoLibretaMili,*/jPanelCamposTipoLibretaMili,jPanelPaginacionTipoLibretaMili, /*jScrollPanelDatosEdicionTipoLibretaMili,*/ jPanelAccionesTipoLibretaMili,jPanelAccionesFormularioTipoLibretaMili,jmenuBarTipoLibretaMili,jmenuBarDetalleTipoLibretaMili,jTtoolBarTipoLibretaMili,jTtoolBarDetalleTipoLibretaMili);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoLibretaMili ,jPanelParametrosReportesTipoLibretaMili, jScrollPanelDatosTipoLibretaMili,jPanelPaginacionTipoLibretaMili, jScrollPanelDatosEdicionTipoLibretaMili, jPanelAccionesTipoLibretaMili,jPanelAccionesFormularioTipoLibretaMili,jmenuBarTipoLibretaMili,jmenuBarDetalleTipoLibretaMili,jTtoolBarTipoLibretaMili,jTtoolBarDetalleTipoLibretaMili);
						
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
	
	public void finishProcessTipoLibretaMili() {// throws Exception 
		this.finishProcessTipoLibretaMili(true);
	}
	
	public void finishProcessTipoLibretaMili(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoLibretaMili ,this.jPanelParametrosReportesTipoLibretaMili, this.jScrollPanelDatosTipoLibretaMili,this.jPanelPaginacionTipoLibretaMili, this.jScrollPanelDatosEdicionTipoLibretaMili, this.jPanelAccionesTipoLibretaMili,this.jPanelAccionesFormularioTipoLibretaMili,this.jmenuBarTipoLibretaMili,this.jmenuBarDetalleTipoLibretaMili,this.jTtoolBarTipoLibretaMili,this.jTtoolBarDetalleTipoLibretaMili);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoLibretaMili=this.jTabbedPaneBusquedasTipoLibretaMili; 
		
		final JPanel jPanelParametrosReportesTipoLibretaMili=this.jPanelParametrosReportesTipoLibretaMili;
		//final JScrollPane jScrollPanelDatosTipoLibretaMili=this.jScrollPanelDatosTipoLibretaMili;
		final JTable jTableDatosTipoLibretaMili=this.jTableDatosTipoLibretaMili;		
		final JPanel jPanelPaginacionTipoLibretaMili=this.jPanelPaginacionTipoLibretaMili;
		//final JScrollPane jScrollPanelDatosEdicionTipoLibretaMili=this.jScrollPanelDatosEdicionTipoLibretaMili;
		final JPanel jPanelAccionesTipoLibretaMili=this.jPanelAccionesTipoLibretaMili;
		
		JPanel jPanelCamposAuxiliarTipoLibretaMili=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoLibretaMili=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) {
			jPanelCamposAuxiliarTipoLibretaMili=this.jInternalFrameDetalleFormTipoLibretaMili.jPanelCamposTipoLibretaMili;
			jPanelAccionesFormularioAuxiliarTipoLibretaMili=this.jInternalFrameDetalleFormTipoLibretaMili.jPanelAccionesFormularioTipoLibretaMili;
		}
		
		final JPanel jPanelCamposTipoLibretaMili=jPanelCamposAuxiliarTipoLibretaMili;
		final JPanel jPanelAccionesFormularioTipoLibretaMili=jPanelAccionesFormularioAuxiliarTipoLibretaMili;
		
		
		final JMenuBar jmenuBarTipoLibretaMili=this.jmenuBarTipoLibretaMili;		
		final JToolBar jTtoolBarTipoLibretaMili=this.jTtoolBarTipoLibretaMili;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoLibretaMili=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoLibretaMili=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) {
			jmenuBarDetalleAuxiliarTipoLibretaMili=this.jInternalFrameDetalleFormTipoLibretaMili.jmenuBarDetalleTipoLibretaMili;
			jTtoolBarDetalleAuxiliarTipoLibretaMili=this.jInternalFrameDetalleFormTipoLibretaMili.jTtoolBarDetalleTipoLibretaMili;		
		}
		
		final JMenuBar jmenuBarDetalleTipoLibretaMili=jmenuBarDetalleAuxiliarTipoLibretaMili;
		final JToolBar jTtoolBarDetalleTipoLibretaMili=jTtoolBarDetalleAuxiliarTipoLibretaMili;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoLibretaMili;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoLibretaMili;
			processRunnable.jTableDatos=jTableDatosTipoLibretaMili;
			processRunnable.jPanelCampos=jPanelCamposTipoLibretaMili;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoLibretaMili;
			processRunnable.jPanelAcciones=jPanelAccionesTipoLibretaMili;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoLibretaMili;
			
			
			processRunnable.jmenuBar=jmenuBarTipoLibretaMili;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoLibretaMili;
			processRunnable.jTtoolBar=jTtoolBarTipoLibretaMili;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoLibretaMili;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoLibretaMili ,jPanelParametrosReportesTipoLibretaMili, jTableDatosTipoLibretaMili,/*jScrollPanelDatosTipoLibretaMili,*/jPanelCamposTipoLibretaMili,jPanelPaginacionTipoLibretaMili, /*jScrollPanelDatosEdicionTipoLibretaMili,*/ jPanelAccionesTipoLibretaMili,jPanelAccionesFormularioTipoLibretaMili,jmenuBarTipoLibretaMili,jmenuBarDetalleTipoLibretaMili,jTtoolBarTipoLibretaMili,jTtoolBarDetalleTipoLibretaMili));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoLibretaMili(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoLibretaMili(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoLibretaMili(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoLibretaMili(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoLibretaMili,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoLibretaMili,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoLibretaMili(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoLibretaMili,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoLibretaMili,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipolibretamiliConstantesFunciones.getsFinalQueryTipoLibretaMili();
		String  finalQueryPaginacionTodos=this.tipolibretamiliConstantesFunciones.getsFinalQueryTipoLibretaMili();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoLibretaMiliConstantesFunciones.getArrayColumnasGlobalesNoTipoLibretaMili(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoLibretaMiliConstantesFunciones.getArrayColumnasGlobalesTipoLibretaMili(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoLibretaMiliConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipolibretamilisEliminados= new ArrayList<TipoLibretaMili>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoLibretaMili();
		
				///*TipoLibretaMiliSessionBean*/this.tipolibretamiliSessionBean=new TipoLibretaMiliSessionBean();
			
			if(this.tipolibretamiliSessionBean==null) {
				this.tipolibretamiliSessionBean=new TipoLibretaMiliSessionBean();
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
					this.iNumeroPaginacion=TipoLibretaMiliConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoLibretaMiliConstantesFunciones.getClassesForeignKeysOfTipoLibretaMili(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipolibretamili."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipolibretamilisAux= new ArrayList<TipoLibretaMili>();
			
				
			tipolibretamiliLogic.setDatosCliente(this.datosCliente);
			tipolibretamiliLogic.setDatosDeep(this.datosDeep);
			tipolibretamiliLogic.setIsConDeep(true);
			
			
			tipolibretamiliLogic.getTipoLibretaMiliDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipolibretamiliLogic.getTodosTipoLibretaMilis(finalQueryGlobal,pagination);
					
					//tipolibretamiliLogic.getTodosTipoLibretaMilisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipolibretamiliLogic.getTipoLibretaMilis()==null|| tipolibretamiliLogic.getTipoLibretaMilis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipolibretamilisAux= new ArrayList<TipoLibretaMili>();
							tipolibretamilisAux.addAll(tipolibretamiliLogic.getTipoLibretaMilis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipolibretamilisAux= new ArrayList<TipoLibretaMili>();
							tipolibretamilisAux.addAll(tipolibretamilis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipolibretamiliLogic.getTodosTipoLibretaMilis(finalQueryGlobal+"",this.pagination);												
							
							//tipolibretamiliLogic.getTodosTipoLibretaMilisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoLibretaMilis("Todos",tipolibretamiliLogic.getTipoLibretaMilis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipolibretamiliLogic.setTipoLibretaMilis(new ArrayList<TipoLibretaMili>());					
							tipolibretamiliLogic.getTipoLibretaMilis().addAll(tipolibretamilisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipolibretamilis=new ArrayList<TipoLibretaMili>();
							tipolibretamilis.addAll(tipolibretamilisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoLibretaMili=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoLibretaMili=this.idActual;
				
				} else if(this.idTipoLibretaMiliActual!=null && this.idTipoLibretaMiliActual!=0L) {
					idTipoLibretaMili=idTipoLibretaMiliActual;
				}
				
					
				this.sDetalleReporte=TipoLibretaMiliConstantesFunciones.getDetalleIndicePorId(idTipoLibretaMili);
				
				this.tipolibretamilis=new ArrayList<TipoLibretaMili>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipolibretamiliLogic.getEntity(idTipoLibretaMili);
					
					//tipolibretamiliLogic.getEntityWithConnection(idTipoLibretaMili);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipolibretamiliLogic.setTipoLibretaMilis(new ArrayList<TipoLibretaMili>());
					tipolibretamiliLogic.getTipoLibretaMilis().add(tipolibretamiliLogic.getTipoLibretaMili());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipolibretamilis=new ArrayList<TipoLibretaMili>();
					this.tipolibretamilis.add(tipolibretamili);
				}
				
				if(tipolibretamiliLogic.getTipoLibretaMili()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoLibretaMiliConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipolibretamiliLogic.getTipoLibretaMilisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoLibretaMiliConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoLibretaMiliConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipolibretamiliLogic.getTipoLibretaMilis()==null||tipolibretamiliLogic.getTipoLibretaMilis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipolibretamilis==null|| tipolibretamilis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolibretamilisAux=new ArrayList<TipoLibretaMili>();
						tipolibretamilisAux.addAll(tipolibretamiliLogic.getTipoLibretaMilis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipolibretamilisAux=new ArrayList<TipoLibretaMili>();
							tipolibretamilisAux.addAll(tipolibretamilis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipolibretamiliLogic.getTipoLibretaMilisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoLibretaMiliConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoLibretaMiliConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoLibretaMilis("FK_IdEmpresa",tipolibretamiliLogic.getTipoLibretaMilis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoLibretaMilis("FK_IdEmpresa",tipolibretamilis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolibretamiliLogic.setTipoLibretaMilis(new ArrayList<TipoLibretaMili>());
						tipolibretamiliLogic.getTipoLibretaMilis().addAll(tipolibretamilisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipolibretamilis=new ArrayList<TipoLibretaMili>();
							tipolibretamilis.addAll(tipolibretamilisAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoLibretaMili();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoLibretaMili();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipolibretamiliLogic.getTipoLibretaMilis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipolibretamilis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipolibretamiliLogic.getTipoLibretaMilis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipolibretamilis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoLibretaMili tipolibretamili) {
		Boolean permite=true;
		
		if(this.tipolibretamili.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoLibretaMiliConstantesFunciones.getOrderByListaTipoLibretaMili();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoLibretaMiliConstantesFunciones.getOrderByListaTipoLibretaMili();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoLibretaMili tipolibretamili:tipolibretamiliLogic.getTipoLibretaMilis()) {
				if(tipolibretamili.getsType().equals(Constantes2.S_TOTALES)) {
					tipolibretamiliTotales=tipolibretamili;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoLibretaMili tipolibretamili:this.tipolibretamilis) {
				if(tipolibretamili.getsType().equals(Constantes2.S_TOTALES)) {
					tipolibretamiliTotales=tipolibretamili;
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
			this.tipolibretamiliAux=new TipoLibretaMili();
			this.tipolibretamiliAux.setsType(Constantes2.S_TOTALES);
			this.tipolibretamiliAux.setIsNew(false);
			this.tipolibretamiliAux.setIsChanged(false);
			this.tipolibretamiliAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoLibretaMiliConstantesFunciones.TotalizarValoresFilaTipoLibretaMili(this.tipolibretamiliLogic.getTipoLibretaMilis(),this.tipolibretamiliAux);
				
				this.tipolibretamiliLogic.getTipoLibretaMilis().add(this.tipolibretamiliAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoLibretaMiliConstantesFunciones.TotalizarValoresFilaTipoLibretaMili(this.tipolibretamilis,this.tipolibretamiliAux);
				
				this.tipolibretamilis.add(this.tipolibretamiliAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipolibretamiliTotales=new TipoLibretaMili();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipolibretamiliLogic.getTipoLibretaMilis().remove(tipolibretamiliTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipolibretamilis.remove(tipolibretamiliTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipolibretamiliTotales=new TipoLibretaMili();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoLibretaMili tipolibretamili:tipolibretamiliLogic.getTipoLibretaMilis()) {
				if(tipolibretamili.getsType().equals(Constantes2.S_TOTALES)) {
					tipolibretamiliTotales=tipolibretamili;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoLibretaMiliConstantesFunciones.TotalizarValoresFilaTipoLibretaMili(this.tipolibretamiliLogic.getTipoLibretaMilis(),tipolibretamiliTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoLibretaMili tipolibretamili:this.tipolibretamilis) {
				if(tipolibretamili.getsType().equals(Constantes2.S_TOTALES)) {
					tipolibretamiliTotales=tipolibretamili;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoLibretaMiliConstantesFunciones.TotalizarValoresFilaTipoLibretaMili(this.tipolibretamilis,tipolibretamiliTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoLibretaMilisFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoLibretaMilisFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipolibretamiliLogic.getTipoLibretaMilisFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoLibretaMili() {
		this.isPermisoTodoTipoLibretaMili=false;
		this.isPermisoNuevoTipoLibretaMili=false;
		this.isPermisoActualizarTipoLibretaMili=false;
		this.isPermisoActualizarOriginalTipoLibretaMili=false;
		this.isPermisoEliminarTipoLibretaMili=false;
		this.isPermisoGuardarCambiosTipoLibretaMili=false;
		this.isPermisoConsultaTipoLibretaMili=false;
		this.isPermisoBusquedaTipoLibretaMili=false;
		this.isPermisoReporteTipoLibretaMili=false;		
		this.isPermisoOrdenTipoLibretaMili=false;		
		this.isPermisoPaginacionMedioTipoLibretaMili=false;		
		this.isPermisoPaginacionAltoTipoLibretaMili=false;
		this.isPermisoPaginacionTodoTipoLibretaMili=false;
		this.isPermisoCopiarTipoLibretaMili=false;		
		this.isPermisoVerFormTipoLibretaMili=false;		
		this.isPermisoDuplicarTipoLibretaMili=false;		
		this.isPermisoOrdenTipoLibretaMili=false;		
	}
	
	public void setPermisosUsuarioTipoLibretaMili(Boolean isPermiso) {
		this.isPermisoTodoTipoLibretaMili=isPermiso;
		this.isPermisoNuevoTipoLibretaMili=isPermiso;
		this.isPermisoActualizarTipoLibretaMili=isPermiso;
		this.isPermisoActualizarOriginalTipoLibretaMili=isPermiso;
		this.isPermisoEliminarTipoLibretaMili=isPermiso;
		this.isPermisoGuardarCambiosTipoLibretaMili=isPermiso;
		this.isPermisoConsultaTipoLibretaMili=isPermiso;
		this.isPermisoBusquedaTipoLibretaMili=isPermiso;
		this.isPermisoReporteTipoLibretaMili=isPermiso;
		this.isPermisoOrdenTipoLibretaMili=isPermiso;		
		this.isPermisoPaginacionMedioTipoLibretaMili=isPermiso;		
		this.isPermisoPaginacionAltoTipoLibretaMili=isPermiso;		
		this.isPermisoPaginacionTodoTipoLibretaMili=isPermiso;		
		this.isPermisoCopiarTipoLibretaMili=isPermiso;		
		this.isPermisoVerFormTipoLibretaMili=isPermiso;		
		this.isPermisoDuplicarTipoLibretaMili=isPermiso;
		this.isPermisoOrdenTipoLibretaMili=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoLibretaMili(Boolean isPermiso) {
		//this.isPermisoTodoTipoLibretaMili=isPermiso;
		this.isPermisoNuevoTipoLibretaMili=isPermiso;
		this.isPermisoActualizarTipoLibretaMili=isPermiso;
		this.isPermisoActualizarOriginalTipoLibretaMili=isPermiso;
		this.isPermisoEliminarTipoLibretaMili=isPermiso;
		this.isPermisoGuardarCambiosTipoLibretaMili=isPermiso;
		//this.isPermisoConsultaTipoLibretaMili=isPermiso;
		//this.isPermisoBusquedaTipoLibretaMili=isPermiso;
		//this.isPermisoReporteTipoLibretaMili=isPermiso;
		//this.isPermisoOrdenTipoLibretaMili=isPermiso;		
		//this.isPermisoPaginacionMedioTipoLibretaMili=isPermiso;		
		//this.isPermisoPaginacionAltoTipoLibretaMili=isPermiso;		
		//this.isPermisoPaginacionTodoTipoLibretaMili=isPermiso;		
		//this.isPermisoCopiarTipoLibretaMili=isPermiso;		
		//this.isPermisoDuplicarTipoLibretaMili=isPermiso;
		//this.isPermisoOrdenTipoLibretaMili=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoLibretaMiliClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DatoGeneralEmpleadoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoLibretaMiliJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDatoGeneralEmpleado=false;
		this.isTienePermisosDatoGeneralEmpleado=this.verificarGetPermisosUsuarioOpcionTipoLibretaMiliClaseRelacionada(this.opcionsRelacionadas,DatoGeneralEmpleadoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoLibretaMili(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoLibretaMiliClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDatoGeneralEmpleado=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoLibretaMiliClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoLibretaMiliClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoLibretaMiliClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDatoGeneralEmpleado && this.jInternalFrameDetalleFormTipoLibretaMili!=null && this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoLibretaMili.jTabbedPaneRelacionesTipoLibretaMili.remove(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoLibretaMili() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoLibretaMiliJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoLibretaMiliConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoLibretaMili=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoLibretaMili=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoLibretaMili=this.isPermisoActualizarTipoLibretaMili;
			this.isPermisoEliminarTipoLibretaMili=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoLibretaMili=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoLibretaMili=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoLibretaMili=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoLibretaMili=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoLibretaMili=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoLibretaMili=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoLibretaMili=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoLibretaMili=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoLibretaMili=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoLibretaMili=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoLibretaMili=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoLibretaMili=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoLibretaMili=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoLibretaMili.setToolTipText(this.jTableDatosTipoLibretaMili.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoLibretaMili(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoLibretaMili(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoLibretaMiliJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoLibretaMiliJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoLibretaMili() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDatoGeneralEmpleado && this.tipolibretamiliConstantesFunciones.mostrarDatoGeneralEmpleadoTipoLibretaMili && !TipoLibretaMiliConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Dato General Empleado");
			reporte.setsDescripcion("Dato General Empleado");
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
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyTipoLibretaMiliListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoLibretaMiliListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoLibretaMiliJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoLibretaMiliListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTipoLibretaMiliListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoLibretaMiliParameterReturnGeneral tipolibretamiliReturnGeneral=new TipoLibretaMiliParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipolibretamiliConstantesFunciones.cargarid_empresaTipoLibretaMili)
					 || (this.esRecargarFks && this.tipolibretamiliConstantesFunciones.cargarid_empresaTipoLibretaMili)) {

					if(!this.tipolibretamiliSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipolibretamiliSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipolibretamiliReturnGeneral=tipolibretamiliLogic.cargarCombosLoteForeignKeyTipoLibretaMili(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipolibretamiliReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoLibretaMili()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipolibretamiliSessionBean==null) {
				this.tipolibretamiliSessionBean=new TipoLibretaMiliSessionBean();
			}

			if(!this.tipolibretamiliSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTipoLibretaMili()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoLibretaMili(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoLibretaMili()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoLibretaMili();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoLibretaMili(TipoLibretaMili tipolibretamili)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoLibretaMili(TipoLibretaMili tipolibretamili,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoLibretaMili()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoLibretaMili()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoLibretaMili()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoLibretaMili()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoLibretaMili()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoLibretaMili()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoLibretaMili(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoLibretaMili()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxid_empresaTipoLibretaMili!=null && this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxid_empresaTipoLibretaMili.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxid_empresaTipoLibretaMili.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoLibretaMiliBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoLibretaMiliBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoLibretaMiliBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipolibretamiliSessionBean=new TipoLibretaMiliSessionBean(); 
		this.tipolibretamiliConstantesFunciones=new TipoLibretaMiliConstantesFunciones(); 
		this.tipolibretamiliBean=new TipoLibretaMili();//(this.tipolibretamiliConstantesFunciones); 		
		this.tipolibretamiliReturnGeneral=new TipoLibretaMiliParameterReturnGeneral(); 
		
		this.tipolibretamiliSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipolibretamiliSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoLibretaMiliBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoLibretaMiliBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoLibretaMiliBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoLibretaMili(true);
			
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
			
			this.tipolibretamiliConstantesFunciones=new TipoLibretaMiliConstantesFunciones(); 
			this.tipolibretamiliBean=new TipoLibretaMili();//this.tipolibretamiliConstantesFunciones); 			
			this.tipolibretamiliReturnGeneral=new TipoLibretaMiliParameterReturnGeneral(); 
		
			TipoLibretaMiliBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Libreta Mili Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipolibretamili=new TipoLibretaMili();
			this.tipolibretamilis = new ArrayList<TipoLibretaMili>();
			this.tipolibretamilisAux = new ArrayList<TipoLibretaMili>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic=new TipoLibretaMiliLogic();
				this.tipolibretamiliLogic.getNewConnexionToDeep("");
			}
			
			//this.tipolibretamiliSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipolibretamiliSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoLibretaMili);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoLibretaMili!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoLibretaMili);	
					}
					
					if(this.jInternalFrameImportacionTipoLibretaMili!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoLibretaMili);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoLibretaMili!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoLibretaMili);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoLibretaMili);
				this.jInternalFrameDetalleFormTipoLibretaMili.setVisible(false);
				this.jInternalFrameDetalleFormTipoLibretaMili.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoLibretaMili!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoLibretaMili);
					this.jInternalFrameReporteDinamicoTipoLibretaMili.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoLibretaMili.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoLibretaMili!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoLibretaMili);
					this.jInternalFrameImportacionTipoLibretaMili.setVisible(false);
					this.jInternalFrameImportacionTipoLibretaMili.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoLibretaMili!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoLibretaMili);
					this.jInternalFrameOrderByTipoLibretaMili.setVisible(false);
					this.jInternalFrameOrderByTipoLibretaMili.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoLibretaMiliActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoLibretaMiliConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipolibretamiliReturnGeneral=new TipoLibretaMiliParameterReturnGeneral();
			
			this.tipolibretamiliParameterGeneral=new TipoLibretaMiliParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipolibretamiliLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoLibretaMiliJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DatoGeneralEmpleadoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoLibretaMiliConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipolibretamiliSessionBean.getEsGuardarRelacionado(),this.tipolibretamiliSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoLibretaMiliConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipolibretamiliSessionBean.getEsGuardarRelacionado(),this.tipolibretamiliSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoLibretaMili=false;
			this.isVisibilidadCeldaDuplicarTipoLibretaMili=true;
			this.isVisibilidadCeldaCopiarTipoLibretaMili=true;
			this.isVisibilidadCeldaVerFormTipoLibretaMili=true;
			this.isVisibilidadCeldaOrdenTipoLibretaMili=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoLibretaMili=false;
			this.isVisibilidadCeldaModificarTipoLibretaMili=false;
			this.isVisibilidadCeldaActualizarTipoLibretaMili=false;
			this.isVisibilidadCeldaEliminarTipoLibretaMili=false;
			this.isVisibilidadCeldaCancelarTipoLibretaMili=false;
			this.isVisibilidadCeldaGuardarTipoLibretaMili=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLibretaMili=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoLibretaMili("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoLibretaMili();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoLibretaMili(false);
			
			this.setPermisosUsuarioTipoLibretaMili();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipolibretamiliSessionBean.getEsGuardarRelacionado() 
				|| (this.tipolibretamiliSessionBean.getEsGuardarRelacionado() && this.tipolibretamiliSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoLibretaMiliClasesRelacionadas();
			}
			
			if(this.tipolibretamiliSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoLibretaMiliClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoLibretaMiliJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoLibretaMili();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoLibretaMili();
			}
			
			if(!this.isPermisoBusquedaTipoLibretaMili) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoLibretaMili.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoLibretaMili,this.isPermisoPaginacionMedioTipoLibretaMili,this.isPermisoPaginacionTodoTipoLibretaMili);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoLibretaMiliConstantesFunciones.getTiposSeleccionarTipoLibretaMili());
				
				this.tiposColumnasSelect=TipoLibretaMiliConstantesFunciones.getTiposSeleccionarTipoLibretaMili(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoLibretaMili();				
				//this.tiposRelacionesSelect=TipoLibretaMiliConstantesFunciones.getTiposRelacionesTipoLibretaMili(true);
				
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
			//if(!this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoLibretaMili();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoLibretaMili(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoLibretaMili(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoLibretaMili() ;
			
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
			
			
			this.datogeneralempleadoLogic=new DatoGeneralEmpleadoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipolibretamiliImplementable= (TipoLibretaMiliImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoLibretaMiliConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipolibretamiliImplementableHome= (TipoLibretaMiliImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoLibretaMiliConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipolibretamilis= new ArrayList<TipoLibretaMili>();
			this.tipolibretamilisEliminados= new ArrayList<TipoLibretaMili>();
						
			this.isEsNuevoTipoLibretaMili=false;
			this.esParaAccionDesdeFormularioTipoLibretaMili=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoLibretaMili(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoLibretaMili();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoLibretaMiliBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoLibretaMiliConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoLibretaMili("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoLibretaMili(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoLibretaMili();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoLibretaMili();
			}
			
			TipoLibretaMiliBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoLibretaMili.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoLibretaMili.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoLibretaMili.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoLibretaMili(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoLibretaMili: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoLibretaMili() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoLibretaMili")) {
				iIndex=this.jInternalFrameDetalleFormTipoLibretaMili.jTabbedPaneRelacionesTipoLibretaMili.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoLibretaMili.jTabbedPaneRelacionesTipoLibretaMili.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoLibretaMili.getSelectedRow();	
				
				

				if(sTitle.equals("Dato General Empleados")) {
					if(!DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoLibretaMili();

						this.cargarParteTabPanelRelacionadaDatoGeneralEmpleado(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoLibretaMili();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDatoGeneralEmpleado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoLibretaMili.cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(false,true,iIndex);
		this.jButtonDatoGeneralEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDatoGeneralEmpleado();

		//this.jTabbedPaneRelacionesTipoLibretaMili.updateUI();
		//this.jTabbedPaneRelacionesTipoLibretaMili.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoLibretaMili.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DatoGeneralEmpleado")) {
				int row=this.jTableDatosTipoLibretaMili.getSelectedRow();
				jButtonDatoGeneralEmpleadoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Dato General Empleado")) {

					if(this.isTienePermisosDatoGeneralEmpleado && this.tipolibretamiliConstantesFunciones.mostrarDatoGeneralEmpleadoTipoLibretaMili && !TipoLibretaMiliConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Dato General Empleados"+"("+DatoGeneralEmpleadoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Dato General Empleados");

						if(tipolibretamiliConstantesFunciones.resaltarDatoGeneralEmpleadoTipoLibretaMili!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipolibretamiliConstantesFunciones.resaltarDatoGeneralEmpleadoTipoLibretaMili);
						}

						jmenuItem.setEnabled(this.tipolibretamiliConstantesFunciones.activarDatoGeneralEmpleadoTipoLibretaMili);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DatoGeneralEmpleado"));

						

						this.jInternalFrameDetalleFormTipoLibretaMili.jmenuDetalleTipoLibretaMili.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoLibretaMili(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoLibretaMili(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoLibretaMili(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoLibretaMiliListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoLibretaMili();
		
		this.cargarCombosFrameForeignKeyTipoLibretaMili();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoLibretaMili();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoLibretaMili();
		}
	}
	
	
	
	public void jButtonNuevoTipoLibretaMiliActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipolibretamiliSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoLibretaMili==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
			
			
			if(jTableDatosTipoLibretaMili.getRowCount()>=1) {
				jTableDatosTipoLibretaMili.removeRowSelectionInterval(0, jTableDatosTipoLibretaMili.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoLibretaMili=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoLibretaMili(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoLibretaMili(true);			
			//this.tipolibretamili=new TipoLibretaMili();
			//this.tipolibretamili.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoLibretaMili(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoLibretaMili() ;
			
			if(TipoLibretaMiliJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoLibretaMili(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipolibretamili);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipolibretamili);				
			
			TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
			
			if(this.tipolibretamiliSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoLibretaMili: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoLibretaMiliActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoLibretaMili> tipolibretamilisSeleccionados=new ArrayList<TipoLibretaMili>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoLibretaMili.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoLibretaMili.getSelectedRows().length;			
			}
			
			tipolibretamilisSeleccionados=this.getTipoLibretaMilisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoLibretaMili--;			
				//TipoLibretaMili tipolibretamiliAux= new TipoLibretaMili();			
				//tipolibretamiliAux.setId(this.iIdNuevoTipoLibretaMili);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoLibretaMili tipolibretamiliOrigen=new TipoLibretaMili();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoLibretaMili tipolibretamiliOrigen : tipolibretamilisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoLibretaMili.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipolibretamiliOrigen =(TipoLibretaMili) this.tipolibretamiliLogic.getTipoLibretaMilis().toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipolibretamiliOrigen =(TipoLibretaMili) this.tipolibretamilis.toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoLibretaMili();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipolibretamili.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoLibretaMili(tipolibretamiliOrigen,this.tipolibretamili,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLibretaMili(this.tipolibretamili);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipolibretamiliLogic.getTipoLibretaMilis().add(this.tipolibretamiliAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipolibretamilis.add(this.tipolibretamiliAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoLibretaMili(false);
				
				this.jTableDatosTipoLibretaMili.setRowSelectionInterval(this.getIndiceNuevoTipoLibretaMili(), this.getIndiceNuevoTipoLibretaMili());
				
				int iLastRow =  this.jTableDatosTipoLibretaMili.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoLibretaMili.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoLibretaMili.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoLibretaMili(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoLibretaMiliActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoLibretaMili> tipolibretamilisSeleccionados=new ArrayList<TipoLibretaMili>();									
		
			TipoLibretaMili tipolibretamiliOrigen=new TipoLibretaMili();
			TipoLibretaMili tipolibretamiliDestino=new TipoLibretaMili();
				
			tipolibretamilisSeleccionados=this.getTipoLibretaMilisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoLibretaMili.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipolibretamilisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoLibretaMili.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolibretamiliOrigen =(TipoLibretaMili) this.tipolibretamiliLogic.getTipoLibretaMilis().toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipolibretamiliOrigen =(TipoLibretaMili) this.tipolibretamilis.toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolibretamiliDestino =(TipoLibretaMili) this.tipolibretamiliLogic.getTipoLibretaMilis().toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipolibretamiliDestino =(TipoLibretaMili) this.tipolibretamilis.toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipolibretamiliOrigen =tipolibretamilisSeleccionados.get(0);
				tipolibretamiliDestino =tipolibretamilisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoLibretaMili(tipolibretamiliOrigen,tipolibretamiliDestino,true,false);
				
				tipolibretamiliDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipolibretamiliDestino,tipolibretamiliLogic.getTipoLibretaMilis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipolibretamiliDestino,tipolibretamilis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoLibretaMili(false);
				
				//this.jTableDatosTipoLibretaMili.setRowSelectionInterval(this.getIndiceNuevoTipoLibretaMili(), this.getIndiceNuevoTipoLibretaMili());
				
				int iLastRow =  this.jTableDatosTipoLibretaMili.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoLibretaMili.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoLibretaMili.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoLibretaMili(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoLibretaMiliActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoLibretaMili==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoLibretaMili.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoLibretaMiliActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoLibretaMili.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoLibretaMili.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoLibretaMili.setVisible(!isVisible);
			this.jPanelPaginacionTipoLibretaMili.setVisible(!isVisible);
			this.jPanelAccionesTipoLibretaMili.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoLibretaMiliActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoLibretaMili();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoLibretaMiliActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoLibretaMili();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoLibretaMiliActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoLibretaMili();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoLibretaMiliActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoLibretaMili();
			
			this.abrirFrameOrderByTipoLibretaMili();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoLibretaMiliActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoLibretaMili();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoLibretaMili(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoLibretaMili);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoLibretaMili.isMaximum()) {
					this.jInternalFrameDetalleFormTipoLibretaMili.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoLibretaMili.setSize(this.jInternalFrameDetalleFormTipoLibretaMili.iWidthFormulario,this.jInternalFrameDetalleFormTipoLibretaMili.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoLibretaMili.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoLibretaMili.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoLibretaMili.isMaximum()) {
						this.jInternalFrameDetalleFormTipoLibretaMili.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoLibretaMili.jContentPaneDetalleTipoLibretaMili.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoLibretaMili.jTabbedPaneRelacionesTipoLibretaMili.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoLibretaMili.jContentPaneDetalleTipoLibretaMili.getWidth(),TipoLibretaMiliConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoLibretaMili.jTabbedPaneRelacionesTipoLibretaMili.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoLibretaMili.jContentPaneDetalleTipoLibretaMili.getWidth(),TipoLibretaMiliConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoLibretaMili.jTabbedPaneRelacionesTipoLibretaMili.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoLibretaMili.jContentPaneDetalleTipoLibretaMili.getWidth(),TipoLibretaMiliConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDatoGeneralEmpleado();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoLibretaMili.setVisible(true);
	        this.jInternalFrameDetalleFormTipoLibretaMili.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoLibretaMili() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoLibretaMili==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoLibretaMili=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoLibretaMili,false,this);
				} else {
					this.jInternalFrameOrderByTipoLibretaMili=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoLibretaMili,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoLibretaMili);
				this.jInternalFrameOrderByTipoLibretaMili.setVisible(false);
				this.jInternalFrameOrderByTipoLibretaMili.setSelected(false);
				
				this.jInternalFrameOrderByTipoLibretaMili.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoLibretaMili"));
				
				this.inicializarActualizarBindingTablaOrderByTipoLibretaMili();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoLibretaMili() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoLibretaMili==null) {
				
				this.jInternalFrameImportacionTipoLibretaMili=new ImportacionJInternalFrame(TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoLibretaMili);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoLibretaMili);
				this.jInternalFrameImportacionTipoLibretaMili.setVisible(false);
				this.jInternalFrameImportacionTipoLibretaMili.setSelected(false);


				this.jInternalFrameImportacionTipoLibretaMili.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoLibretaMili"));
				this.jInternalFrameImportacionTipoLibretaMili.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoLibretaMili"));
				this.jInternalFrameImportacionTipoLibretaMili.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoLibretaMili"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoLibretaMili() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoLibretaMili==null) {
				this.jInternalFrameReporteDinamicoTipoLibretaMili=new ReporteDinamicoJInternalFrame(TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoLibretaMili);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoLibretaMili);
				this.jInternalFrameReporteDinamicoTipoLibretaMili.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoLibretaMili.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoLibretaMili.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoLibretaMili"));
				this.jInternalFrameReporteDinamicoTipoLibretaMili.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoLibretaMili"));
				this.jInternalFrameReporteDinamicoTipoLibretaMili.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoLibretaMili"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoLibretaMili();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDatoGeneralEmpleado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoLibretaMili.jContentPaneDetalleTipoLibretaMili.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoLibretaMili() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoLibretaMili);
			
	       	this.jInternalFrameDetalleFormTipoLibretaMili.setVisible(false);
	        this.jInternalFrameDetalleFormTipoLibretaMili.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoLibretaMili.dispose();
			//this.jInternalFrameDetalleFormTipoLibretaMili=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoLibretaMili() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoLibretaMili.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoLibretaMili.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoLibretaMili() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoLibretaMili.setVisible(true);
	        this.jInternalFrameImportacionTipoLibretaMili.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoLibretaMili() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoLibretaMili.setVisible(true);
	        this.jInternalFrameOrderByTipoLibretaMili.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoLibretaMili() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoLibretaMili.setVisible(false);
	        this.jInternalFrameOrderByTipoLibretaMili.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoLibretaMili() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoLibretaMili.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoLibretaMili.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoLibretaMili() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoLibretaMili.setVisible(false);
	        this.jInternalFrameImportacionTipoLibretaMili.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoLibretaMiliActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoLibretaMili(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoLibretaMili(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoLibretaMili.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoLibretaMili(true);
			//this.isEsNuevoTipoLibretaMili=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamili =(TipoLibretaMili) this.tipolibretamiliLogic.getTipoLibretaMilis().toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipolibretamili =(TipoLibretaMili) this.tipolibretamilis.toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoLibretaMili("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoLibretaMili(false) ;
			
			if(tipolibretamiliSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getEsGuardarRelacionado() && DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDatoGeneralEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoLibretaMiliJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoLibretaMili(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoLibretaMili(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoLibretaMiliActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoLibretaMili.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamili =(TipoLibretaMili) this.tipolibretamiliLogic.getTipoLibretaMilis().toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolibretamili =(TipoLibretaMili) this.tipolibretamilis.toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoLibretaMili(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoLibretaMili==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoLibretaMili.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoLibretaMili(true);
			//this.isEsNuevoTipoLibretaMili=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamili =(TipoLibretaMili) this.tipolibretamiliLogic.getTipoLibretaMilis().toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipolibretamili =(TipoLibretaMili) this.tipolibretamilis.toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipolibretamili.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoLibretaMili("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoLibretaMili(false) ;
			
			if(TipoLibretaMiliJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoLibretaMili(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoLibretaMili(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoLibretaMiliActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoLibretaMili(false);
			
			//if(!this.isEsNuevoTipoLibretaMili) {								
				int intSelectedRow = this.jTableDatosTipoLibretaMili.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamili =(TipoLibretaMili) this.tipolibretamiliLogic.getTipoLibretaMilis().toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipolibretamili =(TipoLibretaMili) this.tipolibretamilis.toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoLibretaMiliJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoLibretaMili(this.tipolibretamili,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoLibretaMili(this.tipolibretamili);
				
			}
			
			if(this.permiteMantenimiento(this.tipolibretamili)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoLibretaMili=true;
					this.inicializarActualizarBindingTablaTipoLibretaMili(false);
					this.isEsNuevoTipoLibretaMili=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoLibretaMili=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoLibretaMili=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoLibretaMili(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoLibretaMili(false);
				
				this.habilitarDeshabilitarControlesTipoLibretaMili(false);
			
												
				
				if(TipoLibretaMiliJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoLibretaMili();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoLibretaMiliActionPerformed(evt,tipolibretamiliSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoLibretaMili(this.tipolibretamili,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoLibretaMili.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipolibretamiliSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipolibretamili.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoLibretaMili.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLibretaMili.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoLibretaMiliActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoLibretaMili.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamili =(TipoLibretaMili) this.tipolibretamiliLogic.getTipoLibretaMilis().toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
				this.tipolibretamili.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipolibretamili =(TipoLibretaMili) this.tipolibretamilis.toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
				this.tipolibretamili.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipolibretamili)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoLibretaMiliModel) this.jTableDatosTipoLibretaMili.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoLibretaMili=true;
				this.inicializarActualizarBindingTablaTipoLibretaMili(false);
				this.isEsNuevoTipoLibretaMili=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoLibretaMili(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoLibretaMili(false);
				
				this.habilitarDeshabilitarControlesTipoLibretaMili(false);
				
				
				
				if(TipoLibretaMiliJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoLibretaMili();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoLibretaMiliActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoLibretaMili.getRowCount()>=1) {
				jTableDatosTipoLibretaMili.removeRowSelectionInterval(0, jTableDatosTipoLibretaMili.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoLibretaMili(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoLibretaMili(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoLibretaMili(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoLibretaMili(false) ;
			
			this.isEsNuevoTipoLibretaMili=false;
			
			if(TipoLibretaMiliJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoLibretaMili();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoLibretaMiliActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoLibretaMili(false);
				
				//SI ES MANUAL
				if(TipoLibretaMiliJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoLibretaMili();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoLibretaMiliActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoLibretaMili--;			
			//TipoLibretaMili tipolibretamiliAux= new TipoLibretaMili();			
			//tipolibretamiliAux.setId(this.iIdNuevoTipoLibretaMili);
			
			if(this.jInternalFrameDetalleFormTipoLibretaMili==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoLibretaMili();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoLibretaMili(this.tipolibretamili);
			
			this.tipolibretamili.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipolibretamiliLogic.getTipoLibretaMilis().add(this.tipolibretamiliAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipolibretamilis.add(this.tipolibretamiliAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoLibretaMili(false);
			
			this.jTableDatosTipoLibretaMili.setRowSelectionInterval(this.getIndiceNuevoTipoLibretaMili(), this.getIndiceNuevoTipoLibretaMili());
			
			int iLastRow =  this.jTableDatosTipoLibretaMili.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoLibretaMili.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoLibretaMili.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoLibretaMili(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoLibretaMiliActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoLibretaMili(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoLibretaMili(false);
			
			//SI ES MANUAL
			if(TipoLibretaMiliJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoLibretaMili();
			}
			
			//this.abrirFrameTreeTipoLibretaMili();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoLibretaMiliActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Libreta MiliS ?", "MANTENIMIENTO DE Tipo Libreta Mili", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoLibretaMili.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoLibretaMili();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipolibretamiliReturnGeneral=tipolibretamiliLogic.procesarImportacionTipoLibretaMilisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipolibretamiliParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoLibretaMiliReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoLibretaMiliActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoLibretaMili.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoLibretaMili.setFileImportacion(this.jInternalFrameImportacionTipoLibretaMili.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoLibretaMili.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoLibretaMili.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoLibretaMili.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoLibretaMili.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoLibretaMiliActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoLibretaMili> tipolibretamilisSeleccionados=new ArrayList<TipoLibretaMili>();		

		tipolibretamilisSeleccionados=this.getTipoLibretaMilisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoLibretaMili.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoLibretaMili.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoLibretaMiliBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoLibretaMiliBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoLibretaMilis("Todos",tipolibretamilisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Libreta Mili",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoLibretaMili.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoLibretaMili.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoLibretaMiliConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoLibretaMiliConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoLibretaMiliConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoLibretaMili.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoLibretaMili.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoLibretaMili.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoLibretaMiliConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoLibretaMiliConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoLibretaMiliConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoLibretaMili.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoLibretaMiliConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoLibretaMiliConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoLibretaMiliConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoLibretaMili.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoLibretaMili.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoLibretaMiliConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoLibretaMiliConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoLibretaMiliConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoLibretaMiliActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoLibretaMili> tipolibretamilisSeleccionados=new ArrayList<TipoLibretaMili>();		
		
		tipolibretamilisSeleccionados=this.getTipoLibretaMilisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolibretamili";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoLibretaMilis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoLibretaMili.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoLibretaMili.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoLibretaMiliConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoLibretaMiliConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoLibretaMili tipolibretamili:tipolibretamilisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipolibretamili.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoLibretaMiliConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoLibretaMiliConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoLibretaMili tipolibretamili:tipolibretamilisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipolibretamili.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoLibretaMiliConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoLibretaMiliConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoLibretaMili tipolibretamili:tipolibretamilisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipolibretamili.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoLibretaMili(row);				
			//	iRow++;
			//}				
			
			//for(TipoLibretaMili tipolibretamiliAux:tipolibretamilisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoLibretaMili(tipolibretamiliAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Libreta Mili",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipolibretamiliLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoLibretaMili(false);
			
			//SI ES MANUAL
			if(TipoLibretaMiliJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoLibretaMili();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoLibretaMiliActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoLibretaMili(false);
			
			//SI ES MANUAL
			if(TipoLibretaMiliJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoLibretaMili();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoLibretaMiliActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoLibretaMili(false);
			
			//SI ES MANUAL
			if(TipoLibretaMiliJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoLibretaMili();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoLibretaMili() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoLibretaMili.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoLibretaMili.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoLibretaMili.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoLibretaMili.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoLibretaMili.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoLibretaMili.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoLibretaMili.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoLibretaMili(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoLibretaMili(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoLibretaMili(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoLibretaMili(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoLibretaMili(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoLibretaMili(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoLibretaMili(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoLibretaMili(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoLibretaMiliJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoLibretaMiliJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoLibretaMili() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoLibretaMili();
		
		this.inicializarActualizarBindingBotonesManualTipoLibretaMili(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoLibretaMili();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoLibretaMili() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoLibretaMili(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoLibretaMili(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoLibretaMili.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoLibretaMili.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoLibretaMili.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoLibretaMili.jCheckBoxPostAccionNuevoTipoLibretaMili.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoLibretaMili.jCheckBoxPostAccionSinCerrarTipoLibretaMili.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoLibretaMili.jCheckBoxPostAccionSinMensajeTipoLibretaMili.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoLibretaMili.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoLibretaMili.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoLibretaMili.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) {
				this.jInternalFrameDetalleFormTipoLibretaMili.jCheckBoxPostAccionNuevoTipoLibretaMili.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoLibretaMili.jCheckBoxPostAccionSinCerrarTipoLibretaMili.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoLibretaMili.jCheckBoxPostAccionSinMensajeTipoLibretaMili.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoLibretaMili.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoLibretaMili.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxTiposAccionesFormularioTipoLibretaMili.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoLibretaMili.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoLibretaMili!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoLibretaMili.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoLibretaMili.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoLibretaMili.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoLibretaMili.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoLibretaMili.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoLibretaMili!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoLibretaMili.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoLibretaMili.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoLibretaMili.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoLibretaMili(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoLibretaMiliJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoLibretaMili(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoLibretaMili() throws Exception {
		try	{
			if(TipoLibretaMiliJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoLibretaMili();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoLibretaMili() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxTiposAccionesFormularioTipoLibretaMili.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxTiposAccionesFormularioTipoLibretaMili.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoLibretaMili() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoLibretaMili.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoLibretaMili.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoLibretaMili.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoLibretaMili.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoLibretaMili.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoLibretaMili.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoLibretaMili.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoLibretaMili.addItem(reporte);
			}
			
			
			if(!this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoLibretaMili.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoLibretaMili.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoLibretaMili.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoLibretaMili.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoLibretaMili.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoLibretaMili.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxTiposAccionesFormularioTipoLibretaMili.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxTiposAccionesFormularioTipoLibretaMili.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoLibretaMili.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoLibretaMili.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoLibretaMili.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoLibretaMili();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoLibretaMili() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoLibretaMili!=null) {
				this.jInternalFrameReporteDinamicoTipoLibretaMili.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoLibretaMili.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoLibretaMili!=null) {
				this.jInternalFrameReporteDinamicoTipoLibretaMili.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoLibretaMili.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoLibretaMili!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoLibretaMili.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoLibretaMili.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoLibretaMili.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoLibretaMili.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoLibretaMili.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoLibretaMili.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoLibretaMili()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoLibretaMili(Boolean esInicializar) throws Exception {				
		if(TipoLibretaMiliJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoLibretaMili();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoLibretaMili() throws Exception {
		this.inicializarActualizarBindingTablaTipoLibretaMili(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoLibretaMili() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoLibretaMili.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoLibretaMili.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoLibretaMili.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoLibretaMiliPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoLibretaMili.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoLibretaMili.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoLibretaMiliPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoLibretaMiliOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoLibretaMiliOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoLibretaMiliPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoLibretaMili.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoLibretaMili.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoLibretaMiliPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoLibretaMili.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoLibretaMili(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipolibretamiliLogic.getTipoLibretaMilis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipolibretamilis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoLibretaMiliJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoLibretaMili.setModel(new TipoLibretaMiliModel(this.tipolibretamiliLogic.getTipoLibretaMilis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoLibretaMili.setModel(new TipoLibretaMiliModel(this.tipolibretamilis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoLibretaMili!=null && this.jInternalFrameOrderByTipoLibretaMili.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoLibretaMili();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoLibretaMili.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoLibretaMili,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoLibretaMiliPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO,tipolibretamiliConstantesFunciones.resaltarSeleccionarTipoLibretaMili,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO,tipolibretamiliConstantesFunciones.resaltarSeleccionarTipoLibretaMili,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoLibretaMili.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoLibretaMili,TipoLibretaMiliConstantesFunciones.LABEL_ID));

		if(this.tipolibretamiliConstantesFunciones.mostraridTipoLibretaMili && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoLibretaMiliConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipolibretamiliConstantesFunciones.resaltaridTipoLibretaMili,this.tipolibretamiliConstantesFunciones.activaridTipoLibretaMili,this,true,"idTipoLibretaMili","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipolibretamiliConstantesFunciones.resaltaridTipoLibretaMili,this.tipolibretamiliConstantesFunciones.activaridTipoLibretaMili,this,true,"idTipoLibretaMili","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoLibretaMili.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoLibretaMili,TipoLibretaMiliConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipolibretamiliConstantesFunciones.mostrarid_empresaTipoLibretaMili && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoLibretaMiliConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipolibretamiliConstantesFunciones.resaltarid_empresaTipoLibretaMili,this,this.tipolibretamiliConstantesFunciones.activarid_empresaTipoLibretaMili));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipolibretamiliConstantesFunciones.resaltarid_empresaTipoLibretaMili,this,this.tipolibretamiliConstantesFunciones.activarid_empresaTipoLibretaMili,false,"id_empresaTipoLibretaMili","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoLibretaMiliPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoLibretaMili.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoLibretaMili,TipoLibretaMiliConstantesFunciones.LABEL_CODIGO));

		if(this.tipolibretamiliConstantesFunciones.mostrarcodigoTipoLibretaMili && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoLibretaMiliConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipolibretamiliConstantesFunciones.resaltarcodigoTipoLibretaMili,this.tipolibretamiliConstantesFunciones.activarcodigoTipoLibretaMili,this,true,"codigoTipoLibretaMili","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipolibretamiliConstantesFunciones.resaltarcodigoTipoLibretaMili,this.tipolibretamiliConstantesFunciones.activarcodigoTipoLibretaMili,this,true,"codigoTipoLibretaMili","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoLibretaMiliPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoLibretaMili.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoLibretaMili,TipoLibretaMiliConstantesFunciones.LABEL_NOMBRE));

		if(this.tipolibretamiliConstantesFunciones.mostrarnombreTipoLibretaMili && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoLibretaMiliConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipolibretamiliConstantesFunciones.resaltarnombreTipoLibretaMili,this.tipolibretamiliConstantesFunciones.activarnombreTipoLibretaMili,this,true,"nombreTipoLibretaMili","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipolibretamiliConstantesFunciones.resaltarnombreTipoLibretaMili,this.tipolibretamiliConstantesFunciones.activarnombreTipoLibretaMili,this,true,"nombreTipoLibretaMili","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoLibretaMiliPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipolibretamiliSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDatoGeneralEmpleado && this.tipolibretamiliConstantesFunciones.mostrarDatoGeneralEmpleadoTipoLibretaMili && !TipoLibretaMiliConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Dato General Empleados");
				tableColumn.setHeaderValue("Dato General Empleados");
				tableColumn.setCellRenderer(new DatoGeneralEmpleadoTableCell(tipolibretamiliConstantesFunciones.resaltarDatoGeneralEmpleadoTipoLibretaMili,this,this.tipolibretamiliConstantesFunciones.activarDatoGeneralEmpleadoTipoLibretaMili));
				tableColumn.setCellEditor(new DatoGeneralEmpleadoTableCell(tipolibretamiliConstantesFunciones.resaltarDatoGeneralEmpleadoTipoLibretaMili,this,this.tipolibretamiliConstantesFunciones.activarDatoGeneralEmpleadoTipoLibretaMili));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoLibretaMili.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipolibretamiliSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipolibretamiliSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoLibretaMili.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipolibretamiliSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipolibretamiliSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoLibretaMili.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoLibretaMili && this.isPermisoGuardarCambiosTipoLibretaMili) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipolibretamiliSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipolibretamiliSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoLibretaMili.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipolibretamiliSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoLibretaMili.addColumn(tableColumn);
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
			
			this.jTableDatosTipoLibretaMili.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoLibretaMili && this.isPermisoGuardarCambiosTipoLibretaMili) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipolibretamiliSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoLibretaMili && this.isPermisoGuardarCambiosTipoLibretaMili) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoLibretaMili.moveColumn(this.jTableDatosTipoLibretaMili.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoLibretaMili.moveColumn(this.jTableDatosTipoLibretaMili.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipolibretamiliSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoLibretaMili.moveColumn(this.jTableDatosTipoLibretaMili.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoLibretaMili.moveColumn(this.jTableDatosTipoLibretaMili.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoLibretaMili.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoLibretaMili.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoLibretaMili,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoLibretaMiliJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoLibretaMili.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoLibretaMili.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoLibretaMiliJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoLibretaMiliJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoLibretaMili.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoLibretaMili.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoLibretaMili.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipolibretamiliLogic.getTipoLibretaMilis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipolibretamilis.size()-1;
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
		//this.jTableDatosTipoLibretaMili.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoLibretaMili.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoLibretaMili();
			
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
				
				//this.isEsNuevoTipoLibretaMili=false;
					
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
			
				if(this.tipolibretamiliSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoLibretaMili==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoLibretaMili.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoLibretaMili.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamili =(TipoLibretaMili) this.tipolibretamiliLogic.getTipoLibretaMilis().toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolibretamili =(TipoLibretaMili) this.tipolibretamilis.toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipolibretamili.getsType().equals("DUPLICADO")
				   || this.tipolibretamili.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoLibretaMili=true;
				
				} else {
					this.isEsNuevoTipoLibretaMili=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
					if(this.tipolibretamili.getId()>=0 && !this.tipolibretamili.getIsNew()) {						
						this.isEsNuevoTipoLibretaMili=false;
						
					} else {
						this.isEsNuevoTipoLibretaMili=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoLibretaMili(esRelaciones);						
				
				this.seleccionarTipoLibretaMili(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipolibretamili.getId()<0) {
					this.isEsNuevoTipoLibretaMili=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoLibretaMili(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoLibretaMili(evt,rowIndex);
				}	
				
				if(this.tipolibretamiliSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoLibretaMili: " + this.dDif); 
					}
				}								
				
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoLibretaMili(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipolibretamili)) {
					if(this.tipolibretamili.getId()>0) {
						this.tipolibretamili.setIsDeleted(true);
						
						this.tipolibretamilisEliminados.add(this.tipolibretamili);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipolibretamiliLogic.getTipoLibretaMilis().remove(this.tipolibretamili);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipolibretamilis.remove(this.tipolibretamili);				
					}
					
					
					((TipoLibretaMiliModel) this.jTableDatosTipoLibretaMili.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoLibretaMili(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoLibretaMili(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoLibretaMili) {
			
			if(this.jInternalFrameDetalleFormTipoLibretaMili==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoLibretaMili.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoLibretaMili.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamili =(TipoLibretaMili) this.tipolibretamiliLogic.getTipoLibretaMilis().toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolibretamili =(TipoLibretaMili) this.tipolibretamilis.toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoLibretaMiliJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoLibretaMili(this.tipolibretamili);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipolibretamiliConstantesFunciones.cargarid_empresaTipoLibretaMili || this.tipolibretamiliConstantesFunciones.event_dependid_empresaTipoLibretaMili) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipolibretamili.getid_empresa());
									//this.inicializarActualizarBindingTipoLibretaMili(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipolibretamili.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipolibretamili.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipolibretamili.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoLibretaMili("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoLibretaMili(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoLibretaMili() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoLibretaMili(TipoLibretaMili tipolibretamili) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoLibretaMili(tipolibretamili,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoLibretaMili(TipoLibretaMili tipolibretamili,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoLibretaMili(tipolibretamili);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoLibretaMili(tipolibretamili,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoLibretaMili(tipolibretamili);
	}
	
	public void setVariablesObjetoActualToFormularioTipoLibretaMili(TipoLibretaMili tipolibretamili) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoLibretaMili==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoLibretaMili.jLabelidTipoLibretaMili.setText(tipolibretamili.getId().toString());
			this.jInternalFrameDetalleFormTipoLibretaMili.jTextFieldcodigoTipoLibretaMili.setText(tipolibretamili.getcodigo());
			this.jInternalFrameDetalleFormTipoLibretaMili.jTextAreanombreTipoLibretaMili.setText(tipolibretamili.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoLibretaMili tipolibretamiliLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipolibretamiliLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoLibretaMili tipolibretamiliLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipolibretamiliLocal=this.tipolibretamili;
			} else {
				tipolibretamiliLocal=this.tipolibretamiliAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipolibretamiliLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoLibretaMili(tipolibretamiliLocal,true);
					
					if(tipolibretamiliSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipolibretamiliLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipolibretamiliLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoLibretaMili(TipoLibretaMili tipolibretamili,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoLibretaMili(tipolibretamili,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoLibretaMili(tipolibretamili);
	}
	
	public void setVariablesFormularioToObjetoActualTipoLibretaMili(TipoLibretaMili tipolibretamili,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoLibretaMili(tipolibretamili,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoLibretaMili(TipoLibretaMili tipolibretamili,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoLibretaMili==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoLibretaMili.jLabelidTipoLibretaMili.getText()==null || this.jInternalFrameDetalleFormTipoLibretaMili.jLabelidTipoLibretaMili.getText()=="" || this.jInternalFrameDetalleFormTipoLibretaMili.jLabelidTipoLibretaMili.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoLibretaMili.jLabelidTipoLibretaMili.setText("0");
			}

			if(conColumnasBase) {tipolibretamili.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoLibretaMili.jLabelidTipoLibretaMili.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoLibretaMiliConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoLibretaMili.jLabelIdTipoLibretaMili,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipolibretamili.setcodigo(this.jInternalFrameDetalleFormTipoLibretaMili.jTextFieldcodigoTipoLibretaMili.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoLibretaMiliConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoLibretaMili.jLabelcodigoTipoLibretaMili,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipolibretamili.setnombre(this.jInternalFrameDetalleFormTipoLibretaMili.jTextAreanombreTipoLibretaMili.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoLibretaMiliConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoLibretaMili.jLabelnombreTipoLibretaMili,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoLibretaMili(TipoLibretaMili tipolibretamiliBean,TipoLibretaMili tipolibretamili,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoLibretaMili(TipoLibretaMili tipolibretamiliOrigen,TipoLibretaMili tipolibretamili,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipolibretamiliOrigen.getId()!=null && !tipolibretamiliOrigen.getId().equals(0L))) {tipolibretamili.setId(tipolibretamiliOrigen.getId());}}
			if(conDefault || (!conDefault && tipolibretamiliOrigen.getcodigo()!=null && !tipolibretamiliOrigen.getcodigo().equals(""))) {tipolibretamili.setcodigo(tipolibretamiliOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipolibretamiliOrigen.getnombre()!=null && !tipolibretamiliOrigen.getnombre().equals(""))) {tipolibretamili.setnombre(tipolibretamiliOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoLibretaMili(TipoLibretaMili tipolibretamili) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoLibretaMili.jLabelidTipoLibretaMili.setText(tipolibretamili.getId().toString());
			this.jInternalFrameDetalleFormTipoLibretaMili.jTextFieldcodigoTipoLibretaMili.setText(tipolibretamili.getcodigo());
			this.jInternalFrameDetalleFormTipoLibretaMili.jTextAreanombreTipoLibretaMili.setText(tipolibretamili.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoLibretaMili(TipoLibretaMiliBean tipolibretamiliBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoLibretaMili.jLabelidTipoLibretaMili.setText(tipolibretamiliBean.getId().toString());
			this.jInternalFrameDetalleFormTipoLibretaMili.jTextFieldcodigoTipoLibretaMili.setText(tipolibretamiliBean.getcodigo());
			this.jInternalFrameDetalleFormTipoLibretaMili.jTextAreanombreTipoLibretaMili.setText(tipolibretamiliBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoLibretaMili(TipoLibretaMiliParameterReturnGeneral tipolibretamiliReturnGeneral,TipoLibretaMiliBean tipolibretamiliBean,Boolean conDefault) throws Exception { 
		try {
			TipoLibretaMili tipolibretamiliLocal=new TipoLibretaMili();
			
			tipolibretamiliLocal=tipolibretamiliReturnGeneral.getTipoLibretaMili();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipolibretamiliLocal.getId()!=null && !tipolibretamiliLocal.getId().equals(0L))) {tipolibretamiliBean.setId(tipolibretamiliLocal.getId());}}
			if(conDefault || (!conDefault && tipolibretamiliLocal.getcodigo()!=null && !tipolibretamiliLocal.getcodigo().equals(""))) {tipolibretamiliBean.setcodigo(tipolibretamiliLocal.getcodigo());}
			if(conDefault || (!conDefault && tipolibretamiliLocal.getnombre()!=null && !tipolibretamiliLocal.getnombre().equals(""))) {tipolibretamiliBean.setnombre(tipolibretamiliLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoLibretaMiliGenerico(Long idTipoLibretaMiliSeleccionado,JComboBox jComboBoxTipoLibretaMili,List<TipoLibretaMili> tipolibretamilisLocal)throws Exception {
		try {
			TipoLibretaMili  tipolibretamiliTemp=null;

			for(TipoLibretaMili tipolibretamiliAux:tipolibretamilisLocal) {
				if(tipolibretamiliAux.getId()!=null && tipolibretamiliAux.getId().equals(idTipoLibretaMiliSeleccionado)) {
					tipolibretamiliTemp=tipolibretamiliAux;
					break;
				}
			}

			jComboBoxTipoLibretaMili.setSelectedItem(tipolibretamiliTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoLibretaMiliGenerico(JComboBox jComboBoxTipoLibretaMili,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoLibretaMili.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoLibretaMili.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoLibretaMili.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoLibretaMili.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoLibretaMili.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoLibretaMili.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoLibretaMili.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoLibretaMili.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoLibretaMili.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoLibretaMili.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DatoGeneralEmpleado")) {
			jButtonDatoGeneralEmpleadoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipolibretamili=(TipoLibretaMili) tipolibretamiliLogic.getTipoLibretaMilis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipolibretamili =(TipoLibretaMili) tipolibretamilis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipolibretamili.getIsNew() && !tipolibretamili.getIsChanged() && !tipolibretamili.getIsDeleted()) {
				sDescripcion=tipolibretamili.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipolibretamili.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoLibretaMili tipolibretamiliRow=new TipoLibretaMili();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipolibretamiliRow=(TipoLibretaMili) tipolibretamiliLogic.getTipoLibretaMilis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipolibretamiliRow=(TipoLibretaMili) tipolibretamilis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDatoGeneralEmpleadoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoLibretaMili tipolibretamili) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoLibretaMili==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamiliLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolibretamili = (TipoLibretaMili)this.tipolibretamiliLogic.getTipoLibretaMilis().toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipolibretamili = (TipoLibretaMili)this.tipolibretamilis.toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipolibretamili!=null) {
						this.tipolibretamili = tipolibretamili;
					} else {
						this.tipolibretamili = new TipoLibretaMili();
					}
				}

				if(this.isTienePermisosDatoGeneralEmpleado && this.permiteMantenimiento(this.tipolibretamili)) {
					DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFramePopup=new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						datogeneralempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFramePopup;
					} else {
						datogeneralempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame;
					}

					List<TipoLibretaMili> tipolibretamilis=new ArrayList<TipoLibretaMili>();
					tipolibretamilis.add(this.tipolibretamili);
					if(!esRelacionado) {
						//datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setConGuardarRelaciones(false);
						//datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					datogeneralempleadoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoLibretaMili.cargarDatoGeneralEmpleadoBeanSwingJInternalFrame(tipolibretamilis,this.tipolibretamili,datogeneralempleadoBeanSwingJInternalFrame,/*conInicializar,*/datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getConGuardarRelaciones(),datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getEsGuardarRelacionado());
					datogeneralempleadoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsDatoGeneralEmpleado("no_relacionado");

						datogeneralempleadoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DatoGeneralEmpleadoConstantesFunciones.ITAMANIOFILATABLA + (DatoGeneralEmpleadoConstantesFunciones.ITAMANIOFILATABLA/2));

						datogeneralempleadoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoLibretaMili=(TitledBorder)this.jScrollPanelDatosTipoLibretaMili.getBorder();
						TitledBorder titledBorderDatoGeneralEmpleado=(TitledBorder)datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.getBorder();

						titledBorderDatoGeneralEmpleado.setTitle(titledBorderTipoLibretaMili.getTitle() + " -> Dato General Empleado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,datogeneralempleadoBeanSwingJInternalFrame);
						}

						datogeneralempleadoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(datogeneralempleadoBeanSwingJInternalFrame);

						datogeneralempleadoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipolibretamiliSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Dato General Empleado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamiliLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamiliLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamiliLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoLibretaMili(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoLibretaMili.setVisible((this.isVisibilidadCeldaNuevoTipoLibretaMili && this.isPermisoNuevoTipoLibretaMili));			
			this.jButtonDuplicarTipoLibretaMili.setVisible((this.isVisibilidadCeldaDuplicarTipoLibretaMili && this.isPermisoDuplicarTipoLibretaMili));			
			this.jButtonCopiarTipoLibretaMili.setVisible((this.isVisibilidadCeldaCopiarTipoLibretaMili && this.isPermisoCopiarTipoLibretaMili));
			this.jButtonVerFormTipoLibretaMili.setVisible((this.isVisibilidadCeldaVerFormTipoLibretaMili && this.isPermisoVerFormTipoLibretaMili));
			
			this.jButtonAbrirOrderByTipoLibretaMili.setVisible((this.isVisibilidadCeldaOrdenTipoLibretaMili && this.isPermisoOrdenTipoLibretaMili));			
			
			this.jButtonNuevoRelacionesTipoLibretaMili.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoLibretaMili && this.isPermisoNuevoTipoLibretaMili));			
			this.jButtonNuevoGuardarCambiosTipoLibretaMili.setVisible((this.isVisibilidadCeldaNuevoTipoLibretaMili && this.isPermisoNuevoTipoLibretaMili && this.isPermisoGuardarCambiosTipoLibretaMili));
			
			if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) {
			this.jInternalFrameDetalleFormTipoLibretaMili.jButtonModificarTipoLibretaMili.setVisible((this.isVisibilidadCeldaModificarTipoLibretaMili && this.isPermisoActualizarTipoLibretaMili));	
			this.jInternalFrameDetalleFormTipoLibretaMili.jButtonActualizarTipoLibretaMili.setVisible((this.isVisibilidadCeldaActualizarTipoLibretaMili && this.isPermisoActualizarTipoLibretaMili));	
			this.jInternalFrameDetalleFormTipoLibretaMili.jButtonEliminarTipoLibretaMili.setVisible((this.isVisibilidadCeldaEliminarTipoLibretaMili && this.isPermisoEliminarTipoLibretaMili));
			this.jInternalFrameDetalleFormTipoLibretaMili.jButtonCancelarTipoLibretaMili.setVisible(this.isVisibilidadCeldaCancelarTipoLibretaMili);							
			this.jInternalFrameDetalleFormTipoLibretaMili.jButtonGuardarCambiosTipoLibretaMili.setVisible((this.isVisibilidadCeldaGuardarTipoLibretaMili && this.isPermisoGuardarCambiosTipoLibretaMili));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoLibretaMili.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoLibretaMili && this.isPermisoGuardarCambiosTipoLibretaMili));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoLibretaMili.setVisible((this.isVisibilidadCeldaNuevoTipoLibretaMili && this.isPermisoNuevoTipoLibretaMili));						
			this.jButtonDuplicarToolBarTipoLibretaMili.setVisible((this.isVisibilidadCeldaDuplicarTipoLibretaMili && this.isPermisoDuplicarTipoLibretaMili));						
			this.jButtonCopiarToolBarTipoLibretaMili.setVisible((this.isVisibilidadCeldaCopiarTipoLibretaMili && this.isPermisoCopiarTipoLibretaMili));			
			this.jButtonVerFormToolBarTipoLibretaMili.setVisible((this.isVisibilidadCeldaVerFormTipoLibretaMili && this.isPermisoVerFormTipoLibretaMili));			
			this.jButtonAbrirOrderByToolBarTipoLibretaMili.setVisible((this.isVisibilidadCeldaOrdenTipoLibretaMili && this.isPermisoOrdenTipoLibretaMili));
			this.jButtonNuevoRelacionesToolBarTipoLibretaMili.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoLibretaMili && this.isPermisoNuevoTipoLibretaMili));			
			this.jButtonNuevoGuardarCambiosToolBarTipoLibretaMili.setVisible((this.isVisibilidadCeldaNuevoTipoLibretaMili && this.isPermisoNuevoTipoLibretaMili && this.isPermisoGuardarCambiosTipoLibretaMili));			
			
			if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) {
			this.jInternalFrameDetalleFormTipoLibretaMili.jButtonModificarToolBarTipoLibretaMili.setVisible((this.isVisibilidadCeldaModificarTipoLibretaMili && this.isPermisoActualizarTipoLibretaMili));	
			this.jInternalFrameDetalleFormTipoLibretaMili.jButtonActualizarToolBarTipoLibretaMili.setVisible((this.isVisibilidadCeldaActualizarTipoLibretaMili  && this.isPermisoActualizarTipoLibretaMili));	
			this.jInternalFrameDetalleFormTipoLibretaMili.jButtonEliminarToolBarTipoLibretaMili.setVisible((this.isVisibilidadCeldaEliminarTipoLibretaMili && this.isPermisoEliminarTipoLibretaMili));
			this.jInternalFrameDetalleFormTipoLibretaMili.jButtonCancelarToolBarTipoLibretaMili.setVisible(this.isVisibilidadCeldaCancelarTipoLibretaMili);				
			this.jInternalFrameDetalleFormTipoLibretaMili.jButtonGuardarCambiosToolBarTipoLibretaMili.setVisible((this.isVisibilidadCeldaGuardarTipoLibretaMili && this.isPermisoGuardarCambiosTipoLibretaMili));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoLibretaMili.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoLibretaMili && this.isPermisoGuardarCambiosTipoLibretaMili));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoLibretaMili.setVisible((this.isVisibilidadCeldaNuevoTipoLibretaMili && this.isPermisoNuevoTipoLibretaMili));			
			this.jMenuItemDuplicarTipoLibretaMili.setVisible((this.isVisibilidadCeldaDuplicarTipoLibretaMili && this.isPermisoDuplicarTipoLibretaMili));			
			this.jMenuItemCopiarTipoLibretaMili.setVisible((this.isVisibilidadCeldaCopiarTipoLibretaMili && this.isPermisoCopiarTipoLibretaMili));			
			this.jMenuItemVerFormTipoLibretaMili.setVisible((this.isVisibilidadCeldaVerFormTipoLibretaMili && this.isPermisoVerFormTipoLibretaMili));			
			this.jMenuItemAbrirOrderByTipoLibretaMili.setVisible((this.isVisibilidadCeldaOrdenTipoLibretaMili && this.isPermisoOrdenTipoLibretaMili));			
			//this.jMenuItemMostrarOcultarTipoLibretaMili.setVisible((this.isVisibilidadCeldaOrdenTipoLibretaMili && this.isPermisoOrdenTipoLibretaMili));
			this.jMenuItemDetalleAbrirOrderByTipoLibretaMili.setVisible((this.isVisibilidadCeldaOrdenTipoLibretaMili && this.isPermisoOrdenTipoLibretaMili));			
			//this.jMenuItemDetalleMostrarOcultarTipoLibretaMili.setVisible((this.isVisibilidadCeldaOrdenTipoLibretaMili && this.isPermisoOrdenTipoLibretaMili));			
			this.jMenuItemNuevoRelacionesTipoLibretaMili.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoLibretaMili && this.isPermisoNuevoTipoLibretaMili));			
			this.jMenuItemNuevoGuardarCambiosTipoLibretaMili.setVisible((this.isVisibilidadCeldaNuevoTipoLibretaMili && this.isPermisoNuevoTipoLibretaMili && this.isPermisoGuardarCambiosTipoLibretaMili));									
			
			if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) {
			this.jInternalFrameDetalleFormTipoLibretaMili.jMenuItemModificarTipoLibretaMili.setVisible((this.isVisibilidadCeldaModificarTipoLibretaMili && this.isPermisoActualizarTipoLibretaMili));	
			this.jInternalFrameDetalleFormTipoLibretaMili.jMenuItemActualizarTipoLibretaMili.setVisible((this.isVisibilidadCeldaActualizarTipoLibretaMili && this.isPermisoActualizarTipoLibretaMili));	
			this.jInternalFrameDetalleFormTipoLibretaMili.jMenuItemEliminarTipoLibretaMili.setVisible((this.isVisibilidadCeldaEliminarTipoLibretaMili && this.isPermisoEliminarTipoLibretaMili));
			this.jInternalFrameDetalleFormTipoLibretaMili.jMenuItemCancelarTipoLibretaMili.setVisible(this.isVisibilidadCeldaCancelarTipoLibretaMili);				
			}
			
			this.jMenuItemGuardarCambiosTipoLibretaMili.setVisible((this.isVisibilidadCeldaGuardarTipoLibretaMili && this.isPermisoGuardarCambiosTipoLibretaMili));						
			this.jMenuItemGuardarCambiosTablaTipoLibretaMili.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoLibretaMili && this.isPermisoGuardarCambiosTipoLibretaMili));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoLibretaMili=this.jButtonNuevoTipoLibretaMili.isVisible();
			this.isVisibilidadCeldaDuplicarTipoLibretaMili=this.jButtonDuplicarTipoLibretaMili.isVisible();
			this.isVisibilidadCeldaCopiarTipoLibretaMili=this.jButtonCopiarTipoLibretaMili.isVisible();
			this.isVisibilidadCeldaVerFormTipoLibretaMili=this.jButtonVerFormTipoLibretaMili.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoLibretaMili=this.jButtonAbrirOrderByTipoLibretaMili.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoLibretaMili=this.jButtonNuevoRelacionesTipoLibretaMili.isVisible();
			this.isVisibilidadCeldaModificarTipoLibretaMili=this.jButtonModificarTipoLibretaMili.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) {
			this.isVisibilidadCeldaActualizarTipoLibretaMili=this.jInternalFrameDetalleFormTipoLibretaMili.jButtonActualizarTipoLibretaMili.isVisible();
			this.isVisibilidadCeldaEliminarTipoLibretaMili=this.jInternalFrameDetalleFormTipoLibretaMili.jButtonEliminarTipoLibretaMili.isVisible();
			this.isVisibilidadCeldaCancelarTipoLibretaMili=this.jInternalFrameDetalleFormTipoLibretaMili.jButtonCancelarTipoLibretaMili.isVisible();
			this.isVisibilidadCeldaGuardarTipoLibretaMili=this.jInternalFrameDetalleFormTipoLibretaMili.jButtonGuardarCambiosTipoLibretaMili.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoLibretaMili=this.jButtonGuardarCambiosTablaTipoLibretaMili.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoLibretaMili=this.jButtonNuevoToolBarTipoLibretaMili.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoLibretaMili=this.jButtonNuevoRelacionesToolBarTipoLibretaMili.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) {
			this.isVisibilidadCeldaModificarTipoLibretaMili=this.jInternalFrameDetalleFormTipoLibretaMili.jButtonModificarToolBarTipoLibretaMili.isVisible();
			this.isVisibilidadCeldaActualizarTipoLibretaMili=this.jInternalFrameDetalleFormTipoLibretaMili.jButtonActualizarToolBarTipoLibretaMili.isVisible();
			this.isVisibilidadCeldaEliminarTipoLibretaMili=this.jInternalFrameDetalleFormTipoLibretaMili.jButtonEliminarToolBarTipoLibretaMili.isVisible();
			this.isVisibilidadCeldaCancelarTipoLibretaMili=this.jInternalFrameDetalleFormTipoLibretaMili.jButtonCancelarToolBarTipoLibretaMili.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoLibretaMili=this.jButtonGuardarCambiosToolBarTipoLibretaMili.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoLibretaMili=this.jButtonGuardarCambiosTablaToolBarTipoLibretaMili.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoLibretaMili=this.jMenuItemNuevoTipoLibretaMili.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoLibretaMili=this.jMenuItemNuevoRelacionesTipoLibretaMili.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) {
			this.isVisibilidadCeldaModificarTipoLibretaMili=this.jInternalFrameDetalleFormTipoLibretaMili.jMenuItemModificarTipoLibretaMili.isVisible();
			this.isVisibilidadCeldaActualizarTipoLibretaMili=this.jInternalFrameDetalleFormTipoLibretaMili.jMenuItemActualizarTipoLibretaMili.isVisible();
			this.isVisibilidadCeldaEliminarTipoLibretaMili=this.jInternalFrameDetalleFormTipoLibretaMili.jMenuItemEliminarTipoLibretaMili.isVisible();
			this.isVisibilidadCeldaCancelarTipoLibretaMili=this.jInternalFrameDetalleFormTipoLibretaMili.jMenuItemCancelarTipoLibretaMili.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoLibretaMili=this.jMenuItemGuardarCambiosTipoLibretaMili.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoLibretaMili=this.jMenuItemGuardarCambiosTablaTipoLibretaMili.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoLibretaMili(Boolean esInicializar) {
		if(TipoLibretaMiliJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipolibretamiliSessionBean.getConGuardarRelaciones()) {
				//if(this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoLibretaMili();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoLibretaMili(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoLibretaMili() {
		this.jButtonNuevoTipoLibretaMili.setVisible(this.isPermisoNuevoTipoLibretaMili);			
		this.jButtonDuplicarTipoLibretaMili.setVisible(this.isPermisoDuplicarTipoLibretaMili);			
		this.jButtonCopiarTipoLibretaMili.setVisible(this.isPermisoCopiarTipoLibretaMili);			
		this.jButtonVerFormTipoLibretaMili.setVisible(this.isPermisoVerFormTipoLibretaMili);			
		
		this.jButtonAbrirOrderByTipoLibretaMili.setVisible(this.isPermisoOrdenTipoLibretaMili);					
		
		this.jButtonNuevoRelacionesTipoLibretaMili.setVisible(this.isPermisoNuevoTipoLibretaMili);			
		
		if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLibretaMili.jButtonModificarTipoLibretaMili.setVisible(this.isPermisoActualizarTipoLibretaMili);	
			this.jInternalFrameDetalleFormTipoLibretaMili.jButtonActualizarTipoLibretaMili.setVisible(this.isPermisoActualizarTipoLibretaMili);	
			this.jInternalFrameDetalleFormTipoLibretaMili.jButtonEliminarTipoLibretaMili.setVisible(this.isPermisoEliminarTipoLibretaMili);
			this.jInternalFrameDetalleFormTipoLibretaMili.jButtonCancelarTipoLibretaMili.setVisible(this.isVisibilidadCeldaCancelarTipoLibretaMili);						
			this.jInternalFrameDetalleFormTipoLibretaMili.jButtonGuardarCambiosTipoLibretaMili.setVisible(this.isPermisoGuardarCambiosTipoLibretaMili);							
		}
		
		this.jButtonGuardarCambiosTablaTipoLibretaMili.setVisible(this.isPermisoActualizarTipoLibretaMili);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoLibretaMili() {
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonModificarTipoLibretaMili.setVisible(this.isPermisoActualizarTipoLibretaMili);	
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonActualizarTipoLibretaMili.setVisible(this.isPermisoActualizarTipoLibretaMili);	
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonEliminarTipoLibretaMili.setVisible(this.isPermisoEliminarTipoLibretaMili);
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonCancelarTipoLibretaMili.setVisible(this.isVisibilidadCeldaCancelarTipoLibretaMili);							
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonGuardarCambiosTipoLibretaMili.setVisible((this.isVisibilidadCeldaGuardarTipoLibretaMili && this.isPermisoGuardarCambiosTipoLibretaMili));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoLibretaMili() {
		if(TipoLibretaMiliJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoLibretaMili();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoLibretaMili() {
	}
	
	public void jTableDatosTipoLibretaMiliListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoLibretaMili(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoLibretaMiliBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamiliLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoLibretaMili.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoLibretaMili(this.gettipolibretamili(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLibretaMili(this.tipolibretamili);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolibretamili =(TipoLibretaMili) this.tipolibretamiliLogic.getTipoLibretaMilis().toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipolibretamili =(TipoLibretaMili) this.tipolibretamilis.toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipolibretamili==null) {
						this.tipolibretamili = new TipoLibretaMili();
					}

					this.setVariablesFormularioToObjetoActualTipoLibretaMili(this.tipolibretamili,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLibretaMili(this.tipolibretamili);
				}

				if(this.tipolibretamili.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipolibretamili.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoLibretaMili(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamiliLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamiliLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamiliLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoLibretaMiliUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoLibretaMili(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoLibretaMili.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoLibretaMili.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoLibretaMili.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamili =(TipoLibretaMili) this.tipolibretamiliLogic.getTipoLibretaMilis().toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipolibretamili =(TipoLibretaMili) this.tipolibretamilis.toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoLibretaMili(this.gettipolibretamili(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoLibretaMili(this.tipolibretamili);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipolibretamiliLogic.getConnexion());

				if(this.tipolibretamili.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipolibretamili.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoLibretaMili=(TitledBorder)this.jScrollPanelDatosTipoLibretaMili.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoLibretaMili.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoLibretaMiliBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamiliLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoLibretaMili.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoLibretaMili(this.gettipolibretamili(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLibretaMili(this.tipolibretamili);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolibretamili =(TipoLibretaMili) this.tipolibretamiliLogic.getTipoLibretaMilis().toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipolibretamili =(TipoLibretaMili) this.tipolibretamilis.toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipolibretamili==null) {
						this.tipolibretamili = new TipoLibretaMili();
					}

					this.setVariablesFormularioToObjetoActualTipoLibretaMili(this.tipolibretamili,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLibretaMili(this.tipolibretamili);
				}

				if(this.tipolibretamili.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipolibretamili.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoLibretaMili(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamiliLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamiliLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamiliLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoLibretaMiliBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamiliLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoLibretaMili.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoLibretaMili(this.gettipolibretamili(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLibretaMili(this.tipolibretamili);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolibretamili =(TipoLibretaMili) this.tipolibretamiliLogic.getTipoLibretaMilis().toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipolibretamili =(TipoLibretaMili) this.tipolibretamilis.toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipolibretamili==null) {
						this.tipolibretamili = new TipoLibretaMili();
					}

					this.setVariablesFormularioToObjetoActualTipoLibretaMili(this.tipolibretamili,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLibretaMili(this.tipolibretamili);
				}

				if(this.tipolibretamili.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipolibretamili.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoLibretaMili(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamiliLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamiliLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamiliLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoLibretaMiliBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamiliLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoLibretaMili.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoLibretaMili(this.gettipolibretamili(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLibretaMili(this.tipolibretamili);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolibretamili =(TipoLibretaMili) this.tipolibretamiliLogic.getTipoLibretaMilis().toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipolibretamili =(TipoLibretaMili) this.tipolibretamilis.toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipolibretamili==null) {
						this.tipolibretamili = new TipoLibretaMili();
					}

					this.setVariablesFormularioToObjetoActualTipoLibretaMili(this.tipolibretamili,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLibretaMili(this.tipolibretamili);
				}

				if(this.tipolibretamili.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipolibretamili.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoLibretaMili(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamiliLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamiliLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamiliLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoLibretaMiliActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoLibretaMili(false,false);

			this.getTipoLibretaMilisFK_IdEmpresa();

			this.inicializarActualizarBindingTipoLibretaMili(false);

			//if(TipoLibretaMiliBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoLibretaMili(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolibretamiliLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoLibretaMili() {
		if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) {
		

		if(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) {
			this.jInternalFrameDetalleFormTipoLibretaMili.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoLibretaMili.dispose();
			this.jInternalFrameDetalleFormTipoLibretaMili=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoLibretaMili!=null) {
			this.jInternalFrameReporteDinamicoTipoLibretaMili.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoLibretaMili.dispose();
			this.jInternalFrameReporteDinamicoTipoLibretaMili=null;
		}
		
		if(this.jInternalFrameImportacionTipoLibretaMili!=null) {
			this.jInternalFrameImportacionTipoLibretaMili.setVisible(false);	    			
			this.jInternalFrameImportacionTipoLibretaMili.dispose();
			this.jInternalFrameImportacionTipoLibretaMili=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoLibretaMili();
			
			TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoLibretaMili")) {
				jButtonNuevoTipoLibretaMiliActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoLibretaMili")) {
				jButtonDuplicarTipoLibretaMiliActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoLibretaMili")) {
				jButtonCopiarTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoLibretaMili")) {
				jButtonVerFormTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoLibretaMili")) {
				jButtonNuevoTipoLibretaMiliActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoLibretaMili")) {
				jButtonDuplicarTipoLibretaMiliActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoLibretaMili")) {
				jButtonNuevoTipoLibretaMiliActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoLibretaMili")) {
				jButtonDuplicarTipoLibretaMiliActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoLibretaMili")) {
				jButtonNuevoTipoLibretaMiliActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoLibretaMili")) {
				jButtonNuevoTipoLibretaMiliActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoLibretaMili")) {
				jButtonNuevoTipoLibretaMiliActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoLibretaMili")) {
				jButtonModificarTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoLibretaMili")) {
				jButtonModificarTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoLibretaMili")) {
				jButtonModificarTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoLibretaMili")) {
				jButtonActualizarTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoLibretaMili")) {
				jButtonActualizarTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoLibretaMili")) {
				jButtonActualizarTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoLibretaMili")) {
				jButtonEliminarTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoLibretaMili")) {
				jButtonEliminarTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoLibretaMili")) {
				jButtonEliminarTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoLibretaMili")) {
				jButtonCancelarTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoLibretaMili")) {
				jButtonCancelarTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoLibretaMili")) {
				jButtonCancelarTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoLibretaMili")) {
				jButtonCerrarTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoLibretaMili")) {
				jButtonCerrarTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoLibretaMili")) {
				jButtonCerrarTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoLibretaMili")) {
				jButtonMostrarOcultarTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoLibretaMili")) {
				jButtonCancelarTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoLibretaMili")) {
				jButtonGuardarCambiosTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoLibretaMili")) {
				jButtonGuardarCambiosTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoLibretaMili")) {
				jButtonCopiarTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoLibretaMili")) {
				jButtonVerFormTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoLibretaMili")) {
				jButtonGuardarCambiosTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoLibretaMili")) {
				jButtonCopiarTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoLibretaMili")) {
				jButtonVerFormTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoLibretaMili")) {
				jButtonGuardarCambiosTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoLibretaMili")) {
				jButtonGuardarCambiosTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoLibretaMili")) {
				jButtonGuardarCambiosTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoLibretaMili")) {
				jButtonRecargarInformacionTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoLibretaMili")) {
				jButtonRecargarInformacionTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoLibretaMili")) {
				jButtonRecargarInformacionTipoLibretaMiliActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoLibretaMili")) {
				jButtonAnterioresTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoLibretaMili")) {
				jButtonAnterioresTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoLibretaMili")) {
				jButtonAnterioresTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoLibretaMili")) {
				jButtonSiguientesTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoLibretaMili")) {
				jButtonSiguientesTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoLibretaMili")) {
				jButtonSiguientesTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoLibretaMili") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoLibretaMili")) {
				jButtonAbrirOrderByTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoLibretaMili") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoLibretaMili")) {
				jButtonMostrarOcultarTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoLibretaMili")) {
				jButtonNuevoGuardarCambiosTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoLibretaMili")) {
				jButtonNuevoGuardarCambiosTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoLibretaMili")) {
				jButtonNuevoGuardarCambiosTipoLibretaMiliActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoLibretaMili")) {
				jButtonCerrarReporteDinamicoTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoLibretaMili")) {
				jButtonGenerarReporteDinamicoTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoLibretaMili")) {
				
				jButtonGenerarExcelReporteDinamicoTipoLibretaMiliActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoLibretaMili")) {
				jButtonCerrarImportacionTipoLibretaMiliActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoLibretaMili")) {
				
				jButtonGenerarImportacionTipoLibretaMiliActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoLibretaMili")) {
				
				jButtonAbrirImportacionTipoLibretaMiliActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoLibretaMili")) {
				jComboBoxTiposAccionesTipoLibretaMiliActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoLibretaMili")) {
				jComboBoxTiposRelacionesTipoLibretaMiliActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoLibretaMili")) {
				jComboBoxTiposAccionesTipoLibretaMiliActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoLibretaMili")) {
				
				jComboBoxTiposSeleccionarTipoLibretaMiliActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoLibretaMili")) {
				jTextFieldValorCampoGeneralTipoLibretaMiliActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoLibretaMili")) {
				jButtonAbrirOrderByTipoLibretaMiliActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoLibretaMili")) {
				jButtonAbrirOrderByTipoLibretaMiliActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoLibretaMili")) {
				jButtonCerrarOrderByTipoLibretaMiliActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoLibretaMiliBusqueda")) {
				this.jButtonidTipoLibretaMiliBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoLibretaMiliUpdate")) {
				this.jButtonid_empresaTipoLibretaMiliUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoLibretaMiliBusqueda")) {
				this.jButtonid_empresaTipoLibretaMiliBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoLibretaMiliBusqueda")) {
				this.jButtoncodigoTipoLibretaMiliBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoLibretaMiliBusqueda")) {
				this.jButtonnombreTipoLibretaMiliBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoLibretaMili();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLibretaMiliActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolibretamili);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolibretamili);
				
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
				
				


				
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLibretaMili.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLibretaMili.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoLibretaMili tipolibretamiliLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipolibretamiliLocal=this.tipolibretamili;
			} else {
				tipolibretamiliLocal=this.tipolibretamiliAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolibretamili);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolibretamili);
				
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
							
				
				


				
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLibretaMili.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLibretaMili.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLibretaMiliActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoLibretaMili.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamiliAnterior =(TipoLibretaMili) this.tipolibretamiliLogic.getTipoLibretaMilis().toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolibretamiliAnterior =(TipoLibretaMili) this.tipolibretamilis.toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
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
			
			TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
			
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
			
			


			
			TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLibretaMiliActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolibretamili);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolibretamili);
				
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
								
						
				


				
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLibretaMili.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLibretaMili.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolibretamili);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolibretamili);
				
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
								
				
				


				
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLibretaMili.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLibretaMili.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLibretaMiliActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoLibretaMili.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamiliAnterior =(TipoLibretaMili) this.tipolibretamiliLogic.getTipoLibretaMilis().toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolibretamiliAnterior =(TipoLibretaMili) this.tipolibretamilis.toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolibretamili);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolibretamili);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLibretaMiliActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoLibretaMili.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamiliAnterior =(TipoLibretaMili) this.tipolibretamiliLogic.getTipoLibretaMilis().toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolibretamiliAnterior =(TipoLibretaMili) this.tipolibretamilis.toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLibretaMiliActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolibretamili);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipolibretamili);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolibretamili);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolibretamili);
				
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
							
				
				


				
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLibretaMili.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLibretaMili.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLibretaMiliActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoLibretaMili.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolibretamiliAnterior =(TipoLibretaMili) this.tipolibretamiliLogic.getTipoLibretaMilis().toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipolibretamiliAnterior =(TipoLibretaMili) this.tipolibretamilis.toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
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
			
			TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
			
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
			
			


			
			TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLibretaMiliActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolibretamili);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipolibretamili);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolibretamili);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolibretamili);
				
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
								
				
				


				
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLibretaMili.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLibretaMili.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLibretaMiliActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoLibretaMili.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamiliAnterior =(TipoLibretaMili) this.tipolibretamiliLogic.getTipoLibretaMilis().toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolibretamiliAnterior =(TipoLibretaMili) this.tipolibretamilis.toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLibretaMiliActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolibretamili);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipolibretamili);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLibretaMiliActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolibretamili);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolibretamili);
				
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoLibretaMili")) {
					jCheckBoxSeleccionarTodosTipoLibretaMiliItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoLibretaMili")) {
					jCheckBoxSeleccionadosTipoLibretaMiliItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoLibretaMili")) {
					
				}
				
				


				
				
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLibretaMili.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLibretaMili.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolibretamili);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipolibretamili);
				
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
												
				
				


				
				
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLibretaMili.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLibretaMili.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLibretaMiliActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoLibretaMili.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolibretamiliAnterior =(TipoLibretaMili) this.tipolibretamiliLogic.getTipoLibretaMilis().toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipolibretamiliAnterior =(TipoLibretaMili) this.tipolibretamilis.toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLibretaMiliActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolibretamili);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolibretamili);
				
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
				
				
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
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
			
			TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
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
			
			


			
			TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLibretaMiliActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolibretamili);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolibretamili);
				
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLibretaMili.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLibretaMili.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolibretamili);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolibretamili);
				
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
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
				
				


				
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLibretaMili.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLibretaMili.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLibretaMiliActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoLibretaMili.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolibretamiliAnterior =(TipoLibretaMili) this.tipolibretamiliLogic.getTipoLibretaMilis().toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolibretamiliAnterior =(TipoLibretaMili) this.tipolibretamilis.toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoLibretaMili")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoLibretaMiliListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoLibretaMili.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipolibretamili =(TipoLibretaMili) this.tipolibretamiliLogic.getTipoLibretaMilis().toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipolibretamili =(TipoLibretaMili) this.tipolibretamilis.toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipolibretamili);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoLibretaMili")) {
				
				}
				
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoLibretaMili")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoLibretaMili.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoLibretaMili")) {
			
			}
			
			TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoLibretaMili();
			
			TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
			
			if(sTipo.equals("NuevoTipoLibretaMili")) {
				jButtonNuevoTipoLibretaMiliActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoLibretaMili")) {
				jButtonDuplicarTipoLibretaMiliActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoLibretaMili")) {
				jButtonCopiarTipoLibretaMiliActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoLibretaMili")) {
				jButtonVerFormTipoLibretaMiliActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoLibretaMili")) {
				jButtonNuevoTipoLibretaMiliActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoLibretaMili")) {
				jButtonModificarTipoLibretaMiliActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoLibretaMili")) {
				jButtonActualizarTipoLibretaMiliActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoLibretaMili")) {
				jButtonEliminarTipoLibretaMiliActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoLibretaMili")) {
				jButtonGuardarCambiosTipoLibretaMiliActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoLibretaMili")) {
				jButtonCancelarTipoLibretaMiliActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoLibretaMili")) {
				jButtonCerrarTipoLibretaMiliActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoLibretaMili")) {
				jButtonGuardarCambiosTipoLibretaMiliActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoLibretaMili")) {
				jButtonNuevoGuardarCambiosTipoLibretaMiliActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoLibretaMili")) {
				jButtonAbrirOrderByTipoLibretaMiliActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoLibretaMili")) {
				jButtonRecargarInformacionTipoLibretaMiliActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoLibretaMili")) {
				jButtonAnterioresTipoLibretaMiliActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoLibretaMili")) {
				jButtonSiguientesTipoLibretaMiliActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoLibretaMiliBusqueda")) {
				this.jButtonidTipoLibretaMiliBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoLibretaMiliUpdate")) {
				this.jButtonid_empresaTipoLibretaMiliUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoLibretaMiliBusqueda")) {
				this.jButtonid_empresaTipoLibretaMiliBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoLibretaMiliBusqueda")) {
				this.jButtoncodigoTipoLibretaMiliBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoLibretaMiliBusqueda")) {
				this.jButtonnombreTipoLibretaMiliBusquedaActionPerformed(evt);
			}
			
			TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoLibretaMili();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoLibretaMili")) {
				closingInternalFrameTipoLibretaMili();
				
			} else if(sTipo.equals("jButtonCancelarTipoLibretaMili")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoLibretaMili = (JInternalFrameBase)evt.getSource();
	            	
	            TipoLibretaMiliBeanSwingJInternalFrame jInternalFrameParent=(TipoLibretaMiliBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoLibretaMili.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoLibretaMiliActionPerformed(null);
			}
			
			TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipolibretamili,new Object(),this.tipolibretamiliParameterGeneral,this.tipolibretamiliReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoLibretaMili(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoLibretaMili(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoLibretaMili(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipolibretamili)) {
			if(!esControlTabla) {
				if(TipoLibretaMiliJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoLibretaMili(this.tipolibretamili,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLibretaMili(this.tipolibretamili);			
				}
				
				if(this.tipolibretamiliSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoLibretaMili(this.tipolibretamili,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipolibretamiliReturnGeneral=tipolibretamiliLogic.procesarEventosTipoLibretaMilisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipolibretamiliLogic.getTipoLibretaMilis(),this.tipolibretamili,this.tipolibretamiliParameterGeneral,this.isEsNuevoTipoLibretaMili,classes);//this.tipolibretamiliLogic.getTipoLibretaMili()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoLibretaMili(this.tipolibretamiliReturnGeneral,this.tipolibretamiliBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipolibretamiliSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoLibretaMili(classes,this.tipolibretamiliReturnGeneral,this.tipolibretamiliBean,false);
					}
						
					if(this.tipolibretamiliReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoLibretaMili(this.tipolibretamiliReturnGeneral.getTipoLibretaMili());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoLibretaMili(this.tipolibretamiliReturnGeneral.getTipoLibretaMili());	
					}
						
					if(this.tipolibretamiliReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoLibretaMili(this.tipolibretamiliReturnGeneral.getTipoLibretaMili(),classes);//this.tipolibretamiliBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoLibretaMili(this.tipolibretamili,classes);//this.tipolibretamiliBean);									
				}
			
				if(TipoLibretaMiliJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoLibretaMili(this.tipolibretamili,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLibretaMili(this.tipolibretamili);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipolibretamiliAnterior!=null) {
						this.tipolibretamili=this.tipolibretamiliAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipolibretamiliReturnGeneral=tipolibretamiliLogic.procesarEventosTipoLibretaMilisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipolibretamiliLogic.getTipoLibretaMilis(),this.tipolibretamili,this.tipolibretamiliParameterGeneral,this.isEsNuevoTipoLibretaMili,classes);//this.tipolibretamiliLogic.getTipoLibretaMili()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipolibretamiliSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipolibretamiliSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipolibretamiliReturnGeneral.getTipoLibretaMili(),tipolibretamiliLogic.getTipoLibretaMilis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipolibretamiliReturnGeneral.getTipoLibretaMili(),this.tipolibretamilis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoLibretaMili.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoLibretaMili.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoLibretaMili();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoLibretaMili() throws Exception {
		
		TipoLibretaMiliModel tipolibretamiliModel=(TipoLibretaMiliModel)this.jTableDatosTipoLibretaMili.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipolibretamiliModel.tipolibretamilis=this.tipolibretamiliLogic.getTipoLibretaMilis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipolibretamiliModel.tipolibretamilis=this.tipolibretamilis;
		}
		
		
		((TipoLibretaMiliModel) this.jTableDatosTipoLibretaMili.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoLibretaMili() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipolibretamiliAnterior(),this.tipolibretamiliLogic.getTipoLibretaMilis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipolibretamiliAnterior(),this.tipolibretamilis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoLibretaMili();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoLibretaMili(TipoLibretaMili tipolibretamili,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DatoGeneralEmpleado.class)) {
					this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(tipolibretamili.getDatoGeneralEmpleados());
					this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoGeneralEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
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
										
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipolibretamili,new Object(),generalEntityParameterGeneral,this.tipolibretamiliReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipolibretamiliSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoLibretaMiliConstantesFunciones.getClassesRelationshipsOfTipoLibretaMili(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoLibretaMiliConstantesFunciones.getClassesRelationshipsFromStringsOfTipoLibretaMili(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoLibretaMili(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoLibretaMiliBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipolibretamili,new Object(),generalEntityParameterGeneral,this.tipolibretamiliReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoLibretaMili(TipoLibretaMiliBean tipolibretamiliBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DatoGeneralEmpleado.class)) {
					this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(tipolibretamili.getDatoGeneralEmpleados());
					this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoGeneralEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoLibretaMili(ArrayList<Classe> classes,TipoLibretaMiliReturnGeneral tipolibretamiliReturnGeneral,TipoLibretaMiliBean tipolibretamiliBean,Boolean conDefault) throws Exception {
		
			this.tipolibretamiliBean.setDatoGeneralEmpleados(tipolibretamiliReturnGeneral.getTipoLibretaMili().getDatoGeneralEmpleados());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoLibretaMili(TipoLibretaMili tipolibretamili,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DatoGeneralEmpleado.class)) {
					tipolibretamili.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipolibretamili)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoLibretaMili = new TipoLibretaMiliDetalleFormJInternalFrame(jDesktopPane,this.tipolibretamiliSessionBean.getConGuardarRelaciones(),this.tipolibretamiliSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoLibretaMili);
		this.jInternalFrameDetalleFormTipoLibretaMili.setVisible(false);
		this.jInternalFrameDetalleFormTipoLibretaMili.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoLibretaMili.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoLibretaMili.tipolibretamiliLogic=this.tipolibretamiliLogic;
		
		this.cargarCombosFrameForeignKeyTipoLibretaMili("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoLibretaMili();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoLibretaMili();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoLibretaMili("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoLibretaMili();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoLibretaMili.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoLibretaMili"));
		
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonModificarTipoLibretaMili.addActionListener(new ButtonActionListener(this,"ModificarTipoLibretaMili"));

		
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonModificarToolBarTipoLibretaMili.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoLibretaMili"));
					
		this.jInternalFrameDetalleFormTipoLibretaMili.jMenuItemModificarTipoLibretaMili.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoLibretaMili"));		
		
		
		
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonActualizarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"ActualizarTipoLibretaMili"));
		
		
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonActualizarToolBarTipoLibretaMili.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoLibretaMili"));
						
		this.jInternalFrameDetalleFormTipoLibretaMili.jMenuItemActualizarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoLibretaMili"));		
		
		
		
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonEliminarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"EliminarTipoLibretaMili"));
		
		
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonEliminarToolBarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoLibretaMili"));
								
		this.jInternalFrameDetalleFormTipoLibretaMili.jMenuItemEliminarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoLibretaMili"));		
		
		
		
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonCancelarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"CancelarTipoLibretaMili"));
		
		
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonCancelarToolBarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoLibretaMili"));
					
		this.jInternalFrameDetalleFormTipoLibretaMili.jMenuItemCancelarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoLibretaMili"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoLibretaMili.jMenuItemDetalleCerrarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoLibretaMili"));		
		
		
		
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonGuardarCambiosToolBarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoLibretaMili"));
		
		
		
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonGuardarCambiosToolBarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoLibretaMili"));
		
		
		
		this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxTiposAccionesFormularioTipoLibretaMili.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoLibretaMili"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonidTipoLibretaMiliBusqueda.addActionListener(new ButtonActionListener(this,"idTipoLibretaMiliBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonid_empresaTipoLibretaMiliUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoLibretaMiliUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonid_empresaTipoLibretaMiliBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoLibretaMiliBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtoncodigoTipoLibretaMiliBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoLibretaMiliBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonnombreTipoLibretaMiliBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoLibretaMiliBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoLibretaMili.jTabbedPaneRelacionesTipoLibretaMili.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoLibretaMili"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoLibretaMili"));
		
		if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLibretaMili.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoLibretaMili"));
		}
		
		this.jTableDatosTipoLibretaMili.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoLibretaMili"));
		
		this.jTableDatosTipoLibretaMili.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoLibretaMili"));
		
		this.jButtonNuevoTipoLibretaMili.addActionListener(new ButtonActionListener(this,"NuevoTipoLibretaMili"));
		
		this.jButtonDuplicarTipoLibretaMili.addActionListener(new ButtonActionListener(this,"DuplicarTipoLibretaMili"));
		
		this.jButtonCopiarTipoLibretaMili.addActionListener(new ButtonActionListener(this,"CopiarTipoLibretaMili"));
		
		this.jButtonVerFormTipoLibretaMili.addActionListener(new ButtonActionListener(this,"VerFormTipoLibretaMili"));
		
		
		this.jButtonNuevoToolBarTipoLibretaMili.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoLibretaMili"));
			
		this.jButtonDuplicarToolBarTipoLibretaMili.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoLibretaMili"));
			
		this.jMenuItemNuevoTipoLibretaMili.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoLibretaMili"));
			
		this.jMenuItemDuplicarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoLibretaMili"));		
		
		
		this.jButtonNuevoRelacionesTipoLibretaMili.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoLibretaMili"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoLibretaMili.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoLibretaMili"));
			
		this.jMenuItemNuevoRelacionesTipoLibretaMili.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoLibretaMili"));		
		
		
		if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLibretaMili.jButtonModificarTipoLibretaMili.addActionListener(new ButtonActionListener(this,"ModificarTipoLibretaMili"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLibretaMili.jButtonModificarToolBarTipoLibretaMili.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoLibretaMili"));
			
			this.jInternalFrameDetalleFormTipoLibretaMili.jMenuItemModificarTipoLibretaMili.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoLibretaMili"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoLibretaMili.jButtonActualizarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"ActualizarTipoLibretaMili"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLibretaMili.jButtonActualizarToolBarTipoLibretaMili.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoLibretaMili"));
				
			this.jInternalFrameDetalleFormTipoLibretaMili.jMenuItemActualizarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoLibretaMili"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLibretaMili.jButtonEliminarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"EliminarTipoLibretaMili"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLibretaMili.jButtonEliminarToolBarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoLibretaMili"));
						
			this.jInternalFrameDetalleFormTipoLibretaMili.jMenuItemEliminarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoLibretaMili"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLibretaMili.jButtonCancelarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"CancelarTipoLibretaMili"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLibretaMili.jButtonCancelarToolBarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoLibretaMili"));
			
			this.jInternalFrameDetalleFormTipoLibretaMili.jMenuItemCancelarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoLibretaMili"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoLibretaMili"));		
		
		
		this.jButtonCerrarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"CerrarTipoLibretaMili"));
		
		
		this.jButtonCerrarToolBarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoLibretaMili"));
			
		this.jMenuItemCerrarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoLibretaMili"));
			
		if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLibretaMili.jMenuItemDetalleCerrarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoLibretaMili"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLibretaMili.jButtonGuardarCambiosTipoLibretaMili.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoLibretaMili"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLibretaMili.jButtonGuardarCambiosToolBarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoLibretaMili"));
		}
		
		this.jButtonCopiarToolBarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoLibretaMili"));
			
		this.jButtonVerFormToolBarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoLibretaMili"));
		
		this.jMenuItemGuardarCambiosTipoLibretaMili.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoLibretaMili"));
			
		this.jMenuItemCopiarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoLibretaMili"));		
		
		this.jMenuItemVerFormTipoLibretaMili.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoLibretaMili"));		
		
		
		this.jButtonGuardarCambiosTablaTipoLibretaMili.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoLibretaMili"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoLibretaMili"));
			
		this.jMenuItemGuardarCambiosTablaTipoLibretaMili.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoLibretaMili"));		
		
		
		
		this.jButtonRecargarInformacionTipoLibretaMili.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoLibretaMili"));
					
		this.jButtonRecargarInformacionToolBarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoLibretaMili"));
		
		this.jMenuItemRecargarInformacionTipoLibretaMili.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoLibretaMili"));		
		
		
		
		this.jButtonAnterioresTipoLibretaMili.addActionListener (new ButtonActionListener(this,"AnterioresTipoLibretaMili"));
		
		
		this.jButtonAnterioresToolBarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoLibretaMili"));
		
		this.jMenuItemAnterioresTipoLibretaMili.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoLibretaMili"));		
		
		
		this.jButtonSiguientesTipoLibretaMili.addActionListener (new ButtonActionListener(this,"SiguientesTipoLibretaMili"));
		
		
		this.jButtonSiguientesToolBarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoLibretaMili"));
			
		this.jMenuItemSiguientesTipoLibretaMili.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoLibretaMili"));
			
		this.jMenuItemAbrirOrderByTipoLibretaMili.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoLibretaMili"));
			
		this.jMenuItemMostrarOcultarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoLibretaMili"));
			
		this.jMenuItemDetalleAbrirOrderByTipoLibretaMili.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoLibretaMili"));
			
		this.jMenuItemDetalleMostarOcultarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoLibretaMili"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoLibretaMili.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoLibretaMili"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoLibretaMili"));
			
		this.jMenuItemNuevoGuardarCambiosTipoLibretaMili.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoLibretaMili"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoLibretaMili.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoLibretaMili"));

		this.jCheckBoxSeleccionadosTipoLibretaMili.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoLibretaMili"));
		
		if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxTiposAccionesFormularioTipoLibretaMili.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoLibretaMili"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoLibretaMili.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoLibretaMili"));
			
		this.jComboBoxTiposAccionesTipoLibretaMili.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoLibretaMili"));
					
		this.jComboBoxTiposSeleccionarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoLibretaMili"));
			
		this.jTextFieldValorCampoGeneralTipoLibretaMili.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoLibretaMili"));		
		
		
		if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonidTipoLibretaMiliBusqueda.addActionListener(new ButtonActionListener(this,"idTipoLibretaMiliBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonid_empresaTipoLibretaMiliUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoLibretaMiliUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonid_empresaTipoLibretaMiliBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoLibretaMiliBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtoncodigoTipoLibretaMiliBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoLibretaMiliBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonnombreTipoLibretaMiliBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoLibretaMiliBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoLibretaMili!=null) {
				this.jInternalFrameReporteDinamicoTipoLibretaMili.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoLibretaMili"));
				this.jInternalFrameReporteDinamicoTipoLibretaMili.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoLibretaMili"));
				this.jInternalFrameReporteDinamicoTipoLibretaMili.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoLibretaMili"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoLibretaMili.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoLibretaMili"));				
			//this.jButtonGenerarReporteDinamicoTipoLibretaMili.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoLibretaMili"));
			//this.jButtonGenerarExcelReporteDinamicoTipoLibretaMili.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoLibretaMili"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoLibretaMili!=null) {
				this.jInternalFrameImportacionTipoLibretaMili.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoLibretaMili"));
				this.jInternalFrameImportacionTipoLibretaMili.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoLibretaMili"));
				this.jInternalFrameImportacionTipoLibretaMili.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoLibretaMili"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoLibretaMili.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoLibretaMili"));
			
			this.jButtonAbrirOrderByToolBarTipoLibretaMili.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoLibretaMili"));			
			
			if(this.jInternalFrameOrderByTipoLibretaMili!=null) {
				this.jInternalFrameOrderByTipoLibretaMili.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoLibretaMili"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLibretaMili.jTabbedPaneRelacionesTipoLibretaMili.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoLibretaMili"));
		
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
            		closingInternalFrameTipoLibretaMili();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoLibretaMili.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoLibretaMili = (JInternalFrameBase)event.getSource();
	            	
	            TipoLibretaMiliBeanSwingJInternalFrame jInternalFrameParent=(TipoLibretaMiliBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoLibretaMili.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoLibretaMiliActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoLibretaMili.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoLibretaMiliListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoLibretaMili.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoLibretaMili.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoLibretaMiliActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoLibretaMiliActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoLibretaMiliActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoLibretaMili";
		inputMap = this.jButtonNuevoTipoLibretaMili.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoLibretaMili.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoLibretaMiliActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoLibretaMiliActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoLibretaMiliActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoLibretaMiliActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoLibretaMili";
		inputMap = this.jButtonNuevoRelacionesTipoLibretaMili.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoLibretaMili.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoLibretaMiliActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoLibretaMili";
		inputMap = this.jButtonModificarTipoLibretaMili.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoLibretaMili.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoLibretaMiliActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoLibretaMili";
		inputMap = this.jButtonActualizarTipoLibretaMili.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoLibretaMili.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoLibretaMiliActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoLibretaMili";
		inputMap = this.jButtonEliminarTipoLibretaMili.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoLibretaMili.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoLibretaMiliActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoLibretaMili";
		inputMap = this.jButtonCancelarTipoLibretaMili.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoLibretaMili.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoLibretaMiliActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoLibretaMili";
		inputMap = this.jButtonCerrarTipoLibretaMili.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoLibretaMili.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoLibretaMiliActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonGuardarCambiosTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoLibretaMili";
		inputMap = this.jInternalFrameDetalleFormTipoLibretaMili.jButtonGuardarCambiosTipoLibretaMili.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonGuardarCambiosTipoLibretaMili.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoLibretaMiliActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoLibretaMili.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoLibretaMiliItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoLibretaMili.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoLibretaMiliActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoLibretaMili.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoLibretaMiliActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoLibretaMili.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoLibretaMiliActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonidTipoLibretaMiliBusqueda.addActionListener(new ButtonActionListener(this,"idTipoLibretaMiliBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonid_empresaTipoLibretaMiliUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoLibretaMiliUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonid_empresaTipoLibretaMiliBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoLibretaMiliBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtoncodigoTipoLibretaMiliBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoLibretaMiliBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLibretaMili.jButtonnombreTipoLibretaMiliBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoLibretaMiliBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoLibretaMili.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoLibretaMiliActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoLibretaMiliActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoLibretaMili.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoLibretaMili(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoLibretaMili tipolibretamiliAux:this.tipolibretamiliLogic.getTipoLibretaMilis()) {
					tipolibretamiliAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoLibretaMili tipolibretamiliAux:tipolibretamilis) {
					tipolibretamiliAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoLibretaMiliItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoLibretaMili(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoLibretaMili tipolibretamiliAux:this.tipolibretamiliLogic.getTipoLibretaMilis()) {
						tipolibretamiliAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoLibretaMili tipolibretamiliAux:tipolibretamilis) {
						tipolibretamiliAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoLibretaMili tipolibretamiliAux:this.tipolibretamiliLogic.getTipoLibretaMilis()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoLibretaMili tipolibretamiliAux:tipolibretamilis) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoLibretaMili(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoLibretaMili.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoLibretaMili.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoLibretaMili,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoLibretaMiliItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoLibretaMili(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoLibretaMili.getSelectedRows();
			
			TipoLibretaMili tipolibretamiliLocal=new TipoLibretaMili();
			
			//this.seleccionarTodosTipoLibretaMili(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipolibretamiliLocal =(TipoLibretaMili) this.tipolibretamiliLogic.getTipoLibretaMilis().toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipolibretamiliLocal =(TipoLibretaMili) this.tipolibretamilis.toArray()[this.jTableDatosTipoLibretaMili.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipolibretamiliLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoLibretaMili tipolibretamiliAux:this.tipolibretamiliLogic.getTipoLibretaMilis()) {
						tipolibretamiliAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoLibretaMili tipolibretamiliAux:tipolibretamilis) {
						tipolibretamiliAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoLibretaMili(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoLibretaMili.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoLibretaMili.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoLibretaMili,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoLibretaMiliItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoLibretaMiliParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoLibretaMiliActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoLibretaMili(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoLibretaMili.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoLibretaMili tipolibretamiliAux:this.tipolibretamiliLogic.getTipoLibretaMilis()) {
				
						if(sTipoSeleccionar.equals(TipoLibretaMiliConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipolibretamiliAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoLibretaMiliConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipolibretamiliAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoLibretaMili tipolibretamiliAux:tipolibretamilis) {
					
						if(sTipoSeleccionar.equals(TipoLibretaMiliConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipolibretamiliAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoLibretaMiliConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipolibretamiliAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoLibretaMili(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoLibretaMiliActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoLibretaMili(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoLibretaMili=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoLibretaMili.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxTiposAccionesFormularioTipoLibretaMili.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoLibretaMili) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoLibretaMili(conSplash);
				
					this.generarReporteTipoLibretaMilisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoLibretaMili.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxTiposAccionesFormularioTipoLibretaMili.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoLibretaMilisSeleccionados();
				//this.jComboBoxTiposAccionesTipoLibretaMili.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoLibretaMilisSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoLibretaMili.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoLibretaMilisSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoLibretaMili.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoLibretaMili();
				
				this.exportarTipoLibretaMilisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoLibretaMili.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxTiposAccionesFormularioTipoLibretaMili.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoLibretaMilis();
				//this.importarTipoLibretaMilis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoLibretaMili.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxTiposAccionesFormularioTipoLibretaMili.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoLibretaMili();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoLibretaMilisSeleccionados();
				//this.jComboBoxTiposAccionesTipoLibretaMili.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Libreta Mili", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoLibretaMili();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoLibretaMili)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoLibretaMili(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Libreta Mili",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoLibretaMili.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxTiposAccionesFormularioTipoLibretaMili.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoLibretaMiliBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoLibretaMili) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoLibretaMili(conSplash);
					
						//this.actualizarParametrosGeneralTipoLibretaMili();
						
						this.generarReporteProcesoAccionTipoLibretaMilisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoLibretaMili.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxTiposAccionesFormularioTipoLibretaMili.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoLibretaMiliBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Libreta MiliS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Libreta Mili", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoLibretaMili();
				
						this.actualizarParametrosGeneralTipoLibretaMili();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipolibretamiliReturnGeneral=tipolibretamiliLogic.procesarAccionTipoLibretaMilisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipolibretamiliLogic.getTipoLibretaMilis(),this.tipolibretamiliParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoLibretaMiliReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoLibretaMili.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxTiposAccionesFormularioTipoLibretaMili.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoLibretaMili();
					
					TipoLibretaMiliBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoLibretaMiliReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoLibretaMili.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxTiposAccionesFormularioTipoLibretaMili.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoLibretaMili(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoLibretaMiliActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoLibretaMili();
			
			if(this.jInternalFrameDetalleFormTipoLibretaMili==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoLibretaMili> tipolibretamilisSeleccionados=new ArrayList<TipoLibretaMili>();		
			TipoLibretaMili tipolibretamili=new TipoLibretaMili();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoLibretaMili(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoLibretaMili.getSelectedItem();
			
			
			
			
			tipolibretamilisSeleccionados=this.getTipoLibretaMilisSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipolibretamilisSeleccionados.size()==1) {
				for(TipoLibretaMili tipolibretamiliAux:tipolibretamilisSeleccionados) {
					tipolibretamili=tipolibretamiliAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Dato General Empleado")) {
					jButtonDatoGeneralEmpleadoActionPerformed(null,rowIndex,true,false,tipolibretamili);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoLibretaMili();
			
      		//this.finishProcessTipoLibretaMili(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoLibretaMiliReturnGeneral() throws Exception {
		if(this.tipolibretamiliReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipolibretamiliReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipolibretamiliReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipolibretamiliReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipolibretamiliReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipolibretamiliReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoLibretaMili(false);
		}
		
		if(this.tipolibretamiliReturnGeneral.getConRetornoLista() || this.tipolibretamiliReturnGeneral.getConRetornoObjeto()) {
			if(this.tipolibretamiliReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipolibretamiliLogic.setTipoLibretaMilis(this.tipolibretamiliReturnGeneral.getTipoLibretaMilis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipolibretamiliReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipolibretamiliLogic.setTipoLibretaMili(this.tipolibretamiliReturnGeneral.getTipoLibretaMili());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoLibretaMili(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoLibretaMili() throws Exception {
		
		
	}
	
	public ArrayList<TipoLibretaMili> getTipoLibretaMilisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoLibretaMili> tipolibretamilisSeleccionados=new ArrayList<TipoLibretaMili>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoLibretaMili) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoLibretaMili tipolibretamiliAux:tipolibretamiliLogic.getTipoLibretaMilis()) {
					if(tipolibretamiliAux.getIsSelected()) {
						tipolibretamilisSeleccionados.add(tipolibretamiliAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoLibretaMili tipolibretamiliAux:this.tipolibretamilis) {
					if(tipolibretamiliAux.getIsSelected()) {
						tipolibretamilisSeleccionados.add(tipolibretamiliAux);				
					}
				}
			}
			
			if(tipolibretamilisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipolibretamilisSeleccionados.addAll(this.tipolibretamiliLogic.getTipoLibretaMilis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipolibretamilisSeleccionados.addAll(this.tipolibretamilis);				
					}
				}
			}
		} else {
			tipolibretamilisSeleccionados.add(this.tipolibretamili);
		}
		
		return tipolibretamilisSeleccionados;
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
	
	public void generarReporteTipoLibretaMilisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoLibretaMilisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoLibretaMilisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoLibretaMilisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoLibretaMilisSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoLibretaMilisSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Libreta Mili",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoLibretaMilisSeleccionados() throws Exception {
		ArrayList<TipoLibretaMili> tipolibretamilisSeleccionados=new ArrayList<TipoLibretaMili>();		
		
		tipolibretamilisSeleccionados=this.getTipoLibretaMilisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoLibretaMilis("Todos",tipolibretamilisSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoLibretaMilisSeleccionados() throws Exception {
		ArrayList<TipoLibretaMili> tipolibretamilisSeleccionados=new ArrayList<TipoLibretaMili>();		
		
		tipolibretamilisSeleccionados=this.getTipoLibretaMilisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoLibretaMilis("Todos",tipolibretamilisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoLibretaMilisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoLibretaMili> tipolibretamilisSeleccionados=new ArrayList<TipoLibretaMili>();
		
		tipolibretamilisSeleccionados=this.getTipoLibretaMilisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoLibretaMilis("Todos",tipolibretamilisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoLibretaMilisSeleccionados() throws Exception {
		ArrayList<TipoLibretaMili> tipolibretamilisSeleccionados=new ArrayList<TipoLibretaMili>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoLibretaMili();
		
		
		tipolibretamilisSeleccionados=this.getTipoLibretaMilisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoLibretaMili();
		
		
		//this.generarReporteTipoLibretaMilis("Todos",tipolibretamilisSeleccionados ,tipolibretamiliImplementable,tipolibretamiliImplementableHome);
	}
	
	public void mostrarImportacionTipoLibretaMilis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoLibretaMili();
		
		this.abrirFrameImportacionTipoLibretaMili();		
		
			
		//this.generarReporteTipoLibretaMilis("Todos",tipolibretamilisSeleccionados ,tipolibretamiliImplementable,tipolibretamiliImplementableHome);
	}
	
	public void importarTipoLibretaMilis() throws Exception {		
	
	}
	
	public void exportarTipoLibretaMilisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoLibretaMilisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoLibretaMilisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoLibretaMilisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Libreta Mili",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoLibretaMilisSeleccionados() throws Exception {
		ArrayList<TipoLibretaMili> tipolibretamilisSeleccionados=new ArrayList<TipoLibretaMili>();		
		
		tipolibretamilisSeleccionados=this.getTipoLibretaMilisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolibretamili."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoLibretaMili(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoLibretaMili tipolibretamiliAux:tipolibretamilisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoLibretaMili(tipolibretamiliAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipolibretamiliAux.setsDetalleGeneralEntityReporte(tipolibretamiliAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Libreta Mili",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoLibretaMili(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoLibretaMiliConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoLibretaMiliConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoLibretaMiliConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoLibretaMiliConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoLibretaMiliConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoLibretaMili(TipoLibretaMili tipolibretamili,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipolibretamili.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipolibretamili.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipolibretamili.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipolibretamili.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipolibretamili.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoLibretaMilisSeleccionados() throws Exception {
		ArrayList<TipoLibretaMili> tipolibretamilisSeleccionados=new ArrayList<TipoLibretaMili>();		
		
		tipolibretamilisSeleccionados=this.getTipoLibretaMilisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolibretamili.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoLibretaMilis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoLibretaMili(row);				
				iRow++;
			}				
			
			for(TipoLibretaMili tipolibretamiliAux:tipolibretamilisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoLibretaMili(tipolibretamiliAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Libreta Mili",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoLibretaMilisSeleccionados() throws Exception {
		ArrayList<TipoLibretaMili> tipolibretamilisSeleccionados=new ArrayList<TipoLibretaMili>();		
		
		tipolibretamilisSeleccionados=this.getTipoLibretaMilisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolibretamili.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipolibretamilis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipolibretamili");
			//elementRoot.appendChild(element);
		
			for(TipoLibretaMili tipolibretamiliAux:tipolibretamilisSeleccionados) {
				element = document.createElement("tipolibretamili");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoLibretaMili(tipolibretamiliAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Libreta Mili",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoLibretaMili(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoLibretaMiliConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoLibretaMiliConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoLibretaMiliConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoLibretaMiliConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoLibretaMiliConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoLibretaMili(TipoLibretaMili tipolibretamili,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipolibretamili.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipolibretamili.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipolibretamili.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipolibretamili.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoLibretaMili(TipoLibretaMili tipolibretamili,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoLibretaMiliConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipolibretamili.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoLibretaMiliConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipolibretamili.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoLibretaMiliConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipolibretamili.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoLibretaMiliConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipolibretamili.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoLibretaMiliConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipolibretamili.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoLibretaMilisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoLibretaMili> tipolibretamilisSeleccionados=new ArrayList<TipoLibretaMili>();
		
		tipolibretamilisSeleccionados=this.getTipoLibretaMilisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoLibretaMili(tipolibretamilisSeleccionados);
		
		this.generarReporteTipoLibretaMilis("Todos",tipolibretamilisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoLibretaMili(ArrayList<TipoLibretaMili> tipolibretamilisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoLibretaMili tipolibretamiliAux:tipolibretamilisSeleccionados) {
				tipolibretamiliAux.setsDetalleGeneralEntityReporte(tipolibretamiliAux.toString());
			
				if(sTipoSeleccionar.equals(TipoLibretaMiliConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipolibretamiliAux.setsDescripcionGeneralEntityReporte1(tipolibretamiliAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoLibretaMiliConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipolibretamiliAux.setsDescripcionGeneralEntityReporte1(tipolibretamiliAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoLibretaMiliConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipolibretamiliAux.setsDescripcionGeneralEntityReporte1(tipolibretamiliAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLibretaMiliConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoLibretaMili(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoLibretaMili=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoLibretaMili=true;
				this.isVisibilidadCeldaGuardarCambiosTipoLibretaMili=true;
			}
			
			this.isVisibilidadCeldaModificarTipoLibretaMili=false;
			this.isVisibilidadCeldaActualizarTipoLibretaMili=false;
			this.isVisibilidadCeldaEliminarTipoLibretaMili=false;
			this.isVisibilidadCeldaCancelarTipoLibretaMili=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLibretaMili=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoLibretaMili=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoLibretaMili=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoLibretaMili=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLibretaMili=false;
			this.isVisibilidadCeldaModificarTipoLibretaMili=false;
			this.isVisibilidadCeldaActualizarTipoLibretaMili=true;
			this.isVisibilidadCeldaEliminarTipoLibretaMili=false;
			this.isVisibilidadCeldaCancelarTipoLibretaMili=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLibretaMili=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoLibretaMili=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoLibretaMili=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoLibretaMili=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLibretaMili=false;
			this.isVisibilidadCeldaModificarTipoLibretaMili=false;
			this.isVisibilidadCeldaActualizarTipoLibretaMili=true;
			this.isVisibilidadCeldaEliminarTipoLibretaMili=true;
			this.isVisibilidadCeldaCancelarTipoLibretaMili=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLibretaMili=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoLibretaMili=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoLibretaMili=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoLibretaMili=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLibretaMili=false;
			this.isVisibilidadCeldaModificarTipoLibretaMili=false;
			this.isVisibilidadCeldaActualizarTipoLibretaMili=true;
			this.isVisibilidadCeldaEliminarTipoLibretaMili=false;
			this.isVisibilidadCeldaCancelarTipoLibretaMili=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLibretaMili=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoLibretaMili=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoLibretaMili=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoLibretaMili=true;
			this.isVisibilidadCeldaGuardarCambiosTipoLibretaMili=true;
			this.isVisibilidadCeldaModificarTipoLibretaMili=false;
			this.isVisibilidadCeldaActualizarTipoLibretaMili=false;
			this.isVisibilidadCeldaEliminarTipoLibretaMili=false;
			this.isVisibilidadCeldaCancelarTipoLibretaMili=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLibretaMili=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoLibretaMili=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoLibretaMili=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoLibretaMili=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLibretaMili=false;
			this.isVisibilidadCeldaActualizarTipoLibretaMili=false;
			this.isVisibilidadCeldaEliminarTipoLibretaMili=false;
			this.isVisibilidadCeldaCancelarTipoLibretaMili=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLibretaMili=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoLibretaMili=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoLibretaMili=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoLibretaMili=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLibretaMili=false;
			this.isVisibilidadCeldaModificarTipoLibretaMili=true;
			this.isVisibilidadCeldaActualizarTipoLibretaMili=false;
			this.isVisibilidadCeldaEliminarTipoLibretaMili=false;
			this.isVisibilidadCeldaCancelarTipoLibretaMili=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLibretaMili=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoLibretaMili=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoLibretaMiliJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoLibretaMili=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoLibretaMili=true;
			this.isVisibilidadCeldaGuardarCambiosTipoLibretaMili=true;
		} else {
			this.actualizarEstadoPanelsTipoLibretaMili(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoLibretaMili=false;
			//this.isVisibilidadCeldaVerFormTipoLibretaMili=false;
			this.isVisibilidadCeldaDuplicarTipoLibretaMili=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipolibretamiliSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoLibretaMili=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoLibretaMili=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLibretaMili=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
			if(!tipolibretamiliSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoLibretaMili=false;												
			}
			
			this.jButtonCerrarTipoLibretaMili.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoLibretaMili=false;
		}
		
		if(!this.permiteMantenimiento(this.tipolibretamili)) {
			this.isVisibilidadCeldaActualizarTipoLibretaMili=false;
			this.isVisibilidadCeldaEliminarTipoLibretaMili=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoLibretaMili() {
		this.isVisibilidadCeldaNuevoTipoLibretaMili=false;
		this.isVisibilidadCeldaGuardarCambiosTipoLibretaMili=false;
	}
	
	public void actualizarEstadoPanelsTipoLibretaMili(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoLibretaMili!=null) {
				this.jScrollPanelDatosEdicionTipoLibretaMili.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoLibretaMili!=null) {
				this.jTabbedPaneBusquedasTipoLibretaMili.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoLibretaMili!=null) {
				this.jScrollPanelDatosTipoLibretaMili.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoLibretaMili!=null) {
				this.jPanelPaginacionTipoLibretaMili.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoLibretaMili!=null) {
				this.jPanelParametrosReportesTipoLibretaMili.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoLibretaMili!=null) {
				this.jScrollPanelDatosEdicionTipoLibretaMili.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoLibretaMili!=null) {
				this.jTabbedPaneBusquedasTipoLibretaMili.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoLibretaMili!=null) {
				this.jScrollPanelDatosTipoLibretaMili.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoLibretaMili!=null) {
				this.jPanelPaginacionTipoLibretaMili.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoLibretaMili!=null) {
				this.jPanelParametrosReportesTipoLibretaMili.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoLibretaMili!=null) {
				this.jScrollPanelDatosEdicionTipoLibretaMili.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoLibretaMili!=null) {
				this.jTabbedPaneBusquedasTipoLibretaMili.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoLibretaMili!=null) {
				this.jScrollPanelDatosTipoLibretaMili.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoLibretaMili!=null) {
				this.jPanelPaginacionTipoLibretaMili.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoLibretaMili!=null) {
				this.jPanelParametrosReportesTipoLibretaMili.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoLibretaMili!=null) {
				this.jScrollPanelDatosEdicionTipoLibretaMili.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoLibretaMili!=null) {
				this.jTabbedPaneBusquedasTipoLibretaMili.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoLibretaMili!=null) {
				this.jScrollPanelDatosTipoLibretaMili.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoLibretaMili!=null) {
				this.jPanelPaginacionTipoLibretaMili.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoLibretaMili!=null) {
				this.jPanelParametrosReportesTipoLibretaMili.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoLibretaMili!=null) {
				this.jScrollPanelDatosEdicionTipoLibretaMili.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoLibretaMili!=null) {
				this.jTabbedPaneBusquedasTipoLibretaMili.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoLibretaMili!=null) {
				this.jScrollPanelDatosTipoLibretaMili.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoLibretaMili!=null) {
				this.jPanelPaginacionTipoLibretaMili.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoLibretaMili!=null) {
				this.jPanelParametrosReportesTipoLibretaMili.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoLibretaMili!=null) {
				this.jScrollPanelDatosEdicionTipoLibretaMili.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoLibretaMili!=null) {
				this.jTabbedPaneBusquedasTipoLibretaMili.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoLibretaMili!=null) {
				this.jScrollPanelDatosTipoLibretaMili.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoLibretaMili!=null) {
				this.jPanelPaginacionTipoLibretaMili.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoLibretaMili!=null) {
				this.jPanelParametrosReportesTipoLibretaMili.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoLibretaMili!=null) {
				this.jScrollPanelDatosEdicionTipoLibretaMili.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoLibretaMili!=null) {
				this.jTabbedPaneBusquedasTipoLibretaMili.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoLibretaMili!=null) {
				this.jScrollPanelDatosTipoLibretaMili.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoLibretaMili!=null) {
				this.jPanelPaginacionTipoLibretaMili.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoLibretaMili!=null) {
				this.jPanelParametrosReportesTipoLibretaMili.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoLibretaMili!=null) {
					this.jTabbedPaneBusquedasTipoLibretaMili.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoLibretaMili!=null) {
				this.jPanelParametrosReportesTipoLibretaMili.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoLibretaMili!=null) {
				this.jTabbedPaneBusquedasTipoLibretaMili.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoLibretaMili!=null) {
				this.jPanelParametrosReportesTipoLibretaMili.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoLibretaMiliParaDatoGeneralEmpleados() throws Exception {
		Boolean isPaginaPopupDatoGeneralEmpleado=false;

		try {

			if(this.tipolibretamiliSessionBean==null) {
				this.tipolibretamiliSessionBean=new TipoLibretaMiliSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoSessionBean=new DatoGeneralEmpleadoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoSessionBean.setsPathNavegacionActual(tipolibretamiliSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDatoGeneralEmpleado=this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado(true);
			this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado(TipoLibretaMiliConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoLibretaMili(true);
			this.jInternalFrameDetalleFormTipoLibretaMili.datogeneralempleadoSessionBean.setlidTipoLibretaMiliActual(this.idTipoLibretaMiliActual);

			tipolibretamiliSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoLibretaMili(true);
			tipolibretamiliSessionBean.setlIdTipoLibretaMiliActualForeignKey(this.idTipoLibretaMiliActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoLibretaMiliSessionBean tipolibretamiliSessionBean=new TipoLibretaMiliSessionBean();
		
		if(this.tipolibretamiliSessionBean==null) {
			this.tipolibretamiliSessionBean=new TipoLibretaMiliSessionBean();
		}
		
		this.tipolibretamiliSessionBean.setsUltimaBusquedaTipoLibretaMili(this.getsAccionBusqueda());
		this.tipolibretamiliSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipolibretamiliSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipolibretamiliSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoLibretaMiliSessionBean tipolibretamiliSessionBean=new TipoLibretaMiliSessionBean();
		
		if(this.tipolibretamiliSessionBean==null) {
			this.tipolibretamiliSessionBean=new TipoLibretaMiliSessionBean();
		}
		
		if(this.tipolibretamiliSessionBean.getsUltimaBusquedaTipoLibretaMili()!=null&&!this.tipolibretamiliSessionBean.getsUltimaBusquedaTipoLibretaMili().equals("")) {
			this.setsAccionBusqueda(tipolibretamiliSessionBean.getsUltimaBusquedaTipoLibretaMili());
			this.setiNumeroPaginacion(tipolibretamiliSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipolibretamiliSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipolibretamiliSessionBean.getid_empresa());
				tipolibretamiliSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipolibretamiliSessionBean.setsUltimaBusquedaTipoLibretaMili("");
		this.tipolibretamiliSessionBean.setiNumeroPaginacion(TipoLibretaMiliConstantesFunciones.INUMEROPAGINACION);
		this.tipolibretamiliSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoLibretaMili(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoLibretaMili() {
		this.updateBorderResaltarBusquedasFormularioTipoLibretaMili();
		this.updateVisibilidadBusquedasFormularioTipoLibretaMili();
		this.updateHabilitarBusquedasFormularioTipoLibretaMili();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoLibretaMili() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoLibretaMili.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoLibretaMili() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoLibretaMili.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoLibretaMili() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoLibretaMili.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoLibretaMili(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoLibretaMili.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoLibretaMili() throws Exception {

		if(this.jInternalFrameDetalleFormTipoLibretaMili==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoLibretaMili();
		this.updateVisibilidadResaltarControlesFormularioTipoLibretaMili();
		this.updateHabilitarResaltarControlesFormularioTipoLibretaMili();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoLibretaMili() throws Exception {
		if(this.jInternalFrameDetalleFormTipoLibretaMili==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipolibretamiliConstantesFunciones.resaltaridTipoLibretaMili!=null && this.jInternalFrameDetalleFormTipoLibretaMili!=null) {this.jInternalFrameDetalleFormTipoLibretaMili.jLabelidTipoLibretaMili.setBorder(this.tipolibretamiliConstantesFunciones.resaltaridTipoLibretaMili);}
		if(this.tipolibretamiliConstantesFunciones.resaltarid_empresaTipoLibretaMili!=null && this.jInternalFrameDetalleFormTipoLibretaMili!=null) {this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxid_empresaTipoLibretaMili.setBorder(this.tipolibretamiliConstantesFunciones.resaltarid_empresaTipoLibretaMili);}
		if(this.tipolibretamiliConstantesFunciones.resaltarcodigoTipoLibretaMili!=null && this.jInternalFrameDetalleFormTipoLibretaMili!=null) {this.jInternalFrameDetalleFormTipoLibretaMili.jTextFieldcodigoTipoLibretaMili.setBorder(this.tipolibretamiliConstantesFunciones.resaltarcodigoTipoLibretaMili);}
		if(this.tipolibretamiliConstantesFunciones.resaltarnombreTipoLibretaMili!=null && this.jInternalFrameDetalleFormTipoLibretaMili!=null) {this.jInternalFrameDetalleFormTipoLibretaMili.jTextAreanombreTipoLibretaMili.setBorder(this.tipolibretamiliConstantesFunciones.resaltarnombreTipoLibretaMili);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoLibretaMili() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoLibretaMili==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) {
	
		//this.jInternalFrameDetalleFormTipoLibretaMili.jLabelidTipoLibretaMili.setVisible(this.tipolibretamiliConstantesFunciones.mostraridTipoLibretaMili);
		this.jInternalFrameDetalleFormTipoLibretaMili.jPanelidTipoLibretaMili.setVisible(this.tipolibretamiliConstantesFunciones.mostraridTipoLibretaMili);
		//this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxid_empresaTipoLibretaMili.setVisible(this.tipolibretamiliConstantesFunciones.mostrarid_empresaTipoLibretaMili);
		this.jInternalFrameDetalleFormTipoLibretaMili.jPanelid_empresaTipoLibretaMili.setVisible(this.tipolibretamiliConstantesFunciones.mostrarid_empresaTipoLibretaMili);
		//this.jInternalFrameDetalleFormTipoLibretaMili.jTextFieldcodigoTipoLibretaMili.setVisible(this.tipolibretamiliConstantesFunciones.mostrarcodigoTipoLibretaMili);
		this.jInternalFrameDetalleFormTipoLibretaMili.jPanelcodigoTipoLibretaMili.setVisible(this.tipolibretamiliConstantesFunciones.mostrarcodigoTipoLibretaMili);
		//this.jInternalFrameDetalleFormTipoLibretaMili.jTextAreanombreTipoLibretaMili.setVisible(this.tipolibretamiliConstantesFunciones.mostrarnombreTipoLibretaMili);
		this.jInternalFrameDetalleFormTipoLibretaMili.jPanelnombreTipoLibretaMili.setVisible(this.tipolibretamiliConstantesFunciones.mostrarnombreTipoLibretaMili);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoLibretaMili() throws Exception {
		if(this.jInternalFrameDetalleFormTipoLibretaMili==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoLibretaMili!=null) {
	
		this.jInternalFrameDetalleFormTipoLibretaMili.jLabelidTipoLibretaMili.setEnabled(this.tipolibretamiliConstantesFunciones.activaridTipoLibretaMili);
		this.jInternalFrameDetalleFormTipoLibretaMili.jComboBoxid_empresaTipoLibretaMili.setEnabled(this.tipolibretamiliConstantesFunciones.activarid_empresaTipoLibretaMili);
		this.jInternalFrameDetalleFormTipoLibretaMili.jTextFieldcodigoTipoLibretaMili.setEnabled(this.tipolibretamiliConstantesFunciones.activarcodigoTipoLibretaMili);
		this.jInternalFrameDetalleFormTipoLibretaMili.jTextAreanombreTipoLibretaMili.setEnabled(this.tipolibretamiliConstantesFunciones.activarnombreTipoLibretaMili);
		}
	}
	
		
}