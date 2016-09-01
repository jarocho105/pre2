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

import com.bydan.erp.nomina.util.TipoSangreConstantesFunciones;
import com.bydan.erp.nomina.util.TipoSangreParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoSangreParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoSangreBean;
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
public class TipoSangreBeanSwingJInternalFrame extends TipoSangreJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoSangreBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoSangre> tiposangreValidator = new ClassValidator<TipoSangre>(TipoSangre.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoSangre tiposangre;	
	public TipoSangre tiposangreAux;
	public TipoSangre tiposangreAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoSangre tiposangreTotales;
	public Long idTipoSangreActual;
	public Long iIdNuevoTipoSangre=0L;
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
	
	public Boolean isPermisoTodoTipoSangre;
	public Boolean isPermisoNuevoTipoSangre;
	public Boolean isPermisoActualizarTipoSangre;
	public Boolean isPermisoActualizarOriginalTipoSangre;
	public Boolean isPermisoEliminarTipoSangre;
	public Boolean isPermisoGuardarCambiosTipoSangre;
	public Boolean isPermisoConsultaTipoSangre;
	public Boolean isPermisoBusquedaTipoSangre;
	public Boolean isPermisoReporteTipoSangre;
	public Boolean isPermisoPaginacionMedioTipoSangre;
	public Boolean isPermisoPaginacionAltoTipoSangre;
	public Boolean isPermisoPaginacionTodoTipoSangre;
	public Boolean isPermisoCopiarTipoSangre;
	public Boolean isPermisoVerFormTipoSangre;
	public Boolean isPermisoDuplicarTipoSangre;
	public Boolean isPermisoOrdenTipoSangre;
	
	
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
	
	public TipoSangreParameterReturnGeneral tiposangreReturnGeneral;
	public TipoSangreParameterReturnGeneral tiposangreParameterGeneral;
	
	

	public DatoGeneralEmpleadoLogic datogeneralempleadoLogic=null;

	public DatoGeneralEmpleadoLogic getDatoGeneralEmpleadoLogic() {
		return datogeneralempleadoLogic;
	}

	public void setDatoGeneralEmpleadoLogic(DatoGeneralEmpleadoLogic datogeneralempleadoLogic) {
		this.datogeneralempleadoLogic = datogeneralempleadoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoSangre=false;
	public Boolean esParaAccionDesdeFormularioTipoSangre=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoSangreSessionBeanAdditional tiposangreSessionBeanAdditional=null;
	
	public TipoSangreSessionBeanAdditional getTipoSangreSessionBeanAdditional() {
		return this.tiposangreSessionBeanAdditional;
	}
	
	public void setTipoSangreSessionBeanAdditional(TipoSangreSessionBeanAdditional tiposangreSessionBeanAdditional) {
		try {
			this.tiposangreSessionBeanAdditional=tiposangreSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoSangreBeanSwingJInternalFrameAdditional tiposangreBeanSwingJInternalFrameAdditional=null;
	//public class TipoSangreBeanSwingJInternalFrame
	
	public TipoSangreBeanSwingJInternalFrameAdditional getTipoSangreBeanSwingJInternalFrameAdditional() {
		return this.tiposangreBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoSangreBeanSwingJInternalFrameAdditional(TipoSangreBeanSwingJInternalFrameAdditional tiposangreBeanSwingJInternalFrameAdditional) {
		try {
			this.tiposangreBeanSwingJInternalFrameAdditional=tiposangreBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoSangreLogic tiposangreLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoSangre tiposangreBean;
	public TipoSangreConstantesFunciones tiposangreConstantesFunciones;
	//public TipoSangreParameterReturnGeneral tiposangreReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoSangre> tiposangres;	
	//public List<TipoSangre> tiposangresEliminados;
	//public List<TipoSangre> tiposangresAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoSangre=false;
	public Boolean isVisibilidadCeldaDuplicarTipoSangre=true;
	public Boolean isVisibilidadCeldaCopiarTipoSangre=true;
	public Boolean isVisibilidadCeldaVerFormTipoSangre=true;
	public Boolean isVisibilidadCeldaOrdenTipoSangre=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoSangre=false;
	public Boolean isVisibilidadCeldaModificarTipoSangre=false;
	public Boolean isVisibilidadCeldaActualizarTipoSangre=false;
	public Boolean isVisibilidadCeldaEliminarTipoSangre=false;
	public Boolean isVisibilidadCeldaCancelarTipoSangre=false;
	public Boolean isVisibilidadCeldaGuardarTipoSangre=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoSangre=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoSangre() {
		return this.iIdNuevoTipoSangre;
	}

	public void setiIdNuevoTipoSangre(Long iIdNuevoTipoSangre) {
		this.iIdNuevoTipoSangre = iIdNuevoTipoSangre;
	}
	
	public Long getidTipoSangreActual() {
		return this.idTipoSangreActual;
	}

	public void setidTipoSangreActual(Long idTipoSangreActual) {
		this.idTipoSangreActual = idTipoSangreActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoSangre gettiposangre() {
		return this.tiposangre;
	}

	public void settiposangre(TipoSangre tiposangre) {
		this.tiposangre = tiposangre;
	}
	
	public TipoSangre gettiposangreAux() {
		return this.tiposangreAux;
	}

	public void settiposangreAux(TipoSangre tiposangreAux) {
		this.tiposangreAux = tiposangreAux;
	}				
	
	public TipoSangre gettiposangreAnterior() {
		return this.tiposangreAnterior;
	}

	public void settiposangreAnterior(TipoSangre tiposangreAnterior) {
		this.tiposangreAnterior = tiposangreAnterior;
	}	
	
	public TipoSangre gettiposangreTotales() {
		return this.tiposangreTotales;
	}

	public void settiposangreTotales(TipoSangre tiposangreTotales) {
		this.tiposangreTotales = tiposangreTotales;
	}	
	
	public TipoSangre gettiposangreBean() {
		return this.tiposangreBean;
	}

	public void settiposangreBean(TipoSangre tiposangreBean) {
		this.tiposangreBean = tiposangreBean;
	}	
	
	public TipoSangreParameterReturnGeneral gettiposangreReturnGeneral() {
		return this.tiposangreReturnGeneral;
	}

	public void settiposangreReturnGeneral(TipoSangreParameterReturnGeneral tiposangreReturnGeneral) {
		this.tiposangreReturnGeneral = tiposangreReturnGeneral;
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
	
	
	public TipoSangreLogic getTipoSangreLogic()	{		
		return tiposangreLogic;
	}

	public void setTipoSangreLogic(TipoSangreLogic tiposangreLogic) {
		this.tiposangreLogic = tiposangreLogic;
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
	
	public Boolean getIsEsNuevoTipoSangre() {
		return isEsNuevoTipoSangre;
	}

	public void setIsEsNuevoTipoSangre(Boolean isEsNuevoTipoSangre) {
		this.isEsNuevoTipoSangre = isEsNuevoTipoSangre;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoSangre() {
		return esParaAccionDesdeFormularioTipoSangre;
	}
	
	public void setEsParaAccionDesdeFormularioTipoSangre(Boolean esParaAccionDesdeFormularioTipoSangre) {
		this.esParaAccionDesdeFormularioTipoSangre = esParaAccionDesdeFormularioTipoSangre;
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

			if(this.tiposangreSessionBean==null) {
				this.tiposangreSessionBean=new TipoSangreSessionBean();
			}

			if(!this.tiposangreSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tiposangreSessionBean.getlidEmpresaActual());
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

					if(this.tiposangre!=null) {
						this.tiposangre.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoSangre!=null) {
						this.jInternalFrameDetalleFormTipoSangre.jComboBoxid_empresaTipoSangre.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoSangre.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoSangre!=null) {
						if(this.jInternalFrameDetalleFormTipoSangre.jComboBoxid_empresaTipoSangre.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoSangre.jComboBoxid_empresaTipoSangre.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoSangreGenerico)throws Exception
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
				jComboBoxid_empresaTipoSangreGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoSangreGenerico!=null && jComboBoxid_empresaTipoSangreGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoSangreGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoSangre tiposangre,JComboBox jComboBoxid_empresaTipoSangreGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoSangreGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoSangre.jComboBoxid_empresaTipoSangre.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoSangreGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tiposangre.setid_empresa(empresaAux.getId());
				tiposangre.setempresa_descripcion(TipoSangreConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tiposangre.setEmpresa(empresaAux);			}
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

					if(!TipoSangreJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoSangre!=null) { 
							this.jInternalFrameDetalleFormTipoSangre.jComboBoxid_empresaTipoSangre.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoSangre.jComboBoxid_empresaTipoSangre.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoSangre!=null) { 
					}

					if(!TipoSangreJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoSangre!=null) {
							this.jInternalFrameDetalleFormTipoSangre.jComboBoxid_empresaTipoSangre.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoSangre!=null) {
							this.jInternalFrameDetalleFormTipoSangre.jComboBoxid_empresaTipoSangre.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoSangre() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoSangreConstantesFunciones.refrescarForeignKeysDescripcionesTipoSangre(this.tiposangreLogic.getTipoSangres());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoSangreConstantesFunciones.refrescarForeignKeysDescripcionesTipoSangre(this.tiposangres);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tiposangreLogic.setTipoSangres(this.tiposangres);
			tiposangreLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoSangreParameterReturnGeneral getTipoSangreParameterGeneral() {
		return this.tiposangreParameterGeneral;
	}
	
	public void setTipoSangreParameterGeneral(TipoSangreParameterReturnGeneral tiposangreParameterGeneral) {
		this.tiposangreParameterGeneral = tiposangreParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoSangre() {
		return isPermisoTodoTipoSangre;
	}

	public void setIsPermisoTodoTipoSangre(Boolean isPermisoTodoTipoSangre) {
		this.isPermisoTodoTipoSangre = isPermisoTodoTipoSangre;
	}

	public Boolean getIsPermisoNuevoTipoSangre() {
		return isPermisoNuevoTipoSangre;
	}

	public void setIsPermisoNuevoTipoSangre(Boolean isPermisoNuevoTipoSangre) {
		this.isPermisoNuevoTipoSangre = isPermisoNuevoTipoSangre;
	}

	public Boolean getIsPermisoActualizarTipoSangre() {
		return isPermisoActualizarTipoSangre;
	}

	public void setIsPermisoActualizarTipoSangre(Boolean isPermisoActualizarTipoSangre) {
		this.isPermisoActualizarTipoSangre = isPermisoActualizarTipoSangre;
	}

	public Boolean getIsPermisoEliminarTipoSangre() {
		return isPermisoEliminarTipoSangre;
	}

	public void setIsPermisoEliminarTipoSangre(Boolean isPermisoEliminarTipoSangre) {
		this.isPermisoEliminarTipoSangre = isPermisoEliminarTipoSangre;
	}

	public Boolean getIsPermisoGuardarCambiosTipoSangre() {
		return isPermisoGuardarCambiosTipoSangre;
	}

	public void setIsPermisoGuardarCambiosTipoSangre(Boolean isPermisoGuardarCambiosTipoSangre) {
		this.isPermisoGuardarCambiosTipoSangre = isPermisoGuardarCambiosTipoSangre;
	}
	
	public Boolean getIsPermisoConsultaTipoSangre() {
		return isPermisoConsultaTipoSangre;
	}

	public void setIsPermisoConsultaTipoSangre(Boolean isPermisoConsultaTipoSangre) {
		this.isPermisoConsultaTipoSangre = isPermisoConsultaTipoSangre;
	}

	public Boolean getIsPermisoBusquedaTipoSangre() {
		return isPermisoBusquedaTipoSangre;
	}

	public void setIsPermisoBusquedaTipoSangre(Boolean isPermisoBusquedaTipoSangre) {
		this.isPermisoBusquedaTipoSangre = isPermisoBusquedaTipoSangre;
	}

	public Boolean getIsPermisoReporteTipoSangre() {
		return isPermisoReporteTipoSangre;
	}

	public void setIsPermisoReporteTipoSangre(Boolean isPermisoReporteTipoSangre) {
		this.isPermisoReporteTipoSangre = isPermisoReporteTipoSangre;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoSangre() {
		return isPermisoPaginacionMedioTipoSangre;
	}

	public void setIsPermisoPaginacionMedioTipoSangre(Boolean isPermisoPaginacionMedioTipoSangre) {
		this.isPermisoPaginacionMedioTipoSangre = isPermisoPaginacionMedioTipoSangre;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoSangre() {
		return isPermisoPaginacionTodoTipoSangre;
	}

	public void setIsPermisoPaginacionTodoTipoSangre(Boolean isPermisoPaginacionTodoTipoSangre) {
		this.isPermisoPaginacionTodoTipoSangre = isPermisoPaginacionTodoTipoSangre;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoSangre() {
		return isPermisoPaginacionAltoTipoSangre;
	}

	public void setIsPermisoPaginacionAltoTipoSangre(Boolean isPermisoPaginacionAltoTipoSangre) {
		this.isPermisoPaginacionAltoTipoSangre = isPermisoPaginacionAltoTipoSangre;
	}
	
	public Boolean getIsPermisoCopiarTipoSangre() {
		return isPermisoCopiarTipoSangre;
	}

	public void setIsPermisoCopiarTipoSangre(Boolean isPermisoCopiarTipoSangre) {
		this.isPermisoCopiarTipoSangre = isPermisoCopiarTipoSangre;
	}
	
	public Boolean getIsPermisoVerFormTipoSangre() {
		return isPermisoVerFormTipoSangre;
	}

	public void setIsPermisoVerFormTipoSangre(Boolean isPermisoVerFormTipoSangre) {
		this.isPermisoVerFormTipoSangre = isPermisoVerFormTipoSangre;
	}
	
	public Boolean getIsPermisoDuplicarTipoSangre() {
		return isPermisoDuplicarTipoSangre;
	}

	public void setIsPermisoDuplicarTipoSangre(Boolean isPermisoDuplicarTipoSangre) {
		this.isPermisoDuplicarTipoSangre = isPermisoDuplicarTipoSangre;
	}
	
	public Boolean getIsPermisoOrdenTipoSangre() {
		return isPermisoOrdenTipoSangre;
	}

	public void setIsPermisoOrdenTipoSangre(Boolean isPermisoOrdenTipoSangre) {
		this.isPermisoOrdenTipoSangre = isPermisoOrdenTipoSangre;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoSangre() {
		return isVisibilidadCeldaNuevoTipoSangre;
	}

	public void setIsVisibilidadCeldaNuevoTipoSangre(Boolean isVisibilidadCeldaNuevoTipoSangre) {
		this.isVisibilidadCeldaNuevoTipoSangre = isVisibilidadCeldaNuevoTipoSangre;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoSangre() {
		return isVisibilidadCeldaDuplicarTipoSangre;
	}

	public void setIsVisibilidadCeldaDuplicarTipoSangre(Boolean isVisibilidadCeldaDuplicarTipoSangre) {
		this.isVisibilidadCeldaDuplicarTipoSangre = isVisibilidadCeldaDuplicarTipoSangre;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoSangre() {
		return isVisibilidadCeldaCopiarTipoSangre;
	}

	public void setIsVisibilidadCeldaCopiarTipoSangre(Boolean isVisibilidadCeldaCopiarTipoSangre) {
		this.isVisibilidadCeldaCopiarTipoSangre = isVisibilidadCeldaCopiarTipoSangre;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoSangre() {
		return isVisibilidadCeldaVerFormTipoSangre;
	}

	public void setIsVisibilidadCeldaVerFormTipoSangre(Boolean isVisibilidadCeldaVerFormTipoSangre) {
		this.isVisibilidadCeldaVerFormTipoSangre = isVisibilidadCeldaVerFormTipoSangre;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoSangre() {
		return isVisibilidadCeldaOrdenTipoSangre;
	}

	public void setIsVisibilidadCeldaOrdenTipoSangre(Boolean isVisibilidadCeldaOrdenTipoSangre) {
		this.isVisibilidadCeldaOrdenTipoSangre = isVisibilidadCeldaOrdenTipoSangre;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoSangre() {
		return isVisibilidadCeldaNuevoRelacionesTipoSangre;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoSangre(Boolean isVisibilidadCeldaNuevoRelacionesTipoSangre) {
		this.isVisibilidadCeldaNuevoRelacionesTipoSangre = isVisibilidadCeldaNuevoRelacionesTipoSangre;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoSangre() {
		return isVisibilidadCeldaModificarTipoSangre;
	}

	public void setIsVisibilidadCeldaModificarTipoSangre(Boolean isVisibilidadCeldaModificarTipoSangre) {
		this.isVisibilidadCeldaModificarTipoSangre = isVisibilidadCeldaModificarTipoSangre;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoSangre() {
		return isVisibilidadCeldaActualizarTipoSangre;
	}

	public void setIsVisibilidadCeldaActualizarTipoSangre(Boolean isVisibilidadCeldaActualizarTipoSangre) {
		this.isVisibilidadCeldaActualizarTipoSangre = isVisibilidadCeldaActualizarTipoSangre;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoSangre() {
		return isVisibilidadCeldaEliminarTipoSangre;
	}

	public void setIsVisibilidadCeldaEliminarTipoSangre(Boolean isVisibilidadCeldaEliminarTipoSangre) {
		this.isVisibilidadCeldaEliminarTipoSangre = isVisibilidadCeldaEliminarTipoSangre;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoSangre() {
		return isVisibilidadCeldaCancelarTipoSangre;
	}

	public void setIsVisibilidadCeldaCancelarTipoSangre(Boolean isVisibilidadCeldaCancelarTipoSangre) {
		this.isVisibilidadCeldaCancelarTipoSangre = isVisibilidadCeldaCancelarTipoSangre;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoSangre() {
		return isVisibilidadCeldaGuardarTipoSangre;
	}

	public void setIsVisibilidadCeldaGuardarTipoSangre(Boolean isVisibilidadCeldaGuardarTipoSangre) {
		this.isVisibilidadCeldaGuardarTipoSangre = isVisibilidadCeldaGuardarTipoSangre;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoSangre() {
		return isVisibilidadCeldaGuardarCambiosTipoSangre;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoSangre(Boolean isVisibilidadCeldaGuardarCambiosTipoSangre) {
		this.isVisibilidadCeldaGuardarCambiosTipoSangre = isVisibilidadCeldaGuardarCambiosTipoSangre;
	}
		
	public TipoSangreSessionBean gettiposangreSessionBean() {
		return this.tiposangreSessionBean;
	}
	
	public void settiposangreSessionBean(TipoSangreSessionBean tiposangreSessionBean) {
		this.tiposangreSessionBean=tiposangreSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoSangre(TipoSangre tiposangre)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tiposangre,null);
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
	
	public void bugActualizarReferenciaActual(TipoSangre tiposangre,TipoSangre tiposangreAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoSangre(tiposangre);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tiposangreAux.setId(tiposangre.getId());
		tiposangreAux.setVersionRow(tiposangre.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoSangre();
		
			int intSelectedRow = this.jTableDatosTipoSangre.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangre =(TipoSangre) this.tiposangreLogic.getTipoSangres().toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tiposangre =(TipoSangre) this.tiposangres.toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoSangreJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoSangre(this.tiposangre,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoSangre(this.tiposangre);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tiposangreValidator.getInvalidValues(this.tiposangre);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tiposangreLogic.setDatosCliente(datosCliente);
			tiposangreLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tiposangreAux=new  TipoSangre();
				
				tiposangreAux.setIsNew(true);
				tiposangreAux.setIsChanged(true);
				
				tiposangreAux.setTipoSangreOriginal(this.tiposangre);
				
				tiposangreAux.setId(this.tiposangre.getId());	
				tiposangreAux.setVersionRow(this.tiposangre.getVersionRow());	
				tiposangreAux.setid_empresa(this.tiposangre.getid_empresa());	
				tiposangreAux.setcodigo(this.tiposangre.getcodigo());	
				tiposangreAux.setnombre(this.tiposangre.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiposangreSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiposangreSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tiposangreAux,tiposangreLogic.getTipoSangres());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiposangreAux,tiposangres);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tiposangreSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiposangreSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposangreLogic.saveTipoSangres();//WithConnection
						//tiposangreLogic.getSetVersionRowTipoSangres();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiposangre,tiposangreAux);
					
					this.refrescarForeignKeysDescripcionesTipoSangre();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiposangreSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados().addAll(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados.addAll(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tiposangreSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiposangreLogic.saveTipoSangreRelaciones(tiposangreAux,this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());//WithConnection
								//tiposangreLogic.getSetVersionRowTipoSangres();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiposangre,tiposangreAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(new ArrayList<DatoGeneralEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados= new ArrayList<DatoGeneralEmpleado>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tiposangreAux.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiposangreSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiposangreSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiposangreAux,tiposangreLogic.getTipoSangres());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiposangreAux,tiposangres);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiposangre,tiposangreAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tiposangreAux=new  TipoSangre();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tiposangreSessionBean.getEsGuardarRelacionado() 
					|| (this.tiposangreSessionBean.getEsGuardarRelacionado() && this.tiposangre.getId()>=0)) {
						
					tiposangreAux.setIsNew(false);
				}
				
				tiposangreAux.setIsDeleted(false);
			
				tiposangreAux.setId(this.tiposangre.getId());	
				tiposangreAux.setVersionRow(this.tiposangre.getVersionRow());	
				tiposangreAux.setid_empresa(this.tiposangre.getid_empresa());	
				tiposangreAux.setcodigo(this.tiposangre.getcodigo());	
				tiposangreAux.setnombre(this.tiposangre.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiposangreAux,tiposangreLogic.getTipoSangres());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiposangreAux,tiposangres);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tiposangreSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiposangreSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposangreLogic.saveTipoSangres();//WithConnection
						//tiposangreLogic.getSetVersionRowTipoSangres();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiposangre,tiposangreAux);
					
					this.refrescarForeignKeysDescripcionesTipoSangre();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiposangreSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados().addAll(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados.addAll(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tiposangreSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiposangreLogic.saveTipoSangreRelaciones(tiposangreAux,this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());//WithConnection
								//tiposangreLogic.getSetVersionRowTipoSangres();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiposangre,tiposangreAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(new ArrayList<DatoGeneralEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados= new ArrayList<DatoGeneralEmpleado>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tiposangreAux.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiposangreSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiposangreSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiposangreAux,tiposangreLogic.getTipoSangres());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiposangreAux,tiposangres);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiposangre,tiposangreAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tiposangreAux=new  TipoSangre();
				
				tiposangreAux.setIsNew(false);
				tiposangreAux.setIsChanged(false);
				
				tiposangreAux.setIsDeleted(true);
				
				tiposangreAux.setId(this.tiposangre.getId());	
				tiposangreAux.setVersionRow(this.tiposangre.getVersionRow());	
				tiposangreAux.setid_empresa(this.tiposangre.getid_empresa());	
				tiposangreAux.setcodigo(this.tiposangre.getcodigo());	
				tiposangreAux.setnombre(this.tiposangre.getnombre());	
				
				if(this.tiposangreSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tiposangreAux.getId()>=0) {	
						this.tiposangresEliminados.add(tiposangreAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tiposangreAux,tiposangreLogic.getTipoSangres());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiposangreAux,tiposangres);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tiposangreSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiposangreSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposangreLogic.saveTipoSangres();//WithConnection
						//tiposangreLogic.getSetVersionRowTipoSangres();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiposangreSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados().addAll(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados.addAll(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tiposangreSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiposangreLogic.saveTipoSangreRelaciones(tiposangreAux,this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());//WithConnection
								//tiposangreLogic.getSetVersionRowTipoSangres();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(new ArrayList<DatoGeneralEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados= new ArrayList<DatoGeneralEmpleado>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tiposangreAux.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tiposangreSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tiposangreSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tiposangreAux,tiposangreLogic.getTipoSangres());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tiposangreAux,tiposangres);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangreLogic.getTipoSangres().addAll(this.tiposangresEliminados);
					
					tiposangreLogic.saveTipoSangres();//WithConnection
					//tiposangreLogic.getSetVersionRowTipoSangres();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoSangre();
				
				this.tiposangresEliminados= new ArrayList<TipoSangre>();		
			}
			
			if(this.tiposangreSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposangreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Sangre GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Sangre",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tiposangre=tiposangreAux;
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
      		//this.finishProcessTipoSangre();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoSangre tiposangreLocal) throws Exception {
		
		if(this.tiposangreSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tiposangreLocal.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());
			
			} else {
			
				tiposangreLocal.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoSangre tiposangreLocal) throws Exception {	
		if(this.tiposangreSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tiposangreLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoSangreActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoSangre.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiposangre =(TipoSangre) this.tiposangreLogic.getTipoSangres().toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tiposangre =(TipoSangre) this.tiposangres.toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tiposangreValidator.getInvalidValues(this.tiposangre);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoSangre tiposangre,List<TipoSangre> tiposangres) throws Exception {
		try	{		
			TipoSangreConstantesFunciones.actualizarLista(tiposangre,tiposangres,this.tiposangreSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoSangre tiposangre,List<TipoSangre> tiposangres) throws Exception {
		try	{			
			TipoSangreConstantesFunciones.actualizarSelectedLista(tiposangre,tiposangres);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoSangre> tiposangresLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tiposangresLocal=this.tiposangreLogic.getTipoSangres();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tiposangresLocal=this.tiposangres;
			}
			//ARCHITECTURE
		
			for(TipoSangre tiposangreLocal:tiposangresLocal) {
				if(this.permiteMantenimiento(tiposangreLocal) && tiposangreLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoSangreConstantesFunciones.getTipoSangreLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoSangreConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSangre.jLabelid_empresaTipoSangre,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoSangreConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSangre.jLabelcodigoTipoSangre,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoSangreConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSangre.jLabelnombreTipoSangre,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoSangre!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoSangre.jLabelid_empresaTipoSangre,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoSangre.jLabelcodigoTipoSangre,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoSangre.jLabelnombreTipoSangre,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DatoGeneralEmpleado")) {
			if(this.tiposangre==null) {
				this.tiposangre= new TipoSangre();
			}

			if(this.tiposangreSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoSangre
				this.setVariablesFormularioToObjetoActualTipoSangre(this.tiposangre,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoSangre(this.tiposangre);

				this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.getdatogeneralempleado().setTipoSangre(this.tiposangre);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoSangre--;	
		
		
		this.tiposangreAux=new TipoSangre();
		
		this.tiposangreAux.setId(this.iIdNuevoTipoSangre);
		this.tiposangreAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiposangreLogic.getTipoSangres().add(this.tiposangreAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tiposangres.add(this.tiposangreAux);
		}
		//ARCHITECTURE
		
		this.tiposangre=this.tiposangreAux;
		
		if(TipoSangreJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoSangre(this.tiposangre);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoSangre(this.tiposangre);
		}
				
		//this.setDefaultControlesTipoSangre();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoSangre();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoSangre();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoSangre();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoSangre(this.tiposangreBean,this.tiposangre,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoSangre(this.tiposangre);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoSangreConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tiposangreSessionBean.getConGuardarRelaciones()) {
			classes=TipoSangreConstantesFunciones.getClassesRelationshipsOfTipoSangre(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tiposangreReturnGeneral=tiposangreLogic.procesarEventosTipoSangresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiposangreLogic.getTipoSangres(),this.tiposangre,this.tiposangreParameterGeneral,this.isEsNuevoTipoSangre,classes);//this.tiposangreLogic.getTipoSangre()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoSangre(this.tiposangreReturnGeneral,this.tiposangreBean,false);
		
		if(this.tiposangreReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoSangre(this.tiposangreReturnGeneral.getTipoSangre());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoSangre(this.tiposangreReturnGeneral.getTipoSangre());
		}
		
		if(this.tiposangreReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoSangre(this.tiposangreReturnGeneral.getTipoSangre(),classes);//this.tiposangreBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoSangre(this.tiposangre,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoSangre();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoSangre();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoSangreBeanSwingJInternalFrameAdditional.RecargarFormTipoSangre(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoSangre(false);
						
			if(tiposangreSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getEsGuardarRelacionado() && DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDatoGeneralEmpleadoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoSangreJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoSangre();
			}
			
			this.actualizarVisualTableDatosTipoSangre();
			
			this.jTableDatosTipoSangre.setRowSelectionInterval(this.getIndiceNuevoTipoSangre(), this.getIndiceNuevoTipoSangre());
			
			this.seleccionarFilaTablaTipoSangreActual();
						
			this.actualizarEstadoCeldasBotonesTipoSangre("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoSangre(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoSangre.jTextFieldcodigoTipoSangre.setEnabled(isHabilitar && this.tiposangreConstantesFunciones.activarcodigoTipoSangre);
		this.jInternalFrameDetalleFormTipoSangre.jTextAreanombreTipoSangre.setEnabled(isHabilitar && this.tiposangreConstantesFunciones.activarnombreTipoSangre);	
		//
		this.jInternalFrameDetalleFormTipoSangre.jComboBoxid_empresaTipoSangre.setEnabled(isHabilitar && this.tiposangreConstantesFunciones.activarid_empresaTipoSangre);
	};
	
	public void setDefaultControlesTipoSangre() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoSangre(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tiposangreSessionBean.setConGuardarRelaciones(true);			
			this.tiposangreSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoSangre.jTabbedPaneRelacionesTipoSangre.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tiposangreSessionBean.setConGuardarRelaciones(false);			
			this.tiposangreSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoSangre.jTabbedPaneRelacionesTipoSangre.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoSangre() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoSangre tiposangreAux:this.tiposangreLogic.getTipoSangres()) {
				if(tiposangreAux.getId().equals(this.iIdNuevoTipoSangre)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoSangre tiposangreAux:this.tiposangres) {
				if(tiposangreAux.getId().equals(this.iIdNuevoTipoSangre)) {
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
	
	public int getIndiceActualTipoSangre(TipoSangre tiposangre,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoSangre tiposangreAux:this.tiposangreLogic.getTipoSangres()) {
				if(tiposangreAux.getId().equals(tiposangre.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoSangre tiposangreAux:this.tiposangres) {
				if(tiposangreAux.getId().equals(tiposangre.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoSangre(TipoSangre tiposangreOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoSangre tiposangreAux:this.tiposangreLogic.getTipoSangres()) {
				if(tiposangreAux.getTipoSangreOriginal().getId().equals(tiposangreOriginal.getId())) {
					existe=true;
					tiposangreOriginal.setId(tiposangreAux.getId());
					tiposangreOriginal.setVersionRow(tiposangreAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoSangre tiposangreAux:this.tiposangres) {
				if(tiposangreAux.getTipoSangreOriginal().getId().equals(tiposangreOriginal.getId())) {
					existe=true;
					tiposangreOriginal.setId(tiposangreAux.getId());
					tiposangreOriginal.setVersionRow(tiposangreAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoSangre(Boolean esParaCancelar) throws Exception {
		tiposangresAux=new ArrayList<TipoSangre>();
		tiposangreAux=new TipoSangre();
		
		if(!this.tiposangreSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoSangre tiposangreAux:this.tiposangreLogic.getTipoSangres()) {
					if(tiposangreAux.getId()<0) {
						tiposangresAux.add(tiposangreAux);
					}		
				}
				this.iIdNuevoTipoSangre=0L;
				this.tiposangreLogic.getTipoSangres().removeAll(tiposangresAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoSangre tiposangreAux:this.tiposangres) {
					if(tiposangreAux.getId()<0) {
						tiposangresAux.add(tiposangreAux);
					}		
				}
				this.iIdNuevoTipoSangre=0L;
				this.tiposangres.removeAll(tiposangresAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoSangre 
					&& this.tiposangreLogic.getTipoSangres().size()>0
					) {
					tiposangreAux=this.tiposangreLogic.getTipoSangres().get(this.tiposangreLogic.getTipoSangres().size() - 1);
				
					if(tiposangreAux.getId()<0) {
						this.tiposangreLogic.getTipoSangres().remove(tiposangreAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoSangre && this.tiposangres.size()>0) {
					tiposangreAux=this.tiposangres.get(this.tiposangres.size() - 1);
				
					if(tiposangreAux.getId()<0) {
						this.tiposangres.remove(tiposangreAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoSangre(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tiposangre.getId()<0) {
				this.tiposangreLogic.getTipoSangres().remove(this.tiposangre);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tiposangre.getId()<0) {
				this.tiposangres.remove(this.tiposangre);
			}
		}			
	}
	
	public void setEstadosInicialesTipoSangre(List<TipoSangre> tiposangresAux) throws Exception {
		TipoSangreConstantesFunciones.setEstadosInicialesTipoSangre(tiposangresAux);
	}
	
	public void setEstadosInicialesTipoSangre(TipoSangre tiposangreAux) throws Exception {
		TipoSangreConstantesFunciones.setEstadosInicialesTipoSangre(tiposangreAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoSangreActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoSangre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoSangreActual()) {
				if(!this.isEsNuevoTipoSangre) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoSangre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoSangre=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoSangreActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Sangre ?", "MANTENIMIENTO DE Tipo Sangre", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoSangre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoSangre tiposangre) throws Exception {
		TipoSangreConstantesFunciones.seleccionarAsignar(this.tiposangre,tiposangre);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoSangre=this.isPermisoActualizarOriginalTipoSangre;
			
			
			this.seleccionarAsignar(tiposangre);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoSangreConstantesFunciones.quitarEspaciosTipoSangre(this.tiposangre,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoSangre("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tiposangreSessionBean.setsFuncionBusquedaRapida(this.tiposangreSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoSangre) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoSangre(esParaCancelar);				
				this.cancelarNuevoTipoSangre(esParaCancelar);								
			}
			
			this.tiposangre=new TipoSangre();
			
			this.inicializarTipoSangre();
			
			this.actualizarEstadoCeldasBotonesTipoSangre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoSangre() throws Exception {
		try {
			TipoSangreConstantesFunciones.inicializarTipoSangre(this.tiposangre);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tiposangreLogic.getTipoSangres().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoSangres(String sAccionBusqueda,List<TipoSangre> tiposangresParaReportes) throws Exception {
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
					sPathReporteFinal="TipoSangre"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoSangreMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoSangreMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoSangre"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Sangres");		
		parameters.put("busquedapor", TipoSangreConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
					
					TipoSangreLogic tiposangreLogicAuxiliar=new TipoSangreLogic();
					tiposangreLogicAuxiliar.setDatosCliente(tiposangreLogic.getDatosCliente());				
					tiposangreLogicAuxiliar.setTipoSangres(tiposangresParaReportes);
					
					tiposangreLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoSangreWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tiposangresParaReportes=tiposangreLogicAuxiliar.getTipoSangres();
					
					//tiposangreLogic.getNewConnexionToDeep();
					
					//for (TipoSangre tiposangre:tiposangresParaReportes) {
					//	tiposangreLogic.deepLoad(tiposangre, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tiposangreLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tiposangreLogic.closeNewConnexionToDeep();
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoSangre=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoSangreConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoSangreConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoSangre=new JRBeanArrayDataSource(TipoSangreJInternalFrame.TraerTipoSangreBeans(tiposangresParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoSangre);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoSangreConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoSangreConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoSangreBean.TraerTipoSangreBeans(tiposangresParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoSangres(sAccionBusqueda,sTipoArchivoReporte,tiposangresParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoSangres(sAccionBusqueda,sTipoArchivoReporte,tiposangresParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoSangreActionPerformed(null);
					//this.generarExcelReporteTipoSangres(sAccionBusqueda,sTipoArchivoReporte,tiposangresParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoSangres(sAccionBusqueda,sTipoArchivoReporte,tiposangresParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoSangres(sAccionBusqueda,sTipoArchivoReporte,tiposangresParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoSangres(sAccionBusqueda,sTipoArchivoReporte,tiposangresParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoSangres(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoSangre> tiposangresParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposangre";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoSangres");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoSangre("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoSangre tiposangre : tiposangresParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoSangreConstantesFunciones.generarExcelReporteDataTipoSangre("NORMAL",row,workbook,tiposangre,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposangreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Sangre",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoSangre(String sTipo,Row row,Workbook workbook) {
		
		TipoSangreConstantesFunciones.generarExcelReporteHeaderTipoSangre(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoSangres(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoSangre> tiposangresParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposangre_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoSangres");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoSangre tiposangre : tiposangresParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoSangreConstantesFunciones.getTipoSangreDescripcion(tiposangre));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoSangreConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoSangreConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiposangre.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoSangreConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoSangreConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiposangre.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoSangreConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoSangreConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiposangre.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposangreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Sangre",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoSangres(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoSangre> tiposangresParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoSangre> tiposangresRespaldo=null;
		
		classes=TipoSangreConstantesFunciones.getClassesRelationshipsOfTipoSangre(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tiposangreLogic.setDatosCliente(this.datosCliente);
		this.tiposangreLogic.setDatosDeep(this.datosDeep);
		this.tiposangreLogic.setIsConDeep(true);
		
		tiposangresRespaldo=this.tiposangreLogic.getTipoSangres();
		
		this.tiposangreLogic.setTipoSangres(tiposangresParaReportes);	
		this.tiposangreLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tiposangresParaReportes=this.tiposangreLogic.getTipoSangres();
		this.tiposangreLogic.setTipoSangres(tiposangresRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposangre_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoSangres");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoSangre("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoSangre tiposangre : tiposangresParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoSangre("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoSangreConstantesFunciones.generarExcelReporteDataTipoSangre("NORMAL",row,workbook,tiposangre,cellStyleDataAux);
		
			
			


				//DatoGeneralEmpleado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tiposangre.getDatoGeneralEmpleados()!=null && tiposangre.getDatoGeneralEmpleados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DatoGeneralEmpleadoConstantesFunciones.generarExcelReporteHeaderDatoGeneralEmpleado("RELACIONADO",row,workbook);
				}

				if(tiposangre.getDatoGeneralEmpleados()!=null) {
					i2=0;
					for(DatoGeneralEmpleado datogeneralempleado : tiposangre.getDatoGeneralEmpleados()) {
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
		cell.setCellValue(TipoSangreConstantesFunciones.getTipoSangreDescripcion(tiposangre));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposangreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Sangre",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoSangre.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoSangre.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoSangre.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoSangre.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoSangre() throws Exception {		
		this.startProcessTipoSangre(true);
	}
	
	public void startProcessTipoSangre(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoSangre ,this.jPanelParametrosReportesTipoSangre, this.jScrollPanelDatosTipoSangre,this.jPanelPaginacionTipoSangre, this.jScrollPanelDatosEdicionTipoSangre, this.jPanelAccionesTipoSangre,this.jPanelAccionesFormularioTipoSangre,this.jmenuBarTipoSangre,this.jmenuBarDetalleTipoSangre,this.jTtoolBarTipoSangre,this.jTtoolBarDetalleTipoSangre);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoSangre=this.jTabbedPaneBusquedasTipoSangre; 
		
		final JPanel jPanelParametrosReportesTipoSangre=this.jPanelParametrosReportesTipoSangre;
		//final JScrollPane jScrollPanelDatosTipoSangre=this.jScrollPanelDatosTipoSangre;
		final JTable jTableDatosTipoSangre=this.jTableDatosTipoSangre;		
		final JPanel jPanelPaginacionTipoSangre=this.jPanelPaginacionTipoSangre;
		//final JScrollPane jScrollPanelDatosEdicionTipoSangre=this.jScrollPanelDatosEdicionTipoSangre;
		final JPanel jPanelAccionesTipoSangre=this.jPanelAccionesTipoSangre;
		
		JPanel jPanelCamposAuxiliarTipoSangre=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoSangre=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoSangre!=null) {
			jPanelCamposAuxiliarTipoSangre=this.jInternalFrameDetalleFormTipoSangre.jPanelCamposTipoSangre;
			jPanelAccionesFormularioAuxiliarTipoSangre=this.jInternalFrameDetalleFormTipoSangre.jPanelAccionesFormularioTipoSangre;
		}
		
		final JPanel jPanelCamposTipoSangre=jPanelCamposAuxiliarTipoSangre;
		final JPanel jPanelAccionesFormularioTipoSangre=jPanelAccionesFormularioAuxiliarTipoSangre;
		
		
		final JMenuBar jmenuBarTipoSangre=this.jmenuBarTipoSangre;
		final JToolBar jTtoolBarTipoSangre=this.jTtoolBarTipoSangre;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoSangre=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoSangre=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoSangre!=null) {
			jmenuBarDetalleAuxiliarTipoSangre=this.jInternalFrameDetalleFormTipoSangre.jmenuBarDetalleTipoSangre;
			jTtoolBarDetalleAuxiliarTipoSangre=this.jInternalFrameDetalleFormTipoSangre.jTtoolBarDetalleTipoSangre;
		}
		
		final JMenuBar jmenuBarDetalleTipoSangre=jmenuBarDetalleAuxiliarTipoSangre;
		final JToolBar jTtoolBarDetalleTipoSangre=jTtoolBarDetalleAuxiliarTipoSangre;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoSangre;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoSangre;
			processRunnable.jTableDatos=jTableDatosTipoSangre;
			processRunnable.jPanelCampos=jPanelCamposTipoSangre;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoSangre;
			processRunnable.jPanelAcciones=jPanelAccionesTipoSangre;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoSangre;
			
			
			processRunnable.jmenuBar=jmenuBarTipoSangre;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoSangre;
			processRunnable.jTtoolBar=jTtoolBarTipoSangre;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoSangre;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoSangre ,jPanelParametrosReportesTipoSangre,jTableDatosTipoSangre, /*jScrollPanelDatosTipoSangre,*/jPanelCamposTipoSangre,jPanelPaginacionTipoSangre, /*jScrollPanelDatosEdicionTipoSangre,*/ jPanelAccionesTipoSangre,jPanelAccionesFormularioTipoSangre,jmenuBarTipoSangre,jmenuBarDetalleTipoSangre,jTtoolBarTipoSangre,jTtoolBarDetalleTipoSangre);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoSangre ,jPanelParametrosReportesTipoSangre, jScrollPanelDatosTipoSangre,jPanelPaginacionTipoSangre, jScrollPanelDatosEdicionTipoSangre, jPanelAccionesTipoSangre,jPanelAccionesFormularioTipoSangre,jmenuBarTipoSangre,jmenuBarDetalleTipoSangre,jTtoolBarTipoSangre,jTtoolBarDetalleTipoSangre);
						
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
	
	public void finishProcessTipoSangre() {// throws Exception 
		this.finishProcessTipoSangre(true);
	}
	
	public void finishProcessTipoSangre(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoSangre ,this.jPanelParametrosReportesTipoSangre, this.jScrollPanelDatosTipoSangre,this.jPanelPaginacionTipoSangre, this.jScrollPanelDatosEdicionTipoSangre, this.jPanelAccionesTipoSangre,this.jPanelAccionesFormularioTipoSangre,this.jmenuBarTipoSangre,this.jmenuBarDetalleTipoSangre,this.jTtoolBarTipoSangre,this.jTtoolBarDetalleTipoSangre);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoSangre=this.jTabbedPaneBusquedasTipoSangre; 
		
		final JPanel jPanelParametrosReportesTipoSangre=this.jPanelParametrosReportesTipoSangre;
		//final JScrollPane jScrollPanelDatosTipoSangre=this.jScrollPanelDatosTipoSangre;
		final JTable jTableDatosTipoSangre=this.jTableDatosTipoSangre;		
		final JPanel jPanelPaginacionTipoSangre=this.jPanelPaginacionTipoSangre;
		//final JScrollPane jScrollPanelDatosEdicionTipoSangre=this.jScrollPanelDatosEdicionTipoSangre;
		final JPanel jPanelAccionesTipoSangre=this.jPanelAccionesTipoSangre;
		
		JPanel jPanelCamposAuxiliarTipoSangre=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoSangre=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoSangre!=null) {
			jPanelCamposAuxiliarTipoSangre=this.jInternalFrameDetalleFormTipoSangre.jPanelCamposTipoSangre;
			jPanelAccionesFormularioAuxiliarTipoSangre=this.jInternalFrameDetalleFormTipoSangre.jPanelAccionesFormularioTipoSangre;
		}
		
		final JPanel jPanelCamposTipoSangre=jPanelCamposAuxiliarTipoSangre;
		final JPanel jPanelAccionesFormularioTipoSangre=jPanelAccionesFormularioAuxiliarTipoSangre;
		
		
		final JMenuBar jmenuBarTipoSangre=this.jmenuBarTipoSangre;		
		final JToolBar jTtoolBarTipoSangre=this.jTtoolBarTipoSangre;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoSangre=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoSangre=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoSangre!=null) {
			jmenuBarDetalleAuxiliarTipoSangre=this.jInternalFrameDetalleFormTipoSangre.jmenuBarDetalleTipoSangre;
			jTtoolBarDetalleAuxiliarTipoSangre=this.jInternalFrameDetalleFormTipoSangre.jTtoolBarDetalleTipoSangre;		
		}
		
		final JMenuBar jmenuBarDetalleTipoSangre=jmenuBarDetalleAuxiliarTipoSangre;
		final JToolBar jTtoolBarDetalleTipoSangre=jTtoolBarDetalleAuxiliarTipoSangre;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoSangre;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoSangre;
			processRunnable.jTableDatos=jTableDatosTipoSangre;
			processRunnable.jPanelCampos=jPanelCamposTipoSangre;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoSangre;
			processRunnable.jPanelAcciones=jPanelAccionesTipoSangre;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoSangre;
			
			
			processRunnable.jmenuBar=jmenuBarTipoSangre;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoSangre;
			processRunnable.jTtoolBar=jTtoolBarTipoSangre;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoSangre;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoSangre ,jPanelParametrosReportesTipoSangre, jTableDatosTipoSangre,/*jScrollPanelDatosTipoSangre,*/jPanelCamposTipoSangre,jPanelPaginacionTipoSangre, /*jScrollPanelDatosEdicionTipoSangre,*/ jPanelAccionesTipoSangre,jPanelAccionesFormularioTipoSangre,jmenuBarTipoSangre,jmenuBarDetalleTipoSangre,jTtoolBarTipoSangre,jTtoolBarDetalleTipoSangre));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoSangre(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoSangre(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoSangre(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoSangre(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoSangre,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoSangre,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoSangre(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoSangre,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoSangre,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tiposangreConstantesFunciones.getsFinalQueryTipoSangre();
		String  finalQueryPaginacionTodos=this.tiposangreConstantesFunciones.getsFinalQueryTipoSangre();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoSangreConstantesFunciones.getArrayColumnasGlobalesNoTipoSangre(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoSangreConstantesFunciones.getArrayColumnasGlobalesTipoSangre(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoSangreConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tiposangresEliminados= new ArrayList<TipoSangre>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoSangre();
		
				///*TipoSangreSessionBean*/this.tiposangreSessionBean=new TipoSangreSessionBean();
			
			if(this.tiposangreSessionBean==null) {
				this.tiposangreSessionBean=new TipoSangreSessionBean();
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
					this.iNumeroPaginacion=TipoSangreConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoSangreConstantesFunciones.getClassesForeignKeysOfTipoSangre(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tiposangre."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tiposangresAux= new ArrayList<TipoSangre>();
			
				
			tiposangreLogic.setDatosCliente(this.datosCliente);
			tiposangreLogic.setDatosDeep(this.datosDeep);
			tiposangreLogic.setIsConDeep(true);
			
			
			tiposangreLogic.getTipoSangreDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tiposangreLogic.getTodosTipoSangres(finalQueryGlobal,pagination);
					
					//tiposangreLogic.getTodosTipoSangresWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tiposangreLogic.getTipoSangres()==null|| tiposangreLogic.getTipoSangres().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiposangresAux= new ArrayList<TipoSangre>();
							tiposangresAux.addAll(tiposangreLogic.getTipoSangres());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposangresAux= new ArrayList<TipoSangre>();
							tiposangresAux.addAll(tiposangres);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiposangreLogic.getTodosTipoSangres(finalQueryGlobal+"",this.pagination);												
							
							//tiposangreLogic.getTodosTipoSangresWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoSangres("Todos",tiposangreLogic.getTipoSangres() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiposangreLogic.setTipoSangres(new ArrayList<TipoSangre>());					
							tiposangreLogic.getTipoSangres().addAll(tiposangresAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposangres=new ArrayList<TipoSangre>();
							tiposangres.addAll(tiposangresAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoSangre=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoSangre=this.idActual;
				
				} else if(this.idTipoSangreActual!=null && this.idTipoSangreActual!=0L) {
					idTipoSangre=idTipoSangreActual;
				}
				
					
				this.sDetalleReporte=TipoSangreConstantesFunciones.getDetalleIndicePorId(idTipoSangre);
				
				this.tiposangres=new ArrayList<TipoSangre>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tiposangreLogic.getEntity(idTipoSangre);
					
					//tiposangreLogic.getEntityWithConnection(idTipoSangre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiposangreLogic.setTipoSangres(new ArrayList<TipoSangre>());
					tiposangreLogic.getTipoSangres().add(tiposangreLogic.getTipoSangre());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiposangres=new ArrayList<TipoSangre>();
					this.tiposangres.add(tiposangre);
				}
				
				if(tiposangreLogic.getTipoSangre()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoSangreConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiposangreLogic.getTipoSangresFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoSangreConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoSangreConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiposangreLogic.getTipoSangres()==null||tiposangreLogic.getTipoSangres().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiposangres==null|| tiposangres.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposangresAux=new ArrayList<TipoSangre>();
						tiposangresAux.addAll(tiposangreLogic.getTipoSangres());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposangresAux=new ArrayList<TipoSangre>();
							tiposangresAux.addAll(tiposangres);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiposangreLogic.getTipoSangresFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoSangreConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoSangreConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoSangres("FK_IdEmpresa",tiposangreLogic.getTipoSangres());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoSangres("FK_IdEmpresa",tiposangres);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposangreLogic.setTipoSangres(new ArrayList<TipoSangre>());
						tiposangreLogic.getTipoSangres().addAll(tiposangresAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposangres=new ArrayList<TipoSangre>();
							tiposangres.addAll(tiposangresAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoSangre();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoSangre();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiposangreLogic.getTipoSangres().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiposangres.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiposangreLogic.getTipoSangres().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiposangres.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoSangre tiposangre) {
		Boolean permite=true;
		
		if(this.tiposangre.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoSangreConstantesFunciones.getOrderByListaTipoSangre();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoSangreConstantesFunciones.getOrderByListaTipoSangre();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoSangre tiposangre:tiposangreLogic.getTipoSangres()) {
				if(tiposangre.getsType().equals(Constantes2.S_TOTALES)) {
					tiposangreTotales=tiposangre;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoSangre tiposangre:this.tiposangres) {
				if(tiposangre.getsType().equals(Constantes2.S_TOTALES)) {
					tiposangreTotales=tiposangre;
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
			this.tiposangreAux=new TipoSangre();
			this.tiposangreAux.setsType(Constantes2.S_TOTALES);
			this.tiposangreAux.setIsNew(false);
			this.tiposangreAux.setIsChanged(false);
			this.tiposangreAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoSangreConstantesFunciones.TotalizarValoresFilaTipoSangre(this.tiposangreLogic.getTipoSangres(),this.tiposangreAux);
				
				this.tiposangreLogic.getTipoSangres().add(this.tiposangreAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoSangreConstantesFunciones.TotalizarValoresFilaTipoSangre(this.tiposangres,this.tiposangreAux);
				
				this.tiposangres.add(this.tiposangreAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tiposangreTotales=new TipoSangre();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiposangreLogic.getTipoSangres().remove(tiposangreTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiposangres.remove(tiposangreTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tiposangreTotales=new TipoSangre();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoSangre tiposangre:tiposangreLogic.getTipoSangres()) {
				if(tiposangre.getsType().equals(Constantes2.S_TOTALES)) {
					tiposangreTotales=tiposangre;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoSangreConstantesFunciones.TotalizarValoresFilaTipoSangre(this.tiposangreLogic.getTipoSangres(),tiposangreTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoSangre tiposangre:this.tiposangres) {
				if(tiposangre.getsType().equals(Constantes2.S_TOTALES)) {
					tiposangreTotales=tiposangre;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoSangreConstantesFunciones.TotalizarValoresFilaTipoSangre(this.tiposangres,tiposangreTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoSangresFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoSangresFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiposangreLogic.getTipoSangresFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoSangre() {
		this.isPermisoTodoTipoSangre=false;
		this.isPermisoNuevoTipoSangre=false;
		this.isPermisoActualizarTipoSangre=false;
		this.isPermisoActualizarOriginalTipoSangre=false;
		this.isPermisoEliminarTipoSangre=false;
		this.isPermisoGuardarCambiosTipoSangre=false;
		this.isPermisoConsultaTipoSangre=false;
		this.isPermisoBusquedaTipoSangre=false;
		this.isPermisoReporteTipoSangre=false;		
		this.isPermisoOrdenTipoSangre=false;		
		this.isPermisoPaginacionMedioTipoSangre=false;		
		this.isPermisoPaginacionAltoTipoSangre=false;
		this.isPermisoPaginacionTodoTipoSangre=false;
		this.isPermisoCopiarTipoSangre=false;		
		this.isPermisoVerFormTipoSangre=false;		
		this.isPermisoDuplicarTipoSangre=false;		
		this.isPermisoOrdenTipoSangre=false;		
	}
	
	public void setPermisosUsuarioTipoSangre(Boolean isPermiso) {
		this.isPermisoTodoTipoSangre=isPermiso;
		this.isPermisoNuevoTipoSangre=isPermiso;
		this.isPermisoActualizarTipoSangre=isPermiso;
		this.isPermisoActualizarOriginalTipoSangre=isPermiso;
		this.isPermisoEliminarTipoSangre=isPermiso;
		this.isPermisoGuardarCambiosTipoSangre=isPermiso;
		this.isPermisoConsultaTipoSangre=isPermiso;
		this.isPermisoBusquedaTipoSangre=isPermiso;
		this.isPermisoReporteTipoSangre=isPermiso;
		this.isPermisoOrdenTipoSangre=isPermiso;		
		this.isPermisoPaginacionMedioTipoSangre=isPermiso;		
		this.isPermisoPaginacionAltoTipoSangre=isPermiso;		
		this.isPermisoPaginacionTodoTipoSangre=isPermiso;		
		this.isPermisoCopiarTipoSangre=isPermiso;		
		this.isPermisoVerFormTipoSangre=isPermiso;		
		this.isPermisoDuplicarTipoSangre=isPermiso;
		this.isPermisoOrdenTipoSangre=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoSangre(Boolean isPermiso) {
		//this.isPermisoTodoTipoSangre=isPermiso;
		this.isPermisoNuevoTipoSangre=isPermiso;
		this.isPermisoActualizarTipoSangre=isPermiso;
		this.isPermisoActualizarOriginalTipoSangre=isPermiso;
		this.isPermisoEliminarTipoSangre=isPermiso;
		this.isPermisoGuardarCambiosTipoSangre=isPermiso;
		//this.isPermisoConsultaTipoSangre=isPermiso;
		//this.isPermisoBusquedaTipoSangre=isPermiso;
		//this.isPermisoReporteTipoSangre=isPermiso;
		//this.isPermisoOrdenTipoSangre=isPermiso;		
		//this.isPermisoPaginacionMedioTipoSangre=isPermiso;		
		//this.isPermisoPaginacionAltoTipoSangre=isPermiso;		
		//this.isPermisoPaginacionTodoTipoSangre=isPermiso;		
		//this.isPermisoCopiarTipoSangre=isPermiso;		
		//this.isPermisoDuplicarTipoSangre=isPermiso;
		//this.isPermisoOrdenTipoSangre=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoSangreClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DatoGeneralEmpleadoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoSangreJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosDatoGeneralEmpleado=this.verificarGetPermisosUsuarioOpcionTipoSangreClaseRelacionada(this.opcionsRelacionadas,DatoGeneralEmpleadoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoSangre(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoSangreClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDatoGeneralEmpleado=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoSangreClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoSangreClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoSangreClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDatoGeneralEmpleado && this.jInternalFrameDetalleFormTipoSangre!=null && this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoSangre.jTabbedPaneRelacionesTipoSangre.remove(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoSangre() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoSangreJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tiposangreSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoSangreConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoSangre=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoSangre=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoSangre=this.isPermisoActualizarTipoSangre;
			this.isPermisoEliminarTipoSangre=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoSangre=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoSangre=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoSangre=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoSangre=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoSangre=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoSangre=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoSangre=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoSangre=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoSangre=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoSangre=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoSangre=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoSangre=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoSangre=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tiposangreSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoSangre.setToolTipText(this.jTableDatosTipoSangre.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoSangre(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoSangre(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoSangreJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoSangreJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoSangre() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDatoGeneralEmpleado && this.tiposangreConstantesFunciones.mostrarDatoGeneralEmpleadoTipoSangre && !TipoSangreConstantesFunciones.ISGUARDARREL) {

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
	public void inicializarCombosForeignKeyTipoSangreListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoSangreListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoSangreJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoSangreListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoSangreListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoSangreParameterReturnGeneral tiposangreReturnGeneral=new TipoSangreParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tiposangreConstantesFunciones.cargarid_empresaTipoSangre)
					 || (this.esRecargarFks && this.tiposangreConstantesFunciones.cargarid_empresaTipoSangre)) {

					if(!this.tiposangreSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tiposangreSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tiposangreReturnGeneral=tiposangreLogic.cargarCombosLoteForeignKeyTipoSangre(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tiposangreReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoSangre()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tiposangreSessionBean==null) {
				this.tiposangreSessionBean=new TipoSangreSessionBean();
			}

			if(!this.tiposangreSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoSangre()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoSangre(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoSangre()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoSangre();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoSangre(TipoSangre tiposangre)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoSangre(TipoSangre tiposangre,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoSangre()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoSangre()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoSangre()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoSangre()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoSangre()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoSangre()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoSangre(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoSangre()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoSangre.jComboBoxid_empresaTipoSangre!=null && this.jInternalFrameDetalleFormTipoSangre.jComboBoxid_empresaTipoSangre.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoSangre.jComboBoxid_empresaTipoSangre.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoSangreBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoSangreBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoSangreBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tiposangreSessionBean=new TipoSangreSessionBean(); 
		this.tiposangreConstantesFunciones=new TipoSangreConstantesFunciones(); 
		this.tiposangreBean=new TipoSangre();//(this.tiposangreConstantesFunciones); 		
		this.tiposangreReturnGeneral=new TipoSangreParameterReturnGeneral(); 
		
		this.tiposangreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiposangreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoSangreBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoSangreBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoSangreBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoSangre(true);
			
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
			
			this.tiposangreConstantesFunciones=new TipoSangreConstantesFunciones(); 
			this.tiposangreBean=new TipoSangre();//this.tiposangreConstantesFunciones); 			
			this.tiposangreReturnGeneral=new TipoSangreParameterReturnGeneral(); 
		
			TipoSangreBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Sangre Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tiposangre=new TipoSangre();
			this.tiposangres = new ArrayList<TipoSangre>();
			this.tiposangresAux = new ArrayList<TipoSangre>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic=new TipoSangreLogic();
				this.tiposangreLogic.getNewConnexionToDeep("");
			}
			
			//this.tiposangreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tiposangreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoSangre);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoSangre!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoSangre);	
					}
					
					if(this.jInternalFrameImportacionTipoSangre!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoSangre);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoSangre!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoSangre);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoSangre!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoSangre);
				this.jInternalFrameDetalleFormTipoSangre.setVisible(false);
				this.jInternalFrameDetalleFormTipoSangre.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoSangre!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoSangre);
					this.jInternalFrameReporteDinamicoTipoSangre.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoSangre.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoSangre!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoSangre);
					this.jInternalFrameImportacionTipoSangre.setVisible(false);
					this.jInternalFrameImportacionTipoSangre.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoSangre!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoSangre);
					this.jInternalFrameOrderByTipoSangre.setVisible(false);
					this.jInternalFrameOrderByTipoSangre.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoSangreActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoSangreConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tiposangreReturnGeneral=new TipoSangreParameterReturnGeneral();
			
			this.tiposangreParameterGeneral=new TipoSangreParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tiposangreLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tiposangreSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoSangreJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tiposangreSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DatoGeneralEmpleadoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoSangreConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiposangreSessionBean.getEsGuardarRelacionado(),this.tiposangreSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoSangreConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiposangreSessionBean.getEsGuardarRelacionado(),this.tiposangreSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoSangre=false;
			this.isVisibilidadCeldaDuplicarTipoSangre=true;
			this.isVisibilidadCeldaCopiarTipoSangre=true;
			this.isVisibilidadCeldaVerFormTipoSangre=true;
			this.isVisibilidadCeldaOrdenTipoSangre=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoSangre=false;
			this.isVisibilidadCeldaModificarTipoSangre=false;
			this.isVisibilidadCeldaActualizarTipoSangre=false;
			this.isVisibilidadCeldaEliminarTipoSangre=false;
			this.isVisibilidadCeldaCancelarTipoSangre=false;
			this.isVisibilidadCeldaGuardarTipoSangre=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSangre=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoSangre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoSangre();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoSangre(false);
			
			this.setPermisosUsuarioTipoSangre();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiposangreSessionBean.getEsGuardarRelacionado() 
				|| (this.tiposangreSessionBean.getEsGuardarRelacionado() && this.tiposangreSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoSangreClasesRelacionadas();
			}
			
			if(this.tiposangreSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoSangreClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoSangreJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoSangre();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoSangre();
			}
			
			if(!this.isPermisoBusquedaTipoSangre) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoSangre.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiposangreSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoSangre,this.isPermisoPaginacionMedioTipoSangre,this.isPermisoPaginacionTodoTipoSangre);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoSangreConstantesFunciones.getTiposSeleccionarTipoSangre());
				
				this.tiposColumnasSelect=TipoSangreConstantesFunciones.getTiposSeleccionarTipoSangre(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoSangre();				
				//this.tiposRelacionesSelect=TipoSangreConstantesFunciones.getTiposRelacionesTipoSangre(true);
				
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
			//if(!this.tiposangreSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoSangre();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoSangre(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoSangre(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoSangre() ;
			
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
				tiposangreImplementable= (TipoSangreImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoSangreConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tiposangreImplementableHome= (TipoSangreImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoSangreConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tiposangres= new ArrayList<TipoSangre>();
			this.tiposangresEliminados= new ArrayList<TipoSangre>();
						
			this.isEsNuevoTipoSangre=false;
			this.esParaAccionDesdeFormularioTipoSangre=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoSangre(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoSangre();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiposangreSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoSangreBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoSangreConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoSangre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoSangre(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoSangre!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoSangre();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoSangre();
			}
			
			TipoSangreBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoSangre.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoSangre.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoSangre.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoSangre(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoSangre: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoSangre() {
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
			if(sTipo.equals("RelacionesTipoSangre")) {
				iIndex=this.jInternalFrameDetalleFormTipoSangre.jTabbedPaneRelacionesTipoSangre.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoSangre.jTabbedPaneRelacionesTipoSangre.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoSangre.getSelectedRow();	
				
				

				if(sTitle.equals("Dato General Empleados")) {
					if(!DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoSangre();

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
				this.finishProcessTipoSangre();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDatoGeneralEmpleado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoSangre.cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(false,true,iIndex);
		this.jButtonDatoGeneralEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDatoGeneralEmpleado();

		//this.jTabbedPaneRelacionesTipoSangre.updateUI();
		//this.jTabbedPaneRelacionesTipoSangre.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoSangre.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DatoGeneralEmpleado")) {
				int row=this.jTableDatosTipoSangre.getSelectedRow();
				jButtonDatoGeneralEmpleadoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tiposangreSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Dato General Empleado")) {

					if(this.isTienePermisosDatoGeneralEmpleado && this.tiposangreConstantesFunciones.mostrarDatoGeneralEmpleadoTipoSangre && !TipoSangreConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Dato General Empleados"+"("+DatoGeneralEmpleadoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Dato General Empleados");

						if(tiposangreConstantesFunciones.resaltarDatoGeneralEmpleadoTipoSangre!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tiposangreConstantesFunciones.resaltarDatoGeneralEmpleadoTipoSangre);
						}

						jmenuItem.setEnabled(this.tiposangreConstantesFunciones.activarDatoGeneralEmpleadoTipoSangre);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DatoGeneralEmpleado"));

						

						this.jInternalFrameDetalleFormTipoSangre.jmenuDetalleTipoSangre.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoSangre(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoSangre(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoSangre(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoSangreListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoSangre();
		
		this.cargarCombosFrameForeignKeyTipoSangre();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoSangre();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoSangre();
		}
	}
	
	
	
	public void jButtonNuevoTipoSangreActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tiposangreSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoSangre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
			
			
			if(jTableDatosTipoSangre.getRowCount()>=1) {
				jTableDatosTipoSangre.removeRowSelectionInterval(0, jTableDatosTipoSangre.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoSangre=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoSangre(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoSangre(true);			
			//this.tiposangre=new TipoSangre();
			//this.tiposangre.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoSangre(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoSangre() ;
			
			if(TipoSangreJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoSangre(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tiposangre);	
			this.actualizarInformacion("INFO_PADRE",false,this.tiposangre);				
			
			TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
			
			if(this.tiposangreSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoSangre: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoSangreActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoSangre> tiposangresSeleccionados=new ArrayList<TipoSangre>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoSangre.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoSangre.getSelectedRows().length;			
			}
			
			tiposangresSeleccionados=this.getTipoSangresSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoSangre--;			
				//TipoSangre tiposangreAux= new TipoSangre();			
				//tiposangreAux.setId(this.iIdNuevoTipoSangre);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoSangre tiposangreOrigen=new TipoSangre();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoSangre tiposangreOrigen : tiposangresSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoSangre.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tiposangreOrigen =(TipoSangre) this.tiposangreLogic.getTipoSangres().toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposangreOrigen =(TipoSangre) this.tiposangres.toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoSangre();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tiposangre.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoSangre(tiposangreOrigen,this.tiposangre,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSangre(this.tiposangre);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiposangreLogic.getTipoSangres().add(this.tiposangreAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiposangres.add(this.tiposangreAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoSangre(false);
				
				this.jTableDatosTipoSangre.setRowSelectionInterval(this.getIndiceNuevoTipoSangre(), this.getIndiceNuevoTipoSangre());
				
				int iLastRow =  this.jTableDatosTipoSangre.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoSangre.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoSangre.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoSangre(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoSangreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoSangre> tiposangresSeleccionados=new ArrayList<TipoSangre>();									
		
			TipoSangre tiposangreOrigen=new TipoSangre();
			TipoSangre tiposangreDestino=new TipoSangre();
				
			tiposangresSeleccionados=this.getTipoSangresSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoSangre.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tiposangresSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoSangre.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposangreOrigen =(TipoSangre) this.tiposangreLogic.getTipoSangres().toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiposangreOrigen =(TipoSangre) this.tiposangres.toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposangreDestino =(TipoSangre) this.tiposangreLogic.getTipoSangres().toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiposangreDestino =(TipoSangre) this.tiposangres.toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tiposangreOrigen =tiposangresSeleccionados.get(0);
				tiposangreDestino =tiposangresSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoSangre(tiposangreOrigen,tiposangreDestino,true,false);
				
				tiposangreDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiposangreDestino,tiposangreLogic.getTipoSangres());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiposangreDestino,tiposangres);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoSangre(false);
				
				//this.jTableDatosTipoSangre.setRowSelectionInterval(this.getIndiceNuevoTipoSangre(), this.getIndiceNuevoTipoSangre());
				
				int iLastRow =  this.jTableDatosTipoSangre.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoSangre.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoSangre.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoSangre(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoSangreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoSangre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoSangre.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoSangreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoSangre.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoSangre.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoSangre.setVisible(!isVisible);
			this.jPanelPaginacionTipoSangre.setVisible(!isVisible);
			this.jPanelAccionesTipoSangre.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoSangreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoSangre();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoSangreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoSangre();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoSangreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoSangre();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoSangreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoSangre();
			
			this.abrirFrameOrderByTipoSangre();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoSangreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoSangre();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoSangre(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoSangre);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoSangre.isMaximum()) {
					this.jInternalFrameDetalleFormTipoSangre.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoSangre.setSize(this.jInternalFrameDetalleFormTipoSangre.iWidthFormulario,this.jInternalFrameDetalleFormTipoSangre.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoSangre.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoSangre.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoSangre.isMaximum()) {
						this.jInternalFrameDetalleFormTipoSangre.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoSangre.jContentPaneDetalleTipoSangre.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoSangre.jTabbedPaneRelacionesTipoSangre.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoSangre.jContentPaneDetalleTipoSangre.getWidth(),TipoSangreConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoSangre.jTabbedPaneRelacionesTipoSangre.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoSangre.jContentPaneDetalleTipoSangre.getWidth(),TipoSangreConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoSangre.jTabbedPaneRelacionesTipoSangre.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoSangre.jContentPaneDetalleTipoSangre.getWidth(),TipoSangreConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDatoGeneralEmpleado();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoSangre.setVisible(true);
	        this.jInternalFrameDetalleFormTipoSangre.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoSangre() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoSangre==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoSangre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoSangre,false,this);
				} else {
					this.jInternalFrameOrderByTipoSangre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoSangre,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoSangre);
				this.jInternalFrameOrderByTipoSangre.setVisible(false);
				this.jInternalFrameOrderByTipoSangre.setSelected(false);
				
				this.jInternalFrameOrderByTipoSangre.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoSangre"));
				
				this.inicializarActualizarBindingTablaOrderByTipoSangre();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoSangre() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoSangre==null) {
				
				this.jInternalFrameImportacionTipoSangre=new ImportacionJInternalFrame(TipoSangreConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoSangre);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoSangre);
				this.jInternalFrameImportacionTipoSangre.setVisible(false);
				this.jInternalFrameImportacionTipoSangre.setSelected(false);


				this.jInternalFrameImportacionTipoSangre.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoSangre"));
				this.jInternalFrameImportacionTipoSangre.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoSangre"));
				this.jInternalFrameImportacionTipoSangre.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoSangre"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoSangre() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoSangre==null) {
				this.jInternalFrameReporteDinamicoTipoSangre=new ReporteDinamicoJInternalFrame(TipoSangreConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoSangre);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoSangre);
				this.jInternalFrameReporteDinamicoTipoSangre.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoSangre.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoSangre.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoSangre"));
				this.jInternalFrameReporteDinamicoTipoSangre.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoSangre"));
				this.jInternalFrameReporteDinamicoTipoSangre.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoSangre"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoSangre();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDatoGeneralEmpleado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoSangre.jContentPaneDetalleTipoSangre.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoSangre() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoSangre);
			
	       	this.jInternalFrameDetalleFormTipoSangre.setVisible(false);
	        this.jInternalFrameDetalleFormTipoSangre.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoSangre.dispose();
			//this.jInternalFrameDetalleFormTipoSangre=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoSangre() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoSangre.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoSangre.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoSangre() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoSangre.setVisible(true);
	        this.jInternalFrameImportacionTipoSangre.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoSangre() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoSangre.setVisible(true);
	        this.jInternalFrameOrderByTipoSangre.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoSangre() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoSangre.setVisible(false);
	        this.jInternalFrameOrderByTipoSangre.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoSangre() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoSangre.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoSangre.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoSangre() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoSangre.setVisible(false);
	        this.jInternalFrameImportacionTipoSangre.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoSangreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoSangre(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoSangre(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoSangre.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoSangre(true);
			//this.isEsNuevoTipoSangre=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangre =(TipoSangre) this.tiposangreLogic.getTipoSangres().toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiposangre =(TipoSangre) this.tiposangres.toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoSangre("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoSangre(false) ;
			
			if(tiposangreSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getEsGuardarRelacionado() && DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDatoGeneralEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoSangreJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoSangre(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoSangre(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoSangreActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoSangre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangre =(TipoSangre) this.tiposangreLogic.getTipoSangres().toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposangre =(TipoSangre) this.tiposangres.toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoSangre(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoSangre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoSangre.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoSangre(true);
			//this.isEsNuevoTipoSangre=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangre =(TipoSangre) this.tiposangreLogic.getTipoSangres().toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiposangre =(TipoSangre) this.tiposangres.toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tiposangre.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoSangre("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoSangre(false) ;
			
			if(TipoSangreJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoSangre(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoSangre(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoSangreActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoSangre(false);
			
			//if(!this.isEsNuevoTipoSangre) {								
				int intSelectedRow = this.jTableDatosTipoSangre.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangre =(TipoSangre) this.tiposangreLogic.getTipoSangres().toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiposangre =(TipoSangre) this.tiposangres.toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoSangreJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoSangre(this.tiposangre,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoSangre(this.tiposangre);
				
			}
			
			if(this.permiteMantenimiento(this.tiposangre)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiposangreSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoSangre=true;
					this.inicializarActualizarBindingTablaTipoSangre(false);
					this.isEsNuevoTipoSangre=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoSangre=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoSangre=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoSangre(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoSangre(false);
				
				this.habilitarDeshabilitarControlesTipoSangre(false);
			
												
				
				if(TipoSangreJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoSangre();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoSangreActionPerformed(evt,tiposangreSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoSangre(this.tiposangre,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoSangre.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tiposangreSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tiposangre.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoSangre.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSangre.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoSangreActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoSangre.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangre =(TipoSangre) this.tiposangreLogic.getTipoSangres().toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
				this.tiposangre.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiposangre =(TipoSangre) this.tiposangres.toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
				this.tiposangre.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tiposangre)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiposangreSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoSangreModel) this.jTableDatosTipoSangre.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoSangre=true;
				this.inicializarActualizarBindingTablaTipoSangre(false);
				this.isEsNuevoTipoSangre=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoSangre(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoSangre(false);
				
				this.habilitarDeshabilitarControlesTipoSangre(false);
				
				
				
				if(TipoSangreJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoSangre();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoSangreActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoSangre.getRowCount()>=1) {
				jTableDatosTipoSangre.removeRowSelectionInterval(0, jTableDatosTipoSangre.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoSangre(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoSangre(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoSangre(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoSangre(false) ;
			
			this.isEsNuevoTipoSangre=false;
			
			if(TipoSangreJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoSangre();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoSangreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoSangre(false);
				
				//SI ES MANUAL
				if(TipoSangreJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoSangre();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoSangreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoSangre--;			
			//TipoSangre tiposangreAux= new TipoSangre();			
			//tiposangreAux.setId(this.iIdNuevoTipoSangre);
			
			if(this.jInternalFrameDetalleFormTipoSangre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoSangre();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoSangre(this.tiposangre);
			
			this.tiposangre.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tiposangreLogic.getTipoSangres().add(this.tiposangreAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tiposangres.add(this.tiposangreAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoSangre(false);
			
			this.jTableDatosTipoSangre.setRowSelectionInterval(this.getIndiceNuevoTipoSangre(), this.getIndiceNuevoTipoSangre());
			
			int iLastRow =  this.jTableDatosTipoSangre.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoSangre.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoSangre.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoSangre(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoSangreActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoSangre(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoSangre(false);
			
			//SI ES MANUAL
			if(TipoSangreJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoSangre();
			}
			
			//this.abrirFrameTreeTipoSangre();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoSangreActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo SangreS ?", "MANTENIMIENTO DE Tipo Sangre", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoSangre.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoSangre();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tiposangreReturnGeneral=tiposangreLogic.procesarImportacionTipoSangresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tiposangreParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoSangreReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoSangreActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoSangre.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoSangre.setFileImportacion(this.jInternalFrameImportacionTipoSangre.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoSangre.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoSangre.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoSangre.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoSangre.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoSangreActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoSangre> tiposangresSeleccionados=new ArrayList<TipoSangre>();		

		tiposangresSeleccionados=this.getTipoSangresSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoSangre.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoSangre.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoSangreBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoSangreBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoSangres("Todos",tiposangresSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposangreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Sangre",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoSangre.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoSangre.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoSangreConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoSangreConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoSangreConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoSangre.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoSangre.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoSangre.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoSangreConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoSangreConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoSangreConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoSangre.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoSangreConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoSangreConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoSangreConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoSangre.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoSangre.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoSangreConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoSangreConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoSangreConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoSangreActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoSangre> tiposangresSeleccionados=new ArrayList<TipoSangre>();		
		
		tiposangresSeleccionados=this.getTipoSangresSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposangre";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoSangres");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoSangre.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoSangre.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoSangreConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoSangreConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoSangre tiposangre:tiposangresSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiposangre.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoSangreConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoSangreConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoSangre tiposangre:tiposangresSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiposangre.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoSangreConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoSangreConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoSangre tiposangre:tiposangresSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiposangre.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoSangre(row);				
			//	iRow++;
			//}				
			
			//for(TipoSangre tiposangreAux:tiposangresSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoSangre(tiposangreAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposangreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Sangre",JOptionPane.INFORMATION_MESSAGE);
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
				this.tiposangreLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoSangre(false);
			
			//SI ES MANUAL
			if(TipoSangreJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoSangre();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoSangreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoSangre(false);
			
			//SI ES MANUAL
			if(TipoSangreJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoSangre();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoSangreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoSangre(false);
			
			//SI ES MANUAL
			if(TipoSangreJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoSangre();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoSangre() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoSangre.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoSangre.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoSangre.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoSangre.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoSangre.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoSangre.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoSangre.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoSangre(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoSangre(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoSangre(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoSangre(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoSangre(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiposangreSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoSangre(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoSangre(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoSangre(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoSangreJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoSangreJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoSangre() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoSangre();
		
		this.inicializarActualizarBindingBotonesManualTipoSangre(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiposangreSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoSangre();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoSangre() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoSangre(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoSangre(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoSangre.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoSangre.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoSangre.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoSangre!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoSangre.jCheckBoxPostAccionNuevoTipoSangre.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoSangre.jCheckBoxPostAccionSinCerrarTipoSangre.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoSangre.jCheckBoxPostAccionSinMensajeTipoSangre.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoSangre.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoSangre.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoSangre.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoSangre!=null) {
				this.jInternalFrameDetalleFormTipoSangre.jCheckBoxPostAccionNuevoTipoSangre.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoSangre.jCheckBoxPostAccionSinCerrarTipoSangre.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoSangre.jCheckBoxPostAccionSinMensajeTipoSangre.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoSangre.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoSangre.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoSangre!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoSangre.jComboBoxTiposAccionesFormularioTipoSangre.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoSangre.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoSangre!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoSangre.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoSangre.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoSangre.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoSangre.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoSangre.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoSangre!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoSangre.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoSangre.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoSangre.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoSangre(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoSangreJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoSangre(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoSangre() throws Exception {
		try	{
			if(TipoSangreJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoSangre();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoSangre() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoSangre.jComboBoxTiposAccionesFormularioTipoSangre.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoSangre.jComboBoxTiposAccionesFormularioTipoSangre.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoSangre() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoSangre.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoSangre.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoSangre.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoSangre.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoSangre.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoSangre.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoSangre.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoSangre.addItem(reporte);
			}
			
			
			if(!this.tiposangreSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoSangre.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoSangre.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoSangre.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoSangre.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoSangre.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoSangre.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoSangre!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoSangre.jComboBoxTiposAccionesFormularioTipoSangre.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoSangre.jComboBoxTiposAccionesFormularioTipoSangre.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoSangre.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoSangre.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoSangre.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoSangre();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoSangre() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoSangre!=null) {
				this.jInternalFrameReporteDinamicoTipoSangre.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoSangre.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoSangre!=null) {
				this.jInternalFrameReporteDinamicoTipoSangre.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoSangre.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoSangre!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoSangre.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoSangre.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoSangre.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoSangre.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoSangre.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoSangre.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoSangre()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoSangre(Boolean esInicializar) throws Exception {				
		if(TipoSangreJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoSangre();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoSangre() throws Exception {
		this.inicializarActualizarBindingTablaTipoSangre(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoSangre() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoSangre.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoSangre.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoSangre.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoSangrePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoSangre.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoSangre.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoSangrePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoSangreOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSangreOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoSangrePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoSangre.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoSangre.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoSangrePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoSangre.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoSangre(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tiposangreLogic.getTipoSangres().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tiposangres.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoSangreJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoSangre.setModel(new TipoSangreModel(this.tiposangreLogic.getTipoSangres(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoSangre.setModel(new TipoSangreModel(this.tiposangres,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoSangre!=null && this.jInternalFrameOrderByTipoSangre.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoSangre();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoSangre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSangre,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoSangrePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoSangreConstantesFunciones.SCLASSWEBTITULO,tiposangreConstantesFunciones.resaltarSeleccionarTipoSangre,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoSangreConstantesFunciones.SCLASSWEBTITULO,tiposangreConstantesFunciones.resaltarSeleccionarTipoSangre,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoSangre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSangre,TipoSangreConstantesFunciones.LABEL_ID));

		if(this.tiposangreConstantesFunciones.mostraridTipoSangre && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoSangreConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tiposangreConstantesFunciones.resaltaridTipoSangre,this.tiposangreConstantesFunciones.activaridTipoSangre,this,true,"idTipoSangre","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiposangreConstantesFunciones.resaltaridTipoSangre,this.tiposangreConstantesFunciones.activaridTipoSangre,this,true,"idTipoSangre","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoSangre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSangre,TipoSangreConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tiposangreConstantesFunciones.mostrarid_empresaTipoSangre && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoSangreConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tiposangreConstantesFunciones.resaltarid_empresaTipoSangre,this,this.tiposangreConstantesFunciones.activarid_empresaTipoSangre));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tiposangreConstantesFunciones.resaltarid_empresaTipoSangre,this,this.tiposangreConstantesFunciones.activarid_empresaTipoSangre,false,"id_empresaTipoSangre","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoSangrePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoSangre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSangre,TipoSangreConstantesFunciones.LABEL_CODIGO));

		if(this.tiposangreConstantesFunciones.mostrarcodigoTipoSangre && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoSangreConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiposangreConstantesFunciones.resaltarcodigoTipoSangre,this.tiposangreConstantesFunciones.activarcodigoTipoSangre,this,true,"codigoTipoSangre","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiposangreConstantesFunciones.resaltarcodigoTipoSangre,this.tiposangreConstantesFunciones.activarcodigoTipoSangre,this,true,"codigoTipoSangre","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoSangrePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoSangre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSangre,TipoSangreConstantesFunciones.LABEL_NOMBRE));

		if(this.tiposangreConstantesFunciones.mostrarnombreTipoSangre && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoSangreConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiposangreConstantesFunciones.resaltarnombreTipoSangre,this.tiposangreConstantesFunciones.activarnombreTipoSangre,this,true,"nombreTipoSangre","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiposangreConstantesFunciones.resaltarnombreTipoSangre,this.tiposangreConstantesFunciones.activarnombreTipoSangre,this,true,"nombreTipoSangre","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoSangrePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tiposangreSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDatoGeneralEmpleado && this.tiposangreConstantesFunciones.mostrarDatoGeneralEmpleadoTipoSangre && !TipoSangreConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Dato General Empleados");
				tableColumn.setHeaderValue("Dato General Empleados");
				tableColumn.setCellRenderer(new DatoGeneralEmpleadoTableCell(tiposangreConstantesFunciones.resaltarDatoGeneralEmpleadoTipoSangre,this,this.tiposangreConstantesFunciones.activarDatoGeneralEmpleadoTipoSangre));
				tableColumn.setCellEditor(new DatoGeneralEmpleadoTableCell(tiposangreConstantesFunciones.resaltarDatoGeneralEmpleadoTipoSangre,this,this.tiposangreConstantesFunciones.activarDatoGeneralEmpleadoTipoSangre));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoSangre.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiposangreSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiposangreSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoSangre.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiposangreSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiposangreSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoSangre.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoSangre && this.isPermisoGuardarCambiosTipoSangre) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tiposangreSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tiposangreSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoSangre.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tiposangreSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoSangre.addColumn(tableColumn);
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
			
			this.jTableDatosTipoSangre.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoSangre && this.isPermisoGuardarCambiosTipoSangre) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiposangreSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoSangre && this.isPermisoGuardarCambiosTipoSangre) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoSangre.moveColumn(this.jTableDatosTipoSangre.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoSangre.moveColumn(this.jTableDatosTipoSangre.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiposangreSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoSangre.moveColumn(this.jTableDatosTipoSangre.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoSangre.moveColumn(this.jTableDatosTipoSangre.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoSangre.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoSangre.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoSangre,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoSangreJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoSangre.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoSangre.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoSangreJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoSangreJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoSangre.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoSangre.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoSangre.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tiposangreLogic.getTipoSangres().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tiposangres.size()-1;
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
		//this.jTableDatosTipoSangre.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoSangre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoSangre();
			
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
				
				//this.isEsNuevoTipoSangre=false;
					
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
			
				if(this.tiposangreSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoSangre==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoSangre.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoSangre.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangre =(TipoSangre) this.tiposangreLogic.getTipoSangres().toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposangre =(TipoSangre) this.tiposangres.toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tiposangre.getsType().equals("DUPLICADO")
				   || this.tiposangre.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoSangre=true;
				
				} else {
					this.isEsNuevoTipoSangre=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tiposangreSessionBean.getEsGuardarRelacionado()) {
					if(this.tiposangre.getId()>=0 && !this.tiposangre.getIsNew()) {						
						this.isEsNuevoTipoSangre=false;
						
					} else {
						this.isEsNuevoTipoSangre=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoSangre(esRelaciones);						
				
				this.seleccionarTipoSangre(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tiposangre.getId()<0) {
					this.isEsNuevoTipoSangre=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoSangre(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoSangre(evt,rowIndex);
				}	
				
				if(this.tiposangreSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoSangre: " + this.dDif); 
					}
				}								
				
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoSangre(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tiposangre)) {
					if(this.tiposangre.getId()>0) {
						this.tiposangre.setIsDeleted(true);
						
						this.tiposangresEliminados.add(this.tiposangre);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiposangreLogic.getTipoSangres().remove(this.tiposangre);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiposangres.remove(this.tiposangre);				
					}
					
					
					((TipoSangreModel) this.jTableDatosTipoSangre.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoSangre(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoSangre(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoSangre) {
			
			if(this.jInternalFrameDetalleFormTipoSangre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoSangre.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoSangre.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangre =(TipoSangre) this.tiposangreLogic.getTipoSangres().toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposangre =(TipoSangre) this.tiposangres.toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoSangreJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoSangre(this.tiposangre);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tiposangreConstantesFunciones.cargarid_empresaTipoSangre || this.tiposangreConstantesFunciones.event_dependid_empresaTipoSangre) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tiposangre.getid_empresa());
									//this.inicializarActualizarBindingTipoSangre(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tiposangre.getEmpresa()!=null) {
							this.empresasForeignKey.add(tiposangre.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tiposangre.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoSangre("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoSangre(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoSangre() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoSangre(TipoSangre tiposangre) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoSangre(tiposangre,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoSangre(TipoSangre tiposangre,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoSangre(tiposangre);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoSangre(tiposangre,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoSangre(tiposangre);
	}
	
	public void setVariablesObjetoActualToFormularioTipoSangre(TipoSangre tiposangre) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoSangre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoSangre.jLabelidTipoSangre.setText(tiposangre.getId().toString());
			this.jInternalFrameDetalleFormTipoSangre.jTextFieldcodigoTipoSangre.setText(tiposangre.getcodigo());
			this.jInternalFrameDetalleFormTipoSangre.jTextAreanombreTipoSangre.setText(tiposangre.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoSangre tiposangreLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tiposangreLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoSangre tiposangreLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tiposangreLocal=this.tiposangre;
			} else {
				tiposangreLocal=this.tiposangreAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tiposangreLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoSangre(tiposangreLocal,true);
					
					if(tiposangreSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tiposangreLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tiposangreSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tiposangreLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoSangre(TipoSangre tiposangre,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoSangre(tiposangre,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoSangre(tiposangre);
	}
	
	public void setVariablesFormularioToObjetoActualTipoSangre(TipoSangre tiposangre,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoSangre(tiposangre,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoSangre(TipoSangre tiposangre,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoSangre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoSangre.jLabelidTipoSangre.getText()==null || this.jInternalFrameDetalleFormTipoSangre.jLabelidTipoSangre.getText()=="" || this.jInternalFrameDetalleFormTipoSangre.jLabelidTipoSangre.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoSangre.jLabelidTipoSangre.setText("0");
			}

			if(conColumnasBase) {tiposangre.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoSangre.jLabelidTipoSangre.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoSangreConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSangre.jLabelIdTipoSangre,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiposangre.setcodigo(this.jInternalFrameDetalleFormTipoSangre.jTextFieldcodigoTipoSangre.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoSangreConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSangre.jLabelcodigoTipoSangre,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiposangre.setnombre(this.jInternalFrameDetalleFormTipoSangre.jTextAreanombreTipoSangre.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoSangreConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSangre.jLabelnombreTipoSangre,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoSangre(TipoSangre tiposangreBean,TipoSangre tiposangre,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoSangre(TipoSangre tiposangreOrigen,TipoSangre tiposangre,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiposangreOrigen.getId()!=null && !tiposangreOrigen.getId().equals(0L))) {tiposangre.setId(tiposangreOrigen.getId());}}
			if(conDefault || (!conDefault && tiposangreOrigen.getcodigo()!=null && !tiposangreOrigen.getcodigo().equals(""))) {tiposangre.setcodigo(tiposangreOrigen.getcodigo());}
			if(conDefault || (!conDefault && tiposangreOrigen.getnombre()!=null && !tiposangreOrigen.getnombre().equals(""))) {tiposangre.setnombre(tiposangreOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoSangre(TipoSangre tiposangre) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoSangre.jLabelidTipoSangre.setText(tiposangre.getId().toString());
			this.jInternalFrameDetalleFormTipoSangre.jTextFieldcodigoTipoSangre.setText(tiposangre.getcodigo());
			this.jInternalFrameDetalleFormTipoSangre.jTextAreanombreTipoSangre.setText(tiposangre.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoSangre(TipoSangreBean tiposangreBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoSangre.jLabelidTipoSangre.setText(tiposangreBean.getId().toString());
			this.jInternalFrameDetalleFormTipoSangre.jTextFieldcodigoTipoSangre.setText(tiposangreBean.getcodigo());
			this.jInternalFrameDetalleFormTipoSangre.jTextAreanombreTipoSangre.setText(tiposangreBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoSangre(TipoSangreParameterReturnGeneral tiposangreReturnGeneral,TipoSangreBean tiposangreBean,Boolean conDefault) throws Exception { 
		try {
			TipoSangre tiposangreLocal=new TipoSangre();
			
			tiposangreLocal=tiposangreReturnGeneral.getTipoSangre();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiposangreLocal.getId()!=null && !tiposangreLocal.getId().equals(0L))) {tiposangreBean.setId(tiposangreLocal.getId());}}
			if(conDefault || (!conDefault && tiposangreLocal.getcodigo()!=null && !tiposangreLocal.getcodigo().equals(""))) {tiposangreBean.setcodigo(tiposangreLocal.getcodigo());}
			if(conDefault || (!conDefault && tiposangreLocal.getnombre()!=null && !tiposangreLocal.getnombre().equals(""))) {tiposangreBean.setnombre(tiposangreLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoSangreGenerico(Long idTipoSangreSeleccionado,JComboBox jComboBoxTipoSangre,List<TipoSangre> tiposangresLocal)throws Exception {
		try {
			TipoSangre  tiposangreTemp=null;

			for(TipoSangre tiposangreAux:tiposangresLocal) {
				if(tiposangreAux.getId()!=null && tiposangreAux.getId().equals(idTipoSangreSeleccionado)) {
					tiposangreTemp=tiposangreAux;
					break;
				}
			}

			jComboBoxTipoSangre.setSelectedItem(tiposangreTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoSangreGenerico(JComboBox jComboBoxTipoSangre,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoSangre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoSangre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoSangre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoSangre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoSangre.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoSangre.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoSangre.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoSangre.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoSangre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoSangre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiposangre=(TipoSangre) tiposangreLogic.getTipoSangres().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiposangre =(TipoSangre) tiposangres.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tiposangre.getIsNew() && !tiposangre.getIsChanged() && !tiposangre.getIsDeleted()) {
				sDescripcion=tiposangre.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tiposangre.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoSangre tiposangreRow=new TipoSangre();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiposangreRow=(TipoSangre) tiposangreLogic.getTipoSangres().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiposangreRow=(TipoSangre) tiposangres.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDatoGeneralEmpleadoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoSangre tiposangre) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoSangre==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangreLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposangre = (TipoSangre)this.tiposangreLogic.getTipoSangres().toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tiposangre = (TipoSangre)this.tiposangres.toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tiposangre!=null) {
						this.tiposangre = tiposangre;
					} else {
						this.tiposangre = new TipoSangre();
					}
				}

				if(this.isTienePermisosDatoGeneralEmpleado && this.permiteMantenimiento(this.tiposangre)) {
					DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFramePopup=new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						datogeneralempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFramePopup;
					} else {
						datogeneralempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame;
					}

					List<TipoSangre> tiposangres=new ArrayList<TipoSangre>();
					tiposangres.add(this.tiposangre);
					if(!esRelacionado) {
						//datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setConGuardarRelaciones(false);
						//datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					datogeneralempleadoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoSangre.cargarDatoGeneralEmpleadoBeanSwingJInternalFrame(tiposangres,this.tiposangre,datogeneralempleadoBeanSwingJInternalFrame,/*conInicializar,*/datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getConGuardarRelaciones(),datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getEsGuardarRelacionado());
					datogeneralempleadoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsDatoGeneralEmpleado("no_relacionado");

						datogeneralempleadoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DatoGeneralEmpleadoConstantesFunciones.ITAMANIOFILATABLA + (DatoGeneralEmpleadoConstantesFunciones.ITAMANIOFILATABLA/2));

						datogeneralempleadoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoSangre=(TitledBorder)this.jScrollPanelDatosTipoSangre.getBorder();
						TitledBorder titledBorderDatoGeneralEmpleado=(TitledBorder)datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.getBorder();

						titledBorderDatoGeneralEmpleado.setTitle(titledBorderTipoSangre.getTitle() + " -> Dato General Empleado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,datogeneralempleadoBeanSwingJInternalFrame);
						}

						datogeneralempleadoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(datogeneralempleadoBeanSwingJInternalFrame);

						datogeneralempleadoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tiposangreSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Dato General Empleado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangreLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangreLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangreLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoSangre(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoSangre.setVisible((this.isVisibilidadCeldaNuevoTipoSangre && this.isPermisoNuevoTipoSangre));			
			this.jButtonDuplicarTipoSangre.setVisible((this.isVisibilidadCeldaDuplicarTipoSangre && this.isPermisoDuplicarTipoSangre));			
			this.jButtonCopiarTipoSangre.setVisible((this.isVisibilidadCeldaCopiarTipoSangre && this.isPermisoCopiarTipoSangre));
			this.jButtonVerFormTipoSangre.setVisible((this.isVisibilidadCeldaVerFormTipoSangre && this.isPermisoVerFormTipoSangre));
			
			this.jButtonAbrirOrderByTipoSangre.setVisible((this.isVisibilidadCeldaOrdenTipoSangre && this.isPermisoOrdenTipoSangre));			
			
			this.jButtonNuevoRelacionesTipoSangre.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoSangre && this.isPermisoNuevoTipoSangre));			
			this.jButtonNuevoGuardarCambiosTipoSangre.setVisible((this.isVisibilidadCeldaNuevoTipoSangre && this.isPermisoNuevoTipoSangre && this.isPermisoGuardarCambiosTipoSangre));
			
			if(this.jInternalFrameDetalleFormTipoSangre!=null) {
			this.jInternalFrameDetalleFormTipoSangre.jButtonModificarTipoSangre.setVisible((this.isVisibilidadCeldaModificarTipoSangre && this.isPermisoActualizarTipoSangre));	
			this.jInternalFrameDetalleFormTipoSangre.jButtonActualizarTipoSangre.setVisible((this.isVisibilidadCeldaActualizarTipoSangre && this.isPermisoActualizarTipoSangre));	
			this.jInternalFrameDetalleFormTipoSangre.jButtonEliminarTipoSangre.setVisible((this.isVisibilidadCeldaEliminarTipoSangre && this.isPermisoEliminarTipoSangre));
			this.jInternalFrameDetalleFormTipoSangre.jButtonCancelarTipoSangre.setVisible(this.isVisibilidadCeldaCancelarTipoSangre);							
			this.jInternalFrameDetalleFormTipoSangre.jButtonGuardarCambiosTipoSangre.setVisible((this.isVisibilidadCeldaGuardarTipoSangre && this.isPermisoGuardarCambiosTipoSangre));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoSangre.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoSangre && this.isPermisoGuardarCambiosTipoSangre));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoSangre.setVisible((this.isVisibilidadCeldaNuevoTipoSangre && this.isPermisoNuevoTipoSangre));						
			this.jButtonDuplicarToolBarTipoSangre.setVisible((this.isVisibilidadCeldaDuplicarTipoSangre && this.isPermisoDuplicarTipoSangre));						
			this.jButtonCopiarToolBarTipoSangre.setVisible((this.isVisibilidadCeldaCopiarTipoSangre && this.isPermisoCopiarTipoSangre));			
			this.jButtonVerFormToolBarTipoSangre.setVisible((this.isVisibilidadCeldaVerFormTipoSangre && this.isPermisoVerFormTipoSangre));			
			this.jButtonAbrirOrderByToolBarTipoSangre.setVisible((this.isVisibilidadCeldaOrdenTipoSangre && this.isPermisoOrdenTipoSangre));
			this.jButtonNuevoRelacionesToolBarTipoSangre.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoSangre && this.isPermisoNuevoTipoSangre));			
			this.jButtonNuevoGuardarCambiosToolBarTipoSangre.setVisible((this.isVisibilidadCeldaNuevoTipoSangre && this.isPermisoNuevoTipoSangre && this.isPermisoGuardarCambiosTipoSangre));			
			
			if(this.jInternalFrameDetalleFormTipoSangre!=null) {
			this.jInternalFrameDetalleFormTipoSangre.jButtonModificarToolBarTipoSangre.setVisible((this.isVisibilidadCeldaModificarTipoSangre && this.isPermisoActualizarTipoSangre));	
			this.jInternalFrameDetalleFormTipoSangre.jButtonActualizarToolBarTipoSangre.setVisible((this.isVisibilidadCeldaActualizarTipoSangre  && this.isPermisoActualizarTipoSangre));	
			this.jInternalFrameDetalleFormTipoSangre.jButtonEliminarToolBarTipoSangre.setVisible((this.isVisibilidadCeldaEliminarTipoSangre && this.isPermisoEliminarTipoSangre));
			this.jInternalFrameDetalleFormTipoSangre.jButtonCancelarToolBarTipoSangre.setVisible(this.isVisibilidadCeldaCancelarTipoSangre);				
			this.jInternalFrameDetalleFormTipoSangre.jButtonGuardarCambiosToolBarTipoSangre.setVisible((this.isVisibilidadCeldaGuardarTipoSangre && this.isPermisoGuardarCambiosTipoSangre));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoSangre.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoSangre && this.isPermisoGuardarCambiosTipoSangre));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoSangre.setVisible((this.isVisibilidadCeldaNuevoTipoSangre && this.isPermisoNuevoTipoSangre));			
			this.jMenuItemDuplicarTipoSangre.setVisible((this.isVisibilidadCeldaDuplicarTipoSangre && this.isPermisoDuplicarTipoSangre));			
			this.jMenuItemCopiarTipoSangre.setVisible((this.isVisibilidadCeldaCopiarTipoSangre && this.isPermisoCopiarTipoSangre));			
			this.jMenuItemVerFormTipoSangre.setVisible((this.isVisibilidadCeldaVerFormTipoSangre && this.isPermisoVerFormTipoSangre));			
			this.jMenuItemAbrirOrderByTipoSangre.setVisible((this.isVisibilidadCeldaOrdenTipoSangre && this.isPermisoOrdenTipoSangre));			
			//this.jMenuItemMostrarOcultarTipoSangre.setVisible((this.isVisibilidadCeldaOrdenTipoSangre && this.isPermisoOrdenTipoSangre));
			this.jMenuItemDetalleAbrirOrderByTipoSangre.setVisible((this.isVisibilidadCeldaOrdenTipoSangre && this.isPermisoOrdenTipoSangre));			
			//this.jMenuItemDetalleMostrarOcultarTipoSangre.setVisible((this.isVisibilidadCeldaOrdenTipoSangre && this.isPermisoOrdenTipoSangre));			
			this.jMenuItemNuevoRelacionesTipoSangre.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoSangre && this.isPermisoNuevoTipoSangre));			
			this.jMenuItemNuevoGuardarCambiosTipoSangre.setVisible((this.isVisibilidadCeldaNuevoTipoSangre && this.isPermisoNuevoTipoSangre && this.isPermisoGuardarCambiosTipoSangre));									
			
			if(this.jInternalFrameDetalleFormTipoSangre!=null) {
			this.jInternalFrameDetalleFormTipoSangre.jMenuItemModificarTipoSangre.setVisible((this.isVisibilidadCeldaModificarTipoSangre && this.isPermisoActualizarTipoSangre));	
			this.jInternalFrameDetalleFormTipoSangre.jMenuItemActualizarTipoSangre.setVisible((this.isVisibilidadCeldaActualizarTipoSangre && this.isPermisoActualizarTipoSangre));	
			this.jInternalFrameDetalleFormTipoSangre.jMenuItemEliminarTipoSangre.setVisible((this.isVisibilidadCeldaEliminarTipoSangre && this.isPermisoEliminarTipoSangre));
			this.jInternalFrameDetalleFormTipoSangre.jMenuItemCancelarTipoSangre.setVisible(this.isVisibilidadCeldaCancelarTipoSangre);				
			}
			
			this.jMenuItemGuardarCambiosTipoSangre.setVisible((this.isVisibilidadCeldaGuardarTipoSangre && this.isPermisoGuardarCambiosTipoSangre));						
			this.jMenuItemGuardarCambiosTablaTipoSangre.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoSangre && this.isPermisoGuardarCambiosTipoSangre));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoSangre=this.jButtonNuevoTipoSangre.isVisible();
			this.isVisibilidadCeldaDuplicarTipoSangre=this.jButtonDuplicarTipoSangre.isVisible();
			this.isVisibilidadCeldaCopiarTipoSangre=this.jButtonCopiarTipoSangre.isVisible();
			this.isVisibilidadCeldaVerFormTipoSangre=this.jButtonVerFormTipoSangre.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoSangre=this.jButtonAbrirOrderByTipoSangre.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoSangre=this.jButtonNuevoRelacionesTipoSangre.isVisible();
			this.isVisibilidadCeldaModificarTipoSangre=this.jButtonModificarTipoSangre.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoSangre!=null) {
			this.isVisibilidadCeldaActualizarTipoSangre=this.jInternalFrameDetalleFormTipoSangre.jButtonActualizarTipoSangre.isVisible();
			this.isVisibilidadCeldaEliminarTipoSangre=this.jInternalFrameDetalleFormTipoSangre.jButtonEliminarTipoSangre.isVisible();
			this.isVisibilidadCeldaCancelarTipoSangre=this.jInternalFrameDetalleFormTipoSangre.jButtonCancelarTipoSangre.isVisible();
			this.isVisibilidadCeldaGuardarTipoSangre=this.jInternalFrameDetalleFormTipoSangre.jButtonGuardarCambiosTipoSangre.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoSangre=this.jButtonGuardarCambiosTablaTipoSangre.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoSangre=this.jButtonNuevoToolBarTipoSangre.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoSangre=this.jButtonNuevoRelacionesToolBarTipoSangre.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoSangre!=null) {
			this.isVisibilidadCeldaModificarTipoSangre=this.jInternalFrameDetalleFormTipoSangre.jButtonModificarToolBarTipoSangre.isVisible();
			this.isVisibilidadCeldaActualizarTipoSangre=this.jInternalFrameDetalleFormTipoSangre.jButtonActualizarToolBarTipoSangre.isVisible();
			this.isVisibilidadCeldaEliminarTipoSangre=this.jInternalFrameDetalleFormTipoSangre.jButtonEliminarToolBarTipoSangre.isVisible();
			this.isVisibilidadCeldaCancelarTipoSangre=this.jInternalFrameDetalleFormTipoSangre.jButtonCancelarToolBarTipoSangre.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoSangre=this.jButtonGuardarCambiosToolBarTipoSangre.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoSangre=this.jButtonGuardarCambiosTablaToolBarTipoSangre.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoSangre=this.jMenuItemNuevoTipoSangre.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoSangre=this.jMenuItemNuevoRelacionesTipoSangre.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoSangre!=null) {
			this.isVisibilidadCeldaModificarTipoSangre=this.jInternalFrameDetalleFormTipoSangre.jMenuItemModificarTipoSangre.isVisible();
			this.isVisibilidadCeldaActualizarTipoSangre=this.jInternalFrameDetalleFormTipoSangre.jMenuItemActualizarTipoSangre.isVisible();
			this.isVisibilidadCeldaEliminarTipoSangre=this.jInternalFrameDetalleFormTipoSangre.jMenuItemEliminarTipoSangre.isVisible();
			this.isVisibilidadCeldaCancelarTipoSangre=this.jInternalFrameDetalleFormTipoSangre.jMenuItemCancelarTipoSangre.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoSangre=this.jMenuItemGuardarCambiosTipoSangre.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoSangre=this.jMenuItemGuardarCambiosTablaTipoSangre.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoSangre(Boolean esInicializar) {
		if(TipoSangreJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tiposangreSessionBean.getConGuardarRelaciones()) {
				//if(this.tiposangreSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoSangre();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoSangre(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoSangre() {
		this.jButtonNuevoTipoSangre.setVisible(this.isPermisoNuevoTipoSangre);			
		this.jButtonDuplicarTipoSangre.setVisible(this.isPermisoDuplicarTipoSangre);			
		this.jButtonCopiarTipoSangre.setVisible(this.isPermisoCopiarTipoSangre);			
		this.jButtonVerFormTipoSangre.setVisible(this.isPermisoVerFormTipoSangre);			
		
		this.jButtonAbrirOrderByTipoSangre.setVisible(this.isPermisoOrdenTipoSangre);					
		
		this.jButtonNuevoRelacionesTipoSangre.setVisible(this.isPermisoNuevoTipoSangre);			
		
		if(this.jInternalFrameDetalleFormTipoSangre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSangre.jButtonModificarTipoSangre.setVisible(this.isPermisoActualizarTipoSangre);	
			this.jInternalFrameDetalleFormTipoSangre.jButtonActualizarTipoSangre.setVisible(this.isPermisoActualizarTipoSangre);	
			this.jInternalFrameDetalleFormTipoSangre.jButtonEliminarTipoSangre.setVisible(this.isPermisoEliminarTipoSangre);
			this.jInternalFrameDetalleFormTipoSangre.jButtonCancelarTipoSangre.setVisible(this.isVisibilidadCeldaCancelarTipoSangre);						
			this.jInternalFrameDetalleFormTipoSangre.jButtonGuardarCambiosTipoSangre.setVisible(this.isPermisoGuardarCambiosTipoSangre);							
		}
		
		this.jButtonGuardarCambiosTablaTipoSangre.setVisible(this.isPermisoActualizarTipoSangre);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoSangre() {
		this.jInternalFrameDetalleFormTipoSangre.jButtonModificarTipoSangre.setVisible(this.isPermisoActualizarTipoSangre);	
		this.jInternalFrameDetalleFormTipoSangre.jButtonActualizarTipoSangre.setVisible(this.isPermisoActualizarTipoSangre);	
		this.jInternalFrameDetalleFormTipoSangre.jButtonEliminarTipoSangre.setVisible(this.isPermisoEliminarTipoSangre);
		this.jInternalFrameDetalleFormTipoSangre.jButtonCancelarTipoSangre.setVisible(this.isVisibilidadCeldaCancelarTipoSangre);							
		this.jInternalFrameDetalleFormTipoSangre.jButtonGuardarCambiosTipoSangre.setVisible((this.isVisibilidadCeldaGuardarTipoSangre && this.isPermisoGuardarCambiosTipoSangre));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoSangre() {
		if(TipoSangreJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoSangre();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoSangre() {
	}
	
	public void jTableDatosTipoSangreListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoSangre(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoSangreBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangreLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoSangre.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoSangre(this.gettiposangre(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSangre(this.tiposangre);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposangre =(TipoSangre) this.tiposangreLogic.getTipoSangres().toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiposangre =(TipoSangre) this.tiposangres.toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiposangre==null) {
						this.tiposangre = new TipoSangre();
					}

					this.setVariablesFormularioToObjetoActualTipoSangre(this.tiposangre,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSangre(this.tiposangre);
				}

				if(this.tiposangre.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tiposangre.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoSangre(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangreLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangreLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangreLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoSangreUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoSangre(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoSangre.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoSangre.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoSangre.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangre =(TipoSangre) this.tiposangreLogic.getTipoSangres().toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiposangre =(TipoSangre) this.tiposangres.toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoSangre(this.gettiposangre(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoSangre(this.tiposangre);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tiposangreLogic.getConnexion());

				if(this.tiposangre.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tiposangre.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoSangre=(TitledBorder)this.jScrollPanelDatosTipoSangre.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoSangre.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoSangreBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangreLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoSangre.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoSangre(this.gettiposangre(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSangre(this.tiposangre);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposangre =(TipoSangre) this.tiposangreLogic.getTipoSangres().toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiposangre =(TipoSangre) this.tiposangres.toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiposangre==null) {
						this.tiposangre = new TipoSangre();
					}

					this.setVariablesFormularioToObjetoActualTipoSangre(this.tiposangre,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSangre(this.tiposangre);
				}

				if(this.tiposangre.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tiposangre.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoSangre(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangreLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangreLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangreLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoSangreBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangreLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoSangre.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoSangre(this.gettiposangre(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSangre(this.tiposangre);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposangre =(TipoSangre) this.tiposangreLogic.getTipoSangres().toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiposangre =(TipoSangre) this.tiposangres.toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiposangre==null) {
						this.tiposangre = new TipoSangre();
					}

					this.setVariablesFormularioToObjetoActualTipoSangre(this.tiposangre,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSangre(this.tiposangre);
				}

				if(this.tiposangre.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tiposangre.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoSangre(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangreLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangreLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangreLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoSangreBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangreLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoSangre.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoSangre(this.gettiposangre(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSangre(this.tiposangre);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposangre =(TipoSangre) this.tiposangreLogic.getTipoSangres().toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiposangre =(TipoSangre) this.tiposangres.toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiposangre==null) {
						this.tiposangre = new TipoSangre();
					}

					this.setVariablesFormularioToObjetoActualTipoSangre(this.tiposangre,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSangre(this.tiposangre);
				}

				if(this.tiposangre.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tiposangre.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoSangre(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangreLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangreLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangreLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoSangreActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoSangre(false,false);

			this.getTipoSangresFK_IdEmpresa();

			this.inicializarActualizarBindingTipoSangre(false);

			//if(TipoSangreBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoSangre(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposangreLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoSangre() {
		if(this.jInternalFrameDetalleFormTipoSangre!=null) {
		

		if(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoSangre!=null) {
			this.jInternalFrameDetalleFormTipoSangre.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoSangre.dispose();
			this.jInternalFrameDetalleFormTipoSangre=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoSangre!=null) {
			this.jInternalFrameReporteDinamicoTipoSangre.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoSangre.dispose();
			this.jInternalFrameReporteDinamicoTipoSangre=null;
		}
		
		if(this.jInternalFrameImportacionTipoSangre!=null) {
			this.jInternalFrameImportacionTipoSangre.setVisible(false);	    			
			this.jInternalFrameImportacionTipoSangre.dispose();
			this.jInternalFrameImportacionTipoSangre=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoSangre();
			
			TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoSangre")) {
				jButtonNuevoTipoSangreActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoSangre")) {
				jButtonDuplicarTipoSangreActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoSangre")) {
				jButtonCopiarTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoSangre")) {
				jButtonVerFormTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoSangre")) {
				jButtonNuevoTipoSangreActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoSangre")) {
				jButtonDuplicarTipoSangreActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoSangre")) {
				jButtonNuevoTipoSangreActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoSangre")) {
				jButtonDuplicarTipoSangreActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoSangre")) {
				jButtonNuevoTipoSangreActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoSangre")) {
				jButtonNuevoTipoSangreActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoSangre")) {
				jButtonNuevoTipoSangreActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoSangre")) {
				jButtonModificarTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoSangre")) {
				jButtonModificarTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoSangre")) {
				jButtonModificarTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoSangre")) {
				jButtonActualizarTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoSangre")) {
				jButtonActualizarTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoSangre")) {
				jButtonActualizarTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoSangre")) {
				jButtonEliminarTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoSangre")) {
				jButtonEliminarTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoSangre")) {
				jButtonEliminarTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoSangre")) {
				jButtonCancelarTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoSangre")) {
				jButtonCancelarTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoSangre")) {
				jButtonCancelarTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoSangre")) {
				jButtonCerrarTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoSangre")) {
				jButtonCerrarTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoSangre")) {
				jButtonCerrarTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoSangre")) {
				jButtonMostrarOcultarTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoSangre")) {
				jButtonCancelarTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoSangre")) {
				jButtonGuardarCambiosTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoSangre")) {
				jButtonGuardarCambiosTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoSangre")) {
				jButtonCopiarTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoSangre")) {
				jButtonVerFormTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoSangre")) {
				jButtonGuardarCambiosTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoSangre")) {
				jButtonCopiarTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoSangre")) {
				jButtonVerFormTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoSangre")) {
				jButtonGuardarCambiosTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoSangre")) {
				jButtonGuardarCambiosTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoSangre")) {
				jButtonGuardarCambiosTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoSangre")) {
				jButtonRecargarInformacionTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoSangre")) {
				jButtonRecargarInformacionTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoSangre")) {
				jButtonRecargarInformacionTipoSangreActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoSangre")) {
				jButtonAnterioresTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoSangre")) {
				jButtonAnterioresTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoSangre")) {
				jButtonAnterioresTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoSangre")) {
				jButtonSiguientesTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoSangre")) {
				jButtonSiguientesTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoSangre")) {
				jButtonSiguientesTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoSangre") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoSangre")) {
				jButtonAbrirOrderByTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoSangre") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoSangre")) {
				jButtonMostrarOcultarTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoSangre")) {
				jButtonNuevoGuardarCambiosTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoSangre")) {
				jButtonNuevoGuardarCambiosTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoSangre")) {
				jButtonNuevoGuardarCambiosTipoSangreActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoSangre")) {
				jButtonCerrarReporteDinamicoTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoSangre")) {
				jButtonGenerarReporteDinamicoTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoSangre")) {
				
				jButtonGenerarExcelReporteDinamicoTipoSangreActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoSangre")) {
				jButtonCerrarImportacionTipoSangreActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoSangre")) {
				
				jButtonGenerarImportacionTipoSangreActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoSangre")) {
				
				jButtonAbrirImportacionTipoSangreActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoSangre")) {
				jComboBoxTiposAccionesTipoSangreActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoSangre")) {
				jComboBoxTiposRelacionesTipoSangreActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoSangre")) {
				jComboBoxTiposAccionesTipoSangreActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoSangre")) {
				
				jComboBoxTiposSeleccionarTipoSangreActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoSangre")) {
				jTextFieldValorCampoGeneralTipoSangreActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoSangre")) {
				jButtonAbrirOrderByTipoSangreActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoSangre")) {
				jButtonAbrirOrderByTipoSangreActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoSangre")) {
				jButtonCerrarOrderByTipoSangreActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoSangreBusqueda")) {
				this.jButtonidTipoSangreBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoSangreUpdate")) {
				this.jButtonid_empresaTipoSangreUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoSangreBusqueda")) {
				this.jButtonid_empresaTipoSangreBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoSangreBusqueda")) {
				this.jButtoncodigoTipoSangreBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoSangreBusqueda")) {
				this.jButtonnombreTipoSangreBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoSangre();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSangreActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposangre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposangre);
				
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
				
				


				
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSangre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSangre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoSangre tiposangreLocal=null;
			
			if(!this.getEsControlTabla()) {
				tiposangreLocal=this.tiposangre;
			} else {
				tiposangreLocal=this.tiposangreAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposangre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposangre);
				
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
							
				
				


				
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSangre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSangre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSangreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoSangre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangreAnterior =(TipoSangre) this.tiposangreLogic.getTipoSangres().toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposangreAnterior =(TipoSangre) this.tiposangres.toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
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
			
			TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
			
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
			
			


			
			TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSangreActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposangre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposangre);
				
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
								
						
				


				
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSangre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSangre.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposangre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposangre);
				
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
								
				
				


				
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSangre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSangre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSangreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoSangre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangreAnterior =(TipoSangre) this.tiposangreLogic.getTipoSangres().toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposangreAnterior =(TipoSangre) this.tiposangres.toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposangre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposangre);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSangreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoSangre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangreAnterior =(TipoSangre) this.tiposangreLogic.getTipoSangres().toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposangreAnterior =(TipoSangre) this.tiposangres.toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSangreActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposangre);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiposangre);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposangre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposangre);
				
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
							
				
				


				
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSangre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSangre.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSangreActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoSangre.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposangreAnterior =(TipoSangre) this.tiposangreLogic.getTipoSangres().toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiposangreAnterior =(TipoSangre) this.tiposangres.toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
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
			
			TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
			
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
			
			


			
			TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSangreActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposangre);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiposangre);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposangre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposangre);
				
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
								
				
				


				
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSangre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSangre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSangreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoSangre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangreAnterior =(TipoSangre) this.tiposangreLogic.getTipoSangres().toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposangreAnterior =(TipoSangre) this.tiposangres.toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSangreActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposangre);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiposangre);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSangreActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposangre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposangre);
				
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoSangre")) {
					jCheckBoxSeleccionarTodosTipoSangreItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoSangre")) {
					jCheckBoxSeleccionadosTipoSangreItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoSangre")) {
					
				}
				
				


				
				
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSangre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSangre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposangre);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tiposangre);
				
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
												
				
				


				
				
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSangre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSangre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSangreActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoSangre.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposangreAnterior =(TipoSangre) this.tiposangreLogic.getTipoSangres().toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiposangreAnterior =(TipoSangre) this.tiposangres.toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSangreActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposangre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposangre);
				
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
				
				
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
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
			
			TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
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
			
			


			
			TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSangreActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposangre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposangre);
				
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSangre.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSangre.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposangre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposangre);
				
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
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
				
				


				
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSangre.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSangre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSangreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoSangre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposangreAnterior =(TipoSangre) this.tiposangreLogic.getTipoSangres().toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposangreAnterior =(TipoSangre) this.tiposangres.toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoSangre")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoSangreListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoSangre.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tiposangre =(TipoSangre) this.tiposangreLogic.getTipoSangres().toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tiposangre =(TipoSangre) this.tiposangres.toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tiposangre);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoSangre")) {
				
				}
				
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoSangre")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoSangre.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoSangre")) {
			
			}
			
			TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoSangre();
			
			TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
			
			if(sTipo.equals("NuevoTipoSangre")) {
				jButtonNuevoTipoSangreActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoSangre")) {
				jButtonDuplicarTipoSangreActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoSangre")) {
				jButtonCopiarTipoSangreActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoSangre")) {
				jButtonVerFormTipoSangreActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoSangre")) {
				jButtonNuevoTipoSangreActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoSangre")) {
				jButtonModificarTipoSangreActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoSangre")) {
				jButtonActualizarTipoSangreActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoSangre")) {
				jButtonEliminarTipoSangreActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoSangre")) {
				jButtonGuardarCambiosTipoSangreActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoSangre")) {
				jButtonCancelarTipoSangreActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoSangre")) {
				jButtonCerrarTipoSangreActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoSangre")) {
				jButtonGuardarCambiosTipoSangreActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoSangre")) {
				jButtonNuevoGuardarCambiosTipoSangreActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoSangre")) {
				jButtonAbrirOrderByTipoSangreActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoSangre")) {
				jButtonRecargarInformacionTipoSangreActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoSangre")) {
				jButtonAnterioresTipoSangreActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoSangre")) {
				jButtonSiguientesTipoSangreActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoSangreBusqueda")) {
				this.jButtonidTipoSangreBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoSangreUpdate")) {
				this.jButtonid_empresaTipoSangreUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoSangreBusqueda")) {
				this.jButtonid_empresaTipoSangreBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoSangreBusqueda")) {
				this.jButtoncodigoTipoSangreBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoSangreBusqueda")) {
				this.jButtonnombreTipoSangreBusquedaActionPerformed(evt);
			}
			
			TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoSangre();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoSangre")) {
				closingInternalFrameTipoSangre();
				
			} else if(sTipo.equals("jButtonCancelarTipoSangre")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoSangre = (JInternalFrameBase)evt.getSource();
	            	
	            TipoSangreBeanSwingJInternalFrame jInternalFrameParent=(TipoSangreBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoSangre.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoSangreActionPerformed(null);
			}
			
			TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiposangre,new Object(),this.tiposangreParameterGeneral,this.tiposangreReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoSangre(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoSangre(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoSangre(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tiposangre)) {
			if(!esControlTabla) {
				if(TipoSangreJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoSangre(this.tiposangre,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSangre(this.tiposangre);			
				}
				
				if(this.tiposangreSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoSangre(this.tiposangre,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiposangreReturnGeneral=tiposangreLogic.procesarEventosTipoSangresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiposangreLogic.getTipoSangres(),this.tiposangre,this.tiposangreParameterGeneral,this.isEsNuevoTipoSangre,classes);//this.tiposangreLogic.getTipoSangre()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoSangre(this.tiposangreReturnGeneral,this.tiposangreBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tiposangreSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoSangre(classes,this.tiposangreReturnGeneral,this.tiposangreBean,false);
					}
						
					if(this.tiposangreReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoSangre(this.tiposangreReturnGeneral.getTipoSangre());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoSangre(this.tiposangreReturnGeneral.getTipoSangre());	
					}
						
					if(this.tiposangreReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoSangre(this.tiposangreReturnGeneral.getTipoSangre(),classes);//this.tiposangreBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoSangre(this.tiposangre,classes);//this.tiposangreBean);									
				}
			
				if(TipoSangreJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoSangre(this.tiposangre,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSangre(this.tiposangre);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tiposangreAnterior!=null) {
						this.tiposangre=this.tiposangreAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiposangreReturnGeneral=tiposangreLogic.procesarEventosTipoSangresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiposangreLogic.getTipoSangres(),this.tiposangre,this.tiposangreParameterGeneral,this.isEsNuevoTipoSangre,classes);//this.tiposangreLogic.getTipoSangre()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiposangreSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiposangreSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tiposangreReturnGeneral.getTipoSangre(),tiposangreLogic.getTipoSangres());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tiposangreReturnGeneral.getTipoSangre(),this.tiposangres);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoSangre.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoSangre.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoSangre();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoSangre() throws Exception {
		
		TipoSangreModel tiposangreModel=(TipoSangreModel)this.jTableDatosTipoSangre.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiposangreModel.tiposangres=this.tiposangreLogic.getTipoSangres();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tiposangreModel.tiposangres=this.tiposangres;
		}
		
		
		((TipoSangreModel) this.jTableDatosTipoSangre.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoSangre() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettiposangreAnterior(),this.tiposangreLogic.getTipoSangres());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettiposangreAnterior(),this.tiposangres);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoSangre();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoSangre(TipoSangre tiposangre,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DatoGeneralEmpleado.class)) {
					this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(tiposangre.getDatoGeneralEmpleados());
					this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoGeneralEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
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
										
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiposangre,new Object(),generalEntityParameterGeneral,this.tiposangreReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tiposangreSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoSangreConstantesFunciones.getClassesRelationshipsOfTipoSangre(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoSangreConstantesFunciones.getClassesRelationshipsFromStringsOfTipoSangre(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoSangre(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoSangreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiposangre,new Object(),generalEntityParameterGeneral,this.tiposangreReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoSangre(TipoSangreBean tiposangreBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DatoGeneralEmpleado.class)) {
					this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(tiposangre.getDatoGeneralEmpleados());
					this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoGeneralEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoSangre(ArrayList<Classe> classes,TipoSangreReturnGeneral tiposangreReturnGeneral,TipoSangreBean tiposangreBean,Boolean conDefault) throws Exception {
		
			this.tiposangreBean.setDatoGeneralEmpleados(tiposangreReturnGeneral.getTipoSangre().getDatoGeneralEmpleados());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoSangre(TipoSangre tiposangre,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DatoGeneralEmpleado.class)) {
					tiposangre.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tiposangre)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoSangre = new TipoSangreDetalleFormJInternalFrame(jDesktopPane,this.tiposangreSessionBean.getConGuardarRelaciones(),this.tiposangreSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoSangre);
		this.jInternalFrameDetalleFormTipoSangre.setVisible(false);
		this.jInternalFrameDetalleFormTipoSangre.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoSangre.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoSangre.tiposangreLogic=this.tiposangreLogic;
		
		this.cargarCombosFrameForeignKeyTipoSangre("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoSangre();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoSangre();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoSangre("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoSangre();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoSangre.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoSangre"));
		
		this.jInternalFrameDetalleFormTipoSangre.jButtonModificarTipoSangre.addActionListener(new ButtonActionListener(this,"ModificarTipoSangre"));

		
		this.jInternalFrameDetalleFormTipoSangre.jButtonModificarToolBarTipoSangre.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoSangre"));
					
		this.jInternalFrameDetalleFormTipoSangre.jMenuItemModificarTipoSangre.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoSangre"));		
		
		
		
		this.jInternalFrameDetalleFormTipoSangre.jButtonActualizarTipoSangre.addActionListener (new ButtonActionListener(this,"ActualizarTipoSangre"));
		
		
		this.jInternalFrameDetalleFormTipoSangre.jButtonActualizarToolBarTipoSangre.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoSangre"));
						
		this.jInternalFrameDetalleFormTipoSangre.jMenuItemActualizarTipoSangre.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoSangre"));		
		
		
		
		this.jInternalFrameDetalleFormTipoSangre.jButtonEliminarTipoSangre.addActionListener (new ButtonActionListener(this,"EliminarTipoSangre"));
		
		
		this.jInternalFrameDetalleFormTipoSangre.jButtonEliminarToolBarTipoSangre.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoSangre"));
								
		this.jInternalFrameDetalleFormTipoSangre.jMenuItemEliminarTipoSangre.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoSangre"));		
		
		
		
		this.jInternalFrameDetalleFormTipoSangre.jButtonCancelarTipoSangre.addActionListener (new ButtonActionListener(this,"CancelarTipoSangre"));
		
		
		this.jInternalFrameDetalleFormTipoSangre.jButtonCancelarToolBarTipoSangre.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoSangre"));
					
		this.jInternalFrameDetalleFormTipoSangre.jMenuItemCancelarTipoSangre.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoSangre"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoSangre.jMenuItemDetalleCerrarTipoSangre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoSangre"));		
		
		
		
		this.jInternalFrameDetalleFormTipoSangre.jButtonGuardarCambiosToolBarTipoSangre.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoSangre"));
		
		
		
		this.jInternalFrameDetalleFormTipoSangre.jButtonGuardarCambiosToolBarTipoSangre.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoSangre"));
		
		
		
		this.jInternalFrameDetalleFormTipoSangre.jComboBoxTiposAccionesFormularioTipoSangre.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoSangre"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSangre.jButtonidTipoSangreBusqueda.addActionListener(new ButtonActionListener(this,"idTipoSangreBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoSangre.jButtonid_empresaTipoSangreUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoSangreUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSangre.jButtonid_empresaTipoSangreBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoSangreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSangre.jButtoncodigoTipoSangreBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoSangreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSangre.jButtonnombreTipoSangreBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoSangreBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoSangre.jTabbedPaneRelacionesTipoSangre.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoSangre"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoSangre"));
		
		if(this.jInternalFrameDetalleFormTipoSangre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSangre.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoSangre"));
		}
		
		this.jTableDatosTipoSangre.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoSangre"));
		
		this.jTableDatosTipoSangre.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoSangre"));
		
		this.jButtonNuevoTipoSangre.addActionListener(new ButtonActionListener(this,"NuevoTipoSangre"));
		
		this.jButtonDuplicarTipoSangre.addActionListener(new ButtonActionListener(this,"DuplicarTipoSangre"));
		
		this.jButtonCopiarTipoSangre.addActionListener(new ButtonActionListener(this,"CopiarTipoSangre"));
		
		this.jButtonVerFormTipoSangre.addActionListener(new ButtonActionListener(this,"VerFormTipoSangre"));
		
		
		this.jButtonNuevoToolBarTipoSangre.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoSangre"));
			
		this.jButtonDuplicarToolBarTipoSangre.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoSangre"));
			
		this.jMenuItemNuevoTipoSangre.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoSangre"));
			
		this.jMenuItemDuplicarTipoSangre.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoSangre"));		
		
		
		this.jButtonNuevoRelacionesTipoSangre.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoSangre"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoSangre.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoSangre"));
			
		this.jMenuItemNuevoRelacionesTipoSangre.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoSangre"));		
		
		
		if(this.jInternalFrameDetalleFormTipoSangre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSangre.jButtonModificarTipoSangre.addActionListener(new ButtonActionListener(this,"ModificarTipoSangre"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSangre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSangre.jButtonModificarToolBarTipoSangre.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoSangre"));
			
			this.jInternalFrameDetalleFormTipoSangre.jMenuItemModificarTipoSangre.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoSangre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSangre!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoSangre.jButtonActualizarTipoSangre.addActionListener (new ButtonActionListener(this,"ActualizarTipoSangre"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSangre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSangre.jButtonActualizarToolBarTipoSangre.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoSangre"));
				
			this.jInternalFrameDetalleFormTipoSangre.jMenuItemActualizarTipoSangre.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoSangre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSangre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSangre.jButtonEliminarTipoSangre.addActionListener (new ButtonActionListener(this,"EliminarTipoSangre"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSangre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSangre.jButtonEliminarToolBarTipoSangre.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoSangre"));
						
			this.jInternalFrameDetalleFormTipoSangre.jMenuItemEliminarTipoSangre.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoSangre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSangre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSangre.jButtonCancelarTipoSangre.addActionListener (new ButtonActionListener(this,"CancelarTipoSangre"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSangre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSangre.jButtonCancelarToolBarTipoSangre.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoSangre"));
			
			this.jInternalFrameDetalleFormTipoSangre.jMenuItemCancelarTipoSangre.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoSangre"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoSangre.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoSangre"));		
		
		
		this.jButtonCerrarTipoSangre.addActionListener (new ButtonActionListener(this,"CerrarTipoSangre"));
		
		
		this.jButtonCerrarToolBarTipoSangre.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoSangre"));
			
		this.jMenuItemCerrarTipoSangre.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoSangre"));
			
		if(this.jInternalFrameDetalleFormTipoSangre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSangre.jMenuItemDetalleCerrarTipoSangre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoSangre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSangre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSangre.jButtonGuardarCambiosTipoSangre.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoSangre"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSangre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSangre.jButtonGuardarCambiosToolBarTipoSangre.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoSangre"));
		}
		
		this.jButtonCopiarToolBarTipoSangre.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoSangre"));
			
		this.jButtonVerFormToolBarTipoSangre.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoSangre"));
		
		this.jMenuItemGuardarCambiosTipoSangre.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoSangre"));
			
		this.jMenuItemCopiarTipoSangre.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoSangre"));		
		
		this.jMenuItemVerFormTipoSangre.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoSangre"));		
		
		
		this.jButtonGuardarCambiosTablaTipoSangre.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoSangre"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoSangre.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoSangre"));
			
		this.jMenuItemGuardarCambiosTablaTipoSangre.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoSangre"));		
		
		
		
		this.jButtonRecargarInformacionTipoSangre.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoSangre"));
					
		this.jButtonRecargarInformacionToolBarTipoSangre.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoSangre"));
		
		this.jMenuItemRecargarInformacionTipoSangre.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoSangre"));		
		
		
		
		this.jButtonAnterioresTipoSangre.addActionListener (new ButtonActionListener(this,"AnterioresTipoSangre"));
		
		
		this.jButtonAnterioresToolBarTipoSangre.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoSangre"));
		
		this.jMenuItemAnterioresTipoSangre.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoSangre"));		
		
		
		this.jButtonSiguientesTipoSangre.addActionListener (new ButtonActionListener(this,"SiguientesTipoSangre"));
		
		
		this.jButtonSiguientesToolBarTipoSangre.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoSangre"));
			
		this.jMenuItemSiguientesTipoSangre.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoSangre"));
			
		this.jMenuItemAbrirOrderByTipoSangre.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoSangre"));
			
		this.jMenuItemMostrarOcultarTipoSangre.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoSangre"));
			
		this.jMenuItemDetalleAbrirOrderByTipoSangre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoSangre"));
			
		this.jMenuItemDetalleMostarOcultarTipoSangre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoSangre"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoSangre.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoSangre"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoSangre.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoSangre"));
			
		this.jMenuItemNuevoGuardarCambiosTipoSangre.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoSangre"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoSangre.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoSangre"));

		this.jCheckBoxSeleccionadosTipoSangre.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoSangre"));
		
		if(this.jInternalFrameDetalleFormTipoSangre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSangre.jComboBoxTiposAccionesFormularioTipoSangre.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoSangre"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoSangre.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoSangre"));
			
		this.jComboBoxTiposAccionesTipoSangre.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoSangre"));
					
		this.jComboBoxTiposSeleccionarTipoSangre.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoSangre"));
			
		this.jTextFieldValorCampoGeneralTipoSangre.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoSangre"));		
		
		
		if(this.jInternalFrameDetalleFormTipoSangre!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSangre.jButtonidTipoSangreBusqueda.addActionListener(new ButtonActionListener(this,"idTipoSangreBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoSangre.jButtonid_empresaTipoSangreUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoSangreUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSangre.jButtonid_empresaTipoSangreBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoSangreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSangre.jButtoncodigoTipoSangreBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoSangreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSangre.jButtonnombreTipoSangreBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoSangreBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoSangre!=null) {
				this.jInternalFrameReporteDinamicoTipoSangre.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoSangre"));
				this.jInternalFrameReporteDinamicoTipoSangre.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoSangre"));
				this.jInternalFrameReporteDinamicoTipoSangre.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoSangre"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoSangre.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoSangre"));				
			//this.jButtonGenerarReporteDinamicoTipoSangre.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoSangre"));
			//this.jButtonGenerarExcelReporteDinamicoTipoSangre.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoSangre"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoSangre!=null) {
				this.jInternalFrameImportacionTipoSangre.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoSangre"));
				this.jInternalFrameImportacionTipoSangre.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoSangre"));
				this.jInternalFrameImportacionTipoSangre.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoSangre"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoSangre.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoSangre"));
			
			this.jButtonAbrirOrderByToolBarTipoSangre.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoSangre"));			
			
			if(this.jInternalFrameOrderByTipoSangre!=null) {
				this.jInternalFrameOrderByTipoSangre.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoSangre"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoSangre!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoSangre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSangre.jTabbedPaneRelacionesTipoSangre.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoSangre"));
		
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
            		closingInternalFrameTipoSangre();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoSangre.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoSangre = (JInternalFrameBase)event.getSource();
	            	
	            TipoSangreBeanSwingJInternalFrame jInternalFrameParent=(TipoSangreBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoSangre.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoSangreActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoSangre.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoSangreListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoSangre.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoSangre.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSangreActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSangreActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSangreActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoSangre";
		inputMap = this.jButtonNuevoTipoSangre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoSangre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoSangreActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSangreActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSangreActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSangreActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoSangre";
		inputMap = this.jButtonNuevoRelacionesTipoSangre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoSangre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoSangreActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoSangre";
		inputMap = this.jButtonModificarTipoSangre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoSangre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoSangreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoSangre";
		inputMap = this.jButtonActualizarTipoSangre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoSangre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoSangreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoSangre";
		inputMap = this.jButtonEliminarTipoSangre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoSangre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoSangreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoSangre";
		inputMap = this.jButtonCancelarTipoSangre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoSangre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoSangreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoSangre";
		inputMap = this.jButtonCerrarTipoSangre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoSangre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoSangreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoSangre.jButtonGuardarCambiosTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoSangre";
		inputMap = this.jInternalFrameDetalleFormTipoSangre.jButtonGuardarCambiosTipoSangre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoSangre.jButtonGuardarCambiosTipoSangre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoSangreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoSangre.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoSangreItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoSangre.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoSangreActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoSangre.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoSangreActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoSangre.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoSangreActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSangre.jButtonidTipoSangreBusqueda.addActionListener(new ButtonActionListener(this,"idTipoSangreBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoSangre.jButtonid_empresaTipoSangreUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoSangreUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSangre.jButtonid_empresaTipoSangreBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoSangreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSangre.jButtoncodigoTipoSangreBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoSangreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSangre.jButtonnombreTipoSangreBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoSangreBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoSangre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoSangreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoSangreActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoSangre.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoSangre(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoSangre tiposangreAux:this.tiposangreLogic.getTipoSangres()) {
					tiposangreAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoSangre tiposangreAux:tiposangres) {
					tiposangreAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoSangreItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoSangre(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoSangre tiposangreAux:this.tiposangreLogic.getTipoSangres()) {
						tiposangreAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoSangre tiposangreAux:tiposangres) {
						tiposangreAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoSangre tiposangreAux:this.tiposangreLogic.getTipoSangres()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoSangre tiposangreAux:tiposangres) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoSangre(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoSangre.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoSangre.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoSangre,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoSangreItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoSangre(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoSangre.getSelectedRows();
			
			TipoSangre tiposangreLocal=new TipoSangre();
			
			//this.seleccionarTodosTipoSangre(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiposangreLocal =(TipoSangre) this.tiposangreLogic.getTipoSangres().toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tiposangreLocal =(TipoSangre) this.tiposangres.toArray()[this.jTableDatosTipoSangre.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tiposangreLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoSangre tiposangreAux:this.tiposangreLogic.getTipoSangres()) {
						tiposangreAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoSangre tiposangreAux:tiposangres) {
						tiposangreAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoSangre(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoSangre.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoSangre.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoSangre,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoSangreItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoSangreParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoSangreActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoSangre(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoSangre.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoSangre tiposangreAux:this.tiposangreLogic.getTipoSangres()) {
				
						if(sTipoSeleccionar.equals(TipoSangreConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiposangreAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoSangreConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiposangreAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoSangre tiposangreAux:tiposangres) {
					
						if(sTipoSeleccionar.equals(TipoSangreConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiposangreAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoSangreConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiposangreAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoSangre(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoSangreActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoSangre(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoSangre=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoSangre.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoSangre.jComboBoxTiposAccionesFormularioTipoSangre.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoSangre) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoSangre(conSplash);
				
					this.generarReporteTipoSangresSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoSangre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoSangre.jComboBoxTiposAccionesFormularioTipoSangre.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoSangresSeleccionados();
				//this.jComboBoxTiposAccionesTipoSangre.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoSangresSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoSangre.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoSangresSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoSangre.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoSangre();
				
				this.exportarTipoSangresSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoSangre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoSangre.jComboBoxTiposAccionesFormularioTipoSangre.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoSangres();
				//this.importarTipoSangres();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoSangre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoSangre.jComboBoxTiposAccionesFormularioTipoSangre.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoSangre();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoSangresSeleccionados();
				//this.jComboBoxTiposAccionesTipoSangre.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Sangre", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoSangre();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoSangre)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoSangre(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Sangre",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoSangre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoSangre.jComboBoxTiposAccionesFormularioTipoSangre.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoSangreBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoSangre) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoSangre(conSplash);
					
						//this.actualizarParametrosGeneralTipoSangre();
						
						this.generarReporteProcesoAccionTipoSangresSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoSangre.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoSangre.jComboBoxTiposAccionesFormularioTipoSangre.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoSangreBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo SangreS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Sangre", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoSangre();
				
						this.actualizarParametrosGeneralTipoSangre();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tiposangreReturnGeneral=tiposangreLogic.procesarAccionTipoSangresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tiposangreLogic.getTipoSangres(),this.tiposangreParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoSangreReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoSangre.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoSangre.jComboBoxTiposAccionesFormularioTipoSangre.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoSangre();
					
					TipoSangreBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoSangreReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoSangre.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoSangre.jComboBoxTiposAccionesFormularioTipoSangre.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoSangre(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoSangreActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoSangre();
			
			if(this.jInternalFrameDetalleFormTipoSangre==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoSangre> tiposangresSeleccionados=new ArrayList<TipoSangre>();		
			TipoSangre tiposangre=new TipoSangre();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoSangre(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoSangre.getSelectedItem();
			
			
			
			
			tiposangresSeleccionados=this.getTipoSangresSeleccionados(true);
			//this.sTipoAccion;
			
			if(tiposangresSeleccionados.size()==1) {
				for(TipoSangre tiposangreAux:tiposangresSeleccionados) {
					tiposangre=tiposangreAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Dato General Empleado")) {
					jButtonDatoGeneralEmpleadoActionPerformed(null,rowIndex,true,false,tiposangre);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoSangre();
			
      		//this.finishProcessTipoSangre(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoSangreReturnGeneral() throws Exception {
		if(this.tiposangreReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tiposangreReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tiposangreReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tiposangreReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tiposangreReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tiposangreReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoSangre(false);
		}
		
		if(this.tiposangreReturnGeneral.getConRetornoLista() || this.tiposangreReturnGeneral.getConRetornoObjeto()) {
			if(this.tiposangreReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiposangreLogic.setTipoSangres(this.tiposangreReturnGeneral.getTipoSangres());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tiposangreReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiposangreLogic.setTipoSangre(this.tiposangreReturnGeneral.getTipoSangre());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoSangre(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoSangre() throws Exception {
		
		
	}
	
	public ArrayList<TipoSangre> getTipoSangresSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoSangre> tiposangresSeleccionados=new ArrayList<TipoSangre>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoSangre) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoSangre tiposangreAux:tiposangreLogic.getTipoSangres()) {
					if(tiposangreAux.getIsSelected()) {
						tiposangresSeleccionados.add(tiposangreAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoSangre tiposangreAux:this.tiposangres) {
					if(tiposangreAux.getIsSelected()) {
						tiposangresSeleccionados.add(tiposangreAux);				
					}
				}
			}
			
			if(tiposangresSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tiposangresSeleccionados.addAll(this.tiposangreLogic.getTipoSangres());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tiposangresSeleccionados.addAll(this.tiposangres);				
					}
				}
			}
		} else {
			tiposangresSeleccionados.add(this.tiposangre);
		}
		
		return tiposangresSeleccionados;
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
	
	public void generarReporteTipoSangresSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoSangresSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoSangresSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoSangresSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoSangresSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoSangresSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Sangre",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoSangresSeleccionados() throws Exception {
		ArrayList<TipoSangre> tiposangresSeleccionados=new ArrayList<TipoSangre>();		
		
		tiposangresSeleccionados=this.getTipoSangresSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoSangres("Todos",tiposangresSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoSangresSeleccionados() throws Exception {
		ArrayList<TipoSangre> tiposangresSeleccionados=new ArrayList<TipoSangre>();		
		
		tiposangresSeleccionados=this.getTipoSangresSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoSangres("Todos",tiposangresSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoSangresSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoSangre> tiposangresSeleccionados=new ArrayList<TipoSangre>();
		
		tiposangresSeleccionados=this.getTipoSangresSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoSangres("Todos",tiposangresSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoSangresSeleccionados() throws Exception {
		ArrayList<TipoSangre> tiposangresSeleccionados=new ArrayList<TipoSangre>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoSangre();
		
		
		tiposangresSeleccionados=this.getTipoSangresSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoSangre();
		
		
		//this.generarReporteTipoSangres("Todos",tiposangresSeleccionados ,tiposangreImplementable,tiposangreImplementableHome);
	}
	
	public void mostrarImportacionTipoSangres() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoSangre();
		
		this.abrirFrameImportacionTipoSangre();		
		
			
		//this.generarReporteTipoSangres("Todos",tiposangresSeleccionados ,tiposangreImplementable,tiposangreImplementableHome);
	}
	
	public void importarTipoSangres() throws Exception {		
	
	}
	
	public void exportarTipoSangresSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoSangresSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoSangresSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoSangresSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Sangre",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoSangresSeleccionados() throws Exception {
		ArrayList<TipoSangre> tiposangresSeleccionados=new ArrayList<TipoSangre>();		
		
		tiposangresSeleccionados=this.getTipoSangresSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposangre."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoSangre(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoSangre tiposangreAux:tiposangresSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoSangre(tiposangreAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tiposangreAux.setsDetalleGeneralEntityReporte(tiposangreAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposangreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Sangre",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoSangre(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoSangreConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoSangreConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoSangreConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoSangreConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoSangreConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoSangre(TipoSangre tiposangre,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tiposangre.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tiposangre.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiposangre.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiposangre.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiposangre.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoSangresSeleccionados() throws Exception {
		ArrayList<TipoSangre> tiposangresSeleccionados=new ArrayList<TipoSangre>();		
		
		tiposangresSeleccionados=this.getTipoSangresSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposangre.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoSangres");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoSangre(row);				
				iRow++;
			}				
			
			for(TipoSangre tiposangreAux:tiposangresSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoSangre(tiposangreAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposangreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Sangre",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoSangresSeleccionados() throws Exception {
		ArrayList<TipoSangre> tiposangresSeleccionados=new ArrayList<TipoSangre>();		
		
		tiposangresSeleccionados=this.getTipoSangresSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposangre.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tiposangres");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tiposangre");
			//elementRoot.appendChild(element);
		
			for(TipoSangre tiposangreAux:tiposangresSeleccionados) {
				element = document.createElement("tiposangre");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoSangre(tiposangreAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposangreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Sangre",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoSangre(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoSangreConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoSangreConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoSangreConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoSangreConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoSangreConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoSangre(TipoSangre tiposangre,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tiposangre.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tiposangre.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tiposangre.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tiposangre.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoSangre(TipoSangre tiposangre,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoSangreConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tiposangre.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoSangreConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tiposangre.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoSangreConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tiposangre.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoSangreConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tiposangre.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoSangreConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tiposangre.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoSangresSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoSangre> tiposangresSeleccionados=new ArrayList<TipoSangre>();
		
		tiposangresSeleccionados=this.getTipoSangresSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoSangre(tiposangresSeleccionados);
		
		this.generarReporteTipoSangres("Todos",tiposangresSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoSangre(ArrayList<TipoSangre> tiposangresSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoSangre tiposangreAux:tiposangresSeleccionados) {
				tiposangreAux.setsDetalleGeneralEntityReporte(tiposangreAux.toString());
			
				if(sTipoSeleccionar.equals(TipoSangreConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tiposangreAux.setsDescripcionGeneralEntityReporte1(tiposangreAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoSangreConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tiposangreAux.setsDescripcionGeneralEntityReporte1(tiposangreAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoSangreConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tiposangreAux.setsDescripcionGeneralEntityReporte1(tiposangreAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSangreConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoSangre(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoSangre=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoSangre=true;
				this.isVisibilidadCeldaGuardarCambiosTipoSangre=true;
			}
			
			this.isVisibilidadCeldaModificarTipoSangre=false;
			this.isVisibilidadCeldaActualizarTipoSangre=false;
			this.isVisibilidadCeldaEliminarTipoSangre=false;
			this.isVisibilidadCeldaCancelarTipoSangre=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSangre=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoSangre=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoSangre=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoSangre=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSangre=false;
			this.isVisibilidadCeldaModificarTipoSangre=false;
			this.isVisibilidadCeldaActualizarTipoSangre=true;
			this.isVisibilidadCeldaEliminarTipoSangre=false;
			this.isVisibilidadCeldaCancelarTipoSangre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSangre=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoSangre=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoSangre=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoSangre=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSangre=false;
			this.isVisibilidadCeldaModificarTipoSangre=false;
			this.isVisibilidadCeldaActualizarTipoSangre=true;
			this.isVisibilidadCeldaEliminarTipoSangre=true;
			this.isVisibilidadCeldaCancelarTipoSangre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSangre=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoSangre=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoSangre=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoSangre=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSangre=false;
			this.isVisibilidadCeldaModificarTipoSangre=false;
			this.isVisibilidadCeldaActualizarTipoSangre=true;
			this.isVisibilidadCeldaEliminarTipoSangre=false;
			this.isVisibilidadCeldaCancelarTipoSangre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSangre=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoSangre=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoSangre=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoSangre=true;
			this.isVisibilidadCeldaGuardarCambiosTipoSangre=true;
			this.isVisibilidadCeldaModificarTipoSangre=false;
			this.isVisibilidadCeldaActualizarTipoSangre=false;
			this.isVisibilidadCeldaEliminarTipoSangre=false;
			this.isVisibilidadCeldaCancelarTipoSangre=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSangre=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoSangre=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoSangre=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoSangre=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSangre=false;
			this.isVisibilidadCeldaActualizarTipoSangre=false;
			this.isVisibilidadCeldaEliminarTipoSangre=false;
			this.isVisibilidadCeldaCancelarTipoSangre=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSangre=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoSangre=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoSangre=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoSangre=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSangre=false;
			this.isVisibilidadCeldaModificarTipoSangre=true;
			this.isVisibilidadCeldaActualizarTipoSangre=false;
			this.isVisibilidadCeldaEliminarTipoSangre=false;
			this.isVisibilidadCeldaCancelarTipoSangre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSangre=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoSangre=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoSangreJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoSangre=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoSangre=true;
			this.isVisibilidadCeldaGuardarCambiosTipoSangre=true;
		} else {
			this.actualizarEstadoPanelsTipoSangre(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoSangre=false;
			//this.isVisibilidadCeldaVerFormTipoSangre=false;
			this.isVisibilidadCeldaDuplicarTipoSangre=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tiposangreSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoSangre=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoSangre=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSangre=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tiposangreSessionBean.getEsGuardarRelacionado()) {
			if(!tiposangreSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoSangre=false;												
			}
			
			this.jButtonCerrarTipoSangre.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoSangre=false;
		}
		
		if(!this.permiteMantenimiento(this.tiposangre)) {
			this.isVisibilidadCeldaActualizarTipoSangre=false;
			this.isVisibilidadCeldaEliminarTipoSangre=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoSangre() {
		this.isVisibilidadCeldaNuevoTipoSangre=false;
		this.isVisibilidadCeldaGuardarCambiosTipoSangre=false;
	}
	
	public void actualizarEstadoPanelsTipoSangre(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoSangre!=null) {
				this.jScrollPanelDatosEdicionTipoSangre.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSangre!=null) {
				this.jTabbedPaneBusquedasTipoSangre.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoSangre!=null) {
				this.jScrollPanelDatosTipoSangre.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoSangre!=null) {
				this.jPanelPaginacionTipoSangre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoSangre!=null) {
				this.jPanelParametrosReportesTipoSangre.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoSangre!=null) {
				this.jScrollPanelDatosEdicionTipoSangre.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSangre!=null) {
				this.jTabbedPaneBusquedasTipoSangre.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoSangre!=null) {
				this.jScrollPanelDatosTipoSangre.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoSangre!=null) {
				this.jPanelPaginacionTipoSangre.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoSangre!=null) {
				this.jPanelParametrosReportesTipoSangre.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoSangre!=null) {
				this.jScrollPanelDatosEdicionTipoSangre.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSangre!=null) {
				this.jTabbedPaneBusquedasTipoSangre.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoSangre!=null) {
				this.jScrollPanelDatosTipoSangre.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoSangre!=null) {
				this.jPanelPaginacionTipoSangre.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoSangre!=null) {
				this.jPanelParametrosReportesTipoSangre.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoSangre!=null) {
				this.jScrollPanelDatosEdicionTipoSangre.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSangre!=null) {
				this.jTabbedPaneBusquedasTipoSangre.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoSangre!=null) {
				this.jScrollPanelDatosTipoSangre.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoSangre!=null) {
				this.jPanelPaginacionTipoSangre.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoSangre!=null) {
				this.jPanelParametrosReportesTipoSangre.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoSangre!=null) {
				this.jScrollPanelDatosEdicionTipoSangre.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSangre!=null) {
				this.jTabbedPaneBusquedasTipoSangre.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoSangre!=null) {
				this.jScrollPanelDatosTipoSangre.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoSangre!=null) {
				this.jPanelPaginacionTipoSangre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoSangre!=null) {
				this.jPanelParametrosReportesTipoSangre.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoSangre!=null) {
				this.jScrollPanelDatosEdicionTipoSangre.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSangre!=null) {
				this.jTabbedPaneBusquedasTipoSangre.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoSangre!=null) {
				this.jScrollPanelDatosTipoSangre.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoSangre!=null) {
				this.jPanelPaginacionTipoSangre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoSangre!=null) {
				this.jPanelParametrosReportesTipoSangre.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoSangre!=null) {
				this.jScrollPanelDatosEdicionTipoSangre.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSangre!=null) {
				this.jTabbedPaneBusquedasTipoSangre.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoSangre!=null) {
				this.jScrollPanelDatosTipoSangre.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoSangre!=null) {
				this.jPanelPaginacionTipoSangre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoSangre!=null) {
				this.jPanelParametrosReportesTipoSangre.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tiposangreSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoSangre!=null) {
					this.jTabbedPaneBusquedasTipoSangre.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoSangre!=null) {
				this.jPanelParametrosReportesTipoSangre.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tiposangreSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSangre!=null) {
				this.jTabbedPaneBusquedasTipoSangre.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoSangre!=null) {
				this.jPanelParametrosReportesTipoSangre.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoSangreParaDatoGeneralEmpleados() throws Exception {
		Boolean isPaginaPopupDatoGeneralEmpleado=false;

		try {

			if(this.tiposangreSessionBean==null) {
				this.tiposangreSessionBean=new TipoSangreSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoSessionBean=new DatoGeneralEmpleadoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoSessionBean.setsPathNavegacionActual(tiposangreSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDatoGeneralEmpleado=this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado(true);
			this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado(TipoSangreConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoSangre(true);
			this.jInternalFrameDetalleFormTipoSangre.datogeneralempleadoSessionBean.setlidTipoSangreActual(this.idTipoSangreActual);

			tiposangreSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoSangre(true);
			tiposangreSessionBean.setlIdTipoSangreActualForeignKey(this.idTipoSangreActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoSangreSessionBean tiposangreSessionBean=new TipoSangreSessionBean();
		
		if(this.tiposangreSessionBean==null) {
			this.tiposangreSessionBean=new TipoSangreSessionBean();
		}
		
		this.tiposangreSessionBean.setsUltimaBusquedaTipoSangre(this.getsAccionBusqueda());
		this.tiposangreSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tiposangreSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tiposangreSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoSangreSessionBean tiposangreSessionBean=new TipoSangreSessionBean();
		
		if(this.tiposangreSessionBean==null) {
			this.tiposangreSessionBean=new TipoSangreSessionBean();
		}
		
		if(this.tiposangreSessionBean.getsUltimaBusquedaTipoSangre()!=null&&!this.tiposangreSessionBean.getsUltimaBusquedaTipoSangre().equals("")) {
			this.setsAccionBusqueda(tiposangreSessionBean.getsUltimaBusquedaTipoSangre());
			this.setiNumeroPaginacion(tiposangreSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tiposangreSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tiposangreSessionBean.getid_empresa());
				tiposangreSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tiposangreSessionBean.setsUltimaBusquedaTipoSangre("");
		this.tiposangreSessionBean.setiNumeroPaginacion(TipoSangreConstantesFunciones.INUMEROPAGINACION);
		this.tiposangreSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoSangre(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoSangre() {
		this.updateBorderResaltarBusquedasFormularioTipoSangre();
		this.updateVisibilidadBusquedasFormularioTipoSangre();
		this.updateHabilitarBusquedasFormularioTipoSangre();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoSangre() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoSangre.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoSangre() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoSangre.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoSangre() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoSangre.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoSangre(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoSangre.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoSangre() throws Exception {

		if(this.jInternalFrameDetalleFormTipoSangre==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoSangre();
		this.updateVisibilidadResaltarControlesFormularioTipoSangre();
		this.updateHabilitarResaltarControlesFormularioTipoSangre();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoSangre() throws Exception {
		if(this.jInternalFrameDetalleFormTipoSangre==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tiposangreConstantesFunciones.resaltaridTipoSangre!=null && this.jInternalFrameDetalleFormTipoSangre!=null) {this.jInternalFrameDetalleFormTipoSangre.jLabelidTipoSangre.setBorder(this.tiposangreConstantesFunciones.resaltaridTipoSangre);}
		if(this.tiposangreConstantesFunciones.resaltarid_empresaTipoSangre!=null && this.jInternalFrameDetalleFormTipoSangre!=null) {this.jInternalFrameDetalleFormTipoSangre.jComboBoxid_empresaTipoSangre.setBorder(this.tiposangreConstantesFunciones.resaltarid_empresaTipoSangre);}
		if(this.tiposangreConstantesFunciones.resaltarcodigoTipoSangre!=null && this.jInternalFrameDetalleFormTipoSangre!=null) {this.jInternalFrameDetalleFormTipoSangre.jTextFieldcodigoTipoSangre.setBorder(this.tiposangreConstantesFunciones.resaltarcodigoTipoSangre);}
		if(this.tiposangreConstantesFunciones.resaltarnombreTipoSangre!=null && this.jInternalFrameDetalleFormTipoSangre!=null) {this.jInternalFrameDetalleFormTipoSangre.jTextAreanombreTipoSangre.setBorder(this.tiposangreConstantesFunciones.resaltarnombreTipoSangre);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoSangre() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoSangre==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoSangre!=null) {
	
		//this.jInternalFrameDetalleFormTipoSangre.jLabelidTipoSangre.setVisible(this.tiposangreConstantesFunciones.mostraridTipoSangre);
		this.jInternalFrameDetalleFormTipoSangre.jPanelidTipoSangre.setVisible(this.tiposangreConstantesFunciones.mostraridTipoSangre);
		//this.jInternalFrameDetalleFormTipoSangre.jComboBoxid_empresaTipoSangre.setVisible(this.tiposangreConstantesFunciones.mostrarid_empresaTipoSangre);
		this.jInternalFrameDetalleFormTipoSangre.jPanelid_empresaTipoSangre.setVisible(this.tiposangreConstantesFunciones.mostrarid_empresaTipoSangre);
		//this.jInternalFrameDetalleFormTipoSangre.jTextFieldcodigoTipoSangre.setVisible(this.tiposangreConstantesFunciones.mostrarcodigoTipoSangre);
		this.jInternalFrameDetalleFormTipoSangre.jPanelcodigoTipoSangre.setVisible(this.tiposangreConstantesFunciones.mostrarcodigoTipoSangre);
		//this.jInternalFrameDetalleFormTipoSangre.jTextAreanombreTipoSangre.setVisible(this.tiposangreConstantesFunciones.mostrarnombreTipoSangre);
		this.jInternalFrameDetalleFormTipoSangre.jPanelnombreTipoSangre.setVisible(this.tiposangreConstantesFunciones.mostrarnombreTipoSangre);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoSangre() throws Exception {
		if(this.jInternalFrameDetalleFormTipoSangre==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoSangre!=null) {
	
		this.jInternalFrameDetalleFormTipoSangre.jLabelidTipoSangre.setEnabled(this.tiposangreConstantesFunciones.activaridTipoSangre);
		this.jInternalFrameDetalleFormTipoSangre.jComboBoxid_empresaTipoSangre.setEnabled(this.tiposangreConstantesFunciones.activarid_empresaTipoSangre);
		this.jInternalFrameDetalleFormTipoSangre.jTextFieldcodigoTipoSangre.setEnabled(this.tiposangreConstantesFunciones.activarcodigoTipoSangre);
		this.jInternalFrameDetalleFormTipoSangre.jTextAreanombreTipoSangre.setEnabled(this.tiposangreConstantesFunciones.activarnombreTipoSangre);
		}
	}
	
		
}