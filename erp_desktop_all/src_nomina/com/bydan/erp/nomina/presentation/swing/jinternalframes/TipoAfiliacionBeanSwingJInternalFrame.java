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

import com.bydan.erp.nomina.util.TipoAfiliacionConstantesFunciones;
import com.bydan.erp.nomina.util.TipoAfiliacionParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoAfiliacionParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoAfiliacionBean;
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
public class TipoAfiliacionBeanSwingJInternalFrame extends TipoAfiliacionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoAfiliacionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoAfiliacion> tipoafiliacionValidator = new ClassValidator<TipoAfiliacion>(TipoAfiliacion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoAfiliacion tipoafiliacion;	
	public TipoAfiliacion tipoafiliacionAux;
	public TipoAfiliacion tipoafiliacionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoAfiliacion tipoafiliacionTotales;
	public Long idTipoAfiliacionActual;
	public Long iIdNuevoTipoAfiliacion=0L;
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

	public String sFinalQueryComboCateTipoAfiliacion="";

	public List<CateTipoAfiliacion> catetipoafiliacionsForeignKey;

	public List<CateTipoAfiliacion> getcatetipoafiliacionsForeignKey() {
		return catetipoafiliacionsForeignKey;
	}

	public void setcatetipoafiliacionsForeignKey(List<CateTipoAfiliacion> catetipoafiliacionsForeignKey) {
		this.catetipoafiliacionsForeignKey = catetipoafiliacionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public CateTipoAfiliacion catetipoafiliacionForeignKey;

	public CateTipoAfiliacion getcatetipoafiliacionForeignKey() {
		return catetipoafiliacionForeignKey;
	}

	public void setcatetipoafiliacionForeignKey(CateTipoAfiliacion catetipoafiliacionForeignKey) {
		this.catetipoafiliacionForeignKey = catetipoafiliacionForeignKey;
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
	
	public Boolean isPermisoTodoTipoAfiliacion;
	public Boolean isPermisoNuevoTipoAfiliacion;
	public Boolean isPermisoActualizarTipoAfiliacion;
	public Boolean isPermisoActualizarOriginalTipoAfiliacion;
	public Boolean isPermisoEliminarTipoAfiliacion;
	public Boolean isPermisoGuardarCambiosTipoAfiliacion;
	public Boolean isPermisoConsultaTipoAfiliacion;
	public Boolean isPermisoBusquedaTipoAfiliacion;
	public Boolean isPermisoReporteTipoAfiliacion;
	public Boolean isPermisoPaginacionMedioTipoAfiliacion;
	public Boolean isPermisoPaginacionAltoTipoAfiliacion;
	public Boolean isPermisoPaginacionTodoTipoAfiliacion;
	public Boolean isPermisoCopiarTipoAfiliacion;
	public Boolean isPermisoVerFormTipoAfiliacion;
	public Boolean isPermisoDuplicarTipoAfiliacion;
	public Boolean isPermisoOrdenTipoAfiliacion;
	
	
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
	
	public TipoAfiliacionParameterReturnGeneral tipoafiliacionReturnGeneral;
	public TipoAfiliacionParameterReturnGeneral tipoafiliacionParameterGeneral;
	
	

	public DatoGeneralEmpleadoLogic datogeneralempleadoLogic=null;

	public DatoGeneralEmpleadoLogic getDatoGeneralEmpleadoLogic() {
		return datogeneralempleadoLogic;
	}

	public void setDatoGeneralEmpleadoLogic(DatoGeneralEmpleadoLogic datogeneralempleadoLogic) {
		this.datogeneralempleadoLogic = datogeneralempleadoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoAfiliacion=false;
	public Boolean esParaAccionDesdeFormularioTipoAfiliacion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoAfiliacionSessionBeanAdditional tipoafiliacionSessionBeanAdditional=null;
	
	public TipoAfiliacionSessionBeanAdditional getTipoAfiliacionSessionBeanAdditional() {
		return this.tipoafiliacionSessionBeanAdditional;
	}
	
	public void setTipoAfiliacionSessionBeanAdditional(TipoAfiliacionSessionBeanAdditional tipoafiliacionSessionBeanAdditional) {
		try {
			this.tipoafiliacionSessionBeanAdditional=tipoafiliacionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoAfiliacionBeanSwingJInternalFrameAdditional tipoafiliacionBeanSwingJInternalFrameAdditional=null;
	//public class TipoAfiliacionBeanSwingJInternalFrame
	
	public TipoAfiliacionBeanSwingJInternalFrameAdditional getTipoAfiliacionBeanSwingJInternalFrameAdditional() {
		return this.tipoafiliacionBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoAfiliacionBeanSwingJInternalFrameAdditional(TipoAfiliacionBeanSwingJInternalFrameAdditional tipoafiliacionBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoafiliacionBeanSwingJInternalFrameAdditional=tipoafiliacionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoAfiliacionLogic tipoafiliacionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoAfiliacion tipoafiliacionBean;
	public TipoAfiliacionConstantesFunciones tipoafiliacionConstantesFunciones;
	//public TipoAfiliacionParameterReturnGeneral tipoafiliacionReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public CateTipoAfiliacionLogic catetipoafiliacionLogic;
	
	//PARAMETROS
	
	
	//public List<TipoAfiliacion> tipoafiliacions;	
	//public List<TipoAfiliacion> tipoafiliacionsEliminados;
	//public List<TipoAfiliacion> tipoafiliacionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoAfiliacion=false;
	public Boolean isVisibilidadCeldaDuplicarTipoAfiliacion=true;
	public Boolean isVisibilidadCeldaCopiarTipoAfiliacion=true;
	public Boolean isVisibilidadCeldaVerFormTipoAfiliacion=true;
	public Boolean isVisibilidadCeldaOrdenTipoAfiliacion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoAfiliacion=false;
	public Boolean isVisibilidadCeldaModificarTipoAfiliacion=false;
	public Boolean isVisibilidadCeldaActualizarTipoAfiliacion=false;
	public Boolean isVisibilidadCeldaEliminarTipoAfiliacion=false;
	public Boolean isVisibilidadCeldaCancelarTipoAfiliacion=false;
	public Boolean isVisibilidadCeldaGuardarTipoAfiliacion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoAfiliacion=false;	
	
	
	public Boolean isVisibilidadFK_IdCateTipoAfiliacion=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoAfiliacion() {
		return this.iIdNuevoTipoAfiliacion;
	}

	public void setiIdNuevoTipoAfiliacion(Long iIdNuevoTipoAfiliacion) {
		this.iIdNuevoTipoAfiliacion = iIdNuevoTipoAfiliacion;
	}
	
	public Long getidTipoAfiliacionActual() {
		return this.idTipoAfiliacionActual;
	}

	public void setidTipoAfiliacionActual(Long idTipoAfiliacionActual) {
		this.idTipoAfiliacionActual = idTipoAfiliacionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoAfiliacion gettipoafiliacion() {
		return this.tipoafiliacion;
	}

	public void settipoafiliacion(TipoAfiliacion tipoafiliacion) {
		this.tipoafiliacion = tipoafiliacion;
	}
	
	public TipoAfiliacion gettipoafiliacionAux() {
		return this.tipoafiliacionAux;
	}

	public void settipoafiliacionAux(TipoAfiliacion tipoafiliacionAux) {
		this.tipoafiliacionAux = tipoafiliacionAux;
	}				
	
	public TipoAfiliacion gettipoafiliacionAnterior() {
		return this.tipoafiliacionAnterior;
	}

	public void settipoafiliacionAnterior(TipoAfiliacion tipoafiliacionAnterior) {
		this.tipoafiliacionAnterior = tipoafiliacionAnterior;
	}	
	
	public TipoAfiliacion gettipoafiliacionTotales() {
		return this.tipoafiliacionTotales;
	}

	public void settipoafiliacionTotales(TipoAfiliacion tipoafiliacionTotales) {
		this.tipoafiliacionTotales = tipoafiliacionTotales;
	}	
	
	public TipoAfiliacion gettipoafiliacionBean() {
		return this.tipoafiliacionBean;
	}

	public void settipoafiliacionBean(TipoAfiliacion tipoafiliacionBean) {
		this.tipoafiliacionBean = tipoafiliacionBean;
	}	
	
	public TipoAfiliacionParameterReturnGeneral gettipoafiliacionReturnGeneral() {
		return this.tipoafiliacionReturnGeneral;
	}

	public void settipoafiliacionReturnGeneral(TipoAfiliacionParameterReturnGeneral tipoafiliacionReturnGeneral) {
		this.tipoafiliacionReturnGeneral = tipoafiliacionReturnGeneral;
	}	
	
	
	public Long id_cate_tipo_afiliacionFK_IdCateTipoAfiliacion=-1L;

	public Long getid_cate_tipo_afiliacionFK_IdCateTipoAfiliacion() {
		return this.id_cate_tipo_afiliacionFK_IdCateTipoAfiliacion;
	}

	public void setid_cate_tipo_afiliacionFK_IdCateTipoAfiliacion(Long id_cate_tipo_afiliacionFK_IdCateTipoAfiliacion) {
		this.id_cate_tipo_afiliacionFK_IdCateTipoAfiliacion = id_cate_tipo_afiliacionFK_IdCateTipoAfiliacion;
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
	
	
	public TipoAfiliacionLogic getTipoAfiliacionLogic()	{		
		return tipoafiliacionLogic;
	}

	public void setTipoAfiliacionLogic(TipoAfiliacionLogic tipoafiliacionLogic) {
		this.tipoafiliacionLogic = tipoafiliacionLogic;
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
	
	public Boolean getIsEsNuevoTipoAfiliacion() {
		return isEsNuevoTipoAfiliacion;
	}

	public void setIsEsNuevoTipoAfiliacion(Boolean isEsNuevoTipoAfiliacion) {
		this.isEsNuevoTipoAfiliacion = isEsNuevoTipoAfiliacion;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoAfiliacion() {
		return esParaAccionDesdeFormularioTipoAfiliacion;
	}
	
	public void setEsParaAccionDesdeFormularioTipoAfiliacion(Boolean esParaAccionDesdeFormularioTipoAfiliacion) {
		this.esParaAccionDesdeFormularioTipoAfiliacion = esParaAccionDesdeFormularioTipoAfiliacion;
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

			if(this.tipoafiliacionSessionBean==null) {
				this.tipoafiliacionSessionBean=new TipoAfiliacionSessionBean();
			}

			if(!this.tipoafiliacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipoafiliacionSessionBean.getlidEmpresaActual());
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

	public void cargarCombosCateTipoAfiliacionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.catetipoafiliacionsForeignKey=new ArrayList<CateTipoAfiliacion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CateTipoAfiliacionLogic catetipoafiliacionLogic=new CateTipoAfiliacionLogic();

			//catetipoafiliacionLogic.getCateTipoAfiliacionDataAccess().setIsForForeingKeyData(true);

			if(this.tipoafiliacionSessionBean==null) {
				this.tipoafiliacionSessionBean=new TipoAfiliacionSessionBean();
			}

			if(!this.tipoafiliacionSessionBean.getisBusquedaDesdeForeignKeySesionCateTipoAfiliacion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//catetipoafiliacionLogic.getCateTipoAfiliacionDataAccess().setIsForForeingKeyData(true);

					catetipoafiliacionLogic.getTodosCateTipoAfiliacionsWithConnection(sFinalQuery,new Pagination());

					this.catetipoafiliacionsForeignKey=catetipoafiliacionLogic.getCateTipoAfiliacions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCateTipoAfiliacion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					catetipoafiliacionLogic.getEntityWithConnection(tipoafiliacionSessionBean.getlidCateTipoAfiliacionActual());
					this.catetipoafiliacionsForeignKey.add(catetipoafiliacionLogic.getCateTipoAfiliacion());
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

					if(this.tipoafiliacion!=null) {
						this.tipoafiliacion.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) {
						this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_empresaTipoAfiliacion.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoAfiliacion.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) {
						if(this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_empresaTipoAfiliacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_empresaTipoAfiliacion.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoAfiliacionGenerico)throws Exception
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
				jComboBoxid_empresaTipoAfiliacionGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoAfiliacionGenerico!=null && jComboBoxid_empresaTipoAfiliacionGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoAfiliacionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCateTipoAfiliacionForeignKey(Long idCateTipoAfiliacionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CateTipoAfiliacion  catetipoafiliacionTemp=null;

			for(CateTipoAfiliacion catetipoafiliacionAux:catetipoafiliacionsForeignKey) {
				if(catetipoafiliacionAux.getId()!=null && catetipoafiliacionAux.getId().equals(idCateTipoAfiliacionSeleccionado)) {
					catetipoafiliacionTemp=catetipoafiliacionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(catetipoafiliacionTemp!=null) {

					if(this.tipoafiliacion!=null) {
						this.tipoafiliacion.setCateTipoAfiliacion(catetipoafiliacionTemp);
					}

					if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) {
						this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_cate_tipo_afiliacionTipoAfiliacion.setSelectedItem(catetipoafiliacionTemp);
					}
				} else {
					//jComboBoxid_cate_tipo_afiliacionTipoAfiliacion.setSelectedItem(catetipoafiliacionTemp);
					if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) {
						if(this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_cate_tipo_afiliacionTipoAfiliacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_cate_tipo_afiliacionTipoAfiliacion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCateTipoAfiliacion") || sFormularioTipoBusqueda.equals("Todos")){
					if(catetipoafiliacionTemp!=null && jComboBoxid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion!=null) {
						jComboBoxid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion.setSelectedItem(catetipoafiliacionTemp);
					} else {
						if(jComboBoxid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion!=null) {
							//jComboBoxid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion.setSelectedItem(catetipoafiliacionTemp);
							if(jComboBoxid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion.getItemCount()>0) {
								jComboBoxid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion.setSelectedIndex(0);
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

	public String getActualCateTipoAfiliacionForeignKeyDescripcion(Long idCateTipoAfiliacionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CateTipoAfiliacion  catetipoafiliacionTemp=null;

			for(CateTipoAfiliacion catetipoafiliacionAux:catetipoafiliacionsForeignKey) {
				if(catetipoafiliacionAux.getId()!=null && catetipoafiliacionAux.getId().equals(idCateTipoAfiliacionSeleccionado)) {
					catetipoafiliacionTemp=catetipoafiliacionAux;
					break;
				}
			}


			sDescripcion=CateTipoAfiliacionConstantesFunciones.getCateTipoAfiliacionDescripcion(catetipoafiliacionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCateTipoAfiliacionForeignKeyGenerico(Long idCateTipoAfiliacionSeleccionado,JComboBox jComboBoxid_cate_tipo_afiliacionTipoAfiliacionGenerico)throws Exception
	{
		try
		{
			CateTipoAfiliacion  catetipoafiliacionTemp=null;

			for(CateTipoAfiliacion catetipoafiliacionAux:catetipoafiliacionsForeignKey) {
				if(catetipoafiliacionAux.getId()!=null && catetipoafiliacionAux.getId().equals(idCateTipoAfiliacionSeleccionado)) {
					catetipoafiliacionTemp=catetipoafiliacionAux;
					break;
				}
			}

			if(catetipoafiliacionTemp!=null) {
				jComboBoxid_cate_tipo_afiliacionTipoAfiliacionGenerico.setSelectedItem(catetipoafiliacionTemp);
			} else {
				if(jComboBoxid_cate_tipo_afiliacionTipoAfiliacionGenerico!=null && jComboBoxid_cate_tipo_afiliacionTipoAfiliacionGenerico.getItemCount()>0) {
					jComboBoxid_cate_tipo_afiliacionTipoAfiliacionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoAfiliacion tipoafiliacion,JComboBox jComboBoxid_empresaTipoAfiliacionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoAfiliacionGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_empresaTipoAfiliacion.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoAfiliacionGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipoafiliacion.setid_empresa(empresaAux.getId());
				tipoafiliacion.setempresa_descripcion(TipoAfiliacionConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipoafiliacion.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCateTipoAfiliacionForeignKey(TipoAfiliacion tipoafiliacion,JComboBox jComboBoxid_cate_tipo_afiliacionTipoAfiliacionGenerico)throws Exception
	{
		try
		{
			CateTipoAfiliacion  catetipoafiliacionAux=new CateTipoAfiliacion();

			if(jComboBoxid_cate_tipo_afiliacionTipoAfiliacionGenerico==null) {
				catetipoafiliacionAux=(CateTipoAfiliacion)this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_cate_tipo_afiliacionTipoAfiliacion.getSelectedItem();
			} else {
				catetipoafiliacionAux=(CateTipoAfiliacion)jComboBoxid_cate_tipo_afiliacionTipoAfiliacionGenerico.getSelectedItem();
			}

			if(catetipoafiliacionAux!=null && catetipoafiliacionAux.getId()!=null) {
				tipoafiliacion.setid_cate_tipo_afiliacion(catetipoafiliacionAux.getId());
				tipoafiliacion.setcatetipoafiliacion_descripcion(TipoAfiliacionConstantesFunciones.getCateTipoAfiliacionDescripcion(catetipoafiliacionAux));
				tipoafiliacion.setCateTipoAfiliacion(catetipoafiliacionAux);			}
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

					if(!TipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) { 
							this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_empresaTipoAfiliacion.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_empresaTipoAfiliacion.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) { 
					}

					if(!TipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCateTipoAfiliacionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCateTipoAfiliacion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) { 
							this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_cate_tipo_afiliacionTipoAfiliacion.removeAllItems();

							for(CateTipoAfiliacion catetipoafiliacion:this.catetipoafiliacionsForeignKey) {
								if(catetipoafiliacion.getes_defecto()) {
									this.tipoafiliacionBean.setid_cate_tipo_afiliacion(catetipoafiliacion.getId());
								}

								this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_cate_tipo_afiliacionTipoAfiliacion.addItem(catetipoafiliacion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) { 
					}

					if(!TipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCateTipoAfiliacion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion.removeAllItems();

							for(CateTipoAfiliacion catetipoafiliacion:this.catetipoafiliacionsForeignKey) {
								this.jComboBoxid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion.addItem(catetipoafiliacion);
							}
						}

						if(!TipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) {
							this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_empresaTipoAfiliacion.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) {
							this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_empresaTipoAfiliacion.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCateTipoAfiliacionForeignKey(CateTipoAfiliacion catetipoafiliacion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) {
							this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_cate_tipo_afiliacionTipoAfiliacion.setSelectedItem(catetipoafiliacion);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) {
							this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_cate_tipo_afiliacionTipoAfiliacion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion.setSelectedItem(catetipoafiliacion);
						} else {
							this.jComboBoxid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoAfiliacion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoAfiliacionConstantesFunciones.refrescarForeignKeysDescripcionesTipoAfiliacion(this.tipoafiliacionLogic.getTipoAfiliacions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoAfiliacionConstantesFunciones.refrescarForeignKeysDescripcionesTipoAfiliacion(this.tipoafiliacions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(CateTipoAfiliacion.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoafiliacionLogic.setTipoAfiliacions(this.tipoafiliacions);
			tipoafiliacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoAfiliacionParameterReturnGeneral getTipoAfiliacionParameterGeneral() {
		return this.tipoafiliacionParameterGeneral;
	}
	
	public void setTipoAfiliacionParameterGeneral(TipoAfiliacionParameterReturnGeneral tipoafiliacionParameterGeneral) {
		this.tipoafiliacionParameterGeneral = tipoafiliacionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoAfiliacion() {
		return isPermisoTodoTipoAfiliacion;
	}

	public void setIsPermisoTodoTipoAfiliacion(Boolean isPermisoTodoTipoAfiliacion) {
		this.isPermisoTodoTipoAfiliacion = isPermisoTodoTipoAfiliacion;
	}

	public Boolean getIsPermisoNuevoTipoAfiliacion() {
		return isPermisoNuevoTipoAfiliacion;
	}

	public void setIsPermisoNuevoTipoAfiliacion(Boolean isPermisoNuevoTipoAfiliacion) {
		this.isPermisoNuevoTipoAfiliacion = isPermisoNuevoTipoAfiliacion;
	}

	public Boolean getIsPermisoActualizarTipoAfiliacion() {
		return isPermisoActualizarTipoAfiliacion;
	}

	public void setIsPermisoActualizarTipoAfiliacion(Boolean isPermisoActualizarTipoAfiliacion) {
		this.isPermisoActualizarTipoAfiliacion = isPermisoActualizarTipoAfiliacion;
	}

	public Boolean getIsPermisoEliminarTipoAfiliacion() {
		return isPermisoEliminarTipoAfiliacion;
	}

	public void setIsPermisoEliminarTipoAfiliacion(Boolean isPermisoEliminarTipoAfiliacion) {
		this.isPermisoEliminarTipoAfiliacion = isPermisoEliminarTipoAfiliacion;
	}

	public Boolean getIsPermisoGuardarCambiosTipoAfiliacion() {
		return isPermisoGuardarCambiosTipoAfiliacion;
	}

	public void setIsPermisoGuardarCambiosTipoAfiliacion(Boolean isPermisoGuardarCambiosTipoAfiliacion) {
		this.isPermisoGuardarCambiosTipoAfiliacion = isPermisoGuardarCambiosTipoAfiliacion;
	}
	
	public Boolean getIsPermisoConsultaTipoAfiliacion() {
		return isPermisoConsultaTipoAfiliacion;
	}

	public void setIsPermisoConsultaTipoAfiliacion(Boolean isPermisoConsultaTipoAfiliacion) {
		this.isPermisoConsultaTipoAfiliacion = isPermisoConsultaTipoAfiliacion;
	}

	public Boolean getIsPermisoBusquedaTipoAfiliacion() {
		return isPermisoBusquedaTipoAfiliacion;
	}

	public void setIsPermisoBusquedaTipoAfiliacion(Boolean isPermisoBusquedaTipoAfiliacion) {
		this.isPermisoBusquedaTipoAfiliacion = isPermisoBusquedaTipoAfiliacion;
	}

	public Boolean getIsPermisoReporteTipoAfiliacion() {
		return isPermisoReporteTipoAfiliacion;
	}

	public void setIsPermisoReporteTipoAfiliacion(Boolean isPermisoReporteTipoAfiliacion) {
		this.isPermisoReporteTipoAfiliacion = isPermisoReporteTipoAfiliacion;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoAfiliacion() {
		return isPermisoPaginacionMedioTipoAfiliacion;
	}

	public void setIsPermisoPaginacionMedioTipoAfiliacion(Boolean isPermisoPaginacionMedioTipoAfiliacion) {
		this.isPermisoPaginacionMedioTipoAfiliacion = isPermisoPaginacionMedioTipoAfiliacion;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoAfiliacion() {
		return isPermisoPaginacionTodoTipoAfiliacion;
	}

	public void setIsPermisoPaginacionTodoTipoAfiliacion(Boolean isPermisoPaginacionTodoTipoAfiliacion) {
		this.isPermisoPaginacionTodoTipoAfiliacion = isPermisoPaginacionTodoTipoAfiliacion;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoAfiliacion() {
		return isPermisoPaginacionAltoTipoAfiliacion;
	}

	public void setIsPermisoPaginacionAltoTipoAfiliacion(Boolean isPermisoPaginacionAltoTipoAfiliacion) {
		this.isPermisoPaginacionAltoTipoAfiliacion = isPermisoPaginacionAltoTipoAfiliacion;
	}
	
	public Boolean getIsPermisoCopiarTipoAfiliacion() {
		return isPermisoCopiarTipoAfiliacion;
	}

	public void setIsPermisoCopiarTipoAfiliacion(Boolean isPermisoCopiarTipoAfiliacion) {
		this.isPermisoCopiarTipoAfiliacion = isPermisoCopiarTipoAfiliacion;
	}
	
	public Boolean getIsPermisoVerFormTipoAfiliacion() {
		return isPermisoVerFormTipoAfiliacion;
	}

	public void setIsPermisoVerFormTipoAfiliacion(Boolean isPermisoVerFormTipoAfiliacion) {
		this.isPermisoVerFormTipoAfiliacion = isPermisoVerFormTipoAfiliacion;
	}
	
	public Boolean getIsPermisoDuplicarTipoAfiliacion() {
		return isPermisoDuplicarTipoAfiliacion;
	}

	public void setIsPermisoDuplicarTipoAfiliacion(Boolean isPermisoDuplicarTipoAfiliacion) {
		this.isPermisoDuplicarTipoAfiliacion = isPermisoDuplicarTipoAfiliacion;
	}
	
	public Boolean getIsPermisoOrdenTipoAfiliacion() {
		return isPermisoOrdenTipoAfiliacion;
	}

	public void setIsPermisoOrdenTipoAfiliacion(Boolean isPermisoOrdenTipoAfiliacion) {
		this.isPermisoOrdenTipoAfiliacion = isPermisoOrdenTipoAfiliacion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoAfiliacion() {
		return isVisibilidadCeldaNuevoTipoAfiliacion;
	}

	public void setIsVisibilidadCeldaNuevoTipoAfiliacion(Boolean isVisibilidadCeldaNuevoTipoAfiliacion) {
		this.isVisibilidadCeldaNuevoTipoAfiliacion = isVisibilidadCeldaNuevoTipoAfiliacion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoAfiliacion() {
		return isVisibilidadCeldaDuplicarTipoAfiliacion;
	}

	public void setIsVisibilidadCeldaDuplicarTipoAfiliacion(Boolean isVisibilidadCeldaDuplicarTipoAfiliacion) {
		this.isVisibilidadCeldaDuplicarTipoAfiliacion = isVisibilidadCeldaDuplicarTipoAfiliacion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoAfiliacion() {
		return isVisibilidadCeldaCopiarTipoAfiliacion;
	}

	public void setIsVisibilidadCeldaCopiarTipoAfiliacion(Boolean isVisibilidadCeldaCopiarTipoAfiliacion) {
		this.isVisibilidadCeldaCopiarTipoAfiliacion = isVisibilidadCeldaCopiarTipoAfiliacion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoAfiliacion() {
		return isVisibilidadCeldaVerFormTipoAfiliacion;
	}

	public void setIsVisibilidadCeldaVerFormTipoAfiliacion(Boolean isVisibilidadCeldaVerFormTipoAfiliacion) {
		this.isVisibilidadCeldaVerFormTipoAfiliacion = isVisibilidadCeldaVerFormTipoAfiliacion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoAfiliacion() {
		return isVisibilidadCeldaOrdenTipoAfiliacion;
	}

	public void setIsVisibilidadCeldaOrdenTipoAfiliacion(Boolean isVisibilidadCeldaOrdenTipoAfiliacion) {
		this.isVisibilidadCeldaOrdenTipoAfiliacion = isVisibilidadCeldaOrdenTipoAfiliacion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoAfiliacion() {
		return isVisibilidadCeldaNuevoRelacionesTipoAfiliacion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoAfiliacion(Boolean isVisibilidadCeldaNuevoRelacionesTipoAfiliacion) {
		this.isVisibilidadCeldaNuevoRelacionesTipoAfiliacion = isVisibilidadCeldaNuevoRelacionesTipoAfiliacion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoAfiliacion() {
		return isVisibilidadCeldaModificarTipoAfiliacion;
	}

	public void setIsVisibilidadCeldaModificarTipoAfiliacion(Boolean isVisibilidadCeldaModificarTipoAfiliacion) {
		this.isVisibilidadCeldaModificarTipoAfiliacion = isVisibilidadCeldaModificarTipoAfiliacion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoAfiliacion() {
		return isVisibilidadCeldaActualizarTipoAfiliacion;
	}

	public void setIsVisibilidadCeldaActualizarTipoAfiliacion(Boolean isVisibilidadCeldaActualizarTipoAfiliacion) {
		this.isVisibilidadCeldaActualizarTipoAfiliacion = isVisibilidadCeldaActualizarTipoAfiliacion;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoAfiliacion() {
		return isVisibilidadCeldaEliminarTipoAfiliacion;
	}

	public void setIsVisibilidadCeldaEliminarTipoAfiliacion(Boolean isVisibilidadCeldaEliminarTipoAfiliacion) {
		this.isVisibilidadCeldaEliminarTipoAfiliacion = isVisibilidadCeldaEliminarTipoAfiliacion;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoAfiliacion() {
		return isVisibilidadCeldaCancelarTipoAfiliacion;
	}

	public void setIsVisibilidadCeldaCancelarTipoAfiliacion(Boolean isVisibilidadCeldaCancelarTipoAfiliacion) {
		this.isVisibilidadCeldaCancelarTipoAfiliacion = isVisibilidadCeldaCancelarTipoAfiliacion;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoAfiliacion() {
		return isVisibilidadCeldaGuardarTipoAfiliacion;
	}

	public void setIsVisibilidadCeldaGuardarTipoAfiliacion(Boolean isVisibilidadCeldaGuardarTipoAfiliacion) {
		this.isVisibilidadCeldaGuardarTipoAfiliacion = isVisibilidadCeldaGuardarTipoAfiliacion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoAfiliacion() {
		return isVisibilidadCeldaGuardarCambiosTipoAfiliacion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoAfiliacion(Boolean isVisibilidadCeldaGuardarCambiosTipoAfiliacion) {
		this.isVisibilidadCeldaGuardarCambiosTipoAfiliacion = isVisibilidadCeldaGuardarCambiosTipoAfiliacion;
	}
		
	public TipoAfiliacionSessionBean gettipoafiliacionSessionBean() {
		return this.tipoafiliacionSessionBean;
	}
	
	public void settipoafiliacionSessionBean(TipoAfiliacionSessionBean tipoafiliacionSessionBean) {
		this.tipoafiliacionSessionBean=tipoafiliacionSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCateTipoAfiliacion() {
		return this.isVisibilidadFK_IdCateTipoAfiliacion;
	}

	public void setisVisibilidadFK_IdCateTipoAfiliacion(Boolean isVisibilidadFK_IdCateTipoAfiliacion) {
		this.isVisibilidadFK_IdCateTipoAfiliacion=isVisibilidadFK_IdCateTipoAfiliacion;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(TipoAfiliacion tipoafiliacion)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipoafiliacion,null);
				this.setActualParaGuardarCateTipoAfiliacionForeignKey(tipoafiliacion,null);
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
	
	public void bugActualizarReferenciaActual(TipoAfiliacion tipoafiliacion,TipoAfiliacion tipoafiliacionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoAfiliacion(tipoafiliacion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoafiliacionAux.setId(tipoafiliacion.getId());
		tipoafiliacionAux.setVersionRow(tipoafiliacion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoAfiliacion();
		
			int intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoAfiliacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.tipoafiliacion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoafiliacionValidator.getInvalidValues(this.tipoafiliacion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoafiliacionLogic.setDatosCliente(datosCliente);
			tipoafiliacionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoafiliacionAux=new  TipoAfiliacion();
				
				tipoafiliacionAux.setIsNew(true);
				tipoafiliacionAux.setIsChanged(true);
				
				tipoafiliacionAux.setTipoAfiliacionOriginal(this.tipoafiliacion);
				
				tipoafiliacionAux.setId(this.tipoafiliacion.getId());	
				tipoafiliacionAux.setVersionRow(this.tipoafiliacion.getVersionRow());	
				tipoafiliacionAux.setid_empresa(this.tipoafiliacion.getid_empresa());	
				tipoafiliacionAux.setid_cate_tipo_afiliacion(this.tipoafiliacion.getid_cate_tipo_afiliacion());	
				tipoafiliacionAux.setcodigo(this.tipoafiliacion.getcodigo());	
				tipoafiliacionAux.setnombre(this.tipoafiliacion.getnombre());	
				tipoafiliacionAux.setporcen_emplea(this.tipoafiliacion.getporcen_emplea());	
				tipoafiliacionAux.setporcen_patro(this.tipoafiliacion.getporcen_patro());	
				tipoafiliacionAux.setporcen_gene_emplea(this.tipoafiliacion.getporcen_gene_emplea());	
				tipoafiliacionAux.setporcen_gene_patro(this.tipoafiliacion.getporcen_gene_patro());	
				tipoafiliacionAux.setporcen_secu(this.tipoafiliacion.getporcen_secu());	
				tipoafiliacionAux.setporcen_iece(this.tipoafiliacion.getporcen_iece());	
				tipoafiliacionAux.setdescripcion(this.tipoafiliacion.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoafiliacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoafiliacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoafiliacionAux,tipoafiliacionLogic.getTipoAfiliacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoafiliacionAux,tipoafiliacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoafiliacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoafiliacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoafiliacionLogic.saveTipoAfiliacions();//WithConnection
						//tipoafiliacionLogic.getSetVersionRowTipoAfiliacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoafiliacion,tipoafiliacionAux);
					
					this.refrescarForeignKeysDescripcionesTipoAfiliacion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoafiliacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados().addAll(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados.addAll(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoafiliacionLogic.saveTipoAfiliacionRelaciones(tipoafiliacionAux,this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());//WithConnection
								//tipoafiliacionLogic.getSetVersionRowTipoAfiliacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoafiliacion,tipoafiliacionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(new ArrayList<DatoGeneralEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados= new ArrayList<DatoGeneralEmpleado>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoafiliacionAux.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoafiliacionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoafiliacionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoafiliacionAux,tipoafiliacionLogic.getTipoAfiliacions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoafiliacionAux,tipoafiliacions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoafiliacion,tipoafiliacionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoafiliacionAux=new  TipoAfiliacion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoafiliacionSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoafiliacionSessionBean.getEsGuardarRelacionado() && this.tipoafiliacion.getId()>=0)) {
						
					tipoafiliacionAux.setIsNew(false);
				}
				
				tipoafiliacionAux.setIsDeleted(false);
			
				tipoafiliacionAux.setId(this.tipoafiliacion.getId());	
				tipoafiliacionAux.setVersionRow(this.tipoafiliacion.getVersionRow());	
				tipoafiliacionAux.setid_empresa(this.tipoafiliacion.getid_empresa());	
				tipoafiliacionAux.setid_cate_tipo_afiliacion(this.tipoafiliacion.getid_cate_tipo_afiliacion());	
				tipoafiliacionAux.setcodigo(this.tipoafiliacion.getcodigo());	
				tipoafiliacionAux.setnombre(this.tipoafiliacion.getnombre());	
				tipoafiliacionAux.setporcen_emplea(this.tipoafiliacion.getporcen_emplea());	
				tipoafiliacionAux.setporcen_patro(this.tipoafiliacion.getporcen_patro());	
				tipoafiliacionAux.setporcen_gene_emplea(this.tipoafiliacion.getporcen_gene_emplea());	
				tipoafiliacionAux.setporcen_gene_patro(this.tipoafiliacion.getporcen_gene_patro());	
				tipoafiliacionAux.setporcen_secu(this.tipoafiliacion.getporcen_secu());	
				tipoafiliacionAux.setporcen_iece(this.tipoafiliacion.getporcen_iece());	
				tipoafiliacionAux.setdescripcion(this.tipoafiliacion.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoafiliacionAux,tipoafiliacionLogic.getTipoAfiliacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoafiliacionAux,tipoafiliacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoafiliacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoafiliacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoafiliacionLogic.saveTipoAfiliacions();//WithConnection
						//tipoafiliacionLogic.getSetVersionRowTipoAfiliacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoafiliacion,tipoafiliacionAux);
					
					this.refrescarForeignKeysDescripcionesTipoAfiliacion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoafiliacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados().addAll(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados.addAll(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoafiliacionLogic.saveTipoAfiliacionRelaciones(tipoafiliacionAux,this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());//WithConnection
								//tipoafiliacionLogic.getSetVersionRowTipoAfiliacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoafiliacion,tipoafiliacionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(new ArrayList<DatoGeneralEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados= new ArrayList<DatoGeneralEmpleado>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoafiliacionAux.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoafiliacionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoafiliacionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoafiliacionAux,tipoafiliacionLogic.getTipoAfiliacions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoafiliacionAux,tipoafiliacions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoafiliacion,tipoafiliacionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoafiliacionAux=new  TipoAfiliacion();
				
				tipoafiliacionAux.setIsNew(false);
				tipoafiliacionAux.setIsChanged(false);
				
				tipoafiliacionAux.setIsDeleted(true);
				
				tipoafiliacionAux.setId(this.tipoafiliacion.getId());	
				tipoafiliacionAux.setVersionRow(this.tipoafiliacion.getVersionRow());	
				tipoafiliacionAux.setid_empresa(this.tipoafiliacion.getid_empresa());	
				tipoafiliacionAux.setid_cate_tipo_afiliacion(this.tipoafiliacion.getid_cate_tipo_afiliacion());	
				tipoafiliacionAux.setcodigo(this.tipoafiliacion.getcodigo());	
				tipoafiliacionAux.setnombre(this.tipoafiliacion.getnombre());	
				tipoafiliacionAux.setporcen_emplea(this.tipoafiliacion.getporcen_emplea());	
				tipoafiliacionAux.setporcen_patro(this.tipoafiliacion.getporcen_patro());	
				tipoafiliacionAux.setporcen_gene_emplea(this.tipoafiliacion.getporcen_gene_emplea());	
				tipoafiliacionAux.setporcen_gene_patro(this.tipoafiliacion.getporcen_gene_patro());	
				tipoafiliacionAux.setporcen_secu(this.tipoafiliacion.getporcen_secu());	
				tipoafiliacionAux.setporcen_iece(this.tipoafiliacion.getporcen_iece());	
				tipoafiliacionAux.setdescripcion(this.tipoafiliacion.getdescripcion());	
				
				if(this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoafiliacionAux.getId()>=0) {	
						this.tipoafiliacionsEliminados.add(tipoafiliacionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoafiliacionAux,tipoafiliacionLogic.getTipoAfiliacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoafiliacionAux,tipoafiliacions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoafiliacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoafiliacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoafiliacionLogic.saveTipoAfiliacions();//WithConnection
						//tipoafiliacionLogic.getSetVersionRowTipoAfiliacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoafiliacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados().addAll(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados.addAll(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoafiliacionLogic.saveTipoAfiliacionRelaciones(tipoafiliacionAux,this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());//WithConnection
								//tipoafiliacionLogic.getSetVersionRowTipoAfiliacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(new ArrayList<DatoGeneralEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados= new ArrayList<DatoGeneralEmpleado>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoafiliacionAux.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoafiliacionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoafiliacionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoafiliacionAux,tipoafiliacionLogic.getTipoAfiliacions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoafiliacionAux,tipoafiliacions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.getTipoAfiliacions().addAll(this.tipoafiliacionsEliminados);
					
					tipoafiliacionLogic.saveTipoAfiliacions();//WithConnection
					//tipoafiliacionLogic.getSetVersionRowTipoAfiliacions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoAfiliacion();
				
				this.tipoafiliacionsEliminados= new ArrayList<TipoAfiliacion>();		
			}
			
			if(this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Afiliacion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Afiliacion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoafiliacion=tipoafiliacionAux;
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
      		//this.finishProcessTipoAfiliacion();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoAfiliacion tipoafiliacionLocal) throws Exception {
		
		if(this.tipoafiliacionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoafiliacionLocal.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());
			
			} else {
			
				tipoafiliacionLocal.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoAfiliacion tipoafiliacionLocal) throws Exception {	
		if(this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoafiliacionLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CateTipoAfiliacionDetalleFormJInternalFrame.class)) {
				CateTipoAfiliacionBeanSwingJInternalFrame catetipoafiliacionBeanSwingJInternalFrameLocal=(CateTipoAfiliacionBeanSwingJInternalFrame) ((CateTipoAfiliacionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				catetipoafiliacionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCateTipoAfiliacion(catetipoafiliacionBeanSwingJInternalFrameLocal.getcatetipoafiliacion(),true);
				catetipoafiliacionBeanSwingJInternalFrameLocal.actualizarLista(catetipoafiliacionBeanSwingJInternalFrameLocal.catetipoafiliacion,this.catetipoafiliacionsForeignKey);

				catetipoafiliacionBeanSwingJInternalFrameLocal.actualizarRelaciones(catetipoafiliacionBeanSwingJInternalFrameLocal.catetipoafiliacion);

				tipoafiliacionLocal.setCateTipoAfiliacion(catetipoafiliacionBeanSwingJInternalFrameLocal.catetipoafiliacion);

				this.addItemDefectoCombosForeignKeyCateTipoAfiliacion();
				this.cargarCombosFrameCateTipoAfiliacionsForeignKey("Formulario");
				this.setActualCateTipoAfiliacionForeignKey(catetipoafiliacionBeanSwingJInternalFrameLocal.catetipoafiliacion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoAfiliacionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoafiliacionValidator.getInvalidValues(this.tipoafiliacion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoAfiliacion tipoafiliacion,List<TipoAfiliacion> tipoafiliacions) throws Exception {
		try	{		
			TipoAfiliacionConstantesFunciones.actualizarLista(tipoafiliacion,tipoafiliacions,this.tipoafiliacionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoAfiliacion tipoafiliacion,List<TipoAfiliacion> tipoafiliacions) throws Exception {
		try	{			
			TipoAfiliacionConstantesFunciones.actualizarSelectedLista(tipoafiliacion,tipoafiliacions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoAfiliacion> tipoafiliacionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoafiliacionsLocal=this.tipoafiliacionLogic.getTipoAfiliacions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoafiliacionsLocal=this.tipoafiliacions;
			}
			//ARCHITECTURE
		
			for(TipoAfiliacion tipoafiliacionLocal:tipoafiliacionsLocal) {
				if(this.permiteMantenimiento(tipoafiliacionLocal) && tipoafiliacionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoAfiliacionConstantesFunciones.getTipoAfiliacionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoAfiliacionConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelid_empresaTipoAfiliacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoAfiliacionConstantesFunciones.IDCATETIPOAFILIACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelid_cate_tipo_afiliacionTipoAfiliacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoAfiliacionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelcodigoTipoAfiliacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoAfiliacionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelnombreTipoAfiliacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoAfiliacionConstantesFunciones.PORCENEMPLEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelporcen_empleaTipoAfiliacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoAfiliacionConstantesFunciones.PORCENPATRO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelporcen_patroTipoAfiliacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoAfiliacionConstantesFunciones.PORCENGENEEMPLEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelporcen_gene_empleaTipoAfiliacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoAfiliacionConstantesFunciones.PORCENGENEPATRO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelporcen_gene_patroTipoAfiliacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoAfiliacionConstantesFunciones.PORCENSECU)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelporcen_secuTipoAfiliacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoAfiliacionConstantesFunciones.PORCENIECE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelporcen_ieceTipoAfiliacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoAfiliacionConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAfiliacion.jLabeldescripcionTipoAfiliacion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelid_empresaTipoAfiliacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelid_cate_tipo_afiliacionTipoAfiliacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelcodigoTipoAfiliacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelnombreTipoAfiliacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelporcen_empleaTipoAfiliacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelporcen_patroTipoAfiliacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelporcen_gene_empleaTipoAfiliacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelporcen_gene_patroTipoAfiliacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelporcen_secuTipoAfiliacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelporcen_ieceTipoAfiliacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoAfiliacion.jLabeldescripcionTipoAfiliacion,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DatoGeneralEmpleado")) {
			if(this.tipoafiliacion==null) {
				this.tipoafiliacion= new TipoAfiliacion();
			}

			if(this.tipoafiliacionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoAfiliacion
				this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.tipoafiliacion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);

				this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.getdatogeneralempleado().setTipoAfiliacion(this.tipoafiliacion);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoAfiliacion--;	
		
		
		this.tipoafiliacionAux=new TipoAfiliacion();
		
		this.tipoafiliacionAux.setId(this.iIdNuevoTipoAfiliacion);
		this.tipoafiliacionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoafiliacionLogic.getTipoAfiliacions().add(this.tipoafiliacionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoafiliacions.add(this.tipoafiliacionAux);
		}
		//ARCHITECTURE
		
		this.tipoafiliacion=this.tipoafiliacionAux;
		
		if(TipoAfiliacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoAfiliacion(this.tipoafiliacion);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoAfiliacion(this.tipoafiliacion);
		}
				
		//this.setDefaultControlesTipoAfiliacion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoAfiliacion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoAfiliacion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoAfiliacion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoAfiliacion(this.tipoafiliacionBean,this.tipoafiliacion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoAfiliacionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoafiliacionSessionBean.getConGuardarRelaciones()) {
			classes=TipoAfiliacionConstantesFunciones.getClassesRelationshipsOfTipoAfiliacion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoafiliacionReturnGeneral=tipoafiliacionLogic.procesarEventosTipoAfiliacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoafiliacionLogic.getTipoAfiliacions(),this.tipoafiliacion,this.tipoafiliacionParameterGeneral,this.isEsNuevoTipoAfiliacion,classes);//this.tipoafiliacionLogic.getTipoAfiliacion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoAfiliacion(this.tipoafiliacionReturnGeneral,this.tipoafiliacionBean,false);
		
		if(this.tipoafiliacionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoAfiliacion(this.tipoafiliacionReturnGeneral.getTipoAfiliacion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoAfiliacion(this.tipoafiliacionReturnGeneral.getTipoAfiliacion());
		}
		
		if(this.tipoafiliacionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoAfiliacion(this.tipoafiliacionReturnGeneral.getTipoAfiliacion(),classes);//this.tipoafiliacionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.tipoafiliacion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoAfiliacion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoAfiliacion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoAfiliacionBeanSwingJInternalFrameAdditional.RecargarFormTipoAfiliacion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoAfiliacion(false);
						
			if(tipoafiliacionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getEsGuardarRelacionado() && DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDatoGeneralEmpleadoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoAfiliacion();
			}
			
			this.actualizarVisualTableDatosTipoAfiliacion();
			
			this.jTableDatosTipoAfiliacion.setRowSelectionInterval(this.getIndiceNuevoTipoAfiliacion(), this.getIndiceNuevoTipoAfiliacion());
			
			this.seleccionarFilaTablaTipoAfiliacionActual();
						
			this.actualizarEstadoCeldasBotonesTipoAfiliacion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoAfiliacion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldcodigoTipoAfiliacion.setEnabled(isHabilitar && this.tipoafiliacionConstantesFunciones.activarcodigoTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jTextAreanombreTipoAfiliacion.setEnabled(isHabilitar && this.tipoafiliacionConstantesFunciones.activarnombreTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_empleaTipoAfiliacion.setEnabled(isHabilitar && this.tipoafiliacionConstantesFunciones.activarporcen_empleaTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_patroTipoAfiliacion.setEnabled(isHabilitar && this.tipoafiliacionConstantesFunciones.activarporcen_patroTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_gene_empleaTipoAfiliacion.setEnabled(isHabilitar && this.tipoafiliacionConstantesFunciones.activarporcen_gene_empleaTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_gene_patroTipoAfiliacion.setEnabled(isHabilitar && this.tipoafiliacionConstantesFunciones.activarporcen_gene_patroTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_secuTipoAfiliacion.setEnabled(isHabilitar && this.tipoafiliacionConstantesFunciones.activarporcen_secuTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_ieceTipoAfiliacion.setEnabled(isHabilitar && this.tipoafiliacionConstantesFunciones.activarporcen_ieceTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jTextAreadescripcionTipoAfiliacion.setEnabled(isHabilitar && this.tipoafiliacionConstantesFunciones.activardescripcionTipoAfiliacion);	
		//
		this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_empresaTipoAfiliacion.setEnabled(isHabilitar && this.tipoafiliacionConstantesFunciones.activarid_empresaTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_cate_tipo_afiliacionTipoAfiliacion.setEnabled(isHabilitar && this.tipoafiliacionConstantesFunciones.activarid_cate_tipo_afiliacionTipoAfiliacion);
	};
	
	public void setDefaultControlesTipoAfiliacion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoAfiliacion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoafiliacionSessionBean.setConGuardarRelaciones(true);			
			this.tipoafiliacionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoAfiliacion.jTabbedPaneRelacionesTipoAfiliacion.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoafiliacionSessionBean.setConGuardarRelaciones(false);			
			this.tipoafiliacionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoAfiliacion.jTabbedPaneRelacionesTipoAfiliacion.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoAfiliacion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAfiliacion tipoafiliacionAux:this.tipoafiliacionLogic.getTipoAfiliacions()) {
				if(tipoafiliacionAux.getId().equals(this.iIdNuevoTipoAfiliacion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAfiliacion tipoafiliacionAux:this.tipoafiliacions) {
				if(tipoafiliacionAux.getId().equals(this.iIdNuevoTipoAfiliacion)) {
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
	
	public int getIndiceActualTipoAfiliacion(TipoAfiliacion tipoafiliacion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAfiliacion tipoafiliacionAux:this.tipoafiliacionLogic.getTipoAfiliacions()) {
				if(tipoafiliacionAux.getId().equals(tipoafiliacion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAfiliacion tipoafiliacionAux:this.tipoafiliacions) {
				if(tipoafiliacionAux.getId().equals(tipoafiliacion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoAfiliacion(TipoAfiliacion tipoafiliacionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAfiliacion tipoafiliacionAux:this.tipoafiliacionLogic.getTipoAfiliacions()) {
				if(tipoafiliacionAux.getTipoAfiliacionOriginal().getId().equals(tipoafiliacionOriginal.getId())) {
					existe=true;
					tipoafiliacionOriginal.setId(tipoafiliacionAux.getId());
					tipoafiliacionOriginal.setVersionRow(tipoafiliacionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAfiliacion tipoafiliacionAux:this.tipoafiliacions) {
				if(tipoafiliacionAux.getTipoAfiliacionOriginal().getId().equals(tipoafiliacionOriginal.getId())) {
					existe=true;
					tipoafiliacionOriginal.setId(tipoafiliacionAux.getId());
					tipoafiliacionOriginal.setVersionRow(tipoafiliacionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoAfiliacion(Boolean esParaCancelar) throws Exception {
		tipoafiliacionsAux=new ArrayList<TipoAfiliacion>();
		tipoafiliacionAux=new TipoAfiliacion();
		
		if(!this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoAfiliacion tipoafiliacionAux:this.tipoafiliacionLogic.getTipoAfiliacions()) {
					if(tipoafiliacionAux.getId()<0) {
						tipoafiliacionsAux.add(tipoafiliacionAux);
					}		
				}
				this.iIdNuevoTipoAfiliacion=0L;
				this.tipoafiliacionLogic.getTipoAfiliacions().removeAll(tipoafiliacionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoAfiliacion tipoafiliacionAux:this.tipoafiliacions) {
					if(tipoafiliacionAux.getId()<0) {
						tipoafiliacionsAux.add(tipoafiliacionAux);
					}		
				}
				this.iIdNuevoTipoAfiliacion=0L;
				this.tipoafiliacions.removeAll(tipoafiliacionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoAfiliacion 
					&& this.tipoafiliacionLogic.getTipoAfiliacions().size()>0
					) {
					tipoafiliacionAux=this.tipoafiliacionLogic.getTipoAfiliacions().get(this.tipoafiliacionLogic.getTipoAfiliacions().size() - 1);
				
					if(tipoafiliacionAux.getId()<0) {
						this.tipoafiliacionLogic.getTipoAfiliacions().remove(tipoafiliacionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoAfiliacion && this.tipoafiliacions.size()>0) {
					tipoafiliacionAux=this.tipoafiliacions.get(this.tipoafiliacions.size() - 1);
				
					if(tipoafiliacionAux.getId()<0) {
						this.tipoafiliacions.remove(tipoafiliacionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoAfiliacion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoafiliacion.getId()<0) {
				this.tipoafiliacionLogic.getTipoAfiliacions().remove(this.tipoafiliacion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoafiliacion.getId()<0) {
				this.tipoafiliacions.remove(this.tipoafiliacion);
			}
		}			
	}
	
	public void setEstadosInicialesTipoAfiliacion(List<TipoAfiliacion> tipoafiliacionsAux) throws Exception {
		TipoAfiliacionConstantesFunciones.setEstadosInicialesTipoAfiliacion(tipoafiliacionsAux);
	}
	
	public void setEstadosInicialesTipoAfiliacion(TipoAfiliacion tipoafiliacionAux) throws Exception {
		TipoAfiliacionConstantesFunciones.setEstadosInicialesTipoAfiliacion(tipoafiliacionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoAfiliacionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoAfiliacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoAfiliacionActual()) {
				if(!this.isEsNuevoTipoAfiliacion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoAfiliacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoAfiliacion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoAfiliacionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Afiliacion ?", "MANTENIMIENTO DE Tipo Afiliacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoAfiliacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoAfiliacion tipoafiliacion) throws Exception {
		TipoAfiliacionConstantesFunciones.seleccionarAsignar(this.tipoafiliacion,tipoafiliacion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoAfiliacion=this.isPermisoActualizarOriginalTipoAfiliacion;
			
			
			this.seleccionarAsignar(tipoafiliacion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoAfiliacionConstantesFunciones.quitarEspaciosTipoAfiliacion(this.tipoafiliacion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoAfiliacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoafiliacionSessionBean.setsFuncionBusquedaRapida(this.tipoafiliacionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoAfiliacion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoAfiliacion(esParaCancelar);				
				this.cancelarNuevoTipoAfiliacion(esParaCancelar);								
			}
			
			this.tipoafiliacion=new TipoAfiliacion();
			
			this.inicializarTipoAfiliacion();
			
			this.actualizarEstadoCeldasBotonesTipoAfiliacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoAfiliacion() throws Exception {
		try {
			TipoAfiliacionConstantesFunciones.inicializarTipoAfiliacion(this.tipoafiliacion);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoafiliacionLogic.getTipoAfiliacions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoAfiliacions(String sAccionBusqueda,List<TipoAfiliacion> tipoafiliacionsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoAfiliacion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoAfiliacionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoAfiliacionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoAfiliacion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Afiliaciones");		
		parameters.put("busquedapor", TipoAfiliacionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
					
					TipoAfiliacionLogic tipoafiliacionLogicAuxiliar=new TipoAfiliacionLogic();
					tipoafiliacionLogicAuxiliar.setDatosCliente(tipoafiliacionLogic.getDatosCliente());				
					tipoafiliacionLogicAuxiliar.setTipoAfiliacions(tipoafiliacionsParaReportes);
					
					tipoafiliacionLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoAfiliacionWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoafiliacionsParaReportes=tipoafiliacionLogicAuxiliar.getTipoAfiliacions();
					
					//tipoafiliacionLogic.getNewConnexionToDeep();
					
					//for (TipoAfiliacion tipoafiliacion:tipoafiliacionsParaReportes) {
					//	tipoafiliacionLogic.deepLoad(tipoafiliacion, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoafiliacionLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoafiliacionLogic.closeNewConnexionToDeep();
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoAfiliacion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoAfiliacionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoAfiliacionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoAfiliacion=new JRBeanArrayDataSource(TipoAfiliacionJInternalFrame.TraerTipoAfiliacionBeans(tipoafiliacionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoAfiliacion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoAfiliacionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoAfiliacionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoAfiliacionBean.TraerTipoAfiliacionBeans(tipoafiliacionsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoAfiliacions(sAccionBusqueda,sTipoArchivoReporte,tipoafiliacionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoAfiliacions(sAccionBusqueda,sTipoArchivoReporte,tipoafiliacionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoAfiliacionActionPerformed(null);
					//this.generarExcelReporteTipoAfiliacions(sAccionBusqueda,sTipoArchivoReporte,tipoafiliacionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoAfiliacions(sAccionBusqueda,sTipoArchivoReporte,tipoafiliacionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoAfiliacions(sAccionBusqueda,sTipoArchivoReporte,tipoafiliacionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoAfiliacions(sAccionBusqueda,sTipoArchivoReporte,tipoafiliacionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoAfiliacions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoAfiliacion> tipoafiliacionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoafiliacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoAfiliacions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoAfiliacion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoAfiliacion tipoafiliacion : tipoafiliacionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoAfiliacionConstantesFunciones.generarExcelReporteDataTipoAfiliacion("NORMAL",row,workbook,tipoafiliacion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Afiliacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoAfiliacion(String sTipo,Row row,Workbook workbook) {
		
		TipoAfiliacionConstantesFunciones.generarExcelReporteHeaderTipoAfiliacion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoAfiliacions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoAfiliacion> tipoafiliacionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoafiliacion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoAfiliacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoAfiliacion tipoafiliacion : tipoafiliacionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoAfiliacionConstantesFunciones.getTipoAfiliacionDescripcion(tipoafiliacion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoAfiliacionConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoafiliacion.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoAfiliacionConstantesFunciones.LABEL_IDCATETIPOAFILIACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_IDCATETIPOAFILIACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoafiliacion.getcatetipoafiliacion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoAfiliacionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoafiliacion.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoAfiliacionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoafiliacion.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoAfiliacionConstantesFunciones.LABEL_PORCENEMPLEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_PORCENEMPLEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoafiliacion.getporcen_emplea());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoAfiliacionConstantesFunciones.LABEL_PORCENPATRO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_PORCENPATRO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoafiliacion.getporcen_patro());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEEMPLEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEEMPLEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoafiliacion.getporcen_gene_emplea());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEPATRO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEPATRO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoafiliacion.getporcen_gene_patro());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoAfiliacionConstantesFunciones.LABEL_PORCENSECU))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_PORCENSECU);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoafiliacion.getporcen_secu());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoAfiliacionConstantesFunciones.LABEL_PORCENIECE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_PORCENIECE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoafiliacion.getporcen_iece());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoAfiliacionConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoafiliacion.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Afiliacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoAfiliacions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoAfiliacion> tipoafiliacionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoAfiliacion> tipoafiliacionsRespaldo=null;
		
		classes=TipoAfiliacionConstantesFunciones.getClassesRelationshipsOfTipoAfiliacion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoafiliacionLogic.setDatosCliente(this.datosCliente);
		this.tipoafiliacionLogic.setDatosDeep(this.datosDeep);
		this.tipoafiliacionLogic.setIsConDeep(true);
		
		tipoafiliacionsRespaldo=this.tipoafiliacionLogic.getTipoAfiliacions();
		
		this.tipoafiliacionLogic.setTipoAfiliacions(tipoafiliacionsParaReportes);	
		this.tipoafiliacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoafiliacionsParaReportes=this.tipoafiliacionLogic.getTipoAfiliacions();
		this.tipoafiliacionLogic.setTipoAfiliacions(tipoafiliacionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoafiliacion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoAfiliacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoAfiliacion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoAfiliacion tipoafiliacion : tipoafiliacionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoAfiliacion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoAfiliacionConstantesFunciones.generarExcelReporteDataTipoAfiliacion("NORMAL",row,workbook,tipoafiliacion,cellStyleDataAux);
		
			
			


				//DatoGeneralEmpleado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoafiliacion.getDatoGeneralEmpleados()!=null && tipoafiliacion.getDatoGeneralEmpleados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DatoGeneralEmpleadoConstantesFunciones.generarExcelReporteHeaderDatoGeneralEmpleado("RELACIONADO",row,workbook);
				}

				if(tipoafiliacion.getDatoGeneralEmpleados()!=null) {
					i2=0;
					for(DatoGeneralEmpleado datogeneralempleado : tipoafiliacion.getDatoGeneralEmpleados()) {
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
		cell.setCellValue(TipoAfiliacionConstantesFunciones.getTipoAfiliacionDescripcion(tipoafiliacion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Afiliacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoAfiliacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAfiliacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoAfiliacion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAfiliacion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoAfiliacion() throws Exception {		
		this.startProcessTipoAfiliacion(true);
	}
	
	public void startProcessTipoAfiliacion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoAfiliacion ,this.jPanelParametrosReportesTipoAfiliacion, this.jScrollPanelDatosTipoAfiliacion,this.jPanelPaginacionTipoAfiliacion, this.jScrollPanelDatosEdicionTipoAfiliacion, this.jPanelAccionesTipoAfiliacion,this.jPanelAccionesFormularioTipoAfiliacion,this.jmenuBarTipoAfiliacion,this.jmenuBarDetalleTipoAfiliacion,this.jTtoolBarTipoAfiliacion,this.jTtoolBarDetalleTipoAfiliacion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoAfiliacion=this.jTabbedPaneBusquedasTipoAfiliacion; 
		
		final JPanel jPanelParametrosReportesTipoAfiliacion=this.jPanelParametrosReportesTipoAfiliacion;
		//final JScrollPane jScrollPanelDatosTipoAfiliacion=this.jScrollPanelDatosTipoAfiliacion;
		final JTable jTableDatosTipoAfiliacion=this.jTableDatosTipoAfiliacion;		
		final JPanel jPanelPaginacionTipoAfiliacion=this.jPanelPaginacionTipoAfiliacion;
		//final JScrollPane jScrollPanelDatosEdicionTipoAfiliacion=this.jScrollPanelDatosEdicionTipoAfiliacion;
		final JPanel jPanelAccionesTipoAfiliacion=this.jPanelAccionesTipoAfiliacion;
		
		JPanel jPanelCamposAuxiliarTipoAfiliacion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoAfiliacion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) {
			jPanelCamposAuxiliarTipoAfiliacion=this.jInternalFrameDetalleFormTipoAfiliacion.jPanelCamposTipoAfiliacion;
			jPanelAccionesFormularioAuxiliarTipoAfiliacion=this.jInternalFrameDetalleFormTipoAfiliacion.jPanelAccionesFormularioTipoAfiliacion;
		}
		
		final JPanel jPanelCamposTipoAfiliacion=jPanelCamposAuxiliarTipoAfiliacion;
		final JPanel jPanelAccionesFormularioTipoAfiliacion=jPanelAccionesFormularioAuxiliarTipoAfiliacion;
		
		
		final JMenuBar jmenuBarTipoAfiliacion=this.jmenuBarTipoAfiliacion;
		final JToolBar jTtoolBarTipoAfiliacion=this.jTtoolBarTipoAfiliacion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoAfiliacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoAfiliacion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) {
			jmenuBarDetalleAuxiliarTipoAfiliacion=this.jInternalFrameDetalleFormTipoAfiliacion.jmenuBarDetalleTipoAfiliacion;
			jTtoolBarDetalleAuxiliarTipoAfiliacion=this.jInternalFrameDetalleFormTipoAfiliacion.jTtoolBarDetalleTipoAfiliacion;
		}
		
		final JMenuBar jmenuBarDetalleTipoAfiliacion=jmenuBarDetalleAuxiliarTipoAfiliacion;
		final JToolBar jTtoolBarDetalleTipoAfiliacion=jTtoolBarDetalleAuxiliarTipoAfiliacion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoAfiliacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoAfiliacion;
			processRunnable.jTableDatos=jTableDatosTipoAfiliacion;
			processRunnable.jPanelCampos=jPanelCamposTipoAfiliacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoAfiliacion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoAfiliacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoAfiliacion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoAfiliacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoAfiliacion;
			processRunnable.jTtoolBar=jTtoolBarTipoAfiliacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoAfiliacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoAfiliacion ,jPanelParametrosReportesTipoAfiliacion,jTableDatosTipoAfiliacion, /*jScrollPanelDatosTipoAfiliacion,*/jPanelCamposTipoAfiliacion,jPanelPaginacionTipoAfiliacion, /*jScrollPanelDatosEdicionTipoAfiliacion,*/ jPanelAccionesTipoAfiliacion,jPanelAccionesFormularioTipoAfiliacion,jmenuBarTipoAfiliacion,jmenuBarDetalleTipoAfiliacion,jTtoolBarTipoAfiliacion,jTtoolBarDetalleTipoAfiliacion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoAfiliacion ,jPanelParametrosReportesTipoAfiliacion, jScrollPanelDatosTipoAfiliacion,jPanelPaginacionTipoAfiliacion, jScrollPanelDatosEdicionTipoAfiliacion, jPanelAccionesTipoAfiliacion,jPanelAccionesFormularioTipoAfiliacion,jmenuBarTipoAfiliacion,jmenuBarDetalleTipoAfiliacion,jTtoolBarTipoAfiliacion,jTtoolBarDetalleTipoAfiliacion);
						
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
	
	public void finishProcessTipoAfiliacion() {// throws Exception 
		this.finishProcessTipoAfiliacion(true);
	}
	
	public void finishProcessTipoAfiliacion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoAfiliacion ,this.jPanelParametrosReportesTipoAfiliacion, this.jScrollPanelDatosTipoAfiliacion,this.jPanelPaginacionTipoAfiliacion, this.jScrollPanelDatosEdicionTipoAfiliacion, this.jPanelAccionesTipoAfiliacion,this.jPanelAccionesFormularioTipoAfiliacion,this.jmenuBarTipoAfiliacion,this.jmenuBarDetalleTipoAfiliacion,this.jTtoolBarTipoAfiliacion,this.jTtoolBarDetalleTipoAfiliacion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoAfiliacion=this.jTabbedPaneBusquedasTipoAfiliacion; 
		
		final JPanel jPanelParametrosReportesTipoAfiliacion=this.jPanelParametrosReportesTipoAfiliacion;
		//final JScrollPane jScrollPanelDatosTipoAfiliacion=this.jScrollPanelDatosTipoAfiliacion;
		final JTable jTableDatosTipoAfiliacion=this.jTableDatosTipoAfiliacion;		
		final JPanel jPanelPaginacionTipoAfiliacion=this.jPanelPaginacionTipoAfiliacion;
		//final JScrollPane jScrollPanelDatosEdicionTipoAfiliacion=this.jScrollPanelDatosEdicionTipoAfiliacion;
		final JPanel jPanelAccionesTipoAfiliacion=this.jPanelAccionesTipoAfiliacion;
		
		JPanel jPanelCamposAuxiliarTipoAfiliacion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoAfiliacion=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) {
			jPanelCamposAuxiliarTipoAfiliacion=this.jInternalFrameDetalleFormTipoAfiliacion.jPanelCamposTipoAfiliacion;
			jPanelAccionesFormularioAuxiliarTipoAfiliacion=this.jInternalFrameDetalleFormTipoAfiliacion.jPanelAccionesFormularioTipoAfiliacion;
		}
		
		final JPanel jPanelCamposTipoAfiliacion=jPanelCamposAuxiliarTipoAfiliacion;
		final JPanel jPanelAccionesFormularioTipoAfiliacion=jPanelAccionesFormularioAuxiliarTipoAfiliacion;
		
		
		final JMenuBar jmenuBarTipoAfiliacion=this.jmenuBarTipoAfiliacion;		
		final JToolBar jTtoolBarTipoAfiliacion=this.jTtoolBarTipoAfiliacion;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoAfiliacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoAfiliacion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) {
			jmenuBarDetalleAuxiliarTipoAfiliacion=this.jInternalFrameDetalleFormTipoAfiliacion.jmenuBarDetalleTipoAfiliacion;
			jTtoolBarDetalleAuxiliarTipoAfiliacion=this.jInternalFrameDetalleFormTipoAfiliacion.jTtoolBarDetalleTipoAfiliacion;		
		}
		
		final JMenuBar jmenuBarDetalleTipoAfiliacion=jmenuBarDetalleAuxiliarTipoAfiliacion;
		final JToolBar jTtoolBarDetalleTipoAfiliacion=jTtoolBarDetalleAuxiliarTipoAfiliacion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoAfiliacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoAfiliacion;
			processRunnable.jTableDatos=jTableDatosTipoAfiliacion;
			processRunnable.jPanelCampos=jPanelCamposTipoAfiliacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoAfiliacion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoAfiliacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoAfiliacion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoAfiliacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoAfiliacion;
			processRunnable.jTtoolBar=jTtoolBarTipoAfiliacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoAfiliacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoAfiliacion ,jPanelParametrosReportesTipoAfiliacion, jTableDatosTipoAfiliacion,/*jScrollPanelDatosTipoAfiliacion,*/jPanelCamposTipoAfiliacion,jPanelPaginacionTipoAfiliacion, /*jScrollPanelDatosEdicionTipoAfiliacion,*/ jPanelAccionesTipoAfiliacion,jPanelAccionesFormularioTipoAfiliacion,jmenuBarTipoAfiliacion,jmenuBarDetalleTipoAfiliacion,jTtoolBarTipoAfiliacion,jTtoolBarDetalleTipoAfiliacion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoAfiliacion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoAfiliacion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoAfiliacion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoAfiliacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoAfiliacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoAfiliacion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoAfiliacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoAfiliacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoAfiliacion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoafiliacionConstantesFunciones.getsFinalQueryTipoAfiliacion();
		String  finalQueryPaginacionTodos=this.tipoafiliacionConstantesFunciones.getsFinalQueryTipoAfiliacion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoAfiliacionConstantesFunciones.getArrayColumnasGlobalesNoTipoAfiliacion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoAfiliacionConstantesFunciones.getArrayColumnasGlobalesTipoAfiliacion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoAfiliacionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoafiliacionsEliminados= new ArrayList<TipoAfiliacion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoAfiliacion();
		
				///*TipoAfiliacionSessionBean*/this.tipoafiliacionSessionBean=new TipoAfiliacionSessionBean();
			
			if(this.tipoafiliacionSessionBean==null) {
				this.tipoafiliacionSessionBean=new TipoAfiliacionSessionBean();
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
					this.iNumeroPaginacion=TipoAfiliacionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoAfiliacionConstantesFunciones.getClassesForeignKeysOfTipoAfiliacion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoafiliacion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoafiliacionsAux= new ArrayList<TipoAfiliacion>();
			
				
			tipoafiliacionLogic.setDatosCliente(this.datosCliente);
			tipoafiliacionLogic.setDatosDeep(this.datosDeep);
			tipoafiliacionLogic.setIsConDeep(true);
			
			
			tipoafiliacionLogic.getTipoAfiliacionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoafiliacionLogic.getTodosTipoAfiliacions(finalQueryGlobal,pagination);
					
					//tipoafiliacionLogic.getTodosTipoAfiliacionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoafiliacionLogic.getTipoAfiliacions()==null|| tipoafiliacionLogic.getTipoAfiliacions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoafiliacionsAux= new ArrayList<TipoAfiliacion>();
							tipoafiliacionsAux.addAll(tipoafiliacionLogic.getTipoAfiliacions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoafiliacionsAux= new ArrayList<TipoAfiliacion>();
							tipoafiliacionsAux.addAll(tipoafiliacions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoafiliacionLogic.getTodosTipoAfiliacions(finalQueryGlobal+"",this.pagination);												
							
							//tipoafiliacionLogic.getTodosTipoAfiliacionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoAfiliacions("Todos",tipoafiliacionLogic.getTipoAfiliacions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoafiliacionLogic.setTipoAfiliacions(new ArrayList<TipoAfiliacion>());					
							tipoafiliacionLogic.getTipoAfiliacions().addAll(tipoafiliacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoafiliacions=new ArrayList<TipoAfiliacion>();
							tipoafiliacions.addAll(tipoafiliacionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoAfiliacion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoAfiliacion=this.idActual;
				
				} else if(this.idTipoAfiliacionActual!=null && this.idTipoAfiliacionActual!=0L) {
					idTipoAfiliacion=idTipoAfiliacionActual;
				}
				
					
				this.sDetalleReporte=TipoAfiliacionConstantesFunciones.getDetalleIndicePorId(idTipoAfiliacion);
				
				this.tipoafiliacions=new ArrayList<TipoAfiliacion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoafiliacionLogic.getEntity(idTipoAfiliacion);
					
					//tipoafiliacionLogic.getEntityWithConnection(idTipoAfiliacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoafiliacionLogic.setTipoAfiliacions(new ArrayList<TipoAfiliacion>());
					tipoafiliacionLogic.getTipoAfiliacions().add(tipoafiliacionLogic.getTipoAfiliacion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoafiliacions=new ArrayList<TipoAfiliacion>();
					this.tipoafiliacions.add(tipoafiliacion);
				}
				
				if(tipoafiliacionLogic.getTipoAfiliacion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCateTipoAfiliacion")) {
				this.sDetalleReporte=TipoAfiliacionConstantesFunciones.getDetalleIndiceFK_IdCateTipoAfiliacion(id_cate_tipo_afiliacionFK_IdCateTipoAfiliacion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoafiliacionLogic.getTipoAfiliacionsFK_IdCateTipoAfiliacion(finalQueryGlobal,pagination,id_cate_tipo_afiliacionFK_IdCateTipoAfiliacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoAfiliacionConstantesFunciones.getDetalleIndiceFK_IdCateTipoAfiliacion(id_cate_tipo_afiliacionFK_IdCateTipoAfiliacion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoAfiliacionConstantesFunciones.getDetalleIndiceFK_IdCateTipoAfiliacion(id_cate_tipo_afiliacionFK_IdCateTipoAfiliacion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoafiliacionLogic.getTipoAfiliacions()==null||tipoafiliacionLogic.getTipoAfiliacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoafiliacions==null|| tipoafiliacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoafiliacionsAux=new ArrayList<TipoAfiliacion>();
						tipoafiliacionsAux.addAll(tipoafiliacionLogic.getTipoAfiliacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoafiliacionsAux=new ArrayList<TipoAfiliacion>();
							tipoafiliacionsAux.addAll(tipoafiliacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoafiliacionLogic.getTipoAfiliacionsFK_IdCateTipoAfiliacion(finalQueryGlobal,pagination,id_cate_tipo_afiliacionFK_IdCateTipoAfiliacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoAfiliacionConstantesFunciones.getDetalleIndiceFK_IdCateTipoAfiliacion(id_cate_tipo_afiliacionFK_IdCateTipoAfiliacion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoAfiliacionConstantesFunciones.getDetalleIndiceFK_IdCateTipoAfiliacion(id_cate_tipo_afiliacionFK_IdCateTipoAfiliacion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoAfiliacions("FK_IdCateTipoAfiliacion",tipoafiliacionLogic.getTipoAfiliacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoAfiliacions("FK_IdCateTipoAfiliacion",tipoafiliacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoafiliacionLogic.setTipoAfiliacions(new ArrayList<TipoAfiliacion>());
						tipoafiliacionLogic.getTipoAfiliacions().addAll(tipoafiliacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoafiliacions=new ArrayList<TipoAfiliacion>();
							tipoafiliacions.addAll(tipoafiliacionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoAfiliacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoafiliacionLogic.getTipoAfiliacionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoAfiliacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoAfiliacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoafiliacionLogic.getTipoAfiliacions()==null||tipoafiliacionLogic.getTipoAfiliacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoafiliacions==null|| tipoafiliacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoafiliacionsAux=new ArrayList<TipoAfiliacion>();
						tipoafiliacionsAux.addAll(tipoafiliacionLogic.getTipoAfiliacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoafiliacionsAux=new ArrayList<TipoAfiliacion>();
							tipoafiliacionsAux.addAll(tipoafiliacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoafiliacionLogic.getTipoAfiliacionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoAfiliacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoAfiliacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoAfiliacions("FK_IdEmpresa",tipoafiliacionLogic.getTipoAfiliacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoAfiliacions("FK_IdEmpresa",tipoafiliacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoafiliacionLogic.setTipoAfiliacions(new ArrayList<TipoAfiliacion>());
						tipoafiliacionLogic.getTipoAfiliacions().addAll(tipoafiliacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoafiliacions=new ArrayList<TipoAfiliacion>();
							tipoafiliacions.addAll(tipoafiliacionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoAfiliacion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoAfiliacion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoafiliacionLogic.getTipoAfiliacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoafiliacions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoafiliacionLogic.getTipoAfiliacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoafiliacions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoAfiliacion tipoafiliacion) {
		Boolean permite=true;
		
		if(this.tipoafiliacion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoAfiliacionConstantesFunciones.getOrderByListaTipoAfiliacion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoAfiliacionConstantesFunciones.getOrderByListaTipoAfiliacion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAfiliacion tipoafiliacion:tipoafiliacionLogic.getTipoAfiliacions()) {
				if(tipoafiliacion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoafiliacionTotales=tipoafiliacion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAfiliacion tipoafiliacion:this.tipoafiliacions) {
				if(tipoafiliacion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoafiliacionTotales=tipoafiliacion;
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
			this.tipoafiliacionAux=new TipoAfiliacion();
			this.tipoafiliacionAux.setsType(Constantes2.S_TOTALES);
			this.tipoafiliacionAux.setIsNew(false);
			this.tipoafiliacionAux.setIsChanged(false);
			this.tipoafiliacionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoAfiliacionConstantesFunciones.TotalizarValoresFilaTipoAfiliacion(this.tipoafiliacionLogic.getTipoAfiliacions(),this.tipoafiliacionAux);
				
				this.tipoafiliacionLogic.getTipoAfiliacions().add(this.tipoafiliacionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoAfiliacionConstantesFunciones.TotalizarValoresFilaTipoAfiliacion(this.tipoafiliacions,this.tipoafiliacionAux);
				
				this.tipoafiliacions.add(this.tipoafiliacionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoafiliacionTotales=new TipoAfiliacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoafiliacionLogic.getTipoAfiliacions().remove(tipoafiliacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoafiliacions.remove(tipoafiliacionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoafiliacionTotales=new TipoAfiliacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAfiliacion tipoafiliacion:tipoafiliacionLogic.getTipoAfiliacions()) {
				if(tipoafiliacion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoafiliacionTotales=tipoafiliacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoAfiliacionConstantesFunciones.TotalizarValoresFilaTipoAfiliacion(this.tipoafiliacionLogic.getTipoAfiliacions(),tipoafiliacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAfiliacion tipoafiliacion:this.tipoafiliacions) {
				if(tipoafiliacion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoafiliacionTotales=tipoafiliacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoAfiliacionConstantesFunciones.TotalizarValoresFilaTipoAfiliacion(this.tipoafiliacions,tipoafiliacionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoAfiliacionsFK_IdCateTipoAfiliacion()throws Exception {
		try {
			sAccionBusqueda="FK_IdCateTipoAfiliacion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoAfiliacionsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoAfiliacionsFK_IdCateTipoAfiliacion(String sFinalQuery,Long id_cate_tipo_afiliacion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoafiliacionLogic.getTipoAfiliacionsFK_IdCateTipoAfiliacion(sFinalQuery,this.pagination,id_cate_tipo_afiliacion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoAfiliacionsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoafiliacionLogic.getTipoAfiliacionsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoAfiliacion() {
		this.isPermisoTodoTipoAfiliacion=false;
		this.isPermisoNuevoTipoAfiliacion=false;
		this.isPermisoActualizarTipoAfiliacion=false;
		this.isPermisoActualizarOriginalTipoAfiliacion=false;
		this.isPermisoEliminarTipoAfiliacion=false;
		this.isPermisoGuardarCambiosTipoAfiliacion=false;
		this.isPermisoConsultaTipoAfiliacion=false;
		this.isPermisoBusquedaTipoAfiliacion=false;
		this.isPermisoReporteTipoAfiliacion=false;		
		this.isPermisoOrdenTipoAfiliacion=false;		
		this.isPermisoPaginacionMedioTipoAfiliacion=false;		
		this.isPermisoPaginacionAltoTipoAfiliacion=false;
		this.isPermisoPaginacionTodoTipoAfiliacion=false;
		this.isPermisoCopiarTipoAfiliacion=false;		
		this.isPermisoVerFormTipoAfiliacion=false;		
		this.isPermisoDuplicarTipoAfiliacion=false;		
		this.isPermisoOrdenTipoAfiliacion=false;		
	}
	
	public void setPermisosUsuarioTipoAfiliacion(Boolean isPermiso) {
		this.isPermisoTodoTipoAfiliacion=isPermiso;
		this.isPermisoNuevoTipoAfiliacion=isPermiso;
		this.isPermisoActualizarTipoAfiliacion=isPermiso;
		this.isPermisoActualizarOriginalTipoAfiliacion=isPermiso;
		this.isPermisoEliminarTipoAfiliacion=isPermiso;
		this.isPermisoGuardarCambiosTipoAfiliacion=isPermiso;
		this.isPermisoConsultaTipoAfiliacion=isPermiso;
		this.isPermisoBusquedaTipoAfiliacion=isPermiso;
		this.isPermisoReporteTipoAfiliacion=isPermiso;
		this.isPermisoOrdenTipoAfiliacion=isPermiso;		
		this.isPermisoPaginacionMedioTipoAfiliacion=isPermiso;		
		this.isPermisoPaginacionAltoTipoAfiliacion=isPermiso;		
		this.isPermisoPaginacionTodoTipoAfiliacion=isPermiso;		
		this.isPermisoCopiarTipoAfiliacion=isPermiso;		
		this.isPermisoVerFormTipoAfiliacion=isPermiso;		
		this.isPermisoDuplicarTipoAfiliacion=isPermiso;
		this.isPermisoOrdenTipoAfiliacion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoAfiliacion(Boolean isPermiso) {
		//this.isPermisoTodoTipoAfiliacion=isPermiso;
		this.isPermisoNuevoTipoAfiliacion=isPermiso;
		this.isPermisoActualizarTipoAfiliacion=isPermiso;
		this.isPermisoActualizarOriginalTipoAfiliacion=isPermiso;
		this.isPermisoEliminarTipoAfiliacion=isPermiso;
		this.isPermisoGuardarCambiosTipoAfiliacion=isPermiso;
		//this.isPermisoConsultaTipoAfiliacion=isPermiso;
		//this.isPermisoBusquedaTipoAfiliacion=isPermiso;
		//this.isPermisoReporteTipoAfiliacion=isPermiso;
		//this.isPermisoOrdenTipoAfiliacion=isPermiso;		
		//this.isPermisoPaginacionMedioTipoAfiliacion=isPermiso;		
		//this.isPermisoPaginacionAltoTipoAfiliacion=isPermiso;		
		//this.isPermisoPaginacionTodoTipoAfiliacion=isPermiso;		
		//this.isPermisoCopiarTipoAfiliacion=isPermiso;		
		//this.isPermisoDuplicarTipoAfiliacion=isPermiso;
		//this.isPermisoOrdenTipoAfiliacion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoAfiliacionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DatoGeneralEmpleadoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoAfiliacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosDatoGeneralEmpleado=this.verificarGetPermisosUsuarioOpcionTipoAfiliacionClaseRelacionada(this.opcionsRelacionadas,DatoGeneralEmpleadoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoAfiliacion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoAfiliacionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDatoGeneralEmpleado=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoAfiliacionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoAfiliacionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoAfiliacionClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDatoGeneralEmpleado && this.jInternalFrameDetalleFormTipoAfiliacion!=null && this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoAfiliacion.jTabbedPaneRelacionesTipoAfiliacion.remove(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoAfiliacion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoAfiliacionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoAfiliacionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoAfiliacion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoAfiliacion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoAfiliacion=this.isPermisoActualizarTipoAfiliacion;
			this.isPermisoEliminarTipoAfiliacion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoAfiliacion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoAfiliacion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoAfiliacion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoAfiliacion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoAfiliacion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoAfiliacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoAfiliacion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoAfiliacion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoAfiliacion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoAfiliacion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoAfiliacion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoAfiliacion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoAfiliacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoAfiliacion.setToolTipText(this.jTableDatosTipoAfiliacion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoAfiliacion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoAfiliacion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoAfiliacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoAfiliacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoAfiliacion() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDatoGeneralEmpleado && this.tipoafiliacionConstantesFunciones.mostrarDatoGeneralEmpleadoTipoAfiliacion && !TipoAfiliacionConstantesFunciones.ISGUARDARREL) {

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
	public void inicializarCombosForeignKeyTipoAfiliacionListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.catetipoafiliacionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoAfiliacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoAfiliacionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoAfiliacionListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCateTipoAfiliacionListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyCateTipoAfiliacionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.catetipoafiliacionsForeignKey==null||this.catetipoafiliacionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CateTipoAfiliacionConstantesFunciones.getArrayColumnasGlobalesCateTipoAfiliacion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CateTipoAfiliacionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CateTipoAfiliacionConstantesFunciones.SFINALQUERY;

				this.cargarCombosCateTipoAfiliacionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTipoAfiliacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoAfiliacionParameterReturnGeneral tipoafiliacionReturnGeneral=new TipoAfiliacionParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoafiliacionConstantesFunciones.cargarid_empresaTipoAfiliacion)
					 || (this.esRecargarFks && this.tipoafiliacionConstantesFunciones.cargarid_empresaTipoAfiliacion)) {

					if(!this.tipoafiliacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoafiliacionSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCateTipoAfiliacion="";

				if(((this.catetipoafiliacionsForeignKey==null||this.catetipoafiliacionsForeignKey.size()<=0) && this.tipoafiliacionConstantesFunciones.cargarid_cate_tipo_afiliacionTipoAfiliacion)
					 || (this.esRecargarFks && this.tipoafiliacionConstantesFunciones.cargarid_cate_tipo_afiliacionTipoAfiliacion)) {

					if(!this.tipoafiliacionSessionBean.getisBusquedaDesdeForeignKeySesionCateTipoAfiliacion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CateTipoAfiliacionConstantesFunciones.getArrayColumnasGlobalesCateTipoAfiliacion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCateTipoAfiliacion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CateTipoAfiliacionConstantesFunciones.TABLENAME);

						finalQueryGlobalCateTipoAfiliacion=Funciones.GetFinalQueryAppend(finalQueryGlobalCateTipoAfiliacion, "");
						finalQueryGlobalCateTipoAfiliacion+=CateTipoAfiliacionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCateTipoAfiliacionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCateTipoAfiliacion=" WHERE " + ConstantesSql.ID + "="+tipoafiliacionSessionBean.getlidCateTipoAfiliacionActual();
					}
				} else {
					finalQueryGlobalCateTipoAfiliacion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoafiliacionReturnGeneral=tipoafiliacionLogic.cargarCombosLoteForeignKeyTipoAfiliacion(finalQueryGlobalEmpresa,finalQueryGlobalCateTipoAfiliacion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoafiliacionReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCateTipoAfiliacion.equals("NONE")) {
				this.catetipoafiliacionsForeignKey=tipoafiliacionReturnGeneral.getcatetipoafiliacionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoAfiliacion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCateTipoAfiliacion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoafiliacionSessionBean==null) {
				this.tipoafiliacionSessionBean=new TipoAfiliacionSessionBean();
			}

			if(!this.tipoafiliacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyCateTipoAfiliacion()throws Exception {
		try {

			if(!this.tipoafiliacionSessionBean.getisBusquedaDesdeForeignKeySesionCateTipoAfiliacion()) {
				CateTipoAfiliacion catetipoafiliacion=new CateTipoAfiliacion();
				CateTipoAfiliacionConstantesFunciones.setCateTipoAfiliacionDescripcion(catetipoafiliacion,Constantes.SMENSAJE_ESCOJA_OPCION);
				catetipoafiliacion.setId(null);

				if(!CateTipoAfiliacionConstantesFunciones.ExisteEnLista(this.catetipoafiliacionsForeignKey,catetipoafiliacion,true)) {

					this.catetipoafiliacionsForeignKey.add(0,catetipoafiliacion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTipoAfiliacion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoAfiliacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoAfiliacion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoAfiliacion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoAfiliacion(TipoAfiliacion tipoafiliacion)throws Exception {	
		try {
			
			this.setActualCateTipoAfiliacionForeignKey(tipoafiliacion.getid_cate_tipo_afiliacion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoAfiliacion(TipoAfiliacion tipoafiliacion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoAfiliacion()throws Exception {	
		try {
			
			this.setActualCateTipoAfiliacionForeignKey(this.tipoafiliacionConstantesFunciones.getid_cate_tipo_afiliacion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoAfiliacion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoAfiliacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoAfiliacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoAfiliacion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoAfiliacion()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameCateTipoAfiliacionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoAfiliacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCateTipoAfiliacionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoAfiliacion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_empresaTipoAfiliacion!=null && this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_empresaTipoAfiliacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_empresaTipoAfiliacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_cate_tipo_afiliacionTipoAfiliacion!=null && this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_cate_tipo_afiliacionTipoAfiliacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_cate_tipo_afiliacionTipoAfiliacion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public TipoAfiliacionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoAfiliacionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoAfiliacionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoafiliacionSessionBean=new TipoAfiliacionSessionBean(); 
		this.tipoafiliacionConstantesFunciones=new TipoAfiliacionConstantesFunciones(); 
		this.tipoafiliacionBean=new TipoAfiliacion();//(this.tipoafiliacionConstantesFunciones); 		
		this.tipoafiliacionReturnGeneral=new TipoAfiliacionParameterReturnGeneral(); 
		
		this.tipoafiliacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoafiliacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoAfiliacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoAfiliacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoAfiliacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoAfiliacion(true);
			
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
			
			this.tipoafiliacionConstantesFunciones=new TipoAfiliacionConstantesFunciones(); 
			this.tipoafiliacionBean=new TipoAfiliacion();//this.tipoafiliacionConstantesFunciones); 			
			this.tipoafiliacionReturnGeneral=new TipoAfiliacionParameterReturnGeneral(); 
		
			TipoAfiliacionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Afiliacion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.tipoafiliacion=new TipoAfiliacion();
			this.tipoafiliacions = new ArrayList<TipoAfiliacion>();
			this.tipoafiliacionsAux = new ArrayList<TipoAfiliacion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic=new TipoAfiliacionLogic();
				this.tipoafiliacionLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoafiliacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoafiliacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoAfiliacion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoAfiliacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoAfiliacion);	
					}
					
					if(this.jInternalFrameImportacionTipoAfiliacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoAfiliacion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoAfiliacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoAfiliacion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoAfiliacion);
				this.jInternalFrameDetalleFormTipoAfiliacion.setVisible(false);
				this.jInternalFrameDetalleFormTipoAfiliacion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoAfiliacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoAfiliacion);
					this.jInternalFrameReporteDinamicoTipoAfiliacion.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoAfiliacion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoAfiliacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoAfiliacion);
					this.jInternalFrameImportacionTipoAfiliacion.setVisible(false);
					this.jInternalFrameImportacionTipoAfiliacion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoAfiliacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoAfiliacion);
					this.jInternalFrameOrderByTipoAfiliacion.setVisible(false);
					this.jInternalFrameOrderByTipoAfiliacion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoAfiliacionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoAfiliacionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoafiliacionReturnGeneral=new TipoAfiliacionParameterReturnGeneral();
			
			this.tipoafiliacionParameterGeneral=new TipoAfiliacionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoafiliacionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoAfiliacionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DatoGeneralEmpleadoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoAfiliacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoafiliacionSessionBean.getEsGuardarRelacionado(),this.tipoafiliacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoAfiliacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoafiliacionSessionBean.getEsGuardarRelacionado(),this.tipoafiliacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoAfiliacion=false;
			this.isVisibilidadCeldaDuplicarTipoAfiliacion=true;
			this.isVisibilidadCeldaCopiarTipoAfiliacion=true;
			this.isVisibilidadCeldaVerFormTipoAfiliacion=true;
			this.isVisibilidadCeldaOrdenTipoAfiliacion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoAfiliacion=false;
			this.isVisibilidadCeldaModificarTipoAfiliacion=false;
			this.isVisibilidadCeldaActualizarTipoAfiliacion=false;
			this.isVisibilidadCeldaEliminarTipoAfiliacion=false;
			this.isVisibilidadCeldaCancelarTipoAfiliacion=false;
			this.isVisibilidadCeldaGuardarTipoAfiliacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAfiliacion=false;
			
			
			this.isVisibilidadFK_IdCateTipoAfiliacion=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoAfiliacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoAfiliacion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoAfiliacion(false);
			
			this.setPermisosUsuarioTipoAfiliacion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoafiliacionSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoafiliacionSessionBean.getEsGuardarRelacionado() && this.tipoafiliacionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoAfiliacionClasesRelacionadas();
			}
			
			if(this.tipoafiliacionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoAfiliacionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoAfiliacion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoAfiliacion();
			}
			
			if(!this.isPermisoBusquedaTipoAfiliacion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoAfiliacion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoAfiliacion,this.isPermisoPaginacionMedioTipoAfiliacion,this.isPermisoPaginacionTodoTipoAfiliacion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoAfiliacionConstantesFunciones.getTiposSeleccionarTipoAfiliacion());
				
				this.tiposColumnasSelect=TipoAfiliacionConstantesFunciones.getTiposSeleccionarTipoAfiliacion(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoAfiliacion();				
				//this.tiposRelacionesSelect=TipoAfiliacionConstantesFunciones.getTiposRelacionesTipoAfiliacion(true);
				
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
			//if(!this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoAfiliacion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioTipoAfiliacion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioTipoAfiliacion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoAfiliacion() ;
			
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
			this.catetipoafiliacionLogic=new CateTipoAfiliacionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipoafiliacionImplementable= (TipoAfiliacionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoAfiliacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoafiliacionImplementableHome= (TipoAfiliacionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoAfiliacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoafiliacions= new ArrayList<TipoAfiliacion>();
			this.tipoafiliacionsEliminados= new ArrayList<TipoAfiliacion>();
						
			this.isEsNuevoTipoAfiliacion=false;
			this.esParaAccionDesdeFormularioTipoAfiliacion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.catetipoafiliacionsForeignKey=new ArrayList<CateTipoAfiliacion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoAfiliacion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoAfiliacion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoAfiliacionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoAfiliacionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoAfiliacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoAfiliacion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoAfiliacion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoAfiliacion();
			}
			
			TipoAfiliacionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoAfiliacion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoAfiliacion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoAfiliacion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoAfiliacion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoAfiliacion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoAfiliacion() {
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
			if(sTipo.equals("RelacionesTipoAfiliacion")) {
				iIndex=this.jInternalFrameDetalleFormTipoAfiliacion.jTabbedPaneRelacionesTipoAfiliacion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoAfiliacion.jTabbedPaneRelacionesTipoAfiliacion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();	
				
				

				if(sTitle.equals("Dato General Empleados")) {
					if(!DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoAfiliacion();

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
				this.finishProcessTipoAfiliacion();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDatoGeneralEmpleado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoAfiliacion.cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(false,true,iIndex);
		this.jButtonDatoGeneralEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDatoGeneralEmpleado();

		//this.jTabbedPaneRelacionesTipoAfiliacion.updateUI();
		//this.jTabbedPaneRelacionesTipoAfiliacion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoAfiliacion.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DatoGeneralEmpleado")) {
				int row=this.jTableDatosTipoAfiliacion.getSelectedRow();
				jButtonDatoGeneralEmpleadoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Dato General Empleado")) {

					if(this.isTienePermisosDatoGeneralEmpleado && this.tipoafiliacionConstantesFunciones.mostrarDatoGeneralEmpleadoTipoAfiliacion && !TipoAfiliacionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Dato General Empleados"+"("+DatoGeneralEmpleadoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Dato General Empleados");

						if(tipoafiliacionConstantesFunciones.resaltarDatoGeneralEmpleadoTipoAfiliacion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoafiliacionConstantesFunciones.resaltarDatoGeneralEmpleadoTipoAfiliacion);
						}

						jmenuItem.setEnabled(this.tipoafiliacionConstantesFunciones.activarDatoGeneralEmpleadoTipoAfiliacion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DatoGeneralEmpleado"));

						

						this.jInternalFrameDetalleFormTipoAfiliacion.jmenuDetalleTipoAfiliacion.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoAfiliacion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoAfiliacion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoAfiliacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoAfiliacionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoAfiliacion();
		
		this.cargarCombosFrameForeignKeyTipoAfiliacion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoAfiliacion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoAfiliacion();
		}
	}
	
	

	public void cargarCombosForeignKeyCateTipoAfiliacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCateTipoAfiliacionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCateTipoAfiliacion();
				this.cargarCombosFrameCateTipoAfiliacionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCateTipoAfiliacion(this.catetipoafiliacionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTipoAfiliacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoafiliacionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoAfiliacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
			
			
			if(jTableDatosTipoAfiliacion.getRowCount()>=1) {
				jTableDatosTipoAfiliacion.removeRowSelectionInterval(0, jTableDatosTipoAfiliacion.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoAfiliacion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoAfiliacion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoAfiliacion(true);			
			//this.tipoafiliacion=new TipoAfiliacion();
			//this.tipoafiliacion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoAfiliacion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoAfiliacion() ;
			
			if(TipoAfiliacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoAfiliacion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoafiliacion);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoafiliacion);				
			
			TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
			
			if(this.tipoafiliacionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoAfiliacion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoAfiliacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoAfiliacion> tipoafiliacionsSeleccionados=new ArrayList<TipoAfiliacion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoAfiliacion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoAfiliacion.getSelectedRows().length;			
			}
			
			tipoafiliacionsSeleccionados=this.getTipoAfiliacionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoAfiliacion--;			
				//TipoAfiliacion tipoafiliacionAux= new TipoAfiliacion();			
				//tipoafiliacionAux.setId(this.iIdNuevoTipoAfiliacion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoAfiliacion tipoafiliacionOrigen=new TipoAfiliacion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoAfiliacion tipoafiliacionOrigen : tipoafiliacionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoafiliacionOrigen =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoafiliacionOrigen =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoAfiliacion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoafiliacion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoAfiliacion(tipoafiliacionOrigen,this.tipoafiliacion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoafiliacionLogic.getTipoAfiliacions().add(this.tipoafiliacionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoafiliacions.add(this.tipoafiliacionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoAfiliacion(false);
				
				this.jTableDatosTipoAfiliacion.setRowSelectionInterval(this.getIndiceNuevoTipoAfiliacion(), this.getIndiceNuevoTipoAfiliacion());
				
				int iLastRow =  this.jTableDatosTipoAfiliacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoAfiliacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoAfiliacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoAfiliacion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoAfiliacion> tipoafiliacionsSeleccionados=new ArrayList<TipoAfiliacion>();									
		
			TipoAfiliacion tipoafiliacionOrigen=new TipoAfiliacion();
			TipoAfiliacion tipoafiliacionDestino=new TipoAfiliacion();
				
			tipoafiliacionsSeleccionados=this.getTipoAfiliacionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoAfiliacion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoafiliacionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoAfiliacion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoafiliacionOrigen =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoafiliacionOrigen =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoafiliacionDestino =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoafiliacionDestino =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoafiliacionOrigen =tipoafiliacionsSeleccionados.get(0);
				tipoafiliacionDestino =tipoafiliacionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoAfiliacion(tipoafiliacionOrigen,tipoafiliacionDestino,true,false);
				
				tipoafiliacionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoafiliacionDestino,tipoafiliacionLogic.getTipoAfiliacions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoafiliacionDestino,tipoafiliacions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoAfiliacion(false);
				
				//this.jTableDatosTipoAfiliacion.setRowSelectionInterval(this.getIndiceNuevoTipoAfiliacion(), this.getIndiceNuevoTipoAfiliacion());
				
				int iLastRow =  this.jTableDatosTipoAfiliacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoAfiliacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoAfiliacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoAfiliacion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoAfiliacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoAfiliacion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoAfiliacion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoAfiliacion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoAfiliacion.setVisible(!isVisible);
			this.jPanelPaginacionTipoAfiliacion.setVisible(!isVisible);
			this.jPanelAccionesTipoAfiliacion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoAfiliacion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoAfiliacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoAfiliacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoAfiliacion();
			
			this.abrirFrameOrderByTipoAfiliacion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoAfiliacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoAfiliacion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoAfiliacion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoAfiliacion.isMaximum()) {
					this.jInternalFrameDetalleFormTipoAfiliacion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoAfiliacion.setSize(this.jInternalFrameDetalleFormTipoAfiliacion.iWidthFormulario,this.jInternalFrameDetalleFormTipoAfiliacion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoAfiliacion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoAfiliacion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoAfiliacion.isMaximum()) {
						this.jInternalFrameDetalleFormTipoAfiliacion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoAfiliacion.jContentPaneDetalleTipoAfiliacion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoAfiliacion.jTabbedPaneRelacionesTipoAfiliacion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoAfiliacion.jContentPaneDetalleTipoAfiliacion.getWidth(),TipoAfiliacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoAfiliacion.jTabbedPaneRelacionesTipoAfiliacion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoAfiliacion.jContentPaneDetalleTipoAfiliacion.getWidth(),TipoAfiliacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoAfiliacion.jTabbedPaneRelacionesTipoAfiliacion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoAfiliacion.jContentPaneDetalleTipoAfiliacion.getWidth(),TipoAfiliacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDatoGeneralEmpleado();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoAfiliacion.setVisible(true);
	        this.jInternalFrameDetalleFormTipoAfiliacion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoAfiliacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoAfiliacion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoAfiliacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoAfiliacion,false,this);
				} else {
					this.jInternalFrameOrderByTipoAfiliacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoAfiliacion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoAfiliacion);
				this.jInternalFrameOrderByTipoAfiliacion.setVisible(false);
				this.jInternalFrameOrderByTipoAfiliacion.setSelected(false);
				
				this.jInternalFrameOrderByTipoAfiliacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoAfiliacion"));
				
				this.inicializarActualizarBindingTablaOrderByTipoAfiliacion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoAfiliacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoAfiliacion==null) {
				
				this.jInternalFrameImportacionTipoAfiliacion=new ImportacionJInternalFrame(TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoAfiliacion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoAfiliacion);
				this.jInternalFrameImportacionTipoAfiliacion.setVisible(false);
				this.jInternalFrameImportacionTipoAfiliacion.setSelected(false);


				this.jInternalFrameImportacionTipoAfiliacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoAfiliacion"));
				this.jInternalFrameImportacionTipoAfiliacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoAfiliacion"));
				this.jInternalFrameImportacionTipoAfiliacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoAfiliacion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoAfiliacion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoAfiliacion==null) {
				this.jInternalFrameReporteDinamicoTipoAfiliacion=new ReporteDinamicoJInternalFrame(TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoAfiliacion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoAfiliacion);
				this.jInternalFrameReporteDinamicoTipoAfiliacion.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoAfiliacion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoAfiliacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoAfiliacion"));
				this.jInternalFrameReporteDinamicoTipoAfiliacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoAfiliacion"));
				this.jInternalFrameReporteDinamicoTipoAfiliacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoAfiliacion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoAfiliacion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDatoGeneralEmpleado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoAfiliacion.jContentPaneDetalleTipoAfiliacion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoAfiliacion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoAfiliacion);
			
	       	this.jInternalFrameDetalleFormTipoAfiliacion.setVisible(false);
	        this.jInternalFrameDetalleFormTipoAfiliacion.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoAfiliacion.dispose();
			//this.jInternalFrameDetalleFormTipoAfiliacion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoAfiliacion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoAfiliacion.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoAfiliacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoAfiliacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoAfiliacion.setVisible(true);
	        this.jInternalFrameImportacionTipoAfiliacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoAfiliacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoAfiliacion.setVisible(true);
	        this.jInternalFrameOrderByTipoAfiliacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoAfiliacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoAfiliacion.setVisible(false);
	        this.jInternalFrameOrderByTipoAfiliacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoAfiliacion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoAfiliacion.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoAfiliacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoAfiliacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoAfiliacion.setVisible(false);
	        this.jInternalFrameImportacionTipoAfiliacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoAfiliacion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoAfiliacion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoAfiliacion(true);
			//this.isEsNuevoTipoAfiliacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoAfiliacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoAfiliacion(false) ;
			
			if(tipoafiliacionSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getEsGuardarRelacionado() && DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDatoGeneralEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoAfiliacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoAfiliacion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoAfiliacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoAfiliacionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoAfiliacion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoAfiliacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoAfiliacion(true);
			//this.isEsNuevoTipoAfiliacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoafiliacion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoAfiliacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoAfiliacion(false) ;
			
			if(TipoAfiliacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoAfiliacion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoAfiliacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaCateTipoAfiliacion(List<CateTipoAfiliacion> catetipoafiliacionsForeignKey)throws Exception{
		TableColumn tableColumnCateTipoAfiliacion=this.jTableDatosTipoAfiliacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAfiliacion,TipoAfiliacionConstantesFunciones.LABEL_IDCATETIPOAFILIACION));
		TableCellEditor tableCellEditorCateTipoAfiliacion =tableColumnCateTipoAfiliacion.getCellEditor();

		CateTipoAfiliacionTableCell catetipoafiliacionTableCellFk=(CateTipoAfiliacionTableCell)tableCellEditorCateTipoAfiliacion;

		if(catetipoafiliacionTableCellFk!=null) {
			catetipoafiliacionTableCellFk.setcatetipoafiliacionsForeignKey(catetipoafiliacionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoAfiliacion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//catetipoafiliacionTableCellFk.setRowActual(intSelectedRow);
			//catetipoafiliacionTableCellFk.setcatetipoafiliacionsForeignKeyActual(catetipoafiliacionsForeignKey);
		//}


		if(catetipoafiliacionTableCellFk!=null) {
			catetipoafiliacionTableCellFk.RecargarCateTipoAfiliacionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoAfiliacion(false);
			
			//if(!this.isEsNuevoTipoAfiliacion) {								
				int intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoAfiliacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.tipoafiliacion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
				
			}
			
			if(this.permiteMantenimiento(this.tipoafiliacion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoAfiliacion=true;
					this.inicializarActualizarBindingTablaTipoAfiliacion(false);
					this.isEsNuevoTipoAfiliacion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoAfiliacion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoAfiliacion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoAfiliacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoAfiliacion(false);
				
				this.habilitarDeshabilitarControlesTipoAfiliacion(false);
			
												
				
				if(TipoAfiliacionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoAfiliacion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoAfiliacionActionPerformed(evt,tipoafiliacionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoAfiliacion(this.tipoafiliacion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoAfiliacion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoafiliacionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoafiliacion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoAfiliacion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAfiliacion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				this.tipoafiliacion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				this.tipoafiliacion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoafiliacion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoAfiliacionModel) this.jTableDatosTipoAfiliacion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoAfiliacion=true;
				this.inicializarActualizarBindingTablaTipoAfiliacion(false);
				this.isEsNuevoTipoAfiliacion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoAfiliacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoAfiliacion(false);
				
				this.habilitarDeshabilitarControlesTipoAfiliacion(false);
				
				
				
				if(TipoAfiliacionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoAfiliacion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoAfiliacion.getRowCount()>=1) {
				jTableDatosTipoAfiliacion.removeRowSelectionInterval(0, jTableDatosTipoAfiliacion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoAfiliacion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoAfiliacion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoAfiliacion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoAfiliacion(false) ;
			
			this.isEsNuevoTipoAfiliacion=false;
			
			if(TipoAfiliacionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoAfiliacion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoAfiliacion(false);
				
				//SI ES MANUAL
				if(TipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoAfiliacion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoAfiliacion--;			
			//TipoAfiliacion tipoafiliacionAux= new TipoAfiliacion();			
			//tipoafiliacionAux.setId(this.iIdNuevoTipoAfiliacion);
			
			if(this.jInternalFrameDetalleFormTipoAfiliacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoAfiliacion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
			
			this.tipoafiliacion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoafiliacionLogic.getTipoAfiliacions().add(this.tipoafiliacionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoafiliacions.add(this.tipoafiliacionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoAfiliacion(false);
			
			this.jTableDatosTipoAfiliacion.setRowSelectionInterval(this.getIndiceNuevoTipoAfiliacion(), this.getIndiceNuevoTipoAfiliacion());
			
			int iLastRow =  this.jTableDatosTipoAfiliacion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoAfiliacion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoAfiliacion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoAfiliacion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoAfiliacion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoAfiliacion(false);
			
			//SI ES MANUAL
			if(TipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoAfiliacion();
			}
			
			//this.abrirFrameTreeTipoAfiliacion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo AfiliacionES ?", "MANTENIMIENTO DE Tipo Afiliacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoAfiliacion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoAfiliacion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoafiliacionReturnGeneral=tipoafiliacionLogic.procesarImportacionTipoAfiliacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoafiliacionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoAfiliacionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoAfiliacion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoAfiliacion.setFileImportacion(this.jInternalFrameImportacionTipoAfiliacion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoAfiliacion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoAfiliacion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoAfiliacion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoAfiliacion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoAfiliacion> tipoafiliacionsSeleccionados=new ArrayList<TipoAfiliacion>();		

		tipoafiliacionsSeleccionados=this.getTipoAfiliacionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoAfiliacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoAfiliacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoAfiliacionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoAfiliacionBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoAfiliacions("Todos",tipoafiliacionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Afiliacion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoAfiliacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAfiliacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoAfiliacionConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoAfiliacionConstantesFunciones.LABEL_IDCATETIPOAFILIACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CateTipoAfiliacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CateTipoAfiliacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CateTipoAfiliacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CateTipoAfiliacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoAfiliacionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoAfiliacionConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENEMPLEA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcenEmplea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcenEmplea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcenEmplea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcenEmplea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENPATRO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcenPatro_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcenPatro_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcenPatro_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcenPatro_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEEMPLEA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcenGeneEmplea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcenGeneEmplea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcenGeneEmplea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcenGeneEmplea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEPATRO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcenGenePatro_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcenGenePatro_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcenGenePatro_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcenGenePatro_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENSECU:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcenSecu_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcenSecu_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcenSecu_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcenSecu_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENIECE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcenIece_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcenIece_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcenIece_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcenIece_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoAfiliacionConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoTipoAfiliacion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoAfiliacion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoAfiliacion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoAfiliacionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_IDCATETIPOAFILIACION:
					sNombreCampoCategoria="id_cate_tipo_afiliacion";
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENEMPLEA:
					sNombreCampoCategoria="porcen_emplea";
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENPATRO:
					sNombreCampoCategoria="porcen_patro";
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEEMPLEA:
					sNombreCampoCategoria="porcen_gene_emplea";
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEPATRO:
					sNombreCampoCategoria="porcen_gene_patro";
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENSECU:
					sNombreCampoCategoria="porcen_secu";
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENIECE:
					sNombreCampoCategoria="porcen_iece";
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoAfiliacion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoAfiliacionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_IDCATETIPOAFILIACION:
					sNombreCampoCategoriaValor="id_cate_tipo_afiliacion";
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENEMPLEA:
					sNombreCampoCategoriaValor="porcen_emplea";
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENPATRO:
					sNombreCampoCategoriaValor="porcen_patro";
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEEMPLEA:
					sNombreCampoCategoriaValor="porcen_gene_emplea";
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEPATRO:
					sNombreCampoCategoriaValor="porcen_gene_patro";
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENSECU:
					sNombreCampoCategoriaValor="porcen_secu";
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENIECE:
					sNombreCampoCategoriaValor="porcen_iece";
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoAfiliacion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAfiliacion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoAfiliacionConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_IDCATETIPOAFILIACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cate Tipo Afiliacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cate_tipo_afiliacion");
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENEMPLEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcen Emplea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcen_emplea");
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENPATRO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcen Patro",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcen_patro");
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEEMPLEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcen Gene Emplea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcen_gene_emplea");
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEPATRO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcen Gene Patro",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcen_gene_patro");
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENSECU:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcen Secu",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcen_secu");
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENIECE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcen Iece",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcen_iece");
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoAfiliacion> tipoafiliacionsSeleccionados=new ArrayList<TipoAfiliacion>();		
		
		tipoafiliacionsSeleccionados=this.getTipoAfiliacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoafiliacion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoAfiliacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoAfiliacion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAfiliacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoAfiliacionConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoAfiliacion tipoafiliacion:tipoafiliacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoafiliacion.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_IDCATETIPOAFILIACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_IDCATETIPOAFILIACION);
					iRow++;

					for(TipoAfiliacion tipoafiliacion:tipoafiliacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoafiliacion.getcatetipoafiliacion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoAfiliacion tipoafiliacion:tipoafiliacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoafiliacion.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoAfiliacion tipoafiliacion:tipoafiliacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoafiliacion.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENEMPLEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_PORCENEMPLEA);
					iRow++;

					for(TipoAfiliacion tipoafiliacion:tipoafiliacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoafiliacion.getporcen_emplea());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENPATRO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_PORCENPATRO);
					iRow++;

					for(TipoAfiliacion tipoafiliacion:tipoafiliacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoafiliacion.getporcen_patro());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEEMPLEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEEMPLEA);
					iRow++;

					for(TipoAfiliacion tipoafiliacion:tipoafiliacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoafiliacion.getporcen_gene_emplea());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEPATRO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEPATRO);
					iRow++;

					for(TipoAfiliacion tipoafiliacion:tipoafiliacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoafiliacion.getporcen_gene_patro());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENSECU:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_PORCENSECU);
					iRow++;

					for(TipoAfiliacion tipoafiliacion:tipoafiliacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoafiliacion.getporcen_secu());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_PORCENIECE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_PORCENIECE);
					iRow++;

					for(TipoAfiliacion tipoafiliacion:tipoafiliacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoafiliacion.getporcen_iece());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoAfiliacionConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(TipoAfiliacion tipoafiliacion:tipoafiliacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoafiliacion.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelTipoAfiliacion(row);				
			//	iRow++;
			//}				
			
			//for(TipoAfiliacion tipoafiliacionAux:tipoafiliacionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoAfiliacion(tipoafiliacionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Afiliacion",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoafiliacionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoAfiliacion(false);
			
			//SI ES MANUAL
			if(TipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoAfiliacion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoAfiliacion(false);
			
			//SI ES MANUAL
			if(TipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoAfiliacion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoAfiliacion(false);
			
			//SI ES MANUAL
			if(TipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoAfiliacion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoAfiliacion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoAfiliacion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoAfiliacion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoAfiliacion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoAfiliacion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoAfiliacion.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoAfiliacion.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoAfiliacion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoAfiliacion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoAfiliacion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoAfiliacion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoAfiliacion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoAfiliacion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoAfiliacion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoAfiliacion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoAfiliacion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoAfiliacionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoAfiliacion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoAfiliacion();
		
		this.inicializarActualizarBindingBotonesManualTipoAfiliacion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoAfiliacion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoAfiliacion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoAfiliacion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoAfiliacion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoAfiliacion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoAfiliacion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoAfiliacion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoAfiliacion.jCheckBoxPostAccionNuevoTipoAfiliacion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoAfiliacion.jCheckBoxPostAccionSinCerrarTipoAfiliacion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoAfiliacion.jCheckBoxPostAccionSinMensajeTipoAfiliacion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoAfiliacion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoAfiliacion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoAfiliacion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) {
				this.jInternalFrameDetalleFormTipoAfiliacion.jCheckBoxPostAccionNuevoTipoAfiliacion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoAfiliacion.jCheckBoxPostAccionSinCerrarTipoAfiliacion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoAfiliacion.jCheckBoxPostAccionSinMensajeTipoAfiliacion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoAfiliacion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoAfiliacion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxTiposAccionesFormularioTipoAfiliacion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoAfiliacion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoAfiliacion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoAfiliacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoAfiliacion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoAfiliacion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoAfiliacion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoAfiliacion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoAfiliacion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoAfiliacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoAfiliacion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoAfiliacion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoAfiliacion(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoAfiliacion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoAfiliacion() throws Exception {
		try	{
			if(TipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoAfiliacion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoAfiliacion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxTiposAccionesFormularioTipoAfiliacion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxTiposAccionesFormularioTipoAfiliacion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoAfiliacion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoAfiliacion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoAfiliacion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoAfiliacion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoAfiliacion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoAfiliacion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoAfiliacion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoAfiliacion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoAfiliacion.addItem(reporte);
			}
			
			
			if(!this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoAfiliacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoAfiliacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoAfiliacion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoAfiliacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoAfiliacion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoAfiliacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxTiposAccionesFormularioTipoAfiliacion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxTiposAccionesFormularioTipoAfiliacion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoAfiliacion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoAfiliacion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoAfiliacion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoAfiliacion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoAfiliacion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoAfiliacion!=null) {
				this.jInternalFrameReporteDinamicoTipoAfiliacion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoAfiliacion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoAfiliacion!=null) {
				this.jInternalFrameReporteDinamicoTipoAfiliacion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoAfiliacion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoAfiliacion!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoAfiliacion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoAfiliacion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoAfiliacion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoAfiliacion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoAfiliacion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoAfiliacion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoAfiliacion.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTipoAfiliacion.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=TipoAfiliacionConstantesFunciones.getTiposSeleccionarTipoAfiliacion(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTipoAfiliacion.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoAfiliacion.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoTipoAfiliacion.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=TipoAfiliacionConstantesFunciones.getTiposSeleccionarTipoAfiliacion(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTipoAfiliacion.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoTipoAfiliacion.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTipoAfiliacion.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=TipoAfiliacionConstantesFunciones.getTiposSeleccionarTipoAfiliacion(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoAfiliacion.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoTipoAfiliacion.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoTipoAfiliacion.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoTipoAfiliacion.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoAfiliacion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion.getSelectedItem()!=null){this.id_cate_tipo_afiliacionFK_IdCateTipoAfiliacion=((CateTipoAfiliacion)this.jComboBoxid_cate_tipo_afiliacionFK_IdCateTipoAfiliacionTipoAfiliacion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoAfiliacion(Boolean esInicializar) throws Exception {				
		if(TipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoAfiliacion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoAfiliacion() throws Exception {
		this.inicializarActualizarBindingTablaTipoAfiliacion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoAfiliacion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoAfiliacion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoAfiliacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoAfiliacion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoAfiliacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoAfiliacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoAfiliacion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoAfiliacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoAfiliacionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAfiliacionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoAfiliacionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoAfiliacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoAfiliacion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoAfiliacionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoAfiliacion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoAfiliacion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoafiliacionLogic.getTipoAfiliacions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoafiliacions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoAfiliacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoAfiliacion.setModel(new TipoAfiliacionModel(this.tipoafiliacionLogic.getTipoAfiliacions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoAfiliacion.setModel(new TipoAfiliacionModel(this.tipoafiliacions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoAfiliacion!=null && this.jInternalFrameOrderByTipoAfiliacion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoAfiliacion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoAfiliacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAfiliacion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoAfiliacionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO,tipoafiliacionConstantesFunciones.resaltarSeleccionarTipoAfiliacion,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO,tipoafiliacionConstantesFunciones.resaltarSeleccionarTipoAfiliacion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoAfiliacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAfiliacion,TipoAfiliacionConstantesFunciones.LABEL_ID));

		if(this.tipoafiliacionConstantesFunciones.mostraridTipoAfiliacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAfiliacionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoafiliacionConstantesFunciones.resaltaridTipoAfiliacion,this.tipoafiliacionConstantesFunciones.activaridTipoAfiliacion,iSizeTabla,this,true,"idTipoAfiliacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoafiliacionConstantesFunciones.resaltaridTipoAfiliacion,this.tipoafiliacionConstantesFunciones.activaridTipoAfiliacion,this,true,"idTipoAfiliacion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoAfiliacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAfiliacion,TipoAfiliacionConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoafiliacionConstantesFunciones.mostrarid_empresaTipoAfiliacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAfiliacionConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoafiliacionConstantesFunciones.resaltarid_empresaTipoAfiliacion,this,this.tipoafiliacionConstantesFunciones.activarid_empresaTipoAfiliacion,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoafiliacionConstantesFunciones.resaltarid_empresaTipoAfiliacion,this,this.tipoafiliacionConstantesFunciones.activarid_empresaTipoAfiliacion,false,"id_empresaTipoAfiliacion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoAfiliacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoAfiliacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAfiliacion,TipoAfiliacionConstantesFunciones.LABEL_IDCATETIPOAFILIACION));

		if(this.tipoafiliacionConstantesFunciones.mostrarid_cate_tipo_afiliacionTipoAfiliacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAfiliacionConstantesFunciones.LABEL_IDCATETIPOAFILIACION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CateTipoAfiliacionTableCell(this.catetipoafiliacionsForeignKey,this.tipoafiliacionConstantesFunciones.resaltarid_cate_tipo_afiliacionTipoAfiliacion,this,this.tipoafiliacionConstantesFunciones.activarid_cate_tipo_afiliacionTipoAfiliacion,iSizeTabla));
			tableColumn.setCellEditor(new CateTipoAfiliacionTableCell(this.catetipoafiliacionsForeignKey,this.tipoafiliacionConstantesFunciones.resaltarid_cate_tipo_afiliacionTipoAfiliacion,this,this.tipoafiliacionConstantesFunciones.activarid_cate_tipo_afiliacionTipoAfiliacion,true,"id_cate_tipo_afiliacionTipoAfiliacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoAfiliacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoAfiliacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAfiliacion,TipoAfiliacionConstantesFunciones.LABEL_CODIGO));

		if(this.tipoafiliacionConstantesFunciones.mostrarcodigoTipoAfiliacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAfiliacionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoafiliacionConstantesFunciones.resaltarcodigoTipoAfiliacion,this.tipoafiliacionConstantesFunciones.activarcodigoTipoAfiliacion,iSizeTabla,this,true,"codigoTipoAfiliacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoafiliacionConstantesFunciones.resaltarcodigoTipoAfiliacion,this.tipoafiliacionConstantesFunciones.activarcodigoTipoAfiliacion,this,true,"codigoTipoAfiliacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoAfiliacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoAfiliacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAfiliacion,TipoAfiliacionConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoafiliacionConstantesFunciones.mostrarnombreTipoAfiliacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAfiliacionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoafiliacionConstantesFunciones.resaltarnombreTipoAfiliacion,this.tipoafiliacionConstantesFunciones.activarnombreTipoAfiliacion,iSizeTabla,this,true,"nombreTipoAfiliacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoafiliacionConstantesFunciones.resaltarnombreTipoAfiliacion,this.tipoafiliacionConstantesFunciones.activarnombreTipoAfiliacion,this,true,"nombreTipoAfiliacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoAfiliacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoAfiliacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAfiliacion,TipoAfiliacionConstantesFunciones.LABEL_PORCENEMPLEA));

		if(this.tipoafiliacionConstantesFunciones.mostrarporcen_empleaTipoAfiliacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAfiliacionConstantesFunciones.LABEL_PORCENEMPLEA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoafiliacionConstantesFunciones.resaltarporcen_empleaTipoAfiliacion,this.tipoafiliacionConstantesFunciones.activarporcen_empleaTipoAfiliacion,iSizeTabla,this,true,"porcen_empleaTipoAfiliacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoafiliacionConstantesFunciones.resaltarporcen_empleaTipoAfiliacion,this.tipoafiliacionConstantesFunciones.activarporcen_empleaTipoAfiliacion,this,true,"porcen_empleaTipoAfiliacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoAfiliacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoAfiliacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAfiliacion,TipoAfiliacionConstantesFunciones.LABEL_PORCENPATRO));

		if(this.tipoafiliacionConstantesFunciones.mostrarporcen_patroTipoAfiliacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAfiliacionConstantesFunciones.LABEL_PORCENPATRO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoafiliacionConstantesFunciones.resaltarporcen_patroTipoAfiliacion,this.tipoafiliacionConstantesFunciones.activarporcen_patroTipoAfiliacion,iSizeTabla,this,true,"porcen_patroTipoAfiliacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoafiliacionConstantesFunciones.resaltarporcen_patroTipoAfiliacion,this.tipoafiliacionConstantesFunciones.activarporcen_patroTipoAfiliacion,this,true,"porcen_patroTipoAfiliacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoAfiliacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoAfiliacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAfiliacion,TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEEMPLEA));

		if(this.tipoafiliacionConstantesFunciones.mostrarporcen_gene_empleaTipoAfiliacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEEMPLEA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoafiliacionConstantesFunciones.resaltarporcen_gene_empleaTipoAfiliacion,this.tipoafiliacionConstantesFunciones.activarporcen_gene_empleaTipoAfiliacion,iSizeTabla,this,true,"porcen_gene_empleaTipoAfiliacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoafiliacionConstantesFunciones.resaltarporcen_gene_empleaTipoAfiliacion,this.tipoafiliacionConstantesFunciones.activarporcen_gene_empleaTipoAfiliacion,this,true,"porcen_gene_empleaTipoAfiliacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoAfiliacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoAfiliacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAfiliacion,TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEPATRO));

		if(this.tipoafiliacionConstantesFunciones.mostrarporcen_gene_patroTipoAfiliacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEPATRO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoafiliacionConstantesFunciones.resaltarporcen_gene_patroTipoAfiliacion,this.tipoafiliacionConstantesFunciones.activarporcen_gene_patroTipoAfiliacion,iSizeTabla,this,true,"porcen_gene_patroTipoAfiliacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoafiliacionConstantesFunciones.resaltarporcen_gene_patroTipoAfiliacion,this.tipoafiliacionConstantesFunciones.activarporcen_gene_patroTipoAfiliacion,this,true,"porcen_gene_patroTipoAfiliacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoAfiliacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoAfiliacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAfiliacion,TipoAfiliacionConstantesFunciones.LABEL_PORCENSECU));

		if(this.tipoafiliacionConstantesFunciones.mostrarporcen_secuTipoAfiliacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAfiliacionConstantesFunciones.LABEL_PORCENSECU,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoafiliacionConstantesFunciones.resaltarporcen_secuTipoAfiliacion,this.tipoafiliacionConstantesFunciones.activarporcen_secuTipoAfiliacion,iSizeTabla,this,true,"porcen_secuTipoAfiliacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoafiliacionConstantesFunciones.resaltarporcen_secuTipoAfiliacion,this.tipoafiliacionConstantesFunciones.activarporcen_secuTipoAfiliacion,this,true,"porcen_secuTipoAfiliacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoAfiliacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoAfiliacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAfiliacion,TipoAfiliacionConstantesFunciones.LABEL_PORCENIECE));

		if(this.tipoafiliacionConstantesFunciones.mostrarporcen_ieceTipoAfiliacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAfiliacionConstantesFunciones.LABEL_PORCENIECE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoafiliacionConstantesFunciones.resaltarporcen_ieceTipoAfiliacion,this.tipoafiliacionConstantesFunciones.activarporcen_ieceTipoAfiliacion,iSizeTabla,this,true,"porcen_ieceTipoAfiliacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoafiliacionConstantesFunciones.resaltarporcen_ieceTipoAfiliacion,this.tipoafiliacionConstantesFunciones.activarporcen_ieceTipoAfiliacion,this,true,"porcen_ieceTipoAfiliacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoAfiliacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoAfiliacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAfiliacion,TipoAfiliacionConstantesFunciones.LABEL_DESCRIPCION));

		if(this.tipoafiliacionConstantesFunciones.mostrardescripcionTipoAfiliacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAfiliacionConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoafiliacionConstantesFunciones.resaltardescripcionTipoAfiliacion,this.tipoafiliacionConstantesFunciones.activardescripcionTipoAfiliacion,iSizeTabla,this,true,"descripcionTipoAfiliacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoafiliacionConstantesFunciones.resaltardescripcionTipoAfiliacion,this.tipoafiliacionConstantesFunciones.activardescripcionTipoAfiliacion,this,true,"descripcionTipoAfiliacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoAfiliacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoafiliacionSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDatoGeneralEmpleado && this.tipoafiliacionConstantesFunciones.mostrarDatoGeneralEmpleadoTipoAfiliacion && !TipoAfiliacionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Dato General Empleados");
				tableColumn.setHeaderValue("Dato General Empleados");
				tableColumn.setCellRenderer(new DatoGeneralEmpleadoTableCell(tipoafiliacionConstantesFunciones.resaltarDatoGeneralEmpleadoTipoAfiliacion,this,this.tipoafiliacionConstantesFunciones.activarDatoGeneralEmpleadoTipoAfiliacion));
				tableColumn.setCellEditor(new DatoGeneralEmpleadoTableCell(tipoafiliacionConstantesFunciones.resaltarDatoGeneralEmpleadoTipoAfiliacion,this,this.tipoafiliacionConstantesFunciones.activarDatoGeneralEmpleadoTipoAfiliacion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoAfiliacion.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoafiliacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoafiliacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoAfiliacion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoafiliacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoafiliacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoAfiliacion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoAfiliacion && this.isPermisoGuardarCambiosTipoAfiliacion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoafiliacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoafiliacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoAfiliacion.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoafiliacionSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false,iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,true,false,iSizeTabla));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosTipoAfiliacion.addColumn(tableColumn);
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
			
			this.jTableDatosTipoAfiliacion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoAfiliacion && this.isPermisoGuardarCambiosTipoAfiliacion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoafiliacionSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoAfiliacion && this.isPermisoGuardarCambiosTipoAfiliacion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoAfiliacion.moveColumn(this.jTableDatosTipoAfiliacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoAfiliacion.moveColumn(this.jTableDatosTipoAfiliacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoafiliacionSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoAfiliacion.moveColumn(this.jTableDatosTipoAfiliacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoAfiliacion.moveColumn(this.jTableDatosTipoAfiliacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoAfiliacion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoAfiliacion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoAfiliacion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoAfiliacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoAfiliacion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoAfiliacion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoAfiliacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoAfiliacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoAfiliacion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoAfiliacion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoAfiliacion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoafiliacionLogic.getTipoAfiliacions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoafiliacions.size()-1;
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
		//this.jTableDatosTipoAfiliacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoAfiliacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoAfiliacion();
			
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
				
				//this.isEsNuevoTipoAfiliacion=false;
					
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
			
				if(this.tipoafiliacionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoAfiliacion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoAfiliacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoAfiliacion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoafiliacion.getsType().equals("DUPLICADO")
				   || this.tipoafiliacion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoAfiliacion=true;
				
				} else {
					this.isEsNuevoTipoAfiliacion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoafiliacion.getId()>=0 && !this.tipoafiliacion.getIsNew()) {						
						this.isEsNuevoTipoAfiliacion=false;
						
					} else {
						this.isEsNuevoTipoAfiliacion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoAfiliacion(esRelaciones);						
				
				this.seleccionarTipoAfiliacion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoafiliacion.getId()<0) {
					this.isEsNuevoTipoAfiliacion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoAfiliacion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoAfiliacion(evt,rowIndex);
				}	
				
				if(this.tipoafiliacionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoAfiliacion: " + this.dDif); 
					}
				}								
				
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoAfiliacion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoafiliacion)) {
					if(this.tipoafiliacion.getId()>0) {
						this.tipoafiliacion.setIsDeleted(true);
						
						this.tipoafiliacionsEliminados.add(this.tipoafiliacion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoafiliacionLogic.getTipoAfiliacions().remove(this.tipoafiliacion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoafiliacions.remove(this.tipoafiliacion);				
					}
					
					
					((TipoAfiliacionModel) this.jTableDatosTipoAfiliacion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoAfiliacion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoAfiliacion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoAfiliacion) {
			
			if(this.jInternalFrameDetalleFormTipoAfiliacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoAfiliacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoAfiliacion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoAfiliacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoAfiliacion(this.tipoafiliacion);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoafiliacionConstantesFunciones.cargarid_empresaTipoAfiliacion || this.tipoafiliacionConstantesFunciones.event_dependid_empresaTipoAfiliacion) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipoafiliacion.getid_empresa());
									//this.inicializarActualizarBindingTipoAfiliacion(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipoafiliacion.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipoafiliacion.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipoafiliacion.getid_empresa(),false,"Formulario");

					//CateTipoAfiliacion
					if(!this.tipoafiliacionConstantesFunciones.cargarid_cate_tipo_afiliacionTipoAfiliacion || this.tipoafiliacionConstantesFunciones.event_dependid_cate_tipo_afiliacionTipoAfiliacion) {
						//this.cargarCombosCateTipoAfiliacionsForeignKeyLista(" where id="+this.tipoafiliacion.getid_cate_tipo_afiliacion());
									//this.inicializarActualizarBindingTipoAfiliacion(false,false);
						this.catetipoafiliacionsForeignKey=new ArrayList<CateTipoAfiliacion>();

						if(tipoafiliacion.getCateTipoAfiliacion()!=null) {
							this.catetipoafiliacionsForeignKey.add(tipoafiliacion.getCateTipoAfiliacion());
						}

						this.addItemDefectoCombosForeignKeyCateTipoAfiliacion();
						this.cargarCombosFrameCateTipoAfiliacionsForeignKey("Todos");
					}
					this.setActualCateTipoAfiliacionForeignKey(this.tipoafiliacion.getid_cate_tipo_afiliacion(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoAfiliacion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoAfiliacion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoAfiliacion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoAfiliacion(TipoAfiliacion tipoafiliacion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoAfiliacion(tipoafiliacion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoAfiliacion(TipoAfiliacion tipoafiliacion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoAfiliacion(tipoafiliacion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoAfiliacion(tipoafiliacion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoAfiliacion(tipoafiliacion);
	}
	
	public void setVariablesObjetoActualToFormularioTipoAfiliacion(TipoAfiliacion tipoafiliacion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoAfiliacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoAfiliacion.jLabelidTipoAfiliacion.setText(tipoafiliacion.getId().toString());
			this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldcodigoTipoAfiliacion.setText(tipoafiliacion.getcodigo());
			this.jInternalFrameDetalleFormTipoAfiliacion.jTextAreanombreTipoAfiliacion.setText(tipoafiliacion.getnombre());
			this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_empleaTipoAfiliacion.setText(tipoafiliacion.getporcen_emplea().toString());
			this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_patroTipoAfiliacion.setText(tipoafiliacion.getporcen_patro().toString());
			this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_gene_empleaTipoAfiliacion.setText(tipoafiliacion.getporcen_gene_emplea().toString());
			this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_gene_patroTipoAfiliacion.setText(tipoafiliacion.getporcen_gene_patro().toString());
			this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_secuTipoAfiliacion.setText(tipoafiliacion.getporcen_secu().toString());
			this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_ieceTipoAfiliacion.setText(tipoafiliacion.getporcen_iece().toString());
			this.jInternalFrameDetalleFormTipoAfiliacion.jTextAreadescripcionTipoAfiliacion.setText(tipoafiliacion.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoAfiliacion tipoafiliacionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoafiliacionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoAfiliacion tipoafiliacionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoafiliacionLocal=this.tipoafiliacion;
			} else {
				tipoafiliacionLocal=this.tipoafiliacionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoafiliacionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoAfiliacion(tipoafiliacionLocal,true);
					
					if(tipoafiliacionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoafiliacionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoafiliacionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoAfiliacion(TipoAfiliacion tipoafiliacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoAfiliacion(tipoafiliacion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(tipoafiliacion);
	}
	
	public void setVariablesFormularioToObjetoActualTipoAfiliacion(TipoAfiliacion tipoafiliacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoAfiliacion(tipoafiliacion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoAfiliacion(TipoAfiliacion tipoafiliacion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoAfiliacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoAfiliacion.jLabelidTipoAfiliacion.getText()==null || this.jInternalFrameDetalleFormTipoAfiliacion.jLabelidTipoAfiliacion.getText()=="" || this.jInternalFrameDetalleFormTipoAfiliacion.jLabelidTipoAfiliacion.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoAfiliacion.jLabelidTipoAfiliacion.setText("0");
			}

			if(conColumnasBase) {tipoafiliacion.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoAfiliacion.jLabelidTipoAfiliacion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoAfiliacionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelIdTipoAfiliacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoafiliacion.setcodigo(this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldcodigoTipoAfiliacion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoAfiliacionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelcodigoTipoAfiliacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoafiliacion.setnombre(this.jInternalFrameDetalleFormTipoAfiliacion.jTextAreanombreTipoAfiliacion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoAfiliacionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelnombreTipoAfiliacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoafiliacion.setporcen_emplea(Double.parseDouble(this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_empleaTipoAfiliacion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoAfiliacionConstantesFunciones.LABEL_PORCENEMPLEA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelporcen_empleaTipoAfiliacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoafiliacion.setporcen_patro(Double.parseDouble(this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_patroTipoAfiliacion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoAfiliacionConstantesFunciones.LABEL_PORCENPATRO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelporcen_patroTipoAfiliacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoafiliacion.setporcen_gene_emplea(Double.parseDouble(this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_gene_empleaTipoAfiliacion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEEMPLEA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelporcen_gene_empleaTipoAfiliacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoafiliacion.setporcen_gene_patro(Double.parseDouble(this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_gene_patroTipoAfiliacion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEPATRO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelporcen_gene_patroTipoAfiliacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoafiliacion.setporcen_secu(Double.parseDouble(this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_secuTipoAfiliacion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoAfiliacionConstantesFunciones.LABEL_PORCENSECU+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelporcen_secuTipoAfiliacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoafiliacion.setporcen_iece(Double.parseDouble(this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_ieceTipoAfiliacion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoAfiliacionConstantesFunciones.LABEL_PORCENIECE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAfiliacion.jLabelporcen_ieceTipoAfiliacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoafiliacion.setdescripcion(this.jInternalFrameDetalleFormTipoAfiliacion.jTextAreadescripcionTipoAfiliacion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoAfiliacionConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAfiliacion.jLabeldescripcionTipoAfiliacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoAfiliacion(TipoAfiliacion tipoafiliacionBean,TipoAfiliacion tipoafiliacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tipoafiliacionBean.getid_cate_tipo_afiliacion()!=null && !tipoafiliacionBean.getid_cate_tipo_afiliacion().equals(-1L))) {tipoafiliacion.setid_cate_tipo_afiliacion(tipoafiliacionBean.getid_cate_tipo_afiliacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoAfiliacion(TipoAfiliacion tipoafiliacionOrigen,TipoAfiliacion tipoafiliacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoafiliacionOrigen.getId()!=null && !tipoafiliacionOrigen.getId().equals(0L))) {tipoafiliacion.setId(tipoafiliacionOrigen.getId());}}
			if(conDefault || (!conDefault && tipoafiliacionOrigen.getid_cate_tipo_afiliacion()!=null && !tipoafiliacionOrigen.getid_cate_tipo_afiliacion().equals(-1L))) {tipoafiliacion.setid_cate_tipo_afiliacion(tipoafiliacionOrigen.getid_cate_tipo_afiliacion());}
			if(conDefault || (!conDefault && tipoafiliacionOrigen.getcodigo()!=null && !tipoafiliacionOrigen.getcodigo().equals(""))) {tipoafiliacion.setcodigo(tipoafiliacionOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoafiliacionOrigen.getnombre()!=null && !tipoafiliacionOrigen.getnombre().equals(""))) {tipoafiliacion.setnombre(tipoafiliacionOrigen.getnombre());}
			if(conDefault || (!conDefault && tipoafiliacionOrigen.getporcen_emplea()!=null && !tipoafiliacionOrigen.getporcen_emplea().equals(0.0))) {tipoafiliacion.setporcen_emplea(tipoafiliacionOrigen.getporcen_emplea());}
			if(conDefault || (!conDefault && tipoafiliacionOrigen.getporcen_patro()!=null && !tipoafiliacionOrigen.getporcen_patro().equals(0.0))) {tipoafiliacion.setporcen_patro(tipoafiliacionOrigen.getporcen_patro());}
			if(conDefault || (!conDefault && tipoafiliacionOrigen.getporcen_gene_emplea()!=null && !tipoafiliacionOrigen.getporcen_gene_emplea().equals(0.0))) {tipoafiliacion.setporcen_gene_emplea(tipoafiliacionOrigen.getporcen_gene_emplea());}
			if(conDefault || (!conDefault && tipoafiliacionOrigen.getporcen_gene_patro()!=null && !tipoafiliacionOrigen.getporcen_gene_patro().equals(0.0))) {tipoafiliacion.setporcen_gene_patro(tipoafiliacionOrigen.getporcen_gene_patro());}
			if(conDefault || (!conDefault && tipoafiliacionOrigen.getporcen_secu()!=null && !tipoafiliacionOrigen.getporcen_secu().equals(0.0))) {tipoafiliacion.setporcen_secu(tipoafiliacionOrigen.getporcen_secu());}
			if(conDefault || (!conDefault && tipoafiliacionOrigen.getporcen_iece()!=null && !tipoafiliacionOrigen.getporcen_iece().equals(0.0))) {tipoafiliacion.setporcen_iece(tipoafiliacionOrigen.getporcen_iece());}
			if(conDefault || (!conDefault && tipoafiliacionOrigen.getdescripcion()!=null && !tipoafiliacionOrigen.getdescripcion().equals(""))) {tipoafiliacion.setdescripcion(tipoafiliacionOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoAfiliacion(TipoAfiliacion tipoafiliacion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoAfiliacion.jLabelidTipoAfiliacion.setText(tipoafiliacion.getId().toString());
			this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldcodigoTipoAfiliacion.setText(tipoafiliacion.getcodigo());
			this.jInternalFrameDetalleFormTipoAfiliacion.jTextAreanombreTipoAfiliacion.setText(tipoafiliacion.getnombre());
			this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_empleaTipoAfiliacion.setText(tipoafiliacion.getporcen_emplea().toString());
			this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_patroTipoAfiliacion.setText(tipoafiliacion.getporcen_patro().toString());
			this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_gene_empleaTipoAfiliacion.setText(tipoafiliacion.getporcen_gene_emplea().toString());
			this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_gene_patroTipoAfiliacion.setText(tipoafiliacion.getporcen_gene_patro().toString());
			this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_secuTipoAfiliacion.setText(tipoafiliacion.getporcen_secu().toString());
			this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_ieceTipoAfiliacion.setText(tipoafiliacion.getporcen_iece().toString());
			this.jInternalFrameDetalleFormTipoAfiliacion.jTextAreadescripcionTipoAfiliacion.setText(tipoafiliacion.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoAfiliacion(TipoAfiliacionBean tipoafiliacionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoAfiliacion.jLabelidTipoAfiliacion.setText(tipoafiliacionBean.getId().toString());
			this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldcodigoTipoAfiliacion.setText(tipoafiliacionBean.getcodigo());
			this.jInternalFrameDetalleFormTipoAfiliacion.jTextAreanombreTipoAfiliacion.setText(tipoafiliacionBean.getnombre());
			this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_empleaTipoAfiliacion.setText(tipoafiliacionBean.getporcen_emplea().toString());
			this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_patroTipoAfiliacion.setText(tipoafiliacionBean.getporcen_patro().toString());
			this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_gene_empleaTipoAfiliacion.setText(tipoafiliacionBean.getporcen_gene_emplea().toString());
			this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_gene_patroTipoAfiliacion.setText(tipoafiliacionBean.getporcen_gene_patro().toString());
			this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_secuTipoAfiliacion.setText(tipoafiliacionBean.getporcen_secu().toString());
			this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_ieceTipoAfiliacion.setText(tipoafiliacionBean.getporcen_iece().toString());
			this.jInternalFrameDetalleFormTipoAfiliacion.jTextAreadescripcionTipoAfiliacion.setText(tipoafiliacionBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoAfiliacion(TipoAfiliacionParameterReturnGeneral tipoafiliacionReturnGeneral,TipoAfiliacionBean tipoafiliacionBean,Boolean conDefault) throws Exception { 
		try {
			TipoAfiliacion tipoafiliacionLocal=new TipoAfiliacion();
			
			tipoafiliacionLocal=tipoafiliacionReturnGeneral.getTipoAfiliacion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoafiliacionLocal.getId()!=null && !tipoafiliacionLocal.getId().equals(0L))) {tipoafiliacionBean.setId(tipoafiliacionLocal.getId());}}
			if(conDefault || (!conDefault && tipoafiliacionLocal.getid_cate_tipo_afiliacion()!=null && !tipoafiliacionLocal.getid_cate_tipo_afiliacion().equals(-1L))) {tipoafiliacionBean.setid_cate_tipo_afiliacion(tipoafiliacionLocal.getid_cate_tipo_afiliacion());}
			if(conDefault || (!conDefault && tipoafiliacionLocal.getcodigo()!=null && !tipoafiliacionLocal.getcodigo().equals(""))) {tipoafiliacionBean.setcodigo(tipoafiliacionLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoafiliacionLocal.getnombre()!=null && !tipoafiliacionLocal.getnombre().equals(""))) {tipoafiliacionBean.setnombre(tipoafiliacionLocal.getnombre());}
			if(conDefault || (!conDefault && tipoafiliacionLocal.getporcen_emplea()!=null && !tipoafiliacionLocal.getporcen_emplea().equals(0.0))) {tipoafiliacionBean.setporcen_emplea(tipoafiliacionLocal.getporcen_emplea());}
			if(conDefault || (!conDefault && tipoafiliacionLocal.getporcen_patro()!=null && !tipoafiliacionLocal.getporcen_patro().equals(0.0))) {tipoafiliacionBean.setporcen_patro(tipoafiliacionLocal.getporcen_patro());}
			if(conDefault || (!conDefault && tipoafiliacionLocal.getporcen_gene_emplea()!=null && !tipoafiliacionLocal.getporcen_gene_emplea().equals(0.0))) {tipoafiliacionBean.setporcen_gene_emplea(tipoafiliacionLocal.getporcen_gene_emplea());}
			if(conDefault || (!conDefault && tipoafiliacionLocal.getporcen_gene_patro()!=null && !tipoafiliacionLocal.getporcen_gene_patro().equals(0.0))) {tipoafiliacionBean.setporcen_gene_patro(tipoafiliacionLocal.getporcen_gene_patro());}
			if(conDefault || (!conDefault && tipoafiliacionLocal.getporcen_secu()!=null && !tipoafiliacionLocal.getporcen_secu().equals(0.0))) {tipoafiliacionBean.setporcen_secu(tipoafiliacionLocal.getporcen_secu());}
			if(conDefault || (!conDefault && tipoafiliacionLocal.getporcen_iece()!=null && !tipoafiliacionLocal.getporcen_iece().equals(0.0))) {tipoafiliacionBean.setporcen_iece(tipoafiliacionLocal.getporcen_iece());}
			if(conDefault || (!conDefault && tipoafiliacionLocal.getdescripcion()!=null && !tipoafiliacionLocal.getdescripcion().equals(""))) {tipoafiliacionBean.setdescripcion(tipoafiliacionLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoAfiliacionGenerico(Long idTipoAfiliacionSeleccionado,JComboBox jComboBoxTipoAfiliacion,List<TipoAfiliacion> tipoafiliacionsLocal)throws Exception {
		try {
			TipoAfiliacion  tipoafiliacionTemp=null;

			for(TipoAfiliacion tipoafiliacionAux:tipoafiliacionsLocal) {
				if(tipoafiliacionAux.getId()!=null && tipoafiliacionAux.getId().equals(idTipoAfiliacionSeleccionado)) {
					tipoafiliacionTemp=tipoafiliacionAux;
					break;
				}
			}

			jComboBoxTipoAfiliacion.setSelectedItem(tipoafiliacionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoAfiliacionGenerico(JComboBox jComboBoxTipoAfiliacion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoAfiliacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoAfiliacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoAfiliacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoAfiliacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoAfiliacion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoAfiliacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoAfiliacion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoAfiliacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoAfiliacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoAfiliacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoafiliacion=(TipoAfiliacion) tipoafiliacionLogic.getTipoAfiliacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoafiliacion =(TipoAfiliacion) tipoafiliacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipoafiliacion.getIsNew() && !tipoafiliacion.getIsChanged() && !tipoafiliacion.getIsDeleted()) {
				sDescripcion=tipoafiliacion.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoafiliacion.getempresa_descripcion();
			}
		}

		if(sTipo.equals("CateTipoAfiliacion")) {
			//sDescripcion=this.getActualCateTipoAfiliacionForeignKeyDescripcion((Long)value);
			if(!tipoafiliacion.getIsNew() && !tipoafiliacion.getIsChanged() && !tipoafiliacion.getIsDeleted()) {
				sDescripcion=tipoafiliacion.getcatetipoafiliacion_descripcion();
			} else {
				//sDescripcion=this.getActualCateTipoAfiliacionForeignKeyDescripcion((Long)value);
				sDescripcion=tipoafiliacion.getcatetipoafiliacion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoAfiliacion tipoafiliacionRow=new TipoAfiliacion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoafiliacionRow=(TipoAfiliacion) tipoafiliacionLogic.getTipoAfiliacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoafiliacionRow=(TipoAfiliacion) tipoafiliacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDatoGeneralEmpleadoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoAfiliacion tipoafiliacion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoAfiliacion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoafiliacion = (TipoAfiliacion)this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoafiliacion = (TipoAfiliacion)this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoafiliacion!=null) {
						this.tipoafiliacion = tipoafiliacion;
					} else {
						this.tipoafiliacion = new TipoAfiliacion();
					}
				}

				if(this.isTienePermisosDatoGeneralEmpleado && this.permiteMantenimiento(this.tipoafiliacion)) {
					DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFramePopup=new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						datogeneralempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFramePopup;
					} else {
						datogeneralempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame;
					}

					List<TipoAfiliacion> tipoafiliacions=new ArrayList<TipoAfiliacion>();
					tipoafiliacions.add(this.tipoafiliacion);
					if(!esRelacionado) {
						//datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setConGuardarRelaciones(false);
						//datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					datogeneralempleadoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoAfiliacion.cargarDatoGeneralEmpleadoBeanSwingJInternalFrame(tipoafiliacions,this.tipoafiliacion,datogeneralempleadoBeanSwingJInternalFrame,/*conInicializar,*/datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getConGuardarRelaciones(),datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getEsGuardarRelacionado());
					datogeneralempleadoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsDatoGeneralEmpleado("no_relacionado");

						datogeneralempleadoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DatoGeneralEmpleadoConstantesFunciones.ITAMANIOFILATABLA + (DatoGeneralEmpleadoConstantesFunciones.ITAMANIOFILATABLA/2));

						datogeneralempleadoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoAfiliacion=(TitledBorder)this.jScrollPanelDatosTipoAfiliacion.getBorder();
						TitledBorder titledBorderDatoGeneralEmpleado=(TitledBorder)datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.getBorder();

						titledBorderDatoGeneralEmpleado.setTitle(titledBorderTipoAfiliacion.getTitle() + " -> Dato General Empleado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,datogeneralempleadoBeanSwingJInternalFrame);
						}

						datogeneralempleadoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(datogeneralempleadoBeanSwingJInternalFrame);

						datogeneralempleadoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoafiliacionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Dato General Empleado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoAfiliacion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoAfiliacion.setVisible((this.isVisibilidadCeldaNuevoTipoAfiliacion && this.isPermisoNuevoTipoAfiliacion));			
			this.jButtonDuplicarTipoAfiliacion.setVisible((this.isVisibilidadCeldaDuplicarTipoAfiliacion && this.isPermisoDuplicarTipoAfiliacion));			
			this.jButtonCopiarTipoAfiliacion.setVisible((this.isVisibilidadCeldaCopiarTipoAfiliacion && this.isPermisoCopiarTipoAfiliacion));
			this.jButtonVerFormTipoAfiliacion.setVisible((this.isVisibilidadCeldaVerFormTipoAfiliacion && this.isPermisoVerFormTipoAfiliacion));
			
			this.jButtonAbrirOrderByTipoAfiliacion.setVisible((this.isVisibilidadCeldaOrdenTipoAfiliacion && this.isPermisoOrdenTipoAfiliacion));			
			
			this.jButtonNuevoRelacionesTipoAfiliacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoAfiliacion && this.isPermisoNuevoTipoAfiliacion));			
			this.jButtonNuevoGuardarCambiosTipoAfiliacion.setVisible((this.isVisibilidadCeldaNuevoTipoAfiliacion && this.isPermisoNuevoTipoAfiliacion && this.isPermisoGuardarCambiosTipoAfiliacion));
			
			if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) {
			this.jInternalFrameDetalleFormTipoAfiliacion.jButtonModificarTipoAfiliacion.setVisible((this.isVisibilidadCeldaModificarTipoAfiliacion && this.isPermisoActualizarTipoAfiliacion));	
			this.jInternalFrameDetalleFormTipoAfiliacion.jButtonActualizarTipoAfiliacion.setVisible((this.isVisibilidadCeldaActualizarTipoAfiliacion && this.isPermisoActualizarTipoAfiliacion));	
			this.jInternalFrameDetalleFormTipoAfiliacion.jButtonEliminarTipoAfiliacion.setVisible((this.isVisibilidadCeldaEliminarTipoAfiliacion && this.isPermisoEliminarTipoAfiliacion));
			this.jInternalFrameDetalleFormTipoAfiliacion.jButtonCancelarTipoAfiliacion.setVisible(this.isVisibilidadCeldaCancelarTipoAfiliacion);							
			this.jInternalFrameDetalleFormTipoAfiliacion.jButtonGuardarCambiosTipoAfiliacion.setVisible((this.isVisibilidadCeldaGuardarTipoAfiliacion && this.isPermisoGuardarCambiosTipoAfiliacion));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoAfiliacion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoAfiliacion && this.isPermisoGuardarCambiosTipoAfiliacion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoAfiliacion.setVisible((this.isVisibilidadCeldaNuevoTipoAfiliacion && this.isPermisoNuevoTipoAfiliacion));						
			this.jButtonDuplicarToolBarTipoAfiliacion.setVisible((this.isVisibilidadCeldaDuplicarTipoAfiliacion && this.isPermisoDuplicarTipoAfiliacion));						
			this.jButtonCopiarToolBarTipoAfiliacion.setVisible((this.isVisibilidadCeldaCopiarTipoAfiliacion && this.isPermisoCopiarTipoAfiliacion));			
			this.jButtonVerFormToolBarTipoAfiliacion.setVisible((this.isVisibilidadCeldaVerFormTipoAfiliacion && this.isPermisoVerFormTipoAfiliacion));			
			this.jButtonAbrirOrderByToolBarTipoAfiliacion.setVisible((this.isVisibilidadCeldaOrdenTipoAfiliacion && this.isPermisoOrdenTipoAfiliacion));
			this.jButtonNuevoRelacionesToolBarTipoAfiliacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoAfiliacion && this.isPermisoNuevoTipoAfiliacion));			
			this.jButtonNuevoGuardarCambiosToolBarTipoAfiliacion.setVisible((this.isVisibilidadCeldaNuevoTipoAfiliacion && this.isPermisoNuevoTipoAfiliacion && this.isPermisoGuardarCambiosTipoAfiliacion));			
			
			if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) {
			this.jInternalFrameDetalleFormTipoAfiliacion.jButtonModificarToolBarTipoAfiliacion.setVisible((this.isVisibilidadCeldaModificarTipoAfiliacion && this.isPermisoActualizarTipoAfiliacion));	
			this.jInternalFrameDetalleFormTipoAfiliacion.jButtonActualizarToolBarTipoAfiliacion.setVisible((this.isVisibilidadCeldaActualizarTipoAfiliacion  && this.isPermisoActualizarTipoAfiliacion));	
			this.jInternalFrameDetalleFormTipoAfiliacion.jButtonEliminarToolBarTipoAfiliacion.setVisible((this.isVisibilidadCeldaEliminarTipoAfiliacion && this.isPermisoEliminarTipoAfiliacion));
			this.jInternalFrameDetalleFormTipoAfiliacion.jButtonCancelarToolBarTipoAfiliacion.setVisible(this.isVisibilidadCeldaCancelarTipoAfiliacion);				
			this.jInternalFrameDetalleFormTipoAfiliacion.jButtonGuardarCambiosToolBarTipoAfiliacion.setVisible((this.isVisibilidadCeldaGuardarTipoAfiliacion && this.isPermisoGuardarCambiosTipoAfiliacion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoAfiliacion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoAfiliacion && this.isPermisoGuardarCambiosTipoAfiliacion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoAfiliacion.setVisible((this.isVisibilidadCeldaNuevoTipoAfiliacion && this.isPermisoNuevoTipoAfiliacion));			
			this.jMenuItemDuplicarTipoAfiliacion.setVisible((this.isVisibilidadCeldaDuplicarTipoAfiliacion && this.isPermisoDuplicarTipoAfiliacion));			
			this.jMenuItemCopiarTipoAfiliacion.setVisible((this.isVisibilidadCeldaCopiarTipoAfiliacion && this.isPermisoCopiarTipoAfiliacion));			
			this.jMenuItemVerFormTipoAfiliacion.setVisible((this.isVisibilidadCeldaVerFormTipoAfiliacion && this.isPermisoVerFormTipoAfiliacion));			
			this.jMenuItemAbrirOrderByTipoAfiliacion.setVisible((this.isVisibilidadCeldaOrdenTipoAfiliacion && this.isPermisoOrdenTipoAfiliacion));			
			//this.jMenuItemMostrarOcultarTipoAfiliacion.setVisible((this.isVisibilidadCeldaOrdenTipoAfiliacion && this.isPermisoOrdenTipoAfiliacion));
			this.jMenuItemDetalleAbrirOrderByTipoAfiliacion.setVisible((this.isVisibilidadCeldaOrdenTipoAfiliacion && this.isPermisoOrdenTipoAfiliacion));			
			//this.jMenuItemDetalleMostrarOcultarTipoAfiliacion.setVisible((this.isVisibilidadCeldaOrdenTipoAfiliacion && this.isPermisoOrdenTipoAfiliacion));			
			this.jMenuItemNuevoRelacionesTipoAfiliacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoAfiliacion && this.isPermisoNuevoTipoAfiliacion));			
			this.jMenuItemNuevoGuardarCambiosTipoAfiliacion.setVisible((this.isVisibilidadCeldaNuevoTipoAfiliacion && this.isPermisoNuevoTipoAfiliacion && this.isPermisoGuardarCambiosTipoAfiliacion));									
			
			if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) {
			this.jInternalFrameDetalleFormTipoAfiliacion.jMenuItemModificarTipoAfiliacion.setVisible((this.isVisibilidadCeldaModificarTipoAfiliacion && this.isPermisoActualizarTipoAfiliacion));	
			this.jInternalFrameDetalleFormTipoAfiliacion.jMenuItemActualizarTipoAfiliacion.setVisible((this.isVisibilidadCeldaActualizarTipoAfiliacion && this.isPermisoActualizarTipoAfiliacion));	
			this.jInternalFrameDetalleFormTipoAfiliacion.jMenuItemEliminarTipoAfiliacion.setVisible((this.isVisibilidadCeldaEliminarTipoAfiliacion && this.isPermisoEliminarTipoAfiliacion));
			this.jInternalFrameDetalleFormTipoAfiliacion.jMenuItemCancelarTipoAfiliacion.setVisible(this.isVisibilidadCeldaCancelarTipoAfiliacion);				
			}
			
			this.jMenuItemGuardarCambiosTipoAfiliacion.setVisible((this.isVisibilidadCeldaGuardarTipoAfiliacion && this.isPermisoGuardarCambiosTipoAfiliacion));						
			this.jMenuItemGuardarCambiosTablaTipoAfiliacion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoAfiliacion && this.isPermisoGuardarCambiosTipoAfiliacion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoAfiliacion=this.jButtonNuevoTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaDuplicarTipoAfiliacion=this.jButtonDuplicarTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaCopiarTipoAfiliacion=this.jButtonCopiarTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaVerFormTipoAfiliacion=this.jButtonVerFormTipoAfiliacion.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoAfiliacion=this.jButtonAbrirOrderByTipoAfiliacion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoAfiliacion=this.jButtonNuevoRelacionesTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaModificarTipoAfiliacion=this.jButtonModificarTipoAfiliacion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) {
			this.isVisibilidadCeldaActualizarTipoAfiliacion=this.jInternalFrameDetalleFormTipoAfiliacion.jButtonActualizarTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaEliminarTipoAfiliacion=this.jInternalFrameDetalleFormTipoAfiliacion.jButtonEliminarTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaCancelarTipoAfiliacion=this.jInternalFrameDetalleFormTipoAfiliacion.jButtonCancelarTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaGuardarTipoAfiliacion=this.jInternalFrameDetalleFormTipoAfiliacion.jButtonGuardarCambiosTipoAfiliacion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoAfiliacion=this.jButtonGuardarCambiosTablaTipoAfiliacion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoAfiliacion=this.jButtonNuevoToolBarTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoAfiliacion=this.jButtonNuevoRelacionesToolBarTipoAfiliacion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) {
			this.isVisibilidadCeldaModificarTipoAfiliacion=this.jInternalFrameDetalleFormTipoAfiliacion.jButtonModificarToolBarTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaActualizarTipoAfiliacion=this.jInternalFrameDetalleFormTipoAfiliacion.jButtonActualizarToolBarTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaEliminarTipoAfiliacion=this.jInternalFrameDetalleFormTipoAfiliacion.jButtonEliminarToolBarTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaCancelarTipoAfiliacion=this.jInternalFrameDetalleFormTipoAfiliacion.jButtonCancelarToolBarTipoAfiliacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoAfiliacion=this.jButtonGuardarCambiosToolBarTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoAfiliacion=this.jButtonGuardarCambiosTablaToolBarTipoAfiliacion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoAfiliacion=this.jMenuItemNuevoTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoAfiliacion=this.jMenuItemNuevoRelacionesTipoAfiliacion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) {
			this.isVisibilidadCeldaModificarTipoAfiliacion=this.jInternalFrameDetalleFormTipoAfiliacion.jMenuItemModificarTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaActualizarTipoAfiliacion=this.jInternalFrameDetalleFormTipoAfiliacion.jMenuItemActualizarTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaEliminarTipoAfiliacion=this.jInternalFrameDetalleFormTipoAfiliacion.jMenuItemEliminarTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaCancelarTipoAfiliacion=this.jInternalFrameDetalleFormTipoAfiliacion.jMenuItemCancelarTipoAfiliacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoAfiliacion=this.jMenuItemGuardarCambiosTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoAfiliacion=this.jMenuItemGuardarCambiosTablaTipoAfiliacion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoAfiliacion(Boolean esInicializar) {
		if(TipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoafiliacionSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoAfiliacion();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoAfiliacion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoAfiliacion() {
		this.jButtonNuevoTipoAfiliacion.setVisible(this.isPermisoNuevoTipoAfiliacion);			
		this.jButtonDuplicarTipoAfiliacion.setVisible(this.isPermisoDuplicarTipoAfiliacion);			
		this.jButtonCopiarTipoAfiliacion.setVisible(this.isPermisoCopiarTipoAfiliacion);			
		this.jButtonVerFormTipoAfiliacion.setVisible(this.isPermisoVerFormTipoAfiliacion);			
		
		this.jButtonAbrirOrderByTipoAfiliacion.setVisible(this.isPermisoOrdenTipoAfiliacion);					
		
		this.jButtonNuevoRelacionesTipoAfiliacion.setVisible(this.isPermisoNuevoTipoAfiliacion);			
		
		if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAfiliacion.jButtonModificarTipoAfiliacion.setVisible(this.isPermisoActualizarTipoAfiliacion);	
			this.jInternalFrameDetalleFormTipoAfiliacion.jButtonActualizarTipoAfiliacion.setVisible(this.isPermisoActualizarTipoAfiliacion);	
			this.jInternalFrameDetalleFormTipoAfiliacion.jButtonEliminarTipoAfiliacion.setVisible(this.isPermisoEliminarTipoAfiliacion);
			this.jInternalFrameDetalleFormTipoAfiliacion.jButtonCancelarTipoAfiliacion.setVisible(this.isVisibilidadCeldaCancelarTipoAfiliacion);						
			this.jInternalFrameDetalleFormTipoAfiliacion.jButtonGuardarCambiosTipoAfiliacion.setVisible(this.isPermisoGuardarCambiosTipoAfiliacion);							
		}
		
		this.jButtonGuardarCambiosTablaTipoAfiliacion.setVisible(this.isPermisoActualizarTipoAfiliacion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoAfiliacion() {
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonModificarTipoAfiliacion.setVisible(this.isPermisoActualizarTipoAfiliacion);	
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonActualizarTipoAfiliacion.setVisible(this.isPermisoActualizarTipoAfiliacion);	
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonEliminarTipoAfiliacion.setVisible(this.isPermisoEliminarTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonCancelarTipoAfiliacion.setVisible(this.isVisibilidadCeldaCancelarTipoAfiliacion);							
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonGuardarCambiosTipoAfiliacion.setVisible((this.isVisibilidadCeldaGuardarTipoAfiliacion && this.isPermisoGuardarCambiosTipoAfiliacion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoAfiliacion() {
		if(TipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoAfiliacion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoAfiliacion() {
	}
	
	public void jTableDatosTipoAfiliacionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoAfiliacion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoAfiliacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.gettipoafiliacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoafiliacion==null) {
						this.tipoafiliacion = new TipoAfiliacion();
					}

					this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.tipoafiliacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
				}

				if(this.tipoafiliacion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoafiliacion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAfiliacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoAfiliacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoAfiliacion(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoAfiliacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoAfiliacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.gettipoafiliacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoafiliacionLogic.getConnexion());

				if(this.tipoafiliacion.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipoafiliacion.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoAfiliacion=(TitledBorder)this.jScrollPanelDatosTipoAfiliacion.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoAfiliacion.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoAfiliacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.gettipoafiliacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoafiliacion==null) {
						this.tipoafiliacion = new TipoAfiliacion();
					}

					this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.tipoafiliacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
				}

				if(this.tipoafiliacion.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipoafiliacion.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAfiliacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cate_tipo_afiliacionTipoAfiliacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocatetipoafiliacion=true;

			idTienePermisocatetipoafiliacion=this.tienePermisosUsuarioEnPaginaWebTipoAfiliacion(CateTipoAfiliacionConstantesFunciones.CLASSNAME);

			if(idTienePermisocatetipoafiliacion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoAfiliacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoAfiliacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.gettipoafiliacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);

				this.catetipoafiliacionBeanSwingJInternalFrame=new CateTipoAfiliacionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.catetipoafiliacionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.catetipoafiliacionBeanSwingJInternalFrame.getCateTipoAfiliacionLogic().setConnexion(this.tipoafiliacionLogic.getConnexion());

				if(this.tipoafiliacion.getid_cate_tipo_afiliacion()!=null) {
					this.catetipoafiliacionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.catetipoafiliacionBeanSwingJInternalFrame.setIdActual(this.tipoafiliacion.getid_cate_tipo_afiliacion());
					this.catetipoafiliacionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.catetipoafiliacionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.catetipoafiliacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaCateTipoAfiliacion();
				}

				JInternalFrameBase jinternalFrame =this.catetipoafiliacionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoAfiliacion=(TitledBorder)this.jScrollPanelDatosTipoAfiliacion.getBorder();
				TitledBorder titledBordercatetipoafiliacion=(TitledBorder)this.catetipoafiliacionBeanSwingJInternalFrame.jScrollPanelDatosCateTipoAfiliacion.getBorder();

				titledBordercatetipoafiliacion.setTitle(titledBorderTipoAfiliacion.getTitle() + " -> Cate Tipo Afiliacion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cate_tipo_afiliacionTipoAfiliacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.gettipoafiliacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoafiliacion==null) {
						this.tipoafiliacion = new TipoAfiliacion();
					}

					this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.tipoafiliacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
				}

				if(this.tipoafiliacion.getid_cate_tipo_afiliacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cate_tipo_afiliacion = "+this.tipoafiliacion.getid_cate_tipo_afiliacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAfiliacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoAfiliacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.gettipoafiliacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoafiliacion==null) {
						this.tipoafiliacion = new TipoAfiliacion();
					}

					this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.tipoafiliacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
				}

				if(this.tipoafiliacion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoafiliacion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAfiliacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoAfiliacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.gettipoafiliacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoafiliacion==null) {
						this.tipoafiliacion = new TipoAfiliacion();
					}

					this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.tipoafiliacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
				}

				if(this.tipoafiliacion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoafiliacion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAfiliacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcen_empleaTipoAfiliacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.gettipoafiliacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoafiliacion==null) {
						this.tipoafiliacion = new TipoAfiliacion();
					}

					this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.tipoafiliacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
				}

				if(this.tipoafiliacion.getporcen_emplea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcen_emplea = "+this.tipoafiliacion.getporcen_emplea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAfiliacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcen_patroTipoAfiliacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.gettipoafiliacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoafiliacion==null) {
						this.tipoafiliacion = new TipoAfiliacion();
					}

					this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.tipoafiliacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
				}

				if(this.tipoafiliacion.getporcen_patro()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcen_patro = "+this.tipoafiliacion.getporcen_patro().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAfiliacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcen_gene_empleaTipoAfiliacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.gettipoafiliacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoafiliacion==null) {
						this.tipoafiliacion = new TipoAfiliacion();
					}

					this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.tipoafiliacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
				}

				if(this.tipoafiliacion.getporcen_gene_emplea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcen_gene_emplea = "+this.tipoafiliacion.getporcen_gene_emplea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAfiliacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcen_gene_patroTipoAfiliacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.gettipoafiliacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoafiliacion==null) {
						this.tipoafiliacion = new TipoAfiliacion();
					}

					this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.tipoafiliacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
				}

				if(this.tipoafiliacion.getporcen_gene_patro()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcen_gene_patro = "+this.tipoafiliacion.getporcen_gene_patro().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAfiliacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcen_secuTipoAfiliacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.gettipoafiliacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoafiliacion==null) {
						this.tipoafiliacion = new TipoAfiliacion();
					}

					this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.tipoafiliacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
				}

				if(this.tipoafiliacion.getporcen_secu()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcen_secu = "+this.tipoafiliacion.getporcen_secu().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAfiliacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcen_ieceTipoAfiliacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.gettipoafiliacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoafiliacion==null) {
						this.tipoafiliacion = new TipoAfiliacion();
					}

					this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.tipoafiliacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
				}

				if(this.tipoafiliacion.getporcen_iece()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcen_iece = "+this.tipoafiliacion.getporcen_iece().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAfiliacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionTipoAfiliacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.gettipoafiliacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoafiliacion==null) {
						this.tipoafiliacion = new TipoAfiliacion();
					}

					this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.tipoafiliacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);
				}

				if(this.tipoafiliacion.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.tipoafiliacion.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAfiliacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCateTipoAfiliacionTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoAfiliacion(false,false);

			this.getTipoAfiliacionsFK_IdCateTipoAfiliacion();

			this.inicializarActualizarBindingTipoAfiliacion(false);

			//if(TipoAfiliacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoAfiliacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoAfiliacion(false,false);

			this.getTipoAfiliacionsFK_IdEmpresa();

			this.inicializarActualizarBindingTipoAfiliacion(false);

			//if(TipoAfiliacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoAfiliacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoafiliacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoAfiliacion() {
		if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) {
		

		if(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) {
			this.jInternalFrameDetalleFormTipoAfiliacion.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoAfiliacion.dispose();
			this.jInternalFrameDetalleFormTipoAfiliacion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoAfiliacion!=null) {
			this.jInternalFrameReporteDinamicoTipoAfiliacion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoAfiliacion.dispose();
			this.jInternalFrameReporteDinamicoTipoAfiliacion=null;
		}
		
		if(this.jInternalFrameImportacionTipoAfiliacion!=null) {
			this.jInternalFrameImportacionTipoAfiliacion.setVisible(false);	    			
			this.jInternalFrameImportacionTipoAfiliacion.dispose();
			this.jInternalFrameImportacionTipoAfiliacion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoAfiliacion();
			
			TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoAfiliacion")) {
				jButtonNuevoTipoAfiliacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoAfiliacion")) {
				jButtonDuplicarTipoAfiliacionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoAfiliacion")) {
				jButtonCopiarTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoAfiliacion")) {
				jButtonVerFormTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoAfiliacion")) {
				jButtonNuevoTipoAfiliacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoAfiliacion")) {
				jButtonDuplicarTipoAfiliacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoAfiliacion")) {
				jButtonNuevoTipoAfiliacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoAfiliacion")) {
				jButtonDuplicarTipoAfiliacionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoAfiliacion")) {
				jButtonNuevoTipoAfiliacionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoAfiliacion")) {
				jButtonNuevoTipoAfiliacionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoAfiliacion")) {
				jButtonNuevoTipoAfiliacionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoAfiliacion")) {
				jButtonModificarTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoAfiliacion")) {
				jButtonModificarTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoAfiliacion")) {
				jButtonModificarTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoAfiliacion")) {
				jButtonActualizarTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoAfiliacion")) {
				jButtonActualizarTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoAfiliacion")) {
				jButtonActualizarTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoAfiliacion")) {
				jButtonEliminarTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoAfiliacion")) {
				jButtonEliminarTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoAfiliacion")) {
				jButtonEliminarTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoAfiliacion")) {
				jButtonCancelarTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoAfiliacion")) {
				jButtonCancelarTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoAfiliacion")) {
				jButtonCancelarTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoAfiliacion")) {
				jButtonCerrarTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoAfiliacion")) {
				jButtonCerrarTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoAfiliacion")) {
				jButtonCerrarTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoAfiliacion")) {
				jButtonMostrarOcultarTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoAfiliacion")) {
				jButtonCancelarTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoAfiliacion")) {
				jButtonGuardarCambiosTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoAfiliacion")) {
				jButtonGuardarCambiosTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoAfiliacion")) {
				jButtonCopiarTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoAfiliacion")) {
				jButtonVerFormTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoAfiliacion")) {
				jButtonGuardarCambiosTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoAfiliacion")) {
				jButtonCopiarTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoAfiliacion")) {
				jButtonVerFormTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoAfiliacion")) {
				jButtonGuardarCambiosTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoAfiliacion")) {
				jButtonGuardarCambiosTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoAfiliacion")) {
				jButtonGuardarCambiosTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoAfiliacion")) {
				jButtonRecargarInformacionTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoAfiliacion")) {
				jButtonRecargarInformacionTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoAfiliacion")) {
				jButtonRecargarInformacionTipoAfiliacionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoAfiliacion")) {
				jButtonAnterioresTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoAfiliacion")) {
				jButtonAnterioresTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoAfiliacion")) {
				jButtonAnterioresTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoAfiliacion")) {
				jButtonSiguientesTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoAfiliacion")) {
				jButtonSiguientesTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoAfiliacion")) {
				jButtonSiguientesTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoAfiliacion") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoAfiliacion")) {
				jButtonAbrirOrderByTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoAfiliacion") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoAfiliacion")) {
				jButtonMostrarOcultarTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoAfiliacion")) {
				jButtonNuevoGuardarCambiosTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoAfiliacion")) {
				jButtonNuevoGuardarCambiosTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoAfiliacion")) {
				jButtonNuevoGuardarCambiosTipoAfiliacionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoAfiliacion")) {
				jButtonCerrarReporteDinamicoTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoAfiliacion")) {
				jButtonGenerarReporteDinamicoTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoAfiliacion")) {
				
				jButtonGenerarExcelReporteDinamicoTipoAfiliacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoAfiliacion")) {
				jButtonCerrarImportacionTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoAfiliacion")) {
				
				jButtonGenerarImportacionTipoAfiliacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoAfiliacion")) {
				
				jButtonAbrirImportacionTipoAfiliacionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoAfiliacion")) {
				jComboBoxTiposAccionesTipoAfiliacionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoAfiliacion")) {
				jComboBoxTiposRelacionesTipoAfiliacionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoAfiliacion")) {
				jComboBoxTiposAccionesTipoAfiliacionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoAfiliacion")) {
				
				jComboBoxTiposSeleccionarTipoAfiliacionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoAfiliacion")) {
				jTextFieldValorCampoGeneralTipoAfiliacionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoAfiliacion")) {
				jButtonAbrirOrderByTipoAfiliacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoAfiliacion")) {
				jButtonAbrirOrderByTipoAfiliacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoAfiliacion")) {
				jButtonCerrarOrderByTipoAfiliacionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoAfiliacionBusqueda")) {
				this.jButtonidTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoAfiliacionUpdate")) {
				this.jButtonid_empresaTipoAfiliacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoAfiliacionBusqueda")) {
				this.jButtonid_empresaTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cate_tipo_afiliacionTipoAfiliacionUpdate")) {
				this.jButtonid_cate_tipo_afiliacionTipoAfiliacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cate_tipo_afiliacionTipoAfiliacionBusqueda")) {
				this.jButtonid_cate_tipo_afiliacionTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoAfiliacionBusqueda")) {
				this.jButtoncodigoTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoAfiliacionBusqueda")) {
				this.jButtonnombreTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcen_empleaTipoAfiliacionBusqueda")) {
				this.jButtonporcen_empleaTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcen_patroTipoAfiliacionBusqueda")) {
				this.jButtonporcen_patroTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcen_gene_empleaTipoAfiliacionBusqueda")) {
				this.jButtonporcen_gene_empleaTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcen_gene_patroTipoAfiliacionBusqueda")) {
				this.jButtonporcen_gene_patroTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcen_secuTipoAfiliacionBusqueda")) {
				this.jButtonporcen_secuTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcen_ieceTipoAfiliacionBusqueda")) {
				this.jButtonporcen_ieceTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoAfiliacionBusqueda")) {
				this.jButtondescripcionTipoAfiliacionBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdCateTipoAfiliacionTipoAfiliacion")) {
				this.jButtonFK_IdCateTipoAfiliacionTipoAfiliacionActionPerformed(evt);
			}
			
			;
			
			
			TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoAfiliacion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAfiliacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoafiliacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoafiliacion);
				
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
				
				


				
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAfiliacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAfiliacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoAfiliacion tipoafiliacionLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoafiliacionLocal=this.tipoafiliacion;
			} else {
				tipoafiliacionLocal=this.tipoafiliacionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoafiliacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoafiliacion);
				
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
							
				
				


				
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAfiliacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAfiliacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAfiliacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionAnterior =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoafiliacionAnterior =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
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
			
			TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
			
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
			
			


			
			TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAfiliacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoafiliacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoafiliacion);
				
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
								
						
				


				
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAfiliacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAfiliacion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoafiliacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoafiliacion);
				
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
								
				
				


				
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAfiliacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAfiliacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAfiliacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionAnterior =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoafiliacionAnterior =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoafiliacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoafiliacion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAfiliacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionAnterior =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoafiliacionAnterior =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAfiliacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoafiliacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoafiliacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoafiliacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoafiliacion);
				
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
							
				
				


				
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAfiliacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAfiliacion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAfiliacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoafiliacionAnterior =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoafiliacionAnterior =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
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
			
			TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
			
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
			
			


			
			TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAfiliacionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoafiliacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoafiliacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoafiliacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoafiliacion);
				
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
								
				
				


				
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAfiliacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAfiliacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAfiliacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionAnterior =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoafiliacionAnterior =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAfiliacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoafiliacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoafiliacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAfiliacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoafiliacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoafiliacion);
				
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoAfiliacion")) {
					jCheckBoxSeleccionarTodosTipoAfiliacionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoAfiliacion")) {
					jCheckBoxSeleccionadosTipoAfiliacionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoAfiliacion")) {
					
				}
				
				


				
				
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAfiliacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAfiliacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoafiliacion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoafiliacion);
				
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
												
				
				


				
				
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAfiliacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAfiliacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAfiliacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoafiliacionAnterior =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoafiliacionAnterior =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAfiliacionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoafiliacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoafiliacion);
				
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
				
				
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
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
			
			TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
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
			
			


			
			TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAfiliacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoafiliacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoafiliacion);
				
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAfiliacion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAfiliacion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoafiliacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoafiliacion);
				
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
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
				
				


				
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAfiliacion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAfiliacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAfiliacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoafiliacionAnterior =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoafiliacionAnterior =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoAfiliacion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoAfiliacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoAfiliacion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoafiliacion =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoafiliacion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoAfiliacion")) {
				
				}
				
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoAfiliacion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoAfiliacion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoAfiliacion")) {
			
			}
			
			TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoAfiliacion();
			
			TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
			
			if(sTipo.equals("NuevoTipoAfiliacion")) {
				jButtonNuevoTipoAfiliacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoAfiliacion")) {
				jButtonDuplicarTipoAfiliacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoAfiliacion")) {
				jButtonCopiarTipoAfiliacionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoAfiliacion")) {
				jButtonVerFormTipoAfiliacionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoAfiliacion")) {
				jButtonNuevoTipoAfiliacionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoAfiliacion")) {
				jButtonModificarTipoAfiliacionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoAfiliacion")) {
				jButtonActualizarTipoAfiliacionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoAfiliacion")) {
				jButtonEliminarTipoAfiliacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoAfiliacion")) {
				jButtonGuardarCambiosTipoAfiliacionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoAfiliacion")) {
				jButtonCancelarTipoAfiliacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoAfiliacion")) {
				jButtonCerrarTipoAfiliacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoAfiliacion")) {
				jButtonGuardarCambiosTipoAfiliacionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoAfiliacion")) {
				jButtonNuevoGuardarCambiosTipoAfiliacionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoAfiliacion")) {
				jButtonAbrirOrderByTipoAfiliacionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoAfiliacion")) {
				jButtonRecargarInformacionTipoAfiliacionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoAfiliacion")) {
				jButtonAnterioresTipoAfiliacionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoAfiliacion")) {
				jButtonSiguientesTipoAfiliacionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoAfiliacionBusqueda")) {
				this.jButtonidTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoAfiliacionUpdate")) {
				this.jButtonid_empresaTipoAfiliacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoAfiliacionBusqueda")) {
				this.jButtonid_empresaTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cate_tipo_afiliacionTipoAfiliacionUpdate")) {
				this.jButtonid_cate_tipo_afiliacionTipoAfiliacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cate_tipo_afiliacionTipoAfiliacionBusqueda")) {
				this.jButtonid_cate_tipo_afiliacionTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoAfiliacionBusqueda")) {
				this.jButtoncodigoTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoAfiliacionBusqueda")) {
				this.jButtonnombreTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcen_empleaTipoAfiliacionBusqueda")) {
				this.jButtonporcen_empleaTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcen_patroTipoAfiliacionBusqueda")) {
				this.jButtonporcen_patroTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcen_gene_empleaTipoAfiliacionBusqueda")) {
				this.jButtonporcen_gene_empleaTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcen_gene_patroTipoAfiliacionBusqueda")) {
				this.jButtonporcen_gene_patroTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcen_secuTipoAfiliacionBusqueda")) {
				this.jButtonporcen_secuTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcen_ieceTipoAfiliacionBusqueda")) {
				this.jButtonporcen_ieceTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoAfiliacionBusqueda")) {
				this.jButtondescripcionTipoAfiliacionBusquedaActionPerformed(evt);
			}
			
			TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoAfiliacion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoAfiliacion")) {
				closingInternalFrameTipoAfiliacion();
				
			} else if(sTipo.equals("jButtonCancelarTipoAfiliacion")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoAfiliacion = (JInternalFrameBase)evt.getSource();
	            	
	            TipoAfiliacionBeanSwingJInternalFrame jInternalFrameParent=(TipoAfiliacionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoAfiliacion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoAfiliacionActionPerformed(null);
			}
			
			TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoafiliacion,new Object(),this.tipoafiliacionParameterGeneral,this.tipoafiliacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoAfiliacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoAfiliacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoAfiliacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoafiliacion)) {
			if(!esControlTabla) {
				if(TipoAfiliacionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.tipoafiliacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);			
				}
				
				if(this.tipoafiliacionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoAfiliacion(this.tipoafiliacion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoafiliacionReturnGeneral=tipoafiliacionLogic.procesarEventosTipoAfiliacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoafiliacionLogic.getTipoAfiliacions(),this.tipoafiliacion,this.tipoafiliacionParameterGeneral,this.isEsNuevoTipoAfiliacion,classes);//this.tipoafiliacionLogic.getTipoAfiliacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoAfiliacion(this.tipoafiliacionReturnGeneral,this.tipoafiliacionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoafiliacionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoAfiliacion(classes,this.tipoafiliacionReturnGeneral,this.tipoafiliacionBean,false);
					}
						
					if(this.tipoafiliacionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoAfiliacion(this.tipoafiliacionReturnGeneral.getTipoAfiliacion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoAfiliacion(this.tipoafiliacionReturnGeneral.getTipoAfiliacion());	
					}
						
					if(this.tipoafiliacionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoAfiliacion(this.tipoafiliacionReturnGeneral.getTipoAfiliacion(),classes);//this.tipoafiliacionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoAfiliacion(this.tipoafiliacion,classes);//this.tipoafiliacionBean);									
				}
			
				if(TipoAfiliacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoAfiliacion(this.tipoafiliacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAfiliacion(this.tipoafiliacion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoafiliacionAnterior!=null) {
						this.tipoafiliacion=this.tipoafiliacionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoafiliacionReturnGeneral=tipoafiliacionLogic.procesarEventosTipoAfiliacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoafiliacionLogic.getTipoAfiliacions(),this.tipoafiliacion,this.tipoafiliacionParameterGeneral,this.isEsNuevoTipoAfiliacion,classes);//this.tipoafiliacionLogic.getTipoAfiliacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoafiliacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoafiliacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoafiliacionReturnGeneral.getTipoAfiliacion(),tipoafiliacionLogic.getTipoAfiliacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoafiliacionReturnGeneral.getTipoAfiliacion(),this.tipoafiliacions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoAfiliacion.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoAfiliacion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoAfiliacion();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoAfiliacion() throws Exception {
		
		TipoAfiliacionModel tipoafiliacionModel=(TipoAfiliacionModel)this.jTableDatosTipoAfiliacion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoafiliacionModel.tipoafiliacions=this.tipoafiliacionLogic.getTipoAfiliacions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoafiliacionModel.tipoafiliacions=this.tipoafiliacions;
		}
		
		
		((TipoAfiliacionModel) this.jTableDatosTipoAfiliacion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoAfiliacion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoafiliacionAnterior(),this.tipoafiliacionLogic.getTipoAfiliacions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoafiliacionAnterior(),this.tipoafiliacions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoAfiliacion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoAfiliacion(TipoAfiliacion tipoafiliacion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DatoGeneralEmpleado.class)) {
					this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(tipoafiliacion.getDatoGeneralEmpleados());
					this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoGeneralEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
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
										
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoafiliacion,new Object(),generalEntityParameterGeneral,this.tipoafiliacionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoafiliacionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoAfiliacionConstantesFunciones.getClassesRelationshipsOfTipoAfiliacion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoAfiliacionConstantesFunciones.getClassesRelationshipsFromStringsOfTipoAfiliacion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoAfiliacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoafiliacion,new Object(),generalEntityParameterGeneral,this.tipoafiliacionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoAfiliacion(TipoAfiliacionBean tipoafiliacionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DatoGeneralEmpleado.class)) {
					this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(tipoafiliacion.getDatoGeneralEmpleados());
					this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoGeneralEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoAfiliacion(ArrayList<Classe> classes,TipoAfiliacionReturnGeneral tipoafiliacionReturnGeneral,TipoAfiliacionBean tipoafiliacionBean,Boolean conDefault) throws Exception {
		
			this.tipoafiliacionBean.setDatoGeneralEmpleados(tipoafiliacionReturnGeneral.getTipoAfiliacion().getDatoGeneralEmpleados());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoAfiliacion(TipoAfiliacion tipoafiliacion,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DatoGeneralEmpleado.class)) {
					tipoafiliacion.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoafiliacion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoAfiliacion = new TipoAfiliacionDetalleFormJInternalFrame(jDesktopPane,this.tipoafiliacionSessionBean.getConGuardarRelaciones(),this.tipoafiliacionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.setVisible(false);
		this.jInternalFrameDetalleFormTipoAfiliacion.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoAfiliacion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoAfiliacion.tipoafiliacionLogic=this.tipoafiliacionLogic;
		
		this.cargarCombosFrameForeignKeyTipoAfiliacion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoAfiliacion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoAfiliacion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoAfiliacion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoAfiliacion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoAfiliacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoAfiliacion"));
		
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonModificarTipoAfiliacion.addActionListener(new ButtonActionListener(this,"ModificarTipoAfiliacion"));

		
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonModificarToolBarTipoAfiliacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoAfiliacion"));
					
		this.jInternalFrameDetalleFormTipoAfiliacion.jMenuItemModificarTipoAfiliacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoAfiliacion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonActualizarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"ActualizarTipoAfiliacion"));
		
		
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonActualizarToolBarTipoAfiliacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoAfiliacion"));
						
		this.jInternalFrameDetalleFormTipoAfiliacion.jMenuItemActualizarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoAfiliacion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonEliminarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"EliminarTipoAfiliacion"));
		
		
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonEliminarToolBarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoAfiliacion"));
								
		this.jInternalFrameDetalleFormTipoAfiliacion.jMenuItemEliminarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoAfiliacion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonCancelarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"CancelarTipoAfiliacion"));
		
		
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonCancelarToolBarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoAfiliacion"));
					
		this.jInternalFrameDetalleFormTipoAfiliacion.jMenuItemCancelarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoAfiliacion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoAfiliacion.jMenuItemDetalleCerrarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoAfiliacion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonGuardarCambiosToolBarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoAfiliacion"));
		
		
		
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonGuardarCambiosToolBarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoAfiliacion"));
		
		
		
		this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxTiposAccionesFormularioTipoAfiliacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoAfiliacion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonidTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoAfiliacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonid_empresaTipoAfiliacionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoAfiliacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonid_empresaTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoAfiliacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonid_cate_tipo_afiliacionTipoAfiliacionUpdate.addActionListener(new ButtonActionListener(this,"id_cate_tipo_afiliacionTipoAfiliacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonid_cate_tipo_afiliacionTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"id_cate_tipo_afiliacionTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtoncodigoTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonnombreTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonporcen_empleaTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"porcen_empleaTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonporcen_patroTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"porcen_patroTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonporcen_gene_empleaTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"porcen_gene_empleaTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonporcen_gene_patroTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"porcen_gene_patroTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonporcen_secuTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"porcen_secuTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonporcen_ieceTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"porcen_ieceTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtondescripcionTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoAfiliacionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoAfiliacion.jTabbedPaneRelacionesTipoAfiliacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoAfiliacion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoAfiliacion"));
		
		if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAfiliacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoAfiliacion"));
		}
		
		this.jTableDatosTipoAfiliacion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoAfiliacion"));
		
		this.jTableDatosTipoAfiliacion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoAfiliacion"));
		
		this.jButtonNuevoTipoAfiliacion.addActionListener(new ButtonActionListener(this,"NuevoTipoAfiliacion"));
		
		this.jButtonDuplicarTipoAfiliacion.addActionListener(new ButtonActionListener(this,"DuplicarTipoAfiliacion"));
		
		this.jButtonCopiarTipoAfiliacion.addActionListener(new ButtonActionListener(this,"CopiarTipoAfiliacion"));
		
		this.jButtonVerFormTipoAfiliacion.addActionListener(new ButtonActionListener(this,"VerFormTipoAfiliacion"));
		
		
		this.jButtonNuevoToolBarTipoAfiliacion.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoAfiliacion"));
			
		this.jButtonDuplicarToolBarTipoAfiliacion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoAfiliacion"));
			
		this.jMenuItemNuevoTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoAfiliacion"));
			
		this.jMenuItemDuplicarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoAfiliacion"));		
		
		
		this.jButtonNuevoRelacionesTipoAfiliacion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoAfiliacion"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoAfiliacion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoAfiliacion"));
			
		this.jMenuItemNuevoRelacionesTipoAfiliacion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoAfiliacion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAfiliacion.jButtonModificarTipoAfiliacion.addActionListener(new ButtonActionListener(this,"ModificarTipoAfiliacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAfiliacion.jButtonModificarToolBarTipoAfiliacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoAfiliacion"));
			
			this.jInternalFrameDetalleFormTipoAfiliacion.jMenuItemModificarTipoAfiliacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoAfiliacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoAfiliacion.jButtonActualizarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"ActualizarTipoAfiliacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAfiliacion.jButtonActualizarToolBarTipoAfiliacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoAfiliacion"));
				
			this.jInternalFrameDetalleFormTipoAfiliacion.jMenuItemActualizarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoAfiliacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAfiliacion.jButtonEliminarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"EliminarTipoAfiliacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAfiliacion.jButtonEliminarToolBarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoAfiliacion"));
						
			this.jInternalFrameDetalleFormTipoAfiliacion.jMenuItemEliminarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoAfiliacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAfiliacion.jButtonCancelarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"CancelarTipoAfiliacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAfiliacion.jButtonCancelarToolBarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoAfiliacion"));
			
			this.jInternalFrameDetalleFormTipoAfiliacion.jMenuItemCancelarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoAfiliacion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoAfiliacion"));		
		
		
		this.jButtonCerrarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"CerrarTipoAfiliacion"));
		
		
		this.jButtonCerrarToolBarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoAfiliacion"));
			
		this.jMenuItemCerrarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoAfiliacion"));
			
		if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAfiliacion.jMenuItemDetalleCerrarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoAfiliacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAfiliacion.jButtonGuardarCambiosTipoAfiliacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoAfiliacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAfiliacion.jButtonGuardarCambiosToolBarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoAfiliacion"));
		}
		
		this.jButtonCopiarToolBarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoAfiliacion"));
			
		this.jButtonVerFormToolBarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoAfiliacion"));
		
		this.jMenuItemGuardarCambiosTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoAfiliacion"));
			
		this.jMenuItemCopiarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoAfiliacion"));		
		
		this.jMenuItemVerFormTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoAfiliacion"));		
		
		
		this.jButtonGuardarCambiosTablaTipoAfiliacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoAfiliacion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoAfiliacion"));
			
		this.jMenuItemGuardarCambiosTablaTipoAfiliacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoAfiliacion"));		
		
		
		
		this.jButtonRecargarInformacionTipoAfiliacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoAfiliacion"));
					
		this.jButtonRecargarInformacionToolBarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoAfiliacion"));
		
		this.jMenuItemRecargarInformacionTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoAfiliacion"));		
		
		
		
		this.jButtonAnterioresTipoAfiliacion.addActionListener (new ButtonActionListener(this,"AnterioresTipoAfiliacion"));
		
		
		this.jButtonAnterioresToolBarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoAfiliacion"));
		
		this.jMenuItemAnterioresTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoAfiliacion"));		
		
		
		this.jButtonSiguientesTipoAfiliacion.addActionListener (new ButtonActionListener(this,"SiguientesTipoAfiliacion"));
		
		
		this.jButtonSiguientesToolBarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoAfiliacion"));
			
		this.jMenuItemSiguientesTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoAfiliacion"));
			
		this.jMenuItemAbrirOrderByTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoAfiliacion"));
			
		this.jMenuItemMostrarOcultarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoAfiliacion"));
			
		this.jMenuItemDetalleAbrirOrderByTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoAfiliacion"));
			
		this.jMenuItemDetalleMostarOcultarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoAfiliacion"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoAfiliacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoAfiliacion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoAfiliacion"));
			
		this.jMenuItemNuevoGuardarCambiosTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoAfiliacion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoAfiliacion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoAfiliacion"));

		this.jCheckBoxSeleccionadosTipoAfiliacion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoAfiliacion"));
		
		if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxTiposAccionesFormularioTipoAfiliacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoAfiliacion"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoAfiliacion.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoAfiliacion"));
			
		this.jComboBoxTiposAccionesTipoAfiliacion.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoAfiliacion"));
					
		this.jComboBoxTiposSeleccionarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoAfiliacion"));
			
		this.jTextFieldValorCampoGeneralTipoAfiliacion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoAfiliacion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonidTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoAfiliacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonid_empresaTipoAfiliacionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoAfiliacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonid_empresaTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoAfiliacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonid_cate_tipo_afiliacionTipoAfiliacionUpdate.addActionListener(new ButtonActionListener(this,"id_cate_tipo_afiliacionTipoAfiliacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonid_cate_tipo_afiliacionTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"id_cate_tipo_afiliacionTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtoncodigoTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonnombreTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonporcen_empleaTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"porcen_empleaTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonporcen_patroTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"porcen_patroTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonporcen_gene_empleaTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"porcen_gene_empleaTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonporcen_gene_patroTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"porcen_gene_patroTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonporcen_secuTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"porcen_secuTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonporcen_ieceTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"porcen_ieceTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtondescripcionTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoAfiliacionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCateTipoAfiliacionTipoAfiliacion.addActionListener(new ButtonActionListener(this,"FK_IdCateTipoAfiliacionTipoAfiliacion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoAfiliacion!=null) {
				this.jInternalFrameReporteDinamicoTipoAfiliacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoAfiliacion"));
				this.jInternalFrameReporteDinamicoTipoAfiliacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoAfiliacion"));
				this.jInternalFrameReporteDinamicoTipoAfiliacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoAfiliacion"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoAfiliacion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoAfiliacion"));				
			//this.jButtonGenerarReporteDinamicoTipoAfiliacion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoAfiliacion"));
			//this.jButtonGenerarExcelReporteDinamicoTipoAfiliacion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoAfiliacion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoAfiliacion!=null) {
				this.jInternalFrameImportacionTipoAfiliacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoAfiliacion"));
				this.jInternalFrameImportacionTipoAfiliacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoAfiliacion"));
				this.jInternalFrameImportacionTipoAfiliacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoAfiliacion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoAfiliacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoAfiliacion"));
			
			this.jButtonAbrirOrderByToolBarTipoAfiliacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoAfiliacion"));			
			
			if(this.jInternalFrameOrderByTipoAfiliacion!=null) {
				this.jInternalFrameOrderByTipoAfiliacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoAfiliacion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAfiliacion.jTabbedPaneRelacionesTipoAfiliacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoAfiliacion"));
		
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
            		closingInternalFrameTipoAfiliacion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoAfiliacion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoAfiliacion = (JInternalFrameBase)event.getSource();
	            	
	            TipoAfiliacionBeanSwingJInternalFrame jInternalFrameParent=(TipoAfiliacionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoAfiliacion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoAfiliacionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoAfiliacion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoAfiliacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoAfiliacion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoAfiliacion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAfiliacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAfiliacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAfiliacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoAfiliacion";
		inputMap = this.jButtonNuevoTipoAfiliacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoAfiliacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoAfiliacionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAfiliacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAfiliacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAfiliacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoAfiliacion";
		inputMap = this.jButtonNuevoRelacionesTipoAfiliacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoAfiliacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoAfiliacionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoAfiliacion";
		inputMap = this.jButtonModificarTipoAfiliacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoAfiliacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoAfiliacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoAfiliacion";
		inputMap = this.jButtonActualizarTipoAfiliacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoAfiliacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoAfiliacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoAfiliacion";
		inputMap = this.jButtonEliminarTipoAfiliacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoAfiliacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoAfiliacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoAfiliacion";
		inputMap = this.jButtonCancelarTipoAfiliacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoAfiliacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoAfiliacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoAfiliacion";
		inputMap = this.jButtonCerrarTipoAfiliacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoAfiliacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoAfiliacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonGuardarCambiosTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoAfiliacion";
		inputMap = this.jInternalFrameDetalleFormTipoAfiliacion.jButtonGuardarCambiosTipoAfiliacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonGuardarCambiosTipoAfiliacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoAfiliacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoAfiliacion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoAfiliacionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoAfiliacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoAfiliacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoAfiliacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoAfiliacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoAfiliacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoAfiliacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonidTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoAfiliacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonid_empresaTipoAfiliacionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoAfiliacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonid_empresaTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoAfiliacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonid_cate_tipo_afiliacionTipoAfiliacionUpdate.addActionListener(new ButtonActionListener(this,"id_cate_tipo_afiliacionTipoAfiliacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonid_cate_tipo_afiliacionTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"id_cate_tipo_afiliacionTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtoncodigoTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonnombreTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonporcen_empleaTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"porcen_empleaTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonporcen_patroTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"porcen_patroTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonporcen_gene_empleaTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"porcen_gene_empleaTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonporcen_gene_patroTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"porcen_gene_patroTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonporcen_secuTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"porcen_secuTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtonporcen_ieceTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"porcen_ieceTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAfiliacion.jButtondescripcionTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoAfiliacionBusqueda"));
		
		
		this.jButtonFK_IdCateTipoAfiliacionTipoAfiliacion.addActionListener(new ButtonActionListener(this,"FK_IdCateTipoAfiliacionTipoAfiliacion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoAfiliacionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoAfiliacion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoAfiliacion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoAfiliacion tipoafiliacionAux:this.tipoafiliacionLogic.getTipoAfiliacions()) {
					tipoafiliacionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoAfiliacion tipoafiliacionAux:tipoafiliacions) {
					tipoafiliacionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoAfiliacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoAfiliacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoAfiliacion tipoafiliacionAux:this.tipoafiliacionLogic.getTipoAfiliacions()) {
						tipoafiliacionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoAfiliacion tipoafiliacionAux:tipoafiliacions) {
						tipoafiliacionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoAfiliacion tipoafiliacionAux:this.tipoafiliacionLogic.getTipoAfiliacions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoAfiliacion tipoafiliacionAux:tipoafiliacions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoAfiliacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoAfiliacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoAfiliacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoAfiliacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoAfiliacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoAfiliacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoAfiliacion.getSelectedRows();
			
			TipoAfiliacion tipoafiliacionLocal=new TipoAfiliacion();
			
			//this.seleccionarTodosTipoAfiliacion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoafiliacionLocal =(TipoAfiliacion) this.tipoafiliacionLogic.getTipoAfiliacions().toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoafiliacionLocal =(TipoAfiliacion) this.tipoafiliacions.toArray()[this.jTableDatosTipoAfiliacion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoafiliacionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoAfiliacion tipoafiliacionAux:this.tipoafiliacionLogic.getTipoAfiliacions()) {
						tipoafiliacionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoAfiliacion tipoafiliacionAux:tipoafiliacions) {
						tipoafiliacionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoAfiliacion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoAfiliacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoAfiliacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoAfiliacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoAfiliacionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoAfiliacionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoAfiliacionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoAfiliacion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoAfiliacion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoAfiliacion tipoafiliacionAux:this.tipoafiliacionLogic.getTipoAfiliacions()) {
				
						if(sTipoSeleccionar.equals(TipoAfiliacionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoafiliacionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoAfiliacionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoafiliacionAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoAfiliacionConstantesFunciones.LABEL_PORCENEMPLEA)) {
							existe=true;
							tipoafiliacionAux.setporcen_emplea(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TipoAfiliacionConstantesFunciones.LABEL_PORCENPATRO)) {
							existe=true;
							tipoafiliacionAux.setporcen_patro(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEEMPLEA)) {
							existe=true;
							tipoafiliacionAux.setporcen_gene_emplea(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEPATRO)) {
							existe=true;
							tipoafiliacionAux.setporcen_gene_patro(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TipoAfiliacionConstantesFunciones.LABEL_PORCENSECU)) {
							existe=true;
							tipoafiliacionAux.setporcen_secu(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TipoAfiliacionConstantesFunciones.LABEL_PORCENIECE)) {
							existe=true;
							tipoafiliacionAux.setporcen_iece(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TipoAfiliacionConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipoafiliacionAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoAfiliacion tipoafiliacionAux:tipoafiliacions) {
					
						if(sTipoSeleccionar.equals(TipoAfiliacionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoafiliacionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoAfiliacionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoafiliacionAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoAfiliacionConstantesFunciones.LABEL_PORCENEMPLEA)) {
							existe=true;
							tipoafiliacionAux.setporcen_emplea(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TipoAfiliacionConstantesFunciones.LABEL_PORCENPATRO)) {
							existe=true;
							tipoafiliacionAux.setporcen_patro(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEEMPLEA)) {
							existe=true;
							tipoafiliacionAux.setporcen_gene_emplea(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEPATRO)) {
							existe=true;
							tipoafiliacionAux.setporcen_gene_patro(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TipoAfiliacionConstantesFunciones.LABEL_PORCENSECU)) {
							existe=true;
							tipoafiliacionAux.setporcen_secu(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TipoAfiliacionConstantesFunciones.LABEL_PORCENIECE)) {
							existe=true;
							tipoafiliacionAux.setporcen_iece(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TipoAfiliacionConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipoafiliacionAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoAfiliacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoAfiliacionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoAfiliacion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoAfiliacion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoAfiliacion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxTiposAccionesFormularioTipoAfiliacion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoAfiliacion) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoAfiliacion(conSplash);
				
					this.generarReporteTipoAfiliacionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoAfiliacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxTiposAccionesFormularioTipoAfiliacion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoAfiliacionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoAfiliacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoAfiliacionsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoAfiliacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoAfiliacionsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoAfiliacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoAfiliacion();
				
				this.exportarTipoAfiliacionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoAfiliacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxTiposAccionesFormularioTipoAfiliacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoAfiliacions();
				//this.importarTipoAfiliacions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoAfiliacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxTiposAccionesFormularioTipoAfiliacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoAfiliacion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoAfiliacionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoAfiliacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Afiliacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoAfiliacion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoAfiliacion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoAfiliacion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Afiliacion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoAfiliacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxTiposAccionesFormularioTipoAfiliacion.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoAfiliacionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoAfiliacion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoAfiliacion(conSplash);
					
						//this.actualizarParametrosGeneralTipoAfiliacion();
						
						this.generarReporteProcesoAccionTipoAfiliacionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoAfiliacion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxTiposAccionesFormularioTipoAfiliacion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoAfiliacionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo AfiliacionES SELECCIONADOS?", "MANTENIMIENTO DE Tipo Afiliacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoAfiliacion();
				
						this.actualizarParametrosGeneralTipoAfiliacion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoafiliacionReturnGeneral=tipoafiliacionLogic.procesarAccionTipoAfiliacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoafiliacionLogic.getTipoAfiliacions(),this.tipoafiliacionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoAfiliacionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoAfiliacion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxTiposAccionesFormularioTipoAfiliacion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoAfiliacion();
					
					TipoAfiliacionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoAfiliacionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoAfiliacion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxTiposAccionesFormularioTipoAfiliacion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoAfiliacion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoAfiliacionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoAfiliacion();
			
			if(this.jInternalFrameDetalleFormTipoAfiliacion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoAfiliacion> tipoafiliacionsSeleccionados=new ArrayList<TipoAfiliacion>();		
			TipoAfiliacion tipoafiliacion=new TipoAfiliacion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoAfiliacion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoAfiliacion.getSelectedItem();
			
			
			
			
			tipoafiliacionsSeleccionados=this.getTipoAfiliacionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoafiliacionsSeleccionados.size()==1) {
				for(TipoAfiliacion tipoafiliacionAux:tipoafiliacionsSeleccionados) {
					tipoafiliacion=tipoafiliacionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Dato General Empleado")) {
					jButtonDatoGeneralEmpleadoActionPerformed(null,rowIndex,true,false,tipoafiliacion);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoAfiliacion();
			
      		//this.finishProcessTipoAfiliacion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoAfiliacionReturnGeneral() throws Exception {
		if(this.tipoafiliacionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoafiliacionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoafiliacionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoafiliacionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoafiliacionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoafiliacionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoAfiliacion(false);
		}
		
		if(this.tipoafiliacionReturnGeneral.getConRetornoLista() || this.tipoafiliacionReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoafiliacionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoafiliacionLogic.setTipoAfiliacions(this.tipoafiliacionReturnGeneral.getTipoAfiliacions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoafiliacionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoafiliacionLogic.setTipoAfiliacion(this.tipoafiliacionReturnGeneral.getTipoAfiliacion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoAfiliacion(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoAfiliacion() throws Exception {
		
		
	}
	
	public ArrayList<TipoAfiliacion> getTipoAfiliacionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoAfiliacion> tipoafiliacionsSeleccionados=new ArrayList<TipoAfiliacion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoAfiliacion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoAfiliacion tipoafiliacionAux:tipoafiliacionLogic.getTipoAfiliacions()) {
					if(tipoafiliacionAux.getIsSelected()) {
						tipoafiliacionsSeleccionados.add(tipoafiliacionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoAfiliacion tipoafiliacionAux:this.tipoafiliacions) {
					if(tipoafiliacionAux.getIsSelected()) {
						tipoafiliacionsSeleccionados.add(tipoafiliacionAux);				
					}
				}
			}
			
			if(tipoafiliacionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoafiliacionsSeleccionados.addAll(this.tipoafiliacionLogic.getTipoAfiliacions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoafiliacionsSeleccionados.addAll(this.tipoafiliacions);				
					}
				}
			}
		} else {
			tipoafiliacionsSeleccionados.add(this.tipoafiliacion);
		}
		
		return tipoafiliacionsSeleccionados;
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
	
	public void generarReporteTipoAfiliacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoAfiliacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoAfiliacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoAfiliacionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoAfiliacionsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoAfiliacionsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Afiliacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoAfiliacionsSeleccionados() throws Exception {
		ArrayList<TipoAfiliacion> tipoafiliacionsSeleccionados=new ArrayList<TipoAfiliacion>();		
		
		tipoafiliacionsSeleccionados=this.getTipoAfiliacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoAfiliacions("Todos",tipoafiliacionsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoAfiliacionsSeleccionados() throws Exception {
		ArrayList<TipoAfiliacion> tipoafiliacionsSeleccionados=new ArrayList<TipoAfiliacion>();		
		
		tipoafiliacionsSeleccionados=this.getTipoAfiliacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoAfiliacions("Todos",tipoafiliacionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoAfiliacionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoAfiliacion> tipoafiliacionsSeleccionados=new ArrayList<TipoAfiliacion>();
		
		tipoafiliacionsSeleccionados=this.getTipoAfiliacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoAfiliacions("Todos",tipoafiliacionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoAfiliacionsSeleccionados() throws Exception {
		ArrayList<TipoAfiliacion> tipoafiliacionsSeleccionados=new ArrayList<TipoAfiliacion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoAfiliacion();
		
		
		tipoafiliacionsSeleccionados=this.getTipoAfiliacionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoAfiliacion();
		
		
		//this.generarReporteTipoAfiliacions("Todos",tipoafiliacionsSeleccionados ,tipoafiliacionImplementable,tipoafiliacionImplementableHome);
	}
	
	public void mostrarImportacionTipoAfiliacions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoAfiliacion();
		
		this.abrirFrameImportacionTipoAfiliacion();		
		
			
		//this.generarReporteTipoAfiliacions("Todos",tipoafiliacionsSeleccionados ,tipoafiliacionImplementable,tipoafiliacionImplementableHome);
	}
	
	public void importarTipoAfiliacions() throws Exception {		
	
	}
	
	public void exportarTipoAfiliacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoAfiliacionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoAfiliacionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoAfiliacionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Afiliacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoAfiliacionsSeleccionados() throws Exception {
		ArrayList<TipoAfiliacion> tipoafiliacionsSeleccionados=new ArrayList<TipoAfiliacion>();		
		
		tipoafiliacionsSeleccionados=this.getTipoAfiliacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoafiliacion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoAfiliacion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoAfiliacion tipoafiliacionAux:tipoafiliacionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoAfiliacion(tipoafiliacionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoafiliacionAux.setsDetalleGeneralEntityReporte(tipoafiliacionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Afiliacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoAfiliacion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoAfiliacionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAfiliacionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAfiliacionConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAfiliacionConstantesFunciones.LABEL_IDCATETIPOAFILIACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAfiliacionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAfiliacionConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAfiliacionConstantesFunciones.LABEL_PORCENEMPLEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAfiliacionConstantesFunciones.LABEL_PORCENPATRO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEEMPLEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEPATRO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAfiliacionConstantesFunciones.LABEL_PORCENSECU;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAfiliacionConstantesFunciones.LABEL_PORCENIECE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAfiliacionConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoAfiliacion(TipoAfiliacion tipoafiliacion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoafiliacion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoafiliacion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoafiliacion.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoafiliacion.getcatetipoafiliacion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoafiliacion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoafiliacion.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoafiliacion.getporcen_emplea().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoafiliacion.getporcen_patro().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoafiliacion.getporcen_gene_emplea().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoafiliacion.getporcen_gene_patro().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoafiliacion.getporcen_secu().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoafiliacion.getporcen_iece().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoafiliacion.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoAfiliacionsSeleccionados() throws Exception {
		ArrayList<TipoAfiliacion> tipoafiliacionsSeleccionados=new ArrayList<TipoAfiliacion>();		
		
		tipoafiliacionsSeleccionados=this.getTipoAfiliacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoafiliacion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoAfiliacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoAfiliacion(row);				
				iRow++;
			}				
			
			for(TipoAfiliacion tipoafiliacionAux:tipoafiliacionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoAfiliacion(tipoafiliacionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Afiliacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoAfiliacionsSeleccionados() throws Exception {
		ArrayList<TipoAfiliacion> tipoafiliacionsSeleccionados=new ArrayList<TipoAfiliacion>();		
		
		tipoafiliacionsSeleccionados=this.getTipoAfiliacionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoafiliacion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoafiliacions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoafiliacion");
			//elementRoot.appendChild(element);
		
			for(TipoAfiliacion tipoafiliacionAux:tipoafiliacionsSeleccionados) {
				element = document.createElement("tipoafiliacion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoAfiliacion(tipoafiliacionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Afiliacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoAfiliacion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_IDCATETIPOAFILIACION);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_PORCENEMPLEA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_PORCENPATRO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEEMPLEA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_PORCENGENEPATRO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_PORCENSECU);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_PORCENIECE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAfiliacionConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoAfiliacion(TipoAfiliacion tipoafiliacion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoafiliacion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoafiliacion.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoafiliacion.getcatetipoafiliacion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoafiliacion.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoafiliacion.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoafiliacion.getporcen_emplea());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoafiliacion.getporcen_patro());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoafiliacion.getporcen_gene_emplea());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoafiliacion.getporcen_gene_patro());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoafiliacion.getporcen_secu());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoafiliacion.getporcen_iece());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoafiliacion.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlTipoAfiliacion(TipoAfiliacion tipoafiliacion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoAfiliacionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoafiliacion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoAfiliacionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoafiliacion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoAfiliacionConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipoafiliacion.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcatetipoafiliacion_descripcion = document.createElement(TipoAfiliacionConstantesFunciones.IDCATETIPOAFILIACION);
		elementcatetipoafiliacion_descripcion.appendChild(document.createTextNode(tipoafiliacion.getcatetipoafiliacion_descripcion()));
		element.appendChild(elementcatetipoafiliacion_descripcion);

		Element elementcodigo = document.createElement(TipoAfiliacionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoafiliacion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoAfiliacionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoafiliacion.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementporcen_emplea = document.createElement(TipoAfiliacionConstantesFunciones.PORCENEMPLEA);
		elementporcen_emplea.appendChild(document.createTextNode(tipoafiliacion.getporcen_emplea().toString().trim()));
		element.appendChild(elementporcen_emplea);

		Element elementporcen_patro = document.createElement(TipoAfiliacionConstantesFunciones.PORCENPATRO);
		elementporcen_patro.appendChild(document.createTextNode(tipoafiliacion.getporcen_patro().toString().trim()));
		element.appendChild(elementporcen_patro);

		Element elementporcen_gene_emplea = document.createElement(TipoAfiliacionConstantesFunciones.PORCENGENEEMPLEA);
		elementporcen_gene_emplea.appendChild(document.createTextNode(tipoafiliacion.getporcen_gene_emplea().toString().trim()));
		element.appendChild(elementporcen_gene_emplea);

		Element elementporcen_gene_patro = document.createElement(TipoAfiliacionConstantesFunciones.PORCENGENEPATRO);
		elementporcen_gene_patro.appendChild(document.createTextNode(tipoafiliacion.getporcen_gene_patro().toString().trim()));
		element.appendChild(elementporcen_gene_patro);

		Element elementporcen_secu = document.createElement(TipoAfiliacionConstantesFunciones.PORCENSECU);
		elementporcen_secu.appendChild(document.createTextNode(tipoafiliacion.getporcen_secu().toString().trim()));
		element.appendChild(elementporcen_secu);

		Element elementporcen_iece = document.createElement(TipoAfiliacionConstantesFunciones.PORCENIECE);
		elementporcen_iece.appendChild(document.createTextNode(tipoafiliacion.getporcen_iece().toString().trim()));
		element.appendChild(elementporcen_iece);

		Element elementdescripcion = document.createElement(TipoAfiliacionConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(tipoafiliacion.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoTipoAfiliacionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoAfiliacion> tipoafiliacionsSeleccionados=new ArrayList<TipoAfiliacion>();
		
		tipoafiliacionsSeleccionados=this.getTipoAfiliacionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoAfiliacion(tipoafiliacionsSeleccionados);
		
		this.generarReporteTipoAfiliacions("Todos",tipoafiliacionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoAfiliacion(ArrayList<TipoAfiliacion> tipoafiliacionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoAfiliacion tipoafiliacionAux:tipoafiliacionsSeleccionados) {
				tipoafiliacionAux.setsDetalleGeneralEntityReporte(tipoafiliacionAux.toString());
			
				if(sTipoSeleccionar.equals(TipoAfiliacionConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoafiliacionAux.setsDescripcionGeneralEntityReporte1(tipoafiliacionAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoAfiliacionConstantesFunciones.LABEL_IDCATETIPOAFILIACION)) {
					existe=true;
					tipoafiliacionAux.setsDescripcionGeneralEntityReporte1(tipoafiliacionAux.getcatetipoafiliacion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoAfiliacionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoafiliacionAux.setsDescripcionGeneralEntityReporte1(tipoafiliacionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoAfiliacionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoafiliacionAux.setsDescripcionGeneralEntityReporte1(tipoafiliacionAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoAfiliacionConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					tipoafiliacionAux.setsDescripcionGeneralEntityReporte1(tipoafiliacionAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoAfiliacion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoAfiliacion=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoAfiliacion=true;
				this.isVisibilidadCeldaGuardarCambiosTipoAfiliacion=true;
			}
			
			this.isVisibilidadCeldaModificarTipoAfiliacion=false;
			this.isVisibilidadCeldaActualizarTipoAfiliacion=false;
			this.isVisibilidadCeldaEliminarTipoAfiliacion=false;
			this.isVisibilidadCeldaCancelarTipoAfiliacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAfiliacion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoAfiliacion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoAfiliacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAfiliacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAfiliacion=false;
			this.isVisibilidadCeldaModificarTipoAfiliacion=false;
			this.isVisibilidadCeldaActualizarTipoAfiliacion=true;
			this.isVisibilidadCeldaEliminarTipoAfiliacion=false;
			this.isVisibilidadCeldaCancelarTipoAfiliacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAfiliacion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoAfiliacion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoAfiliacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAfiliacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAfiliacion=false;
			this.isVisibilidadCeldaModificarTipoAfiliacion=false;
			this.isVisibilidadCeldaActualizarTipoAfiliacion=true;
			this.isVisibilidadCeldaEliminarTipoAfiliacion=true;
			this.isVisibilidadCeldaCancelarTipoAfiliacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAfiliacion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoAfiliacion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoAfiliacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAfiliacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAfiliacion=false;
			this.isVisibilidadCeldaModificarTipoAfiliacion=false;
			this.isVisibilidadCeldaActualizarTipoAfiliacion=true;
			this.isVisibilidadCeldaEliminarTipoAfiliacion=false;
			this.isVisibilidadCeldaCancelarTipoAfiliacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAfiliacion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoAfiliacion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoAfiliacion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoAfiliacion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoAfiliacion=true;
			this.isVisibilidadCeldaModificarTipoAfiliacion=false;
			this.isVisibilidadCeldaActualizarTipoAfiliacion=false;
			this.isVisibilidadCeldaEliminarTipoAfiliacion=false;
			this.isVisibilidadCeldaCancelarTipoAfiliacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAfiliacion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoAfiliacion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoAfiliacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAfiliacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAfiliacion=false;
			this.isVisibilidadCeldaActualizarTipoAfiliacion=false;
			this.isVisibilidadCeldaEliminarTipoAfiliacion=false;
			this.isVisibilidadCeldaCancelarTipoAfiliacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAfiliacion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoAfiliacion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoAfiliacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAfiliacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAfiliacion=false;
			this.isVisibilidadCeldaModificarTipoAfiliacion=true;
			this.isVisibilidadCeldaActualizarTipoAfiliacion=false;
			this.isVisibilidadCeldaEliminarTipoAfiliacion=false;
			this.isVisibilidadCeldaCancelarTipoAfiliacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAfiliacion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoAfiliacion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoAfiliacionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoAfiliacion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoAfiliacion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoAfiliacion=true;
		} else {
			this.actualizarEstadoPanelsTipoAfiliacion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoAfiliacion=false;
			//this.isVisibilidadCeldaVerFormTipoAfiliacion=false;
			this.isVisibilidadCeldaDuplicarTipoAfiliacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoafiliacionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoAfiliacion=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoAfiliacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAfiliacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
			if(!tipoafiliacionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoAfiliacion=false;												
			}
			
			this.jButtonCerrarTipoAfiliacion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoAfiliacion=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoafiliacion)) {
			this.isVisibilidadCeldaActualizarTipoAfiliacion=false;
			this.isVisibilidadCeldaEliminarTipoAfiliacion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoAfiliacion() {
		this.isVisibilidadCeldaNuevoTipoAfiliacion=false;
		this.isVisibilidadCeldaGuardarCambiosTipoAfiliacion=false;
	}
	
	public void actualizarEstadoPanelsTipoAfiliacion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoAfiliacion!=null) {
				this.jScrollPanelDatosEdicionTipoAfiliacion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAfiliacion!=null) {
				this.jTabbedPaneBusquedasTipoAfiliacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoAfiliacion!=null) {
				this.jScrollPanelDatosTipoAfiliacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoAfiliacion!=null) {
				this.jPanelPaginacionTipoAfiliacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoAfiliacion!=null) {
				this.jPanelParametrosReportesTipoAfiliacion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoAfiliacion!=null) {
				this.jScrollPanelDatosEdicionTipoAfiliacion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAfiliacion!=null) {
				this.jTabbedPaneBusquedasTipoAfiliacion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoAfiliacion!=null) {
				this.jScrollPanelDatosTipoAfiliacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoAfiliacion!=null) {
				this.jPanelPaginacionTipoAfiliacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoAfiliacion!=null) {
				this.jPanelParametrosReportesTipoAfiliacion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoAfiliacion!=null) {
				this.jScrollPanelDatosEdicionTipoAfiliacion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAfiliacion!=null) {
				this.jTabbedPaneBusquedasTipoAfiliacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoAfiliacion!=null) {
				this.jScrollPanelDatosTipoAfiliacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoAfiliacion!=null) {
				this.jPanelPaginacionTipoAfiliacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoAfiliacion!=null) {
				this.jPanelParametrosReportesTipoAfiliacion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoAfiliacion!=null) {
				this.jScrollPanelDatosEdicionTipoAfiliacion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAfiliacion!=null) {
				this.jTabbedPaneBusquedasTipoAfiliacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoAfiliacion!=null) {
				this.jScrollPanelDatosTipoAfiliacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoAfiliacion!=null) {
				this.jPanelPaginacionTipoAfiliacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoAfiliacion!=null) {
				this.jPanelParametrosReportesTipoAfiliacion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoAfiliacion!=null) {
				this.jScrollPanelDatosEdicionTipoAfiliacion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAfiliacion!=null) {
				this.jTabbedPaneBusquedasTipoAfiliacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoAfiliacion!=null) {
				this.jScrollPanelDatosTipoAfiliacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoAfiliacion!=null) {
				this.jPanelPaginacionTipoAfiliacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoAfiliacion!=null) {
				this.jPanelParametrosReportesTipoAfiliacion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoAfiliacion!=null) {
				this.jScrollPanelDatosEdicionTipoAfiliacion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAfiliacion!=null) {
				this.jTabbedPaneBusquedasTipoAfiliacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoAfiliacion!=null) {
				this.jScrollPanelDatosTipoAfiliacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoAfiliacion!=null) {
				this.jPanelPaginacionTipoAfiliacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoAfiliacion!=null) {
				this.jPanelParametrosReportesTipoAfiliacion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoAfiliacion!=null) {
				this.jScrollPanelDatosEdicionTipoAfiliacion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAfiliacion!=null) {
				this.jTabbedPaneBusquedasTipoAfiliacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoAfiliacion!=null) {
				this.jScrollPanelDatosTipoAfiliacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoAfiliacion!=null) {
				this.jPanelPaginacionTipoAfiliacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoAfiliacion!=null) {
				this.jPanelParametrosReportesTipoAfiliacion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoAfiliacion!=null) {
					this.jTabbedPaneBusquedasTipoAfiliacion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoAfiliacion!=null) {
				this.jPanelParametrosReportesTipoAfiliacion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoafiliacionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAfiliacion!=null) {
				this.jTabbedPaneBusquedasTipoAfiliacion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoAfiliacion!=null) {
				this.jPanelParametrosReportesTipoAfiliacion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCateTipoAfiliacion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCateTipoAfiliacion) {this.jTabbedPaneBusquedasTipoAfiliacion.remove(jPanelFK_IdCateTipoAfiliacionTipoAfiliacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaCateTipoAfiliacion(Boolean isParaCateTipoAfiliacion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCateTipoAfiliacionNegation=!isParaCateTipoAfiliacion;

			this.isVisibilidadFK_IdCateTipoAfiliacion=isParaCateTipoAfiliacion;
			if(!this.isVisibilidadFK_IdCateTipoAfiliacion) {this.jTabbedPaneBusquedasTipoAfiliacion.remove(jPanelFK_IdCateTipoAfiliacionTipoAfiliacion);}
		}
		
	}
	
	

	public String registrarSesionTipoAfiliacionParaDatoGeneralEmpleados() throws Exception {
		Boolean isPaginaPopupDatoGeneralEmpleado=false;

		try {

			if(this.tipoafiliacionSessionBean==null) {
				this.tipoafiliacionSessionBean=new TipoAfiliacionSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoSessionBean=new DatoGeneralEmpleadoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoSessionBean.setsPathNavegacionActual(tipoafiliacionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDatoGeneralEmpleado=this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado(true);
			this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado(TipoAfiliacionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoAfiliacion(true);
			this.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoSessionBean.setlidTipoAfiliacionActual(this.idTipoAfiliacionActual);

			tipoafiliacionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoAfiliacion(true);
			tipoafiliacionSessionBean.setlIdTipoAfiliacionActualForeignKey(this.idTipoAfiliacionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoAfiliacionSessionBean tipoafiliacionSessionBean=new TipoAfiliacionSessionBean();
		
		if(this.tipoafiliacionSessionBean==null) {
			this.tipoafiliacionSessionBean=new TipoAfiliacionSessionBean();
		}
		
		this.tipoafiliacionSessionBean.setsUltimaBusquedaTipoAfiliacion(this.getsAccionBusqueda());
		this.tipoafiliacionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoafiliacionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCateTipoAfiliacion")) {
			tipoafiliacionSessionBean.setid_cate_tipo_afiliacion(this.getid_cate_tipo_afiliacionFK_IdCateTipoAfiliacion());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoafiliacionSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoAfiliacionSessionBean tipoafiliacionSessionBean=new TipoAfiliacionSessionBean();
		
		if(this.tipoafiliacionSessionBean==null) {
			this.tipoafiliacionSessionBean=new TipoAfiliacionSessionBean();
		}
		
		if(this.tipoafiliacionSessionBean.getsUltimaBusquedaTipoAfiliacion()!=null&&!this.tipoafiliacionSessionBean.getsUltimaBusquedaTipoAfiliacion().equals("")) {
			this.setsAccionBusqueda(tipoafiliacionSessionBean.getsUltimaBusquedaTipoAfiliacion());
			this.setiNumeroPaginacion(tipoafiliacionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoafiliacionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCateTipoAfiliacion")) {
				this.setid_cate_tipo_afiliacionFK_IdCateTipoAfiliacion(tipoafiliacionSessionBean.getid_cate_tipo_afiliacion());
				tipoafiliacionSessionBean.setid_cate_tipo_afiliacion(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoafiliacionSessionBean.getid_empresa());
				tipoafiliacionSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipoafiliacionSessionBean.setsUltimaBusquedaTipoAfiliacion("");
		this.tipoafiliacionSessionBean.setiNumeroPaginacion(TipoAfiliacionConstantesFunciones.INUMEROPAGINACION);
		this.tipoafiliacionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoAfiliacion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoAfiliacion() {
		this.updateBorderResaltarBusquedasFormularioTipoAfiliacion();
		this.updateVisibilidadBusquedasFormularioTipoAfiliacion();
		this.updateHabilitarBusquedasFormularioTipoAfiliacion();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoAfiliacion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoAfiliacion.getComponents().length>0) {
	

		if(this.tipoafiliacionConstantesFunciones.resaltarFK_IdCateTipoAfiliacionTipoAfiliacion!=null) {
			index= this.jTabbedPaneBusquedasTipoAfiliacion.indexOfComponent(this.jPanelFK_IdCateTipoAfiliacionTipoAfiliacion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoAfiliacion.getComponent(index);
				jPanel.setBorder(this.tipoafiliacionConstantesFunciones.resaltarFK_IdCateTipoAfiliacionTipoAfiliacion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoAfiliacion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoAfiliacion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoAfiliacion.indexOfComponent(this.jPanelFK_IdCateTipoAfiliacionTipoAfiliacion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoAfiliacion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipoafiliacionConstantesFunciones.mostrarFK_IdCateTipoAfiliacionTipoAfiliacion);
			if(!this.tipoafiliacionConstantesFunciones.mostrarFK_IdCateTipoAfiliacionTipoAfiliacion && index>-1) {
				this.jTabbedPaneBusquedasTipoAfiliacion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoAfiliacion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoAfiliacion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoAfiliacion.indexOfComponent(this.jPanelFK_IdCateTipoAfiliacionTipoAfiliacion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoAfiliacion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipoafiliacionConstantesFunciones.activarFK_IdCateTipoAfiliacionTipoAfiliacion);
				this.jTabbedPaneBusquedasTipoAfiliacion.setEnabledAt(index,this.tipoafiliacionConstantesFunciones.activarFK_IdCateTipoAfiliacionTipoAfiliacion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoAfiliacion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCateTipoAfiliacion")) {
			index= this.jTabbedPaneBusquedasTipoAfiliacion.indexOfComponent(this.jPanelFK_IdCateTipoAfiliacionTipoAfiliacion);

			this.jTabbedPaneBusquedasTipoAfiliacion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoAfiliacion.getComponent(index);

			this.tipoafiliacionConstantesFunciones.setResaltarFK_IdCateTipoAfiliacionTipoAfiliacion(resaltar);

			jPanel.setBorder(this.tipoafiliacionConstantesFunciones.resaltarFK_IdCateTipoAfiliacionTipoAfiliacion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoAfiliacion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoAfiliacion() throws Exception {

		if(this.jInternalFrameDetalleFormTipoAfiliacion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoAfiliacion();
		this.updateVisibilidadResaltarControlesFormularioTipoAfiliacion();
		this.updateHabilitarResaltarControlesFormularioTipoAfiliacion();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoAfiliacion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoAfiliacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoafiliacionConstantesFunciones.resaltaridTipoAfiliacion!=null && this.jInternalFrameDetalleFormTipoAfiliacion!=null) {this.jInternalFrameDetalleFormTipoAfiliacion.jLabelidTipoAfiliacion.setBorder(this.tipoafiliacionConstantesFunciones.resaltaridTipoAfiliacion);}
		if(this.tipoafiliacionConstantesFunciones.resaltarid_empresaTipoAfiliacion!=null && this.jInternalFrameDetalleFormTipoAfiliacion!=null) {this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_empresaTipoAfiliacion.setBorder(this.tipoafiliacionConstantesFunciones.resaltarid_empresaTipoAfiliacion);}
		if(this.tipoafiliacionConstantesFunciones.resaltarid_cate_tipo_afiliacionTipoAfiliacion!=null && this.jInternalFrameDetalleFormTipoAfiliacion!=null) {this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_cate_tipo_afiliacionTipoAfiliacion.setBorder(this.tipoafiliacionConstantesFunciones.resaltarid_cate_tipo_afiliacionTipoAfiliacion);}
		if(this.tipoafiliacionConstantesFunciones.resaltarcodigoTipoAfiliacion!=null && this.jInternalFrameDetalleFormTipoAfiliacion!=null) {this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldcodigoTipoAfiliacion.setBorder(this.tipoafiliacionConstantesFunciones.resaltarcodigoTipoAfiliacion);}
		if(this.tipoafiliacionConstantesFunciones.resaltarnombreTipoAfiliacion!=null && this.jInternalFrameDetalleFormTipoAfiliacion!=null) {this.jInternalFrameDetalleFormTipoAfiliacion.jTextAreanombreTipoAfiliacion.setBorder(this.tipoafiliacionConstantesFunciones.resaltarnombreTipoAfiliacion);}
		if(this.tipoafiliacionConstantesFunciones.resaltarporcen_empleaTipoAfiliacion!=null && this.jInternalFrameDetalleFormTipoAfiliacion!=null) {this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_empleaTipoAfiliacion.setBorder(this.tipoafiliacionConstantesFunciones.resaltarporcen_empleaTipoAfiliacion);}
		if(this.tipoafiliacionConstantesFunciones.resaltarporcen_patroTipoAfiliacion!=null && this.jInternalFrameDetalleFormTipoAfiliacion!=null) {this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_patroTipoAfiliacion.setBorder(this.tipoafiliacionConstantesFunciones.resaltarporcen_patroTipoAfiliacion);}
		if(this.tipoafiliacionConstantesFunciones.resaltarporcen_gene_empleaTipoAfiliacion!=null && this.jInternalFrameDetalleFormTipoAfiliacion!=null) {this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_gene_empleaTipoAfiliacion.setBorder(this.tipoafiliacionConstantesFunciones.resaltarporcen_gene_empleaTipoAfiliacion);}
		if(this.tipoafiliacionConstantesFunciones.resaltarporcen_gene_patroTipoAfiliacion!=null && this.jInternalFrameDetalleFormTipoAfiliacion!=null) {this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_gene_patroTipoAfiliacion.setBorder(this.tipoafiliacionConstantesFunciones.resaltarporcen_gene_patroTipoAfiliacion);}
		if(this.tipoafiliacionConstantesFunciones.resaltarporcen_secuTipoAfiliacion!=null && this.jInternalFrameDetalleFormTipoAfiliacion!=null) {this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_secuTipoAfiliacion.setBorder(this.tipoafiliacionConstantesFunciones.resaltarporcen_secuTipoAfiliacion);}
		if(this.tipoafiliacionConstantesFunciones.resaltarporcen_ieceTipoAfiliacion!=null && this.jInternalFrameDetalleFormTipoAfiliacion!=null) {this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_ieceTipoAfiliacion.setBorder(this.tipoafiliacionConstantesFunciones.resaltarporcen_ieceTipoAfiliacion);}
		if(this.tipoafiliacionConstantesFunciones.resaltardescripcionTipoAfiliacion!=null && this.jInternalFrameDetalleFormTipoAfiliacion!=null) {this.jInternalFrameDetalleFormTipoAfiliacion.jTextAreadescripcionTipoAfiliacion.setBorder(this.tipoafiliacionConstantesFunciones.resaltardescripcionTipoAfiliacion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoAfiliacion() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoAfiliacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) {
	
		//this.jInternalFrameDetalleFormTipoAfiliacion.jLabelidTipoAfiliacion.setVisible(this.tipoafiliacionConstantesFunciones.mostraridTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jPanelidTipoAfiliacion.setVisible(this.tipoafiliacionConstantesFunciones.mostraridTipoAfiliacion);
		//this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_empresaTipoAfiliacion.setVisible(this.tipoafiliacionConstantesFunciones.mostrarid_empresaTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jPanelid_empresaTipoAfiliacion.setVisible(this.tipoafiliacionConstantesFunciones.mostrarid_empresaTipoAfiliacion);
		//this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_cate_tipo_afiliacionTipoAfiliacion.setVisible(this.tipoafiliacionConstantesFunciones.mostrarid_cate_tipo_afiliacionTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jPanelid_cate_tipo_afiliacionTipoAfiliacion.setVisible(this.tipoafiliacionConstantesFunciones.mostrarid_cate_tipo_afiliacionTipoAfiliacion);
		//this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldcodigoTipoAfiliacion.setVisible(this.tipoafiliacionConstantesFunciones.mostrarcodigoTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jPanelcodigoTipoAfiliacion.setVisible(this.tipoafiliacionConstantesFunciones.mostrarcodigoTipoAfiliacion);
		//this.jInternalFrameDetalleFormTipoAfiliacion.jTextAreanombreTipoAfiliacion.setVisible(this.tipoafiliacionConstantesFunciones.mostrarnombreTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jPanelnombreTipoAfiliacion.setVisible(this.tipoafiliacionConstantesFunciones.mostrarnombreTipoAfiliacion);
		//this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_empleaTipoAfiliacion.setVisible(this.tipoafiliacionConstantesFunciones.mostrarporcen_empleaTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jPanelporcen_empleaTipoAfiliacion.setVisible(this.tipoafiliacionConstantesFunciones.mostrarporcen_empleaTipoAfiliacion);
		//this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_patroTipoAfiliacion.setVisible(this.tipoafiliacionConstantesFunciones.mostrarporcen_patroTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jPanelporcen_patroTipoAfiliacion.setVisible(this.tipoafiliacionConstantesFunciones.mostrarporcen_patroTipoAfiliacion);
		//this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_gene_empleaTipoAfiliacion.setVisible(this.tipoafiliacionConstantesFunciones.mostrarporcen_gene_empleaTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jPanelporcen_gene_empleaTipoAfiliacion.setVisible(this.tipoafiliacionConstantesFunciones.mostrarporcen_gene_empleaTipoAfiliacion);
		//this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_gene_patroTipoAfiliacion.setVisible(this.tipoafiliacionConstantesFunciones.mostrarporcen_gene_patroTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jPanelporcen_gene_patroTipoAfiliacion.setVisible(this.tipoafiliacionConstantesFunciones.mostrarporcen_gene_patroTipoAfiliacion);
		//this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_secuTipoAfiliacion.setVisible(this.tipoafiliacionConstantesFunciones.mostrarporcen_secuTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jPanelporcen_secuTipoAfiliacion.setVisible(this.tipoafiliacionConstantesFunciones.mostrarporcen_secuTipoAfiliacion);
		//this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_ieceTipoAfiliacion.setVisible(this.tipoafiliacionConstantesFunciones.mostrarporcen_ieceTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jPanelporcen_ieceTipoAfiliacion.setVisible(this.tipoafiliacionConstantesFunciones.mostrarporcen_ieceTipoAfiliacion);
		//this.jInternalFrameDetalleFormTipoAfiliacion.jTextAreadescripcionTipoAfiliacion.setVisible(this.tipoafiliacionConstantesFunciones.mostrardescripcionTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jPaneldescripcionTipoAfiliacion.setVisible(this.tipoafiliacionConstantesFunciones.mostrardescripcionTipoAfiliacion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoAfiliacion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoAfiliacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoAfiliacion!=null) {
	
		this.jInternalFrameDetalleFormTipoAfiliacion.jLabelidTipoAfiliacion.setEnabled(this.tipoafiliacionConstantesFunciones.activaridTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_empresaTipoAfiliacion.setEnabled(this.tipoafiliacionConstantesFunciones.activarid_empresaTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jComboBoxid_cate_tipo_afiliacionTipoAfiliacion.setEnabled(this.tipoafiliacionConstantesFunciones.activarid_cate_tipo_afiliacionTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldcodigoTipoAfiliacion.setEnabled(this.tipoafiliacionConstantesFunciones.activarcodigoTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jTextAreanombreTipoAfiliacion.setEnabled(this.tipoafiliacionConstantesFunciones.activarnombreTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_empleaTipoAfiliacion.setEnabled(this.tipoafiliacionConstantesFunciones.activarporcen_empleaTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_patroTipoAfiliacion.setEnabled(this.tipoafiliacionConstantesFunciones.activarporcen_patroTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_gene_empleaTipoAfiliacion.setEnabled(this.tipoafiliacionConstantesFunciones.activarporcen_gene_empleaTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_gene_patroTipoAfiliacion.setEnabled(this.tipoafiliacionConstantesFunciones.activarporcen_gene_patroTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_secuTipoAfiliacion.setEnabled(this.tipoafiliacionConstantesFunciones.activarporcen_secuTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jTextFieldporcen_ieceTipoAfiliacion.setEnabled(this.tipoafiliacionConstantesFunciones.activarporcen_ieceTipoAfiliacion);
		this.jInternalFrameDetalleFormTipoAfiliacion.jTextAreadescripcionTipoAfiliacion.setEnabled(this.tipoafiliacionConstantesFunciones.activardescripcionTipoAfiliacion);
		}
	}
	
		
}