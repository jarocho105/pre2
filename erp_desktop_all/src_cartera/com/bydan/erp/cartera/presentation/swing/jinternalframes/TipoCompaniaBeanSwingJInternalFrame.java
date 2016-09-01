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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.TipoCompaniaConstantesFunciones;
import com.bydan.erp.cartera.util.TipoCompaniaParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoCompaniaParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoCompaniaBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
public class TipoCompaniaBeanSwingJInternalFrame extends TipoCompaniaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoCompaniaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoCompania> tipocompaniaValidator = new ClassValidator<TipoCompania>(TipoCompania.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoCompania tipocompania;	
	public TipoCompania tipocompaniaAux;
	public TipoCompania tipocompaniaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoCompania tipocompaniaTotales;
	public Long idTipoCompaniaActual;
	public Long iIdNuevoTipoCompania=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosDatoConstitucion=false;

	public Boolean getIsTienePermisosDatoConstitucion() {
		return isTienePermisosDatoConstitucion;
	}

	public void setIsTienePermisosDatoConstitucion(Boolean isTienePermisosDatoConstitucion) {
		this.isTienePermisosDatoConstitucion= isTienePermisosDatoConstitucion;
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
	
	public Boolean isPermisoTodoTipoCompania;
	public Boolean isPermisoNuevoTipoCompania;
	public Boolean isPermisoActualizarTipoCompania;
	public Boolean isPermisoActualizarOriginalTipoCompania;
	public Boolean isPermisoEliminarTipoCompania;
	public Boolean isPermisoGuardarCambiosTipoCompania;
	public Boolean isPermisoConsultaTipoCompania;
	public Boolean isPermisoBusquedaTipoCompania;
	public Boolean isPermisoReporteTipoCompania;
	public Boolean isPermisoPaginacionMedioTipoCompania;
	public Boolean isPermisoPaginacionAltoTipoCompania;
	public Boolean isPermisoPaginacionTodoTipoCompania;
	public Boolean isPermisoCopiarTipoCompania;
	public Boolean isPermisoVerFormTipoCompania;
	public Boolean isPermisoDuplicarTipoCompania;
	public Boolean isPermisoOrdenTipoCompania;
	
	
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
	
	public TipoCompaniaParameterReturnGeneral tipocompaniaReturnGeneral;
	public TipoCompaniaParameterReturnGeneral tipocompaniaParameterGeneral;
	
	

	public DatoConstitucionLogic datoconstitucionLogic=null;

	public DatoConstitucionLogic getDatoConstitucionLogic() {
		return datoconstitucionLogic;
	}

	public void setDatoConstitucionLogic(DatoConstitucionLogic datoconstitucionLogic) {
		this.datoconstitucionLogic = datoconstitucionLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoCompania=false;
	public Boolean esParaAccionDesdeFormularioTipoCompania=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoCompaniaSessionBeanAdditional tipocompaniaSessionBeanAdditional=null;
	
	public TipoCompaniaSessionBeanAdditional getTipoCompaniaSessionBeanAdditional() {
		return this.tipocompaniaSessionBeanAdditional;
	}
	
	public void setTipoCompaniaSessionBeanAdditional(TipoCompaniaSessionBeanAdditional tipocompaniaSessionBeanAdditional) {
		try {
			this.tipocompaniaSessionBeanAdditional=tipocompaniaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoCompaniaBeanSwingJInternalFrameAdditional tipocompaniaBeanSwingJInternalFrameAdditional=null;
	//public class TipoCompaniaBeanSwingJInternalFrame
	
	public TipoCompaniaBeanSwingJInternalFrameAdditional getTipoCompaniaBeanSwingJInternalFrameAdditional() {
		return this.tipocompaniaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoCompaniaBeanSwingJInternalFrameAdditional(TipoCompaniaBeanSwingJInternalFrameAdditional tipocompaniaBeanSwingJInternalFrameAdditional) {
		try {
			this.tipocompaniaBeanSwingJInternalFrameAdditional=tipocompaniaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoCompaniaLogic tipocompaniaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoCompania tipocompaniaBean;
	public TipoCompaniaConstantesFunciones tipocompaniaConstantesFunciones;
	//public TipoCompaniaParameterReturnGeneral tipocompaniaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoCompania> tipocompanias;	
	//public List<TipoCompania> tipocompaniasEliminados;
	//public List<TipoCompania> tipocompaniasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoCompania=false;
	public Boolean isVisibilidadCeldaDuplicarTipoCompania=true;
	public Boolean isVisibilidadCeldaCopiarTipoCompania=true;
	public Boolean isVisibilidadCeldaVerFormTipoCompania=true;
	public Boolean isVisibilidadCeldaOrdenTipoCompania=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoCompania=false;
	public Boolean isVisibilidadCeldaModificarTipoCompania=false;
	public Boolean isVisibilidadCeldaActualizarTipoCompania=false;
	public Boolean isVisibilidadCeldaEliminarTipoCompania=false;
	public Boolean isVisibilidadCeldaCancelarTipoCompania=false;
	public Boolean isVisibilidadCeldaGuardarTipoCompania=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoCompania=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoCompania() {
		return this.iIdNuevoTipoCompania;
	}

	public void setiIdNuevoTipoCompania(Long iIdNuevoTipoCompania) {
		this.iIdNuevoTipoCompania = iIdNuevoTipoCompania;
	}
	
	public Long getidTipoCompaniaActual() {
		return this.idTipoCompaniaActual;
	}

	public void setidTipoCompaniaActual(Long idTipoCompaniaActual) {
		this.idTipoCompaniaActual = idTipoCompaniaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoCompania gettipocompania() {
		return this.tipocompania;
	}

	public void settipocompania(TipoCompania tipocompania) {
		this.tipocompania = tipocompania;
	}
	
	public TipoCompania gettipocompaniaAux() {
		return this.tipocompaniaAux;
	}

	public void settipocompaniaAux(TipoCompania tipocompaniaAux) {
		this.tipocompaniaAux = tipocompaniaAux;
	}				
	
	public TipoCompania gettipocompaniaAnterior() {
		return this.tipocompaniaAnterior;
	}

	public void settipocompaniaAnterior(TipoCompania tipocompaniaAnterior) {
		this.tipocompaniaAnterior = tipocompaniaAnterior;
	}	
	
	public TipoCompania gettipocompaniaTotales() {
		return this.tipocompaniaTotales;
	}

	public void settipocompaniaTotales(TipoCompania tipocompaniaTotales) {
		this.tipocompaniaTotales = tipocompaniaTotales;
	}	
	
	public TipoCompania gettipocompaniaBean() {
		return this.tipocompaniaBean;
	}

	public void settipocompaniaBean(TipoCompania tipocompaniaBean) {
		this.tipocompaniaBean = tipocompaniaBean;
	}	
	
	public TipoCompaniaParameterReturnGeneral gettipocompaniaReturnGeneral() {
		return this.tipocompaniaReturnGeneral;
	}

	public void settipocompaniaReturnGeneral(TipoCompaniaParameterReturnGeneral tipocompaniaReturnGeneral) {
		this.tipocompaniaReturnGeneral = tipocompaniaReturnGeneral;
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
	
	
	public TipoCompaniaLogic getTipoCompaniaLogic()	{		
		return tipocompaniaLogic;
	}

	public void setTipoCompaniaLogic(TipoCompaniaLogic tipocompaniaLogic) {
		this.tipocompaniaLogic = tipocompaniaLogic;
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
	
	public Boolean getIsEsNuevoTipoCompania() {
		return isEsNuevoTipoCompania;
	}

	public void setIsEsNuevoTipoCompania(Boolean isEsNuevoTipoCompania) {
		this.isEsNuevoTipoCompania = isEsNuevoTipoCompania;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoCompania() {
		return esParaAccionDesdeFormularioTipoCompania;
	}
	
	public void setEsParaAccionDesdeFormularioTipoCompania(Boolean esParaAccionDesdeFormularioTipoCompania) {
		this.esParaAccionDesdeFormularioTipoCompania = esParaAccionDesdeFormularioTipoCompania;
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

			if(this.tipocompaniaSessionBean==null) {
				this.tipocompaniaSessionBean=new TipoCompaniaSessionBean();
			}

			if(!this.tipocompaniaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipocompaniaSessionBean.getlidEmpresaActual());
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

					if(this.tipocompania!=null) {
						this.tipocompania.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoCompania!=null) {
						this.jInternalFrameDetalleFormTipoCompania.jComboBoxid_empresaTipoCompania.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoCompania.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoCompania!=null) {
						if(this.jInternalFrameDetalleFormTipoCompania.jComboBoxid_empresaTipoCompania.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoCompania.jComboBoxid_empresaTipoCompania.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoCompaniaGenerico)throws Exception
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
				jComboBoxid_empresaTipoCompaniaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoCompaniaGenerico!=null && jComboBoxid_empresaTipoCompaniaGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoCompaniaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoCompania tipocompania,JComboBox jComboBoxid_empresaTipoCompaniaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoCompaniaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoCompania.jComboBoxid_empresaTipoCompania.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoCompaniaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipocompania.setid_empresa(empresaAux.getId());
				tipocompania.setempresa_descripcion(TipoCompaniaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipocompania.setEmpresa(empresaAux);			}
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

					if(!TipoCompaniaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoCompania!=null) { 
							this.jInternalFrameDetalleFormTipoCompania.jComboBoxid_empresaTipoCompania.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoCompania.jComboBoxid_empresaTipoCompania.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoCompania!=null) { 
					}

					if(!TipoCompaniaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoCompania!=null) {
							this.jInternalFrameDetalleFormTipoCompania.jComboBoxid_empresaTipoCompania.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoCompania!=null) {
							this.jInternalFrameDetalleFormTipoCompania.jComboBoxid_empresaTipoCompania.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoCompania() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoCompaniaConstantesFunciones.refrescarForeignKeysDescripcionesTipoCompania(this.tipocompaniaLogic.getTipoCompanias());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoCompaniaConstantesFunciones.refrescarForeignKeysDescripcionesTipoCompania(this.tipocompanias);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipocompaniaLogic.setTipoCompanias(this.tipocompanias);
			tipocompaniaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoCompaniaParameterReturnGeneral getTipoCompaniaParameterGeneral() {
		return this.tipocompaniaParameterGeneral;
	}
	
	public void setTipoCompaniaParameterGeneral(TipoCompaniaParameterReturnGeneral tipocompaniaParameterGeneral) {
		this.tipocompaniaParameterGeneral = tipocompaniaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoCompania() {
		return isPermisoTodoTipoCompania;
	}

	public void setIsPermisoTodoTipoCompania(Boolean isPermisoTodoTipoCompania) {
		this.isPermisoTodoTipoCompania = isPermisoTodoTipoCompania;
	}

	public Boolean getIsPermisoNuevoTipoCompania() {
		return isPermisoNuevoTipoCompania;
	}

	public void setIsPermisoNuevoTipoCompania(Boolean isPermisoNuevoTipoCompania) {
		this.isPermisoNuevoTipoCompania = isPermisoNuevoTipoCompania;
	}

	public Boolean getIsPermisoActualizarTipoCompania() {
		return isPermisoActualizarTipoCompania;
	}

	public void setIsPermisoActualizarTipoCompania(Boolean isPermisoActualizarTipoCompania) {
		this.isPermisoActualizarTipoCompania = isPermisoActualizarTipoCompania;
	}

	public Boolean getIsPermisoEliminarTipoCompania() {
		return isPermisoEliminarTipoCompania;
	}

	public void setIsPermisoEliminarTipoCompania(Boolean isPermisoEliminarTipoCompania) {
		this.isPermisoEliminarTipoCompania = isPermisoEliminarTipoCompania;
	}

	public Boolean getIsPermisoGuardarCambiosTipoCompania() {
		return isPermisoGuardarCambiosTipoCompania;
	}

	public void setIsPermisoGuardarCambiosTipoCompania(Boolean isPermisoGuardarCambiosTipoCompania) {
		this.isPermisoGuardarCambiosTipoCompania = isPermisoGuardarCambiosTipoCompania;
	}
	
	public Boolean getIsPermisoConsultaTipoCompania() {
		return isPermisoConsultaTipoCompania;
	}

	public void setIsPermisoConsultaTipoCompania(Boolean isPermisoConsultaTipoCompania) {
		this.isPermisoConsultaTipoCompania = isPermisoConsultaTipoCompania;
	}

	public Boolean getIsPermisoBusquedaTipoCompania() {
		return isPermisoBusquedaTipoCompania;
	}

	public void setIsPermisoBusquedaTipoCompania(Boolean isPermisoBusquedaTipoCompania) {
		this.isPermisoBusquedaTipoCompania = isPermisoBusquedaTipoCompania;
	}

	public Boolean getIsPermisoReporteTipoCompania() {
		return isPermisoReporteTipoCompania;
	}

	public void setIsPermisoReporteTipoCompania(Boolean isPermisoReporteTipoCompania) {
		this.isPermisoReporteTipoCompania = isPermisoReporteTipoCompania;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoCompania() {
		return isPermisoPaginacionMedioTipoCompania;
	}

	public void setIsPermisoPaginacionMedioTipoCompania(Boolean isPermisoPaginacionMedioTipoCompania) {
		this.isPermisoPaginacionMedioTipoCompania = isPermisoPaginacionMedioTipoCompania;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoCompania() {
		return isPermisoPaginacionTodoTipoCompania;
	}

	public void setIsPermisoPaginacionTodoTipoCompania(Boolean isPermisoPaginacionTodoTipoCompania) {
		this.isPermisoPaginacionTodoTipoCompania = isPermisoPaginacionTodoTipoCompania;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoCompania() {
		return isPermisoPaginacionAltoTipoCompania;
	}

	public void setIsPermisoPaginacionAltoTipoCompania(Boolean isPermisoPaginacionAltoTipoCompania) {
		this.isPermisoPaginacionAltoTipoCompania = isPermisoPaginacionAltoTipoCompania;
	}
	
	public Boolean getIsPermisoCopiarTipoCompania() {
		return isPermisoCopiarTipoCompania;
	}

	public void setIsPermisoCopiarTipoCompania(Boolean isPermisoCopiarTipoCompania) {
		this.isPermisoCopiarTipoCompania = isPermisoCopiarTipoCompania;
	}
	
	public Boolean getIsPermisoVerFormTipoCompania() {
		return isPermisoVerFormTipoCompania;
	}

	public void setIsPermisoVerFormTipoCompania(Boolean isPermisoVerFormTipoCompania) {
		this.isPermisoVerFormTipoCompania = isPermisoVerFormTipoCompania;
	}
	
	public Boolean getIsPermisoDuplicarTipoCompania() {
		return isPermisoDuplicarTipoCompania;
	}

	public void setIsPermisoDuplicarTipoCompania(Boolean isPermisoDuplicarTipoCompania) {
		this.isPermisoDuplicarTipoCompania = isPermisoDuplicarTipoCompania;
	}
	
	public Boolean getIsPermisoOrdenTipoCompania() {
		return isPermisoOrdenTipoCompania;
	}

	public void setIsPermisoOrdenTipoCompania(Boolean isPermisoOrdenTipoCompania) {
		this.isPermisoOrdenTipoCompania = isPermisoOrdenTipoCompania;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoCompania() {
		return isVisibilidadCeldaNuevoTipoCompania;
	}

	public void setIsVisibilidadCeldaNuevoTipoCompania(Boolean isVisibilidadCeldaNuevoTipoCompania) {
		this.isVisibilidadCeldaNuevoTipoCompania = isVisibilidadCeldaNuevoTipoCompania;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoCompania() {
		return isVisibilidadCeldaDuplicarTipoCompania;
	}

	public void setIsVisibilidadCeldaDuplicarTipoCompania(Boolean isVisibilidadCeldaDuplicarTipoCompania) {
		this.isVisibilidadCeldaDuplicarTipoCompania = isVisibilidadCeldaDuplicarTipoCompania;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoCompania() {
		return isVisibilidadCeldaCopiarTipoCompania;
	}

	public void setIsVisibilidadCeldaCopiarTipoCompania(Boolean isVisibilidadCeldaCopiarTipoCompania) {
		this.isVisibilidadCeldaCopiarTipoCompania = isVisibilidadCeldaCopiarTipoCompania;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoCompania() {
		return isVisibilidadCeldaVerFormTipoCompania;
	}

	public void setIsVisibilidadCeldaVerFormTipoCompania(Boolean isVisibilidadCeldaVerFormTipoCompania) {
		this.isVisibilidadCeldaVerFormTipoCompania = isVisibilidadCeldaVerFormTipoCompania;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoCompania() {
		return isVisibilidadCeldaOrdenTipoCompania;
	}

	public void setIsVisibilidadCeldaOrdenTipoCompania(Boolean isVisibilidadCeldaOrdenTipoCompania) {
		this.isVisibilidadCeldaOrdenTipoCompania = isVisibilidadCeldaOrdenTipoCompania;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoCompania() {
		return isVisibilidadCeldaNuevoRelacionesTipoCompania;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoCompania(Boolean isVisibilidadCeldaNuevoRelacionesTipoCompania) {
		this.isVisibilidadCeldaNuevoRelacionesTipoCompania = isVisibilidadCeldaNuevoRelacionesTipoCompania;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoCompania() {
		return isVisibilidadCeldaModificarTipoCompania;
	}

	public void setIsVisibilidadCeldaModificarTipoCompania(Boolean isVisibilidadCeldaModificarTipoCompania) {
		this.isVisibilidadCeldaModificarTipoCompania = isVisibilidadCeldaModificarTipoCompania;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoCompania() {
		return isVisibilidadCeldaActualizarTipoCompania;
	}

	public void setIsVisibilidadCeldaActualizarTipoCompania(Boolean isVisibilidadCeldaActualizarTipoCompania) {
		this.isVisibilidadCeldaActualizarTipoCompania = isVisibilidadCeldaActualizarTipoCompania;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoCompania() {
		return isVisibilidadCeldaEliminarTipoCompania;
	}

	public void setIsVisibilidadCeldaEliminarTipoCompania(Boolean isVisibilidadCeldaEliminarTipoCompania) {
		this.isVisibilidadCeldaEliminarTipoCompania = isVisibilidadCeldaEliminarTipoCompania;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoCompania() {
		return isVisibilidadCeldaCancelarTipoCompania;
	}

	public void setIsVisibilidadCeldaCancelarTipoCompania(Boolean isVisibilidadCeldaCancelarTipoCompania) {
		this.isVisibilidadCeldaCancelarTipoCompania = isVisibilidadCeldaCancelarTipoCompania;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoCompania() {
		return isVisibilidadCeldaGuardarTipoCompania;
	}

	public void setIsVisibilidadCeldaGuardarTipoCompania(Boolean isVisibilidadCeldaGuardarTipoCompania) {
		this.isVisibilidadCeldaGuardarTipoCompania = isVisibilidadCeldaGuardarTipoCompania;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoCompania() {
		return isVisibilidadCeldaGuardarCambiosTipoCompania;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoCompania(Boolean isVisibilidadCeldaGuardarCambiosTipoCompania) {
		this.isVisibilidadCeldaGuardarCambiosTipoCompania = isVisibilidadCeldaGuardarCambiosTipoCompania;
	}
		
	public TipoCompaniaSessionBean gettipocompaniaSessionBean() {
		return this.tipocompaniaSessionBean;
	}
	
	public void settipocompaniaSessionBean(TipoCompaniaSessionBean tipocompaniaSessionBean) {
		this.tipocompaniaSessionBean=tipocompaniaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoCompania(TipoCompania tipocompania)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipocompania,null);
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
	
	public void bugActualizarReferenciaActual(TipoCompania tipocompania,TipoCompania tipocompaniaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoCompania(tipocompania);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipocompaniaAux.setId(tipocompania.getId());
		tipocompaniaAux.setVersionRow(tipocompania.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoCompania();
		
			int intSelectedRow = this.jTableDatosTipoCompania.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompania =(TipoCompania) this.tipocompaniaLogic.getTipoCompanias().toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipocompania =(TipoCompania) this.tipocompanias.toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoCompaniaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoCompania(this.tipocompania,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCompania(this.tipocompania);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipocompaniaValidator.getInvalidValues(this.tipocompania);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipocompaniaLogic.setDatosCliente(datosCliente);
			tipocompaniaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipocompaniaAux=new  TipoCompania();
				
				tipocompaniaAux.setIsNew(true);
				tipocompaniaAux.setIsChanged(true);
				
				tipocompaniaAux.setTipoCompaniaOriginal(this.tipocompania);
				
				tipocompaniaAux.setId(this.tipocompania.getId());	
				tipocompaniaAux.setVersionRow(this.tipocompania.getVersionRow());	
				tipocompaniaAux.setid_empresa(this.tipocompania.getid_empresa());	
				tipocompaniaAux.setcodigo(this.tipocompania.getcodigo());	
				tipocompaniaAux.setnombre(this.tipocompania.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocompaniaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocompaniaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipocompaniaAux,tipocompaniaLogic.getTipoCompanias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocompaniaAux,tipocompanias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipocompaniaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocompaniaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocompaniaLogic.saveTipoCompanias();//WithConnection
						//tipocompaniaLogic.getSetVersionRowTipoCompanias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocompania,tipocompaniaAux);
					
					this.refrescarForeignKeysDescripcionesTipoCompania();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocompaniaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucionLogic.getDatoConstitucions().addAll(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucions.addAll(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucionsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocompaniaLogic.saveTipoCompaniaRelaciones(tipocompaniaAux,this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucionLogic.getDatoConstitucions());//WithConnection
								//tipocompaniaLogic.getSetVersionRowTipoCompanias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipocompania,tipocompaniaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucionLogic.setDatoConstitucions(new ArrayList<DatoConstitucion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucions= new ArrayList<DatoConstitucion>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocompaniaAux.setDatoConstitucions(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucionLogic.getDatoConstitucions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipocompaniaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipocompaniaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipocompaniaAux,tipocompaniaLogic.getTipoCompanias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipocompaniaAux,tipocompanias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipocompania,tipocompaniaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipocompaniaAux=new  TipoCompania();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipocompaniaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipocompaniaSessionBean.getEsGuardarRelacionado() && this.tipocompania.getId()>=0)) {
						
					tipocompaniaAux.setIsNew(false);
				}
				
				tipocompaniaAux.setIsDeleted(false);
			
				tipocompaniaAux.setId(this.tipocompania.getId());	
				tipocompaniaAux.setVersionRow(this.tipocompania.getVersionRow());	
				tipocompaniaAux.setid_empresa(this.tipocompania.getid_empresa());	
				tipocompaniaAux.setcodigo(this.tipocompania.getcodigo());	
				tipocompaniaAux.setnombre(this.tipocompania.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocompaniaAux,tipocompaniaLogic.getTipoCompanias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocompaniaAux,tipocompanias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipocompaniaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocompaniaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocompaniaLogic.saveTipoCompanias();//WithConnection
						//tipocompaniaLogic.getSetVersionRowTipoCompanias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocompania,tipocompaniaAux);
					
					this.refrescarForeignKeysDescripcionesTipoCompania();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocompaniaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucionLogic.getDatoConstitucions().addAll(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucions.addAll(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucionsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocompaniaLogic.saveTipoCompaniaRelaciones(tipocompaniaAux,this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucionLogic.getDatoConstitucions());//WithConnection
								//tipocompaniaLogic.getSetVersionRowTipoCompanias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipocompania,tipocompaniaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucionLogic.setDatoConstitucions(new ArrayList<DatoConstitucion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucions= new ArrayList<DatoConstitucion>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocompaniaAux.setDatoConstitucions(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucionLogic.getDatoConstitucions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipocompaniaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipocompaniaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipocompaniaAux,tipocompaniaLogic.getTipoCompanias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipocompaniaAux,tipocompanias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipocompania,tipocompaniaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipocompaniaAux=new  TipoCompania();
				
				tipocompaniaAux.setIsNew(false);
				tipocompaniaAux.setIsChanged(false);
				
				tipocompaniaAux.setIsDeleted(true);
				
				tipocompaniaAux.setId(this.tipocompania.getId());	
				tipocompaniaAux.setVersionRow(this.tipocompania.getVersionRow());	
				tipocompaniaAux.setid_empresa(this.tipocompania.getid_empresa());	
				tipocompaniaAux.setcodigo(this.tipocompania.getcodigo());	
				tipocompaniaAux.setnombre(this.tipocompania.getnombre());	
				
				if(this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipocompaniaAux.getId()>=0) {	
						this.tipocompaniasEliminados.add(tipocompaniaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipocompaniaAux,tipocompaniaLogic.getTipoCompanias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocompaniaAux,tipocompanias);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipocompaniaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocompaniaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocompaniaLogic.saveTipoCompanias();//WithConnection
						//tipocompaniaLogic.getSetVersionRowTipoCompanias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocompaniaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucionLogic.getDatoConstitucions().addAll(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucions.addAll(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucionsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocompaniaLogic.saveTipoCompaniaRelaciones(tipocompaniaAux,this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucionLogic.getDatoConstitucions());//WithConnection
								//tipocompaniaLogic.getSetVersionRowTipoCompanias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucionLogic.setDatoConstitucions(new ArrayList<DatoConstitucion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucions= new ArrayList<DatoConstitucion>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocompaniaAux.setDatoConstitucions(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucionLogic.getDatoConstitucions());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipocompaniaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipocompaniaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipocompaniaAux,tipocompaniaLogic.getTipoCompanias());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipocompaniaAux,tipocompanias);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompaniaLogic.getTipoCompanias().addAll(this.tipocompaniasEliminados);
					
					tipocompaniaLogic.saveTipoCompanias();//WithConnection
					//tipocompaniaLogic.getSetVersionRowTipoCompanias();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoCompania();
				
				this.tipocompaniasEliminados= new ArrayList<TipoCompania>();		
			}
			
			if(this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Compania GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Compania",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipocompania=tipocompaniaAux;
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
      		//this.finishProcessTipoCompania();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoCompania tipocompaniaLocal) throws Exception {
		
		if(this.tipocompaniaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipocompaniaLocal.setDatoConstitucions(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucionLogic.getDatoConstitucions());
			
			} else {
			
				tipocompaniaLocal.setDatoConstitucions(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucions);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoCompania tipocompaniaLocal) throws Exception {	
		if(this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipocompaniaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoCompaniaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoCompania.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocompania =(TipoCompania) this.tipocompaniaLogic.getTipoCompanias().toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipocompania =(TipoCompania) this.tipocompanias.toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipocompaniaValidator.getInvalidValues(this.tipocompania);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoCompania tipocompania,List<TipoCompania> tipocompanias) throws Exception {
		try	{		
			TipoCompaniaConstantesFunciones.actualizarLista(tipocompania,tipocompanias,this.tipocompaniaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoCompania tipocompania,List<TipoCompania> tipocompanias) throws Exception {
		try	{			
			TipoCompaniaConstantesFunciones.actualizarSelectedLista(tipocompania,tipocompanias);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoCompania> tipocompaniasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipocompaniasLocal=this.tipocompaniaLogic.getTipoCompanias();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipocompaniasLocal=this.tipocompanias;
			}
			//ARCHITECTURE
		
			for(TipoCompania tipocompaniaLocal:tipocompaniasLocal) {
				if(this.permiteMantenimiento(tipocompaniaLocal) && tipocompaniaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoCompaniaConstantesFunciones.getTipoCompaniaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoCompaniaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCompania.jLabelid_empresaTipoCompania,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCompaniaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCompania.jLabelcodigoTipoCompania,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCompaniaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCompania.jLabelnombreTipoCompania,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoCompania!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCompania.jLabelid_empresaTipoCompania,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCompania.jLabelcodigoTipoCompania,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCompania.jLabelnombreTipoCompania,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DatoConstitucion")) {
			if(this.tipocompania==null) {
				this.tipocompania= new TipoCompania();
			}

			if(this.tipocompaniaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoCompania
				this.setVariablesFormularioToObjetoActualTipoCompania(this.tipocompania,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCompania(this.tipocompania);

				this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.getdatoconstitucion().setTipoCompania(this.tipocompania);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoCompania--;	
		
		
		this.tipocompaniaAux=new TipoCompania();
		
		this.tipocompaniaAux.setId(this.iIdNuevoTipoCompania);
		this.tipocompaniaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocompaniaLogic.getTipoCompanias().add(this.tipocompaniaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipocompanias.add(this.tipocompaniaAux);
		}
		//ARCHITECTURE
		
		this.tipocompania=this.tipocompaniaAux;
		
		if(TipoCompaniaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoCompania(this.tipocompania);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCompania(this.tipocompania);
		}
				
		//this.setDefaultControlesTipoCompania();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoCompania();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoCompania();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCompania();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCompania(this.tipocompaniaBean,this.tipocompania,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCompania(this.tipocompania);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoCompaniaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipocompaniaSessionBean.getConGuardarRelaciones()) {
			classes=TipoCompaniaConstantesFunciones.getClassesRelationshipsOfTipoCompania(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipocompaniaReturnGeneral=tipocompaniaLogic.procesarEventosTipoCompaniasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocompaniaLogic.getTipoCompanias(),this.tipocompania,this.tipocompaniaParameterGeneral,this.isEsNuevoTipoCompania,classes);//this.tipocompaniaLogic.getTipoCompania()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoCompania(this.tipocompaniaReturnGeneral,this.tipocompaniaBean,false);
		
		if(this.tipocompaniaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCompania(this.tipocompaniaReturnGeneral.getTipoCompania());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoCompania(this.tipocompaniaReturnGeneral.getTipoCompania());
		}
		
		if(this.tipocompaniaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoCompania(this.tipocompaniaReturnGeneral.getTipoCompania(),classes);//this.tipocompaniaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoCompania(this.tipocompania,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoCompania();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoCompania();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCompaniaBeanSwingJInternalFrameAdditional.RecargarFormTipoCompania(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoCompania(false);
						
			if(tipocompaniaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucionSessionBean.getEsGuardarRelacionado() && DatoConstitucionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDatoConstitucionActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoCompaniaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCompania();
			}
			
			this.actualizarVisualTableDatosTipoCompania();
			
			this.jTableDatosTipoCompania.setRowSelectionInterval(this.getIndiceNuevoTipoCompania(), this.getIndiceNuevoTipoCompania());
			
			this.seleccionarFilaTablaTipoCompaniaActual();
						
			this.actualizarEstadoCeldasBotonesTipoCompania("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoCompania(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoCompania.jTextFieldcodigoTipoCompania.setEnabled(isHabilitar && this.tipocompaniaConstantesFunciones.activarcodigoTipoCompania);
		this.jInternalFrameDetalleFormTipoCompania.jTextAreanombreTipoCompania.setEnabled(isHabilitar && this.tipocompaniaConstantesFunciones.activarnombreTipoCompania);	
		//
		this.jInternalFrameDetalleFormTipoCompania.jComboBoxid_empresaTipoCompania.setEnabled(isHabilitar && this.tipocompaniaConstantesFunciones.activarid_empresaTipoCompania);
	};
	
	public void setDefaultControlesTipoCompania() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoCompania(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipocompaniaSessionBean.setConGuardarRelaciones(true);			
			this.tipocompaniaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoCompania.jTabbedPaneRelacionesTipoCompania.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipocompaniaSessionBean.setConGuardarRelaciones(false);			
			this.tipocompaniaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoCompania.jTabbedPaneRelacionesTipoCompania.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoCompania() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCompania tipocompaniaAux:this.tipocompaniaLogic.getTipoCompanias()) {
				if(tipocompaniaAux.getId().equals(this.iIdNuevoTipoCompania)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCompania tipocompaniaAux:this.tipocompanias) {
				if(tipocompaniaAux.getId().equals(this.iIdNuevoTipoCompania)) {
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
	
	public int getIndiceActualTipoCompania(TipoCompania tipocompania,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCompania tipocompaniaAux:this.tipocompaniaLogic.getTipoCompanias()) {
				if(tipocompaniaAux.getId().equals(tipocompania.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCompania tipocompaniaAux:this.tipocompanias) {
				if(tipocompaniaAux.getId().equals(tipocompania.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoCompania(TipoCompania tipocompaniaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCompania tipocompaniaAux:this.tipocompaniaLogic.getTipoCompanias()) {
				if(tipocompaniaAux.getTipoCompaniaOriginal().getId().equals(tipocompaniaOriginal.getId())) {
					existe=true;
					tipocompaniaOriginal.setId(tipocompaniaAux.getId());
					tipocompaniaOriginal.setVersionRow(tipocompaniaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCompania tipocompaniaAux:this.tipocompanias) {
				if(tipocompaniaAux.getTipoCompaniaOriginal().getId().equals(tipocompaniaOriginal.getId())) {
					existe=true;
					tipocompaniaOriginal.setId(tipocompaniaAux.getId());
					tipocompaniaOriginal.setVersionRow(tipocompaniaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoCompania(Boolean esParaCancelar) throws Exception {
		tipocompaniasAux=new ArrayList<TipoCompania>();
		tipocompaniaAux=new TipoCompania();
		
		if(!this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCompania tipocompaniaAux:this.tipocompaniaLogic.getTipoCompanias()) {
					if(tipocompaniaAux.getId()<0) {
						tipocompaniasAux.add(tipocompaniaAux);
					}		
				}
				this.iIdNuevoTipoCompania=0L;
				this.tipocompaniaLogic.getTipoCompanias().removeAll(tipocompaniasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCompania tipocompaniaAux:this.tipocompanias) {
					if(tipocompaniaAux.getId()<0) {
						tipocompaniasAux.add(tipocompaniaAux);
					}		
				}
				this.iIdNuevoTipoCompania=0L;
				this.tipocompanias.removeAll(tipocompaniasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoCompania 
					&& this.tipocompaniaLogic.getTipoCompanias().size()>0
					) {
					tipocompaniaAux=this.tipocompaniaLogic.getTipoCompanias().get(this.tipocompaniaLogic.getTipoCompanias().size() - 1);
				
					if(tipocompaniaAux.getId()<0) {
						this.tipocompaniaLogic.getTipoCompanias().remove(tipocompaniaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoCompania && this.tipocompanias.size()>0) {
					tipocompaniaAux=this.tipocompanias.get(this.tipocompanias.size() - 1);
				
					if(tipocompaniaAux.getId()<0) {
						this.tipocompanias.remove(tipocompaniaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoCompania(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipocompania.getId()<0) {
				this.tipocompaniaLogic.getTipoCompanias().remove(this.tipocompania);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipocompania.getId()<0) {
				this.tipocompanias.remove(this.tipocompania);
			}
		}			
	}
	
	public void setEstadosInicialesTipoCompania(List<TipoCompania> tipocompaniasAux) throws Exception {
		TipoCompaniaConstantesFunciones.setEstadosInicialesTipoCompania(tipocompaniasAux);
	}
	
	public void setEstadosInicialesTipoCompania(TipoCompania tipocompaniaAux) throws Exception {
		TipoCompaniaConstantesFunciones.setEstadosInicialesTipoCompania(tipocompaniaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoCompaniaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoCompania("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoCompaniaActual()) {
				if(!this.isEsNuevoTipoCompania) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoCompania("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoCompania=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoCompaniaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Compania ?", "MANTENIMIENTO DE Tipo Compania", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoCompania("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoCompania tipocompania) throws Exception {
		TipoCompaniaConstantesFunciones.seleccionarAsignar(this.tipocompania,tipocompania);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoCompania=this.isPermisoActualizarOriginalTipoCompania;
			
			
			this.seleccionarAsignar(tipocompania);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCompaniaConstantesFunciones.quitarEspaciosTipoCompania(this.tipocompania,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoCompania("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipocompaniaSessionBean.setsFuncionBusquedaRapida(this.tipocompaniaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoCompania) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoCompania(esParaCancelar);				
				this.cancelarNuevoTipoCompania(esParaCancelar);								
			}
			
			this.tipocompania=new TipoCompania();
			
			this.inicializarTipoCompania();
			
			this.actualizarEstadoCeldasBotonesTipoCompania("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoCompania() throws Exception {
		try {
			TipoCompaniaConstantesFunciones.inicializarTipoCompania(this.tipocompania);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipocompaniaLogic.getTipoCompanias().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoCompanias(String sAccionBusqueda,List<TipoCompania> tipocompaniasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoCompania"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoCompaniaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoCompaniaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoCompania"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Companias");		
		parameters.put("busquedapor", TipoCompaniaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DatoConstitucion.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoCompaniaLogic tipocompaniaLogicAuxiliar=new TipoCompaniaLogic();
					tipocompaniaLogicAuxiliar.setDatosCliente(tipocompaniaLogic.getDatosCliente());				
					tipocompaniaLogicAuxiliar.setTipoCompanias(tipocompaniasParaReportes);
					
					tipocompaniaLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoCompaniaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipocompaniasParaReportes=tipocompaniaLogicAuxiliar.getTipoCompanias();
					
					//tipocompaniaLogic.getNewConnexionToDeep();
					
					//for (TipoCompania tipocompania:tipocompaniasParaReportes) {
					//	tipocompaniaLogic.deepLoad(tipocompania, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipocompaniaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipocompaniaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDatoConstitucion = AuxiliarReportes.class.getResourceAsStream("DatoConstitucionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_datoconstitucion", reportFileDatoConstitucion);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoCompania=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoCompaniaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoCompaniaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoCompania=new JRBeanArrayDataSource(TipoCompaniaJInternalFrame.TraerTipoCompaniaBeans(tipocompaniasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoCompania);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoCompaniaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoCompaniaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoCompaniaBean.TraerTipoCompaniaBeans(tipocompaniasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoCompanias(sAccionBusqueda,sTipoArchivoReporte,tipocompaniasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoCompanias(sAccionBusqueda,sTipoArchivoReporte,tipocompaniasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoCompaniaActionPerformed(null);
					//this.generarExcelReporteTipoCompanias(sAccionBusqueda,sTipoArchivoReporte,tipocompaniasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoCompanias(sAccionBusqueda,sTipoArchivoReporte,tipocompaniasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoCompanias(sAccionBusqueda,sTipoArchivoReporte,tipocompaniasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoCompanias(sAccionBusqueda,sTipoArchivoReporte,tipocompaniasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoCompanias(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCompania> tipocompaniasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocompania";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCompanias");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCompania("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoCompania tipocompania : tipocompaniasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoCompaniaConstantesFunciones.generarExcelReporteDataTipoCompania("NORMAL",row,workbook,tipocompania,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Compania",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoCompania(String sTipo,Row row,Workbook workbook) {
		
		TipoCompaniaConstantesFunciones.generarExcelReporteHeaderTipoCompania(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoCompanias(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCompania> tipocompaniasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocompania_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCompanias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoCompania tipocompania : tipocompaniasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoCompaniaConstantesFunciones.getTipoCompaniaDescripcion(tipocompania));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCompaniaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCompaniaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocompania.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCompaniaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCompaniaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocompania.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCompaniaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCompaniaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocompania.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Compania",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoCompanias(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCompania> tipocompaniasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoCompania> tipocompaniasRespaldo=null;
		
		classes=TipoCompaniaConstantesFunciones.getClassesRelationshipsOfTipoCompania(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipocompaniaLogic.setDatosCliente(this.datosCliente);
		this.tipocompaniaLogic.setDatosDeep(this.datosDeep);
		this.tipocompaniaLogic.setIsConDeep(true);
		
		tipocompaniasRespaldo=this.tipocompaniaLogic.getTipoCompanias();
		
		this.tipocompaniaLogic.setTipoCompanias(tipocompaniasParaReportes);	
		this.tipocompaniaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipocompaniasParaReportes=this.tipocompaniaLogic.getTipoCompanias();
		this.tipocompaniaLogic.setTipoCompanias(tipocompaniasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocompania_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCompanias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCompania("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoCompania tipocompania : tipocompaniasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoCompania("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoCompaniaConstantesFunciones.generarExcelReporteDataTipoCompania("NORMAL",row,workbook,tipocompania,cellStyleDataAux);
		
			
			


				//DatoConstitucion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DatoConstitucionConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipocompania.getDatoConstitucions()!=null && tipocompania.getDatoConstitucions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DatoConstitucionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DatoConstitucionConstantesFunciones.generarExcelReporteHeaderDatoConstitucion("RELACIONADO",row,workbook);
				}

				if(tipocompania.getDatoConstitucions()!=null) {
					i2=0;
					for(DatoConstitucion datoconstitucion : tipocompania.getDatoConstitucions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DatoConstitucionConstantesFunciones.generarExcelReporteDataDatoConstitucion("RELACIONADO",row,workbook,datoconstitucion,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoCompaniaConstantesFunciones.getTipoCompaniaDescripcion(tipocompania));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Compania",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCompania.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCompania.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCompania.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCompania.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoCompania() throws Exception {		
		this.startProcessTipoCompania(true);
	}
	
	public void startProcessTipoCompania(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoCompania ,this.jPanelParametrosReportesTipoCompania, this.jScrollPanelDatosTipoCompania,this.jPanelPaginacionTipoCompania, this.jScrollPanelDatosEdicionTipoCompania, this.jPanelAccionesTipoCompania,this.jPanelAccionesFormularioTipoCompania,this.jmenuBarTipoCompania,this.jmenuBarDetalleTipoCompania,this.jTtoolBarTipoCompania,this.jTtoolBarDetalleTipoCompania);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCompania=this.jTabbedPaneBusquedasTipoCompania; 
		
		final JPanel jPanelParametrosReportesTipoCompania=this.jPanelParametrosReportesTipoCompania;
		//final JScrollPane jScrollPanelDatosTipoCompania=this.jScrollPanelDatosTipoCompania;
		final JTable jTableDatosTipoCompania=this.jTableDatosTipoCompania;		
		final JPanel jPanelPaginacionTipoCompania=this.jPanelPaginacionTipoCompania;
		//final JScrollPane jScrollPanelDatosEdicionTipoCompania=this.jScrollPanelDatosEdicionTipoCompania;
		final JPanel jPanelAccionesTipoCompania=this.jPanelAccionesTipoCompania;
		
		JPanel jPanelCamposAuxiliarTipoCompania=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoCompania=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoCompania!=null) {
			jPanelCamposAuxiliarTipoCompania=this.jInternalFrameDetalleFormTipoCompania.jPanelCamposTipoCompania;
			jPanelAccionesFormularioAuxiliarTipoCompania=this.jInternalFrameDetalleFormTipoCompania.jPanelAccionesFormularioTipoCompania;
		}
		
		final JPanel jPanelCamposTipoCompania=jPanelCamposAuxiliarTipoCompania;
		final JPanel jPanelAccionesFormularioTipoCompania=jPanelAccionesFormularioAuxiliarTipoCompania;
		
		
		final JMenuBar jmenuBarTipoCompania=this.jmenuBarTipoCompania;
		final JToolBar jTtoolBarTipoCompania=this.jTtoolBarTipoCompania;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoCompania=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCompania=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoCompania!=null) {
			jmenuBarDetalleAuxiliarTipoCompania=this.jInternalFrameDetalleFormTipoCompania.jmenuBarDetalleTipoCompania;
			jTtoolBarDetalleAuxiliarTipoCompania=this.jInternalFrameDetalleFormTipoCompania.jTtoolBarDetalleTipoCompania;
		}
		
		final JMenuBar jmenuBarDetalleTipoCompania=jmenuBarDetalleAuxiliarTipoCompania;
		final JToolBar jTtoolBarDetalleTipoCompania=jTtoolBarDetalleAuxiliarTipoCompania;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCompania;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCompania;
			processRunnable.jTableDatos=jTableDatosTipoCompania;
			processRunnable.jPanelCampos=jPanelCamposTipoCompania;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCompania;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCompania;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCompania;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCompania;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCompania;
			processRunnable.jTtoolBar=jTtoolBarTipoCompania;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCompania;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCompania ,jPanelParametrosReportesTipoCompania,jTableDatosTipoCompania, /*jScrollPanelDatosTipoCompania,*/jPanelCamposTipoCompania,jPanelPaginacionTipoCompania, /*jScrollPanelDatosEdicionTipoCompania,*/ jPanelAccionesTipoCompania,jPanelAccionesFormularioTipoCompania,jmenuBarTipoCompania,jmenuBarDetalleTipoCompania,jTtoolBarTipoCompania,jTtoolBarDetalleTipoCompania);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCompania ,jPanelParametrosReportesTipoCompania, jScrollPanelDatosTipoCompania,jPanelPaginacionTipoCompania, jScrollPanelDatosEdicionTipoCompania, jPanelAccionesTipoCompania,jPanelAccionesFormularioTipoCompania,jmenuBarTipoCompania,jmenuBarDetalleTipoCompania,jTtoolBarTipoCompania,jTtoolBarDetalleTipoCompania);
						
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
	
	public void finishProcessTipoCompania() {// throws Exception 
		this.finishProcessTipoCompania(true);
	}
	
	public void finishProcessTipoCompania(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoCompania ,this.jPanelParametrosReportesTipoCompania, this.jScrollPanelDatosTipoCompania,this.jPanelPaginacionTipoCompania, this.jScrollPanelDatosEdicionTipoCompania, this.jPanelAccionesTipoCompania,this.jPanelAccionesFormularioTipoCompania,this.jmenuBarTipoCompania,this.jmenuBarDetalleTipoCompania,this.jTtoolBarTipoCompania,this.jTtoolBarDetalleTipoCompania);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCompania=this.jTabbedPaneBusquedasTipoCompania; 
		
		final JPanel jPanelParametrosReportesTipoCompania=this.jPanelParametrosReportesTipoCompania;
		//final JScrollPane jScrollPanelDatosTipoCompania=this.jScrollPanelDatosTipoCompania;
		final JTable jTableDatosTipoCompania=this.jTableDatosTipoCompania;		
		final JPanel jPanelPaginacionTipoCompania=this.jPanelPaginacionTipoCompania;
		//final JScrollPane jScrollPanelDatosEdicionTipoCompania=this.jScrollPanelDatosEdicionTipoCompania;
		final JPanel jPanelAccionesTipoCompania=this.jPanelAccionesTipoCompania;
		
		JPanel jPanelCamposAuxiliarTipoCompania=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoCompania=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoCompania!=null) {
			jPanelCamposAuxiliarTipoCompania=this.jInternalFrameDetalleFormTipoCompania.jPanelCamposTipoCompania;
			jPanelAccionesFormularioAuxiliarTipoCompania=this.jInternalFrameDetalleFormTipoCompania.jPanelAccionesFormularioTipoCompania;
		}
		
		final JPanel jPanelCamposTipoCompania=jPanelCamposAuxiliarTipoCompania;
		final JPanel jPanelAccionesFormularioTipoCompania=jPanelAccionesFormularioAuxiliarTipoCompania;
		
		
		final JMenuBar jmenuBarTipoCompania=this.jmenuBarTipoCompania;		
		final JToolBar jTtoolBarTipoCompania=this.jTtoolBarTipoCompania;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoCompania=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCompania=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoCompania!=null) {
			jmenuBarDetalleAuxiliarTipoCompania=this.jInternalFrameDetalleFormTipoCompania.jmenuBarDetalleTipoCompania;
			jTtoolBarDetalleAuxiliarTipoCompania=this.jInternalFrameDetalleFormTipoCompania.jTtoolBarDetalleTipoCompania;		
		}
		
		final JMenuBar jmenuBarDetalleTipoCompania=jmenuBarDetalleAuxiliarTipoCompania;
		final JToolBar jTtoolBarDetalleTipoCompania=jTtoolBarDetalleAuxiliarTipoCompania;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCompania;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCompania;
			processRunnable.jTableDatos=jTableDatosTipoCompania;
			processRunnable.jPanelCampos=jPanelCamposTipoCompania;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCompania;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCompania;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCompania;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCompania;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCompania;
			processRunnable.jTtoolBar=jTtoolBarTipoCompania;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCompania;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoCompania ,jPanelParametrosReportesTipoCompania, jTableDatosTipoCompania,/*jScrollPanelDatosTipoCompania,*/jPanelCamposTipoCompania,jPanelPaginacionTipoCompania, /*jScrollPanelDatosEdicionTipoCompania,*/ jPanelAccionesTipoCompania,jPanelAccionesFormularioTipoCompania,jmenuBarTipoCompania,jmenuBarDetalleTipoCompania,jTtoolBarTipoCompania,jTtoolBarDetalleTipoCompania));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoCompania(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoCompania(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoCompania(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoCompania(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoCompania,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoCompania,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoCompania(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoCompania,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoCompania,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipocompaniaConstantesFunciones.getsFinalQueryTipoCompania();
		String  finalQueryPaginacionTodos=this.tipocompaniaConstantesFunciones.getsFinalQueryTipoCompania();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoCompaniaConstantesFunciones.getArrayColumnasGlobalesNoTipoCompania(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoCompaniaConstantesFunciones.getArrayColumnasGlobalesTipoCompania(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoCompaniaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipocompaniasEliminados= new ArrayList<TipoCompania>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoCompania();
		
				///*TipoCompaniaSessionBean*/this.tipocompaniaSessionBean=new TipoCompaniaSessionBean();
			
			if(this.tipocompaniaSessionBean==null) {
				this.tipocompaniaSessionBean=new TipoCompaniaSessionBean();
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
					this.iNumeroPaginacion=TipoCompaniaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoCompaniaConstantesFunciones.getClassesForeignKeysOfTipoCompania(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipocompania."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipocompaniasAux= new ArrayList<TipoCompania>();
			
				
			tipocompaniaLogic.setDatosCliente(this.datosCliente);
			tipocompaniaLogic.setDatosDeep(this.datosDeep);
			tipocompaniaLogic.setIsConDeep(true);
			
			
			tipocompaniaLogic.getTipoCompaniaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipocompaniaLogic.getTodosTipoCompanias(finalQueryGlobal,pagination);
					
					//tipocompaniaLogic.getTodosTipoCompaniasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipocompaniaLogic.getTipoCompanias()==null|| tipocompaniaLogic.getTipoCompanias().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocompaniasAux= new ArrayList<TipoCompania>();
							tipocompaniasAux.addAll(tipocompaniaLogic.getTipoCompanias());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocompaniasAux= new ArrayList<TipoCompania>();
							tipocompaniasAux.addAll(tipocompanias);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocompaniaLogic.getTodosTipoCompanias(finalQueryGlobal+"",this.pagination);												
							
							//tipocompaniaLogic.getTodosTipoCompaniasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoCompanias("Todos",tipocompaniaLogic.getTipoCompanias() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocompaniaLogic.setTipoCompanias(new ArrayList<TipoCompania>());					
							tipocompaniaLogic.getTipoCompanias().addAll(tipocompaniasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocompanias=new ArrayList<TipoCompania>();
							tipocompanias.addAll(tipocompaniasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoCompania=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoCompania=this.idActual;
				
				} else if(this.idTipoCompaniaActual!=null && this.idTipoCompaniaActual!=0L) {
					idTipoCompania=idTipoCompaniaActual;
				}
				
					
				this.sDetalleReporte=TipoCompaniaConstantesFunciones.getDetalleIndicePorId(idTipoCompania);
				
				this.tipocompanias=new ArrayList<TipoCompania>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipocompaniaLogic.getEntity(idTipoCompania);
					
					//tipocompaniaLogic.getEntityWithConnection(idTipoCompania);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocompaniaLogic.setTipoCompanias(new ArrayList<TipoCompania>());
					tipocompaniaLogic.getTipoCompanias().add(tipocompaniaLogic.getTipoCompania());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocompanias=new ArrayList<TipoCompania>();
					this.tipocompanias.add(tipocompania);
				}
				
				if(tipocompaniaLogic.getTipoCompania()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoCompaniaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocompaniaLogic.getTipoCompaniasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCompaniaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCompaniaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocompaniaLogic.getTipoCompanias()==null||tipocompaniaLogic.getTipoCompanias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocompanias==null|| tipocompanias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocompaniasAux=new ArrayList<TipoCompania>();
						tipocompaniasAux.addAll(tipocompaniaLogic.getTipoCompanias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocompaniasAux=new ArrayList<TipoCompania>();
							tipocompaniasAux.addAll(tipocompanias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocompaniaLogic.getTipoCompaniasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCompaniaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCompaniaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoCompanias("FK_IdEmpresa",tipocompaniaLogic.getTipoCompanias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoCompanias("FK_IdEmpresa",tipocompanias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocompaniaLogic.setTipoCompanias(new ArrayList<TipoCompania>());
						tipocompaniaLogic.getTipoCompanias().addAll(tipocompaniasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocompanias=new ArrayList<TipoCompania>();
							tipocompanias.addAll(tipocompaniasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoCompania();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoCompania();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocompaniaLogic.getTipoCompanias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocompanias.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocompaniaLogic.getTipoCompanias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocompanias.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoCompania tipocompania) {
		Boolean permite=true;
		
		if(this.tipocompania.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoCompaniaConstantesFunciones.getOrderByListaTipoCompania();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoCompaniaConstantesFunciones.getOrderByListaTipoCompania();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCompania tipocompania:tipocompaniaLogic.getTipoCompanias()) {
				if(tipocompania.getsType().equals(Constantes2.S_TOTALES)) {
					tipocompaniaTotales=tipocompania;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCompania tipocompania:this.tipocompanias) {
				if(tipocompania.getsType().equals(Constantes2.S_TOTALES)) {
					tipocompaniaTotales=tipocompania;
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
			this.tipocompaniaAux=new TipoCompania();
			this.tipocompaniaAux.setsType(Constantes2.S_TOTALES);
			this.tipocompaniaAux.setIsNew(false);
			this.tipocompaniaAux.setIsChanged(false);
			this.tipocompaniaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoCompaniaConstantesFunciones.TotalizarValoresFilaTipoCompania(this.tipocompaniaLogic.getTipoCompanias(),this.tipocompaniaAux);
				
				this.tipocompaniaLogic.getTipoCompanias().add(this.tipocompaniaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoCompaniaConstantesFunciones.TotalizarValoresFilaTipoCompania(this.tipocompanias,this.tipocompaniaAux);
				
				this.tipocompanias.add(this.tipocompaniaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipocompaniaTotales=new TipoCompania();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocompaniaLogic.getTipoCompanias().remove(tipocompaniaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocompanias.remove(tipocompaniaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipocompaniaTotales=new TipoCompania();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCompania tipocompania:tipocompaniaLogic.getTipoCompanias()) {
				if(tipocompania.getsType().equals(Constantes2.S_TOTALES)) {
					tipocompaniaTotales=tipocompania;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCompaniaConstantesFunciones.TotalizarValoresFilaTipoCompania(this.tipocompaniaLogic.getTipoCompanias(),tipocompaniaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCompania tipocompania:this.tipocompanias) {
				if(tipocompania.getsType().equals(Constantes2.S_TOTALES)) {
					tipocompaniaTotales=tipocompania;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCompaniaConstantesFunciones.TotalizarValoresFilaTipoCompania(this.tipocompanias,tipocompaniaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoCompaniasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoCompaniasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocompaniaLogic.getTipoCompaniasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoCompania() {
		this.isPermisoTodoTipoCompania=false;
		this.isPermisoNuevoTipoCompania=false;
		this.isPermisoActualizarTipoCompania=false;
		this.isPermisoActualizarOriginalTipoCompania=false;
		this.isPermisoEliminarTipoCompania=false;
		this.isPermisoGuardarCambiosTipoCompania=false;
		this.isPermisoConsultaTipoCompania=false;
		this.isPermisoBusquedaTipoCompania=false;
		this.isPermisoReporteTipoCompania=false;		
		this.isPermisoOrdenTipoCompania=false;		
		this.isPermisoPaginacionMedioTipoCompania=false;		
		this.isPermisoPaginacionAltoTipoCompania=false;
		this.isPermisoPaginacionTodoTipoCompania=false;
		this.isPermisoCopiarTipoCompania=false;		
		this.isPermisoVerFormTipoCompania=false;		
		this.isPermisoDuplicarTipoCompania=false;		
		this.isPermisoOrdenTipoCompania=false;		
	}
	
	public void setPermisosUsuarioTipoCompania(Boolean isPermiso) {
		this.isPermisoTodoTipoCompania=isPermiso;
		this.isPermisoNuevoTipoCompania=isPermiso;
		this.isPermisoActualizarTipoCompania=isPermiso;
		this.isPermisoActualizarOriginalTipoCompania=isPermiso;
		this.isPermisoEliminarTipoCompania=isPermiso;
		this.isPermisoGuardarCambiosTipoCompania=isPermiso;
		this.isPermisoConsultaTipoCompania=isPermiso;
		this.isPermisoBusquedaTipoCompania=isPermiso;
		this.isPermisoReporteTipoCompania=isPermiso;
		this.isPermisoOrdenTipoCompania=isPermiso;		
		this.isPermisoPaginacionMedioTipoCompania=isPermiso;		
		this.isPermisoPaginacionAltoTipoCompania=isPermiso;		
		this.isPermisoPaginacionTodoTipoCompania=isPermiso;		
		this.isPermisoCopiarTipoCompania=isPermiso;		
		this.isPermisoVerFormTipoCompania=isPermiso;		
		this.isPermisoDuplicarTipoCompania=isPermiso;
		this.isPermisoOrdenTipoCompania=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoCompania(Boolean isPermiso) {
		//this.isPermisoTodoTipoCompania=isPermiso;
		this.isPermisoNuevoTipoCompania=isPermiso;
		this.isPermisoActualizarTipoCompania=isPermiso;
		this.isPermisoActualizarOriginalTipoCompania=isPermiso;
		this.isPermisoEliminarTipoCompania=isPermiso;
		this.isPermisoGuardarCambiosTipoCompania=isPermiso;
		//this.isPermisoConsultaTipoCompania=isPermiso;
		//this.isPermisoBusquedaTipoCompania=isPermiso;
		//this.isPermisoReporteTipoCompania=isPermiso;
		//this.isPermisoOrdenTipoCompania=isPermiso;		
		//this.isPermisoPaginacionMedioTipoCompania=isPermiso;		
		//this.isPermisoPaginacionAltoTipoCompania=isPermiso;		
		//this.isPermisoPaginacionTodoTipoCompania=isPermiso;		
		//this.isPermisoCopiarTipoCompania=isPermiso;		
		//this.isPermisoDuplicarTipoCompania=isPermiso;
		//this.isPermisoOrdenTipoCompania=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoCompaniaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DatoConstitucionConstantesFunciones.SNOMBREOPCION);
		
		if(TipoCompaniaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDatoConstitucion=false;
		this.isTienePermisosDatoConstitucion=this.verificarGetPermisosUsuarioOpcionTipoCompaniaClaseRelacionada(this.opcionsRelacionadas,DatoConstitucionConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoCompania(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoCompaniaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDatoConstitucion=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoCompaniaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoCompaniaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoCompaniaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDatoConstitucion && this.jInternalFrameDetalleFormTipoCompania!=null && this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCompania.jTabbedPaneRelacionesTipoCompania.remove(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoCompania() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoCompaniaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoCompaniaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoCompania=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoCompania=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoCompania=this.isPermisoActualizarTipoCompania;
			this.isPermisoEliminarTipoCompania=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoCompania=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoCompania=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoCompania=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoCompania=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoCompania=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCompania=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoCompania=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoCompania=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoCompania=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoCompania=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoCompania=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoCompania=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCompania=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoCompania.setToolTipText(this.jTableDatosTipoCompania.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoCompania(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoCompania(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoCompaniaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoCompaniaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoCompania() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDatoConstitucion && this.tipocompaniaConstantesFunciones.mostrarDatoConstitucionTipoCompania && !TipoCompaniaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Dato Constitucion");
			reporte.setsDescripcion("Dato Constitucion");
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
	public void inicializarCombosForeignKeyTipoCompaniaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoCompaniaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoCompaniaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoCompaniaListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoCompaniaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoCompaniaParameterReturnGeneral tipocompaniaReturnGeneral=new TipoCompaniaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipocompaniaConstantesFunciones.cargarid_empresaTipoCompania)
					 || (this.esRecargarFks && this.tipocompaniaConstantesFunciones.cargarid_empresaTipoCompania)) {

					if(!this.tipocompaniaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipocompaniaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipocompaniaReturnGeneral=tipocompaniaLogic.cargarCombosLoteForeignKeyTipoCompania(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipocompaniaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoCompania()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipocompaniaSessionBean==null) {
				this.tipocompaniaSessionBean=new TipoCompaniaSessionBean();
			}

			if(!this.tipocompaniaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoCompania()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoCompania(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoCompania()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCompania();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoCompania(TipoCompania tipocompania)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoCompania(TipoCompania tipocompania,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoCompania()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCompania()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoCompania()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoCompania()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoCompania()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoCompania()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoCompania(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoCompania()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoCompania.jComboBoxid_empresaTipoCompania!=null && this.jInternalFrameDetalleFormTipoCompania.jComboBoxid_empresaTipoCompania.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoCompania.jComboBoxid_empresaTipoCompania.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoCompaniaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoCompaniaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoCompaniaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipocompaniaSessionBean=new TipoCompaniaSessionBean(); 
		this.tipocompaniaConstantesFunciones=new TipoCompaniaConstantesFunciones(); 
		this.tipocompaniaBean=new TipoCompania();//(this.tipocompaniaConstantesFunciones); 		
		this.tipocompaniaReturnGeneral=new TipoCompaniaParameterReturnGeneral(); 
		
		this.tipocompaniaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocompaniaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoCompaniaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoCompaniaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoCompaniaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoCompania(true);
			
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
			
			this.tipocompaniaConstantesFunciones=new TipoCompaniaConstantesFunciones(); 
			this.tipocompaniaBean=new TipoCompania();//this.tipocompaniaConstantesFunciones); 			
			this.tipocompaniaReturnGeneral=new TipoCompaniaParameterReturnGeneral(); 
		
			TipoCompaniaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Compania Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipocompania=new TipoCompania();
			this.tipocompanias = new ArrayList<TipoCompania>();
			this.tipocompaniasAux = new ArrayList<TipoCompania>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic=new TipoCompaniaLogic();
				this.tipocompaniaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipocompaniaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipocompaniaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoCompania);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoCompania!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCompania);	
					}
					
					if(this.jInternalFrameImportacionTipoCompania!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCompania);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoCompania!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoCompania);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoCompania!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCompania);
				this.jInternalFrameDetalleFormTipoCompania.setVisible(false);
				this.jInternalFrameDetalleFormTipoCompania.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoCompania!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCompania);
					this.jInternalFrameReporteDinamicoTipoCompania.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoCompania.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoCompania!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoCompania);
					this.jInternalFrameImportacionTipoCompania.setVisible(false);
					this.jInternalFrameImportacionTipoCompania.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoCompania!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoCompania);
					this.jInternalFrameOrderByTipoCompania.setVisible(false);
					this.jInternalFrameOrderByTipoCompania.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoCompaniaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoCompaniaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipocompaniaReturnGeneral=new TipoCompaniaParameterReturnGeneral();
			
			this.tipocompaniaParameterGeneral=new TipoCompaniaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipocompaniaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoCompaniaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DatoConstitucionConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCompaniaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocompaniaSessionBean.getEsGuardarRelacionado(),this.tipocompaniaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCompaniaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocompaniaSessionBean.getEsGuardarRelacionado(),this.tipocompaniaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoCompania=false;
			this.isVisibilidadCeldaDuplicarTipoCompania=true;
			this.isVisibilidadCeldaCopiarTipoCompania=true;
			this.isVisibilidadCeldaVerFormTipoCompania=true;
			this.isVisibilidadCeldaOrdenTipoCompania=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCompania=false;
			this.isVisibilidadCeldaModificarTipoCompania=false;
			this.isVisibilidadCeldaActualizarTipoCompania=false;
			this.isVisibilidadCeldaEliminarTipoCompania=false;
			this.isVisibilidadCeldaCancelarTipoCompania=false;
			this.isVisibilidadCeldaGuardarTipoCompania=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCompania=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoCompania("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoCompania();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoCompania(false);
			
			this.setPermisosUsuarioTipoCompania();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocompaniaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipocompaniaSessionBean.getEsGuardarRelacionado() && this.tipocompaniaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoCompaniaClasesRelacionadas();
			}
			
			if(this.tipocompaniaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoCompaniaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoCompaniaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoCompania();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoCompania();
			}
			
			if(!this.isPermisoBusquedaTipoCompania) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoCompania.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoCompania,this.isPermisoPaginacionMedioTipoCompania,this.isPermisoPaginacionTodoTipoCompania);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoCompaniaConstantesFunciones.getTiposSeleccionarTipoCompania());
				
				this.tiposColumnasSelect=TipoCompaniaConstantesFunciones.getTiposSeleccionarTipoCompania(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoCompania();				
				//this.tiposRelacionesSelect=TipoCompaniaConstantesFunciones.getTiposRelacionesTipoCompania(true);
				
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
			//if(!this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoCompania();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoCompania(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoCompania(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCompania() ;
			
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
			
			
			this.datoconstitucionLogic=new DatoConstitucionLogic(); 
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
				tipocompaniaImplementable= (TipoCompaniaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCompaniaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipocompaniaImplementableHome= (TipoCompaniaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCompaniaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipocompanias= new ArrayList<TipoCompania>();
			this.tipocompaniasEliminados= new ArrayList<TipoCompania>();
						
			this.isEsNuevoTipoCompania=false;
			this.esParaAccionDesdeFormularioTipoCompania=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoCompania(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoCompania();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoCompaniaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoCompaniaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoCompania("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoCompania(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoCompania!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoCompania();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoCompania();
			}
			
			TipoCompaniaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoCompania.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoCompania.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoCompania.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoCompania(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoCompania: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoCompania() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DatoConstitucionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DatoConstitucionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoCompania")) {
				iIndex=this.jInternalFrameDetalleFormTipoCompania.jTabbedPaneRelacionesTipoCompania.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoCompania.jTabbedPaneRelacionesTipoCompania.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoCompania.getSelectedRow();	
				
				

				if(sTitle.equals("Dato Constituciones")) {
					if(!DatoConstitucionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoCompania();

						this.cargarParteTabPanelRelacionadaDatoConstitucion(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoCompania();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDatoConstitucion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoCompania.cargarSessionConBeanSwingJInternalFrameDatoConstitucion(false,true,iIndex);
		this.jButtonDatoConstitucionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDatoConstitucion();

		//this.jTabbedPaneRelacionesTipoCompania.updateUI();
		//this.jTabbedPaneRelacionesTipoCompania.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoCompania.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DatoConstitucion")) {
				int row=this.jTableDatosTipoCompania.getSelectedRow();
				jButtonDatoConstitucionActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Dato Constitucion")) {

					if(this.isTienePermisosDatoConstitucion && this.tipocompaniaConstantesFunciones.mostrarDatoConstitucionTipoCompania && !TipoCompaniaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Dato Constituciones"+"("+DatoConstitucionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Dato Constituciones");

						if(tipocompaniaConstantesFunciones.resaltarDatoConstitucionTipoCompania!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipocompaniaConstantesFunciones.resaltarDatoConstitucionTipoCompania);
						}

						jmenuItem.setEnabled(this.tipocompaniaConstantesFunciones.activarDatoConstitucionTipoCompania);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DatoConstitucion"));

						

						this.jInternalFrameDetalleFormTipoCompania.jmenuDetalleTipoCompania.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoCompania(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoCompania(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoCompania(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoCompaniaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoCompania();
		
		this.cargarCombosFrameForeignKeyTipoCompania();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoCompania();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoCompania();
		}
	}
	
	
	
	public void jButtonNuevoTipoCompaniaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipocompaniaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoCompania==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
			
			
			if(jTableDatosTipoCompania.getRowCount()>=1) {
				jTableDatosTipoCompania.removeRowSelectionInterval(0, jTableDatosTipoCompania.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoCompania=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoCompania(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoCompania(true);			
			//this.tipocompania=new TipoCompania();
			//this.tipocompania.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCompania(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCompania() ;
			
			if(TipoCompaniaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCompania(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipocompania);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipocompania);				
			
			TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
			
			if(this.tipocompaniaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoCompania: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoCompaniaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoCompania> tipocompaniasSeleccionados=new ArrayList<TipoCompania>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoCompania.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoCompania.getSelectedRows().length;			
			}
			
			tipocompaniasSeleccionados=this.getTipoCompaniasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoCompania--;			
				//TipoCompania tipocompaniaAux= new TipoCompania();			
				//tipocompaniaAux.setId(this.iIdNuevoTipoCompania);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoCompania tipocompaniaOrigen=new TipoCompania();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoCompania tipocompaniaOrigen : tipocompaniasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoCompania.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipocompaniaOrigen =(TipoCompania) this.tipocompaniaLogic.getTipoCompanias().toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocompaniaOrigen =(TipoCompania) this.tipocompanias.toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoCompania();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipocompania.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoCompania(tipocompaniaOrigen,this.tipocompania,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCompania(this.tipocompania);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocompaniaLogic.getTipoCompanias().add(this.tipocompaniaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocompanias.add(this.tipocompaniaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoCompania(false);
				
				this.jTableDatosTipoCompania.setRowSelectionInterval(this.getIndiceNuevoTipoCompania(), this.getIndiceNuevoTipoCompania());
				
				int iLastRow =  this.jTableDatosTipoCompania.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCompania.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCompania.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCompania(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoCompaniaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoCompania> tipocompaniasSeleccionados=new ArrayList<TipoCompania>();									
		
			TipoCompania tipocompaniaOrigen=new TipoCompania();
			TipoCompania tipocompaniaDestino=new TipoCompania();
				
			tipocompaniasSeleccionados=this.getTipoCompaniasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoCompania.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipocompaniasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoCompania.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocompaniaOrigen =(TipoCompania) this.tipocompaniaLogic.getTipoCompanias().toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocompaniaOrigen =(TipoCompania) this.tipocompanias.toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocompaniaDestino =(TipoCompania) this.tipocompaniaLogic.getTipoCompanias().toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocompaniaDestino =(TipoCompania) this.tipocompanias.toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipocompaniaOrigen =tipocompaniasSeleccionados.get(0);
				tipocompaniaDestino =tipocompaniasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoCompania(tipocompaniaOrigen,tipocompaniaDestino,true,false);
				
				tipocompaniaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocompaniaDestino,tipocompaniaLogic.getTipoCompanias());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocompaniaDestino,tipocompanias);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoCompania(false);
				
				//this.jTableDatosTipoCompania.setRowSelectionInterval(this.getIndiceNuevoTipoCompania(), this.getIndiceNuevoTipoCompania());
				
				int iLastRow =  this.jTableDatosTipoCompania.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCompania.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCompania.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCompania(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoCompaniaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCompania==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoCompania.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoCompaniaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoCompania.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoCompania.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoCompania.setVisible(!isVisible);
			this.jPanelPaginacionTipoCompania.setVisible(!isVisible);
			this.jPanelAccionesTipoCompania.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoCompaniaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoCompania();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoCompaniaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoCompania();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoCompaniaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoCompania();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoCompaniaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoCompania();
			
			this.abrirFrameOrderByTipoCompania();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoCompaniaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoCompania();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoCompania(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCompania);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoCompania.isMaximum()) {
					this.jInternalFrameDetalleFormTipoCompania.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoCompania.setSize(this.jInternalFrameDetalleFormTipoCompania.iWidthFormulario,this.jInternalFrameDetalleFormTipoCompania.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoCompania.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoCompania.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoCompania.isMaximum()) {
						this.jInternalFrameDetalleFormTipoCompania.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoCompania.jContentPaneDetalleTipoCompania.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoCompania.jTabbedPaneRelacionesTipoCompania.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoCompania.jContentPaneDetalleTipoCompania.getWidth(),TipoCompaniaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCompania.jTabbedPaneRelacionesTipoCompania.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoCompania.jContentPaneDetalleTipoCompania.getWidth(),TipoCompaniaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCompania.jTabbedPaneRelacionesTipoCompania.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoCompania.jContentPaneDetalleTipoCompania.getWidth(),TipoCompaniaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DatoConstitucionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDatoConstitucion();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoCompania.setVisible(true);
	        this.jInternalFrameDetalleFormTipoCompania.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoCompania() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoCompania==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoCompania=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCompania,false,this);
				} else {
					this.jInternalFrameOrderByTipoCompania=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCompania,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoCompania);
				this.jInternalFrameOrderByTipoCompania.setVisible(false);
				this.jInternalFrameOrderByTipoCompania.setSelected(false);
				
				this.jInternalFrameOrderByTipoCompania.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCompania"));
				
				this.inicializarActualizarBindingTablaOrderByTipoCompania();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoCompania() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoCompania==null) {
				
				this.jInternalFrameImportacionTipoCompania=new ImportacionJInternalFrame(TipoCompaniaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCompania);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoCompania);
				this.jInternalFrameImportacionTipoCompania.setVisible(false);
				this.jInternalFrameImportacionTipoCompania.setSelected(false);


				this.jInternalFrameImportacionTipoCompania.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCompania"));
				this.jInternalFrameImportacionTipoCompania.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCompania"));
				this.jInternalFrameImportacionTipoCompania.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCompania"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoCompania() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoCompania==null) {
				this.jInternalFrameReporteDinamicoTipoCompania=new ReporteDinamicoJInternalFrame(TipoCompaniaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCompania);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCompania);
				this.jInternalFrameReporteDinamicoTipoCompania.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoCompania.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoCompania.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCompania"));
				this.jInternalFrameReporteDinamicoTipoCompania.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCompania"));
				this.jInternalFrameReporteDinamicoTipoCompania.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCompania"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCompania();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDatoConstitucion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.jScrollPanelDatosDatoConstitucion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoCompania.jContentPaneDetalleTipoCompania.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.jScrollPanelDatosDatoConstitucion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.jScrollPanelDatosDatoConstitucion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.jScrollPanelDatosDatoConstitucion.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoCompania() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCompania);
			
	       	this.jInternalFrameDetalleFormTipoCompania.setVisible(false);
	        this.jInternalFrameDetalleFormTipoCompania.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoCompania.dispose();
			//this.jInternalFrameDetalleFormTipoCompania=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoCompania() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoCompania.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoCompania.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoCompania() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoCompania.setVisible(true);
	        this.jInternalFrameImportacionTipoCompania.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoCompania() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoCompania.setVisible(true);
	        this.jInternalFrameOrderByTipoCompania.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoCompania() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoCompania.setVisible(false);
	        this.jInternalFrameOrderByTipoCompania.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoCompania() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoCompania.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoCompania.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoCompania() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoCompania.setVisible(false);
	        this.jInternalFrameImportacionTipoCompania.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoCompaniaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoCompania(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoCompania(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCompania.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoCompania(true);
			//this.isEsNuevoTipoCompania=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompania =(TipoCompania) this.tipocompaniaLogic.getTipoCompanias().toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocompania =(TipoCompania) this.tipocompanias.toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoCompania("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCompania(false) ;
			
			if(tipocompaniaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucionSessionBean.getEsGuardarRelacionado() && DatoConstitucionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDatoConstitucionActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoCompaniaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCompania(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCompania(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoCompaniaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoCompania.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompania =(TipoCompania) this.tipocompaniaLogic.getTipoCompanias().toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocompania =(TipoCompania) this.tipocompanias.toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoCompania(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCompania==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCompania.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoCompania(true);
			//this.isEsNuevoTipoCompania=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompania =(TipoCompania) this.tipocompaniaLogic.getTipoCompanias().toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocompania =(TipoCompania) this.tipocompanias.toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipocompania.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoCompania("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoCompania(false) ;
			
			if(TipoCompaniaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCompania(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCompania(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoCompaniaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoCompania(false);
			
			//if(!this.isEsNuevoTipoCompania) {								
				int intSelectedRow = this.jTableDatosTipoCompania.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompania =(TipoCompania) this.tipocompaniaLogic.getTipoCompanias().toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocompania =(TipoCompania) this.tipocompanias.toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoCompaniaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoCompania(this.tipocompania,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCompania(this.tipocompania);
				
			}
			
			if(this.permiteMantenimiento(this.tipocompania)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoCompania=true;
					this.inicializarActualizarBindingTablaTipoCompania(false);
					this.isEsNuevoTipoCompania=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoCompania=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoCompania=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCompania(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCompania(false);
				
				this.habilitarDeshabilitarControlesTipoCompania(false);
			
												
				
				if(TipoCompaniaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoCompania();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoCompaniaActionPerformed(evt,tipocompaniaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoCompania(this.tipocompania,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoCompania.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipocompaniaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipocompania.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoCompania.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCompania.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoCompaniaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoCompania.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompania =(TipoCompania) this.tipocompaniaLogic.getTipoCompanias().toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
				this.tipocompania.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocompania =(TipoCompania) this.tipocompanias.toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
				this.tipocompania.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipocompania)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoCompaniaModel) this.jTableDatosTipoCompania.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoCompania=true;
				this.inicializarActualizarBindingTablaTipoCompania(false);
				this.isEsNuevoTipoCompania=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCompania(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCompania(false);
				
				this.habilitarDeshabilitarControlesTipoCompania(false);
				
				
				
				if(TipoCompaniaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoCompania();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoCompaniaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoCompania.getRowCount()>=1) {
				jTableDatosTipoCompania.removeRowSelectionInterval(0, jTableDatosTipoCompania.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoCompania(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoCompania(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCompania(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCompania(false) ;
			
			this.isEsNuevoTipoCompania=false;
			
			if(TipoCompaniaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoCompania();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoCompaniaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoCompania(false);
				
				//SI ES MANUAL
				if(TipoCompaniaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoCompania();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoCompaniaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoCompania--;			
			//TipoCompania tipocompaniaAux= new TipoCompania();			
			//tipocompaniaAux.setId(this.iIdNuevoTipoCompania);
			
			if(this.jInternalFrameDetalleFormTipoCompania==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoCompania();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoCompania(this.tipocompania);
			
			this.tipocompania.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipocompaniaLogic.getTipoCompanias().add(this.tipocompaniaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipocompanias.add(this.tipocompaniaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoCompania(false);
			
			this.jTableDatosTipoCompania.setRowSelectionInterval(this.getIndiceNuevoTipoCompania(), this.getIndiceNuevoTipoCompania());
			
			int iLastRow =  this.jTableDatosTipoCompania.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoCompania.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoCompania.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoCompania(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoCompaniaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoCompania(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCompania(false);
			
			//SI ES MANUAL
			if(TipoCompaniaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCompania();
			}
			
			//this.abrirFrameTreeTipoCompania();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoCompaniaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo CompaniaS ?", "MANTENIMIENTO DE Tipo Compania", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoCompania.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoCompania();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipocompaniaReturnGeneral=tipocompaniaLogic.procesarImportacionTipoCompaniasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipocompaniaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoCompaniaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoCompaniaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoCompania.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoCompania.setFileImportacion(this.jInternalFrameImportacionTipoCompania.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoCompania.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoCompania.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoCompania.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoCompania.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoCompaniaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoCompania> tipocompaniasSeleccionados=new ArrayList<TipoCompania>();		

		tipocompaniasSeleccionados=this.getTipoCompaniasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCompania.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCompania.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoCompaniaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoCompaniaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoCompanias("Todos",tipocompaniasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Compania",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCompania.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCompania.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCompaniaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCompaniaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCompaniaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoCompania.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCompania.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCompania.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoCompaniaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoCompaniaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoCompaniaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoCompania.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoCompaniaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoCompaniaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoCompaniaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoCompania.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCompania.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCompaniaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoCompaniaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoCompaniaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoCompaniaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoCompania> tipocompaniasSeleccionados=new ArrayList<TipoCompania>();		
		
		tipocompaniasSeleccionados=this.getTipoCompaniasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocompania";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoCompanias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoCompania.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCompania.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoCompaniaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCompaniaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoCompania tipocompania:tipocompaniasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocompania.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCompaniaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCompaniaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoCompania tipocompania:tipocompaniasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocompania.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCompaniaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCompaniaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoCompania tipocompania:tipocompaniasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocompania.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoCompania(row);				
			//	iRow++;
			//}				
			
			//for(TipoCompania tipocompaniaAux:tipocompaniasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoCompania(tipocompaniaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Compania",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipocompaniaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCompania(false);
			
			//SI ES MANUAL
			if(TipoCompaniaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCompania();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoCompaniaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCompania(false);
			
			//SI ES MANUAL
			if(TipoCompaniaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCompania();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoCompaniaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCompania(false);
			
			//SI ES MANUAL
			if(TipoCompaniaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCompania();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoCompania() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoCompania.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoCompania.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoCompania.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoCompania.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoCompania.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoCompania.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoCompania.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoCompania(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoCompania(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoCompania(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoCompania(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoCompania(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoCompania(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCompania(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoCompania(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoCompaniaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoCompaniaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoCompania() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoCompania();
		
		this.inicializarActualizarBindingBotonesManualTipoCompania(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCompania();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCompania() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCompania(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCompania(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoCompania.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoCompania.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoCompania.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoCompania!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoCompania.jCheckBoxPostAccionNuevoTipoCompania.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoCompania.jCheckBoxPostAccionSinCerrarTipoCompania.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoCompania.jCheckBoxPostAccionSinMensajeTipoCompania.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoCompania.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoCompania.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoCompania.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoCompania!=null) {
				this.jInternalFrameDetalleFormTipoCompania.jCheckBoxPostAccionNuevoTipoCompania.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoCompania.jCheckBoxPostAccionSinCerrarTipoCompania.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoCompania.jCheckBoxPostAccionSinMensajeTipoCompania.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoCompania.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoCompania.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoCompania!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoCompania.jComboBoxTiposAccionesFormularioTipoCompania.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoCompania.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoCompania!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCompania.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoCompania.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoCompania.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoCompania.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoCompania.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoCompania!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCompania.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoCompania.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoCompania.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoCompania(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoCompaniaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCompania(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoCompania() throws Exception {
		try	{
			if(TipoCompaniaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCompania();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCompania() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoCompania.jComboBoxTiposAccionesFormularioTipoCompania.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoCompania.jComboBoxTiposAccionesFormularioTipoCompania.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCompania() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoCompania.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoCompania.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoCompania.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoCompania.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoCompania.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoCompania.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoCompania.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoCompania.addItem(reporte);
			}
			
			
			if(!this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoCompania.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoCompania.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoCompania.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoCompania.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoCompania.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoCompania.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoCompania!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoCompania.jComboBoxTiposAccionesFormularioTipoCompania.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoCompania.jComboBoxTiposAccionesFormularioTipoCompania.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoCompania.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoCompania.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoCompania.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCompania();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCompania() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCompania!=null) {
				this.jInternalFrameReporteDinamicoTipoCompania.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCompania.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCompania!=null) {
				this.jInternalFrameReporteDinamicoTipoCompania.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCompania.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoCompania!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoCompania.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCompania.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCompania.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoCompania.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCompania.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCompania.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoCompania()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoCompania(Boolean esInicializar) throws Exception {				
		if(TipoCompaniaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCompania();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoCompania() throws Exception {
		this.inicializarActualizarBindingTablaTipoCompania(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoCompania() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoCompania.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoCompania.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCompania.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoCompaniaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoCompania.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCompania.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoCompaniaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoCompaniaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCompaniaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoCompaniaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoCompania.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCompania.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoCompaniaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoCompania.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoCompania(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipocompaniaLogic.getTipoCompanias().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipocompanias.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoCompaniaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoCompania.setModel(new TipoCompaniaModel(this.tipocompaniaLogic.getTipoCompanias(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoCompania.setModel(new TipoCompaniaModel(this.tipocompanias,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoCompania!=null && this.jInternalFrameOrderByTipoCompania.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoCompania();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoCompania.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCompania,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoCompaniaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO,tipocompaniaConstantesFunciones.resaltarSeleccionarTipoCompania,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO,tipocompaniaConstantesFunciones.resaltarSeleccionarTipoCompania,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoCompania.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCompania,TipoCompaniaConstantesFunciones.LABEL_ID));

		if(this.tipocompaniaConstantesFunciones.mostraridTipoCompania && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCompaniaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocompaniaConstantesFunciones.resaltaridTipoCompania,this.tipocompaniaConstantesFunciones.activaridTipoCompania,this,true,"idTipoCompania","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocompaniaConstantesFunciones.resaltaridTipoCompania,this.tipocompaniaConstantesFunciones.activaridTipoCompania,this,true,"idTipoCompania","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCompania.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCompania,TipoCompaniaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipocompaniaConstantesFunciones.mostrarid_empresaTipoCompania && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCompaniaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipocompaniaConstantesFunciones.resaltarid_empresaTipoCompania,this,this.tipocompaniaConstantesFunciones.activarid_empresaTipoCompania));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipocompaniaConstantesFunciones.resaltarid_empresaTipoCompania,this,this.tipocompaniaConstantesFunciones.activarid_empresaTipoCompania,false,"id_empresaTipoCompania","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCompaniaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCompania.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCompania,TipoCompaniaConstantesFunciones.LABEL_CODIGO));

		if(this.tipocompaniaConstantesFunciones.mostrarcodigoTipoCompania && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCompaniaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocompaniaConstantesFunciones.resaltarcodigoTipoCompania,this.tipocompaniaConstantesFunciones.activarcodigoTipoCompania,this,true,"codigoTipoCompania","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocompaniaConstantesFunciones.resaltarcodigoTipoCompania,this.tipocompaniaConstantesFunciones.activarcodigoTipoCompania,this,true,"codigoTipoCompania","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCompaniaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCompania.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCompania,TipoCompaniaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipocompaniaConstantesFunciones.mostrarnombreTipoCompania && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCompaniaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocompaniaConstantesFunciones.resaltarnombreTipoCompania,this.tipocompaniaConstantesFunciones.activarnombreTipoCompania,this,true,"nombreTipoCompania","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocompaniaConstantesFunciones.resaltarnombreTipoCompania,this.tipocompaniaConstantesFunciones.activarnombreTipoCompania,this,true,"nombreTipoCompania","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCompaniaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipocompaniaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDatoConstitucion && this.tipocompaniaConstantesFunciones.mostrarDatoConstitucionTipoCompania && !TipoCompaniaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Dato Constituciones");
				tableColumn.setHeaderValue("Dato Constituciones");
				tableColumn.setCellRenderer(new DatoConstitucionTableCell(tipocompaniaConstantesFunciones.resaltarDatoConstitucionTipoCompania,this,this.tipocompaniaConstantesFunciones.activarDatoConstitucionTipoCompania));
				tableColumn.setCellEditor(new DatoConstitucionTableCell(tipocompaniaConstantesFunciones.resaltarDatoConstitucionTipoCompania,this,this.tipocompaniaConstantesFunciones.activarDatoConstitucionTipoCompania));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoCompania.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocompaniaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocompaniaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCompania.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocompaniaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocompaniaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCompania.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoCompania && this.isPermisoGuardarCambiosTipoCompania) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipocompaniaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipocompaniaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoCompania.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipocompaniaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoCompania.addColumn(tableColumn);
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
			
			this.jTableDatosTipoCompania.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCompania && this.isPermisoGuardarCambiosTipoCompania) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocompaniaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCompania && this.isPermisoGuardarCambiosTipoCompania) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoCompania.moveColumn(this.jTableDatosTipoCompania.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoCompania.moveColumn(this.jTableDatosTipoCompania.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocompaniaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoCompania.moveColumn(this.jTableDatosTipoCompania.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoCompania.moveColumn(this.jTableDatosTipoCompania.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoCompania.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoCompania.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoCompania,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoCompaniaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoCompania.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoCompania.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoCompaniaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoCompaniaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoCompania.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoCompania.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoCompania.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipocompaniaLogic.getTipoCompanias().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipocompanias.size()-1;
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
		//this.jTableDatosTipoCompania.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoCompania.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoCompania();
			
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
				
				//this.isEsNuevoTipoCompania=false;
					
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
			
				if(this.tipocompaniaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoCompania==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCompania.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCompania.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompania =(TipoCompania) this.tipocompaniaLogic.getTipoCompanias().toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocompania =(TipoCompania) this.tipocompanias.toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipocompania.getsType().equals("DUPLICADO")
				   || this.tipocompania.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoCompania=true;
				
				} else {
					this.isEsNuevoTipoCompania=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipocompania.getId()>=0 && !this.tipocompania.getIsNew()) {						
						this.isEsNuevoTipoCompania=false;
						
					} else {
						this.isEsNuevoTipoCompania=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoCompania(esRelaciones);						
				
				this.seleccionarTipoCompania(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipocompania.getId()<0) {
					this.isEsNuevoTipoCompania=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoCompania(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoCompania(evt,rowIndex);
				}	
				
				if(this.tipocompaniaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoCompania: " + this.dDif); 
					}
				}								
				
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoCompania(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipocompania)) {
					if(this.tipocompania.getId()>0) {
						this.tipocompania.setIsDeleted(true);
						
						this.tipocompaniasEliminados.add(this.tipocompania);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocompaniaLogic.getTipoCompanias().remove(this.tipocompania);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocompanias.remove(this.tipocompania);				
					}
					
					
					((TipoCompaniaModel) this.jTableDatosTipoCompania.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCompania(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoCompania(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoCompania) {
			
			if(this.jInternalFrameDetalleFormTipoCompania==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCompania.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCompania.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompania =(TipoCompania) this.tipocompaniaLogic.getTipoCompanias().toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocompania =(TipoCompania) this.tipocompanias.toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoCompaniaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoCompania(this.tipocompania);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipocompaniaConstantesFunciones.cargarid_empresaTipoCompania || this.tipocompaniaConstantesFunciones.event_dependid_empresaTipoCompania) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipocompania.getid_empresa());
									//this.inicializarActualizarBindingTipoCompania(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipocompania.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipocompania.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipocompania.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoCompania("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoCompania(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCompania() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCompania(TipoCompania tipocompania) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoCompania(tipocompania,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCompania(TipoCompania tipocompania,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoCompania(tipocompania);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoCompania(tipocompania,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoCompania(tipocompania);
	}
	
	public void setVariablesObjetoActualToFormularioTipoCompania(TipoCompania tipocompania) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoCompania==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoCompania.jLabelidTipoCompania.setText(tipocompania.getId().toString());
			this.jInternalFrameDetalleFormTipoCompania.jTextFieldcodigoTipoCompania.setText(tipocompania.getcodigo());
			this.jInternalFrameDetalleFormTipoCompania.jTextAreanombreTipoCompania.setText(tipocompania.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoCompania tipocompaniaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipocompaniaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoCompania tipocompaniaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipocompaniaLocal=this.tipocompania;
			} else {
				tipocompaniaLocal=this.tipocompaniaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipocompaniaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoCompania(tipocompaniaLocal,true);
					
					if(tipocompaniaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipocompaniaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipocompaniaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoCompania(TipoCompania tipocompania,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCompania(tipocompania,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCompania(tipocompania);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCompania(TipoCompania tipocompania,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCompania(tipocompania,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCompania(TipoCompania tipocompania,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoCompania==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoCompania.jLabelidTipoCompania.getText()==null || this.jInternalFrameDetalleFormTipoCompania.jLabelidTipoCompania.getText()=="" || this.jInternalFrameDetalleFormTipoCompania.jLabelidTipoCompania.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoCompania.jLabelidTipoCompania.setText("0");
			}

			if(conColumnasBase) {tipocompania.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoCompania.jLabelidTipoCompania.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCompaniaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCompania.jLabelIdTipoCompania,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocompania.setcodigo(this.jInternalFrameDetalleFormTipoCompania.jTextFieldcodigoTipoCompania.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCompaniaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCompania.jLabelcodigoTipoCompania,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocompania.setnombre(this.jInternalFrameDetalleFormTipoCompania.jTextAreanombreTipoCompania.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCompaniaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCompania.jLabelnombreTipoCompania,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCompania(TipoCompania tipocompaniaBean,TipoCompania tipocompania,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoCompania(TipoCompania tipocompaniaOrigen,TipoCompania tipocompania,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocompaniaOrigen.getId()!=null && !tipocompaniaOrigen.getId().equals(0L))) {tipocompania.setId(tipocompaniaOrigen.getId());}}
			if(conDefault || (!conDefault && tipocompaniaOrigen.getcodigo()!=null && !tipocompaniaOrigen.getcodigo().equals(""))) {tipocompania.setcodigo(tipocompaniaOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipocompaniaOrigen.getnombre()!=null && !tipocompaniaOrigen.getnombre().equals(""))) {tipocompania.setnombre(tipocompaniaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCompania(TipoCompania tipocompania) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCompania.jLabelidTipoCompania.setText(tipocompania.getId().toString());
			this.jInternalFrameDetalleFormTipoCompania.jTextFieldcodigoTipoCompania.setText(tipocompania.getcodigo());
			this.jInternalFrameDetalleFormTipoCompania.jTextAreanombreTipoCompania.setText(tipocompania.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCompania(TipoCompaniaBean tipocompaniaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCompania.jLabelidTipoCompania.setText(tipocompaniaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoCompania.jTextFieldcodigoTipoCompania.setText(tipocompaniaBean.getcodigo());
			this.jInternalFrameDetalleFormTipoCompania.jTextAreanombreTipoCompania.setText(tipocompaniaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoCompania(TipoCompaniaParameterReturnGeneral tipocompaniaReturnGeneral,TipoCompaniaBean tipocompaniaBean,Boolean conDefault) throws Exception { 
		try {
			TipoCompania tipocompaniaLocal=new TipoCompania();
			
			tipocompaniaLocal=tipocompaniaReturnGeneral.getTipoCompania();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocompaniaLocal.getId()!=null && !tipocompaniaLocal.getId().equals(0L))) {tipocompaniaBean.setId(tipocompaniaLocal.getId());}}
			if(conDefault || (!conDefault && tipocompaniaLocal.getcodigo()!=null && !tipocompaniaLocal.getcodigo().equals(""))) {tipocompaniaBean.setcodigo(tipocompaniaLocal.getcodigo());}
			if(conDefault || (!conDefault && tipocompaniaLocal.getnombre()!=null && !tipocompaniaLocal.getnombre().equals(""))) {tipocompaniaBean.setnombre(tipocompaniaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoCompaniaGenerico(Long idTipoCompaniaSeleccionado,JComboBox jComboBoxTipoCompania,List<TipoCompania> tipocompaniasLocal)throws Exception {
		try {
			TipoCompania  tipocompaniaTemp=null;

			for(TipoCompania tipocompaniaAux:tipocompaniasLocal) {
				if(tipocompaniaAux.getId()!=null && tipocompaniaAux.getId().equals(idTipoCompaniaSeleccionado)) {
					tipocompaniaTemp=tipocompaniaAux;
					break;
				}
			}

			jComboBoxTipoCompania.setSelectedItem(tipocompaniaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoCompaniaGenerico(JComboBox jComboBoxTipoCompania,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoCompania.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCompania.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoCompania.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCompania.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCompania.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoCompania.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCompania.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoCompania.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoCompania.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoCompania.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DatoConstitucion")) {
			jButtonDatoConstitucionActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocompania=(TipoCompania) tipocompaniaLogic.getTipoCompanias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocompania =(TipoCompania) tipocompanias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipocompania.getIsNew() && !tipocompania.getIsChanged() && !tipocompania.getIsDeleted()) {
				sDescripcion=tipocompania.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipocompania.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoCompania tipocompaniaRow=new TipoCompania();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocompaniaRow=(TipoCompania) tipocompaniaLogic.getTipoCompanias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocompaniaRow=(TipoCompania) tipocompanias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDatoConstitucionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoCompania tipocompania) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoCompania==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompaniaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocompania = (TipoCompania)this.tipocompaniaLogic.getTipoCompanias().toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipocompania = (TipoCompania)this.tipocompanias.toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipocompania!=null) {
						this.tipocompania = tipocompania;
					} else {
						this.tipocompania = new TipoCompania();
					}
				}

				if(this.isTienePermisosDatoConstitucion && this.permiteMantenimiento(this.tipocompania)) {
					DatoConstitucionBeanSwingJInternalFrame datoconstitucionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFramePopup=new DatoConstitucionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						datoconstitucionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFramePopup;
					} else {
						datoconstitucionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame;
					}

					List<TipoCompania> tipocompanias=new ArrayList<TipoCompania>();
					tipocompanias.add(this.tipocompania);
					if(!esRelacionado) {
						//datoconstitucionBeanSwingJInternalFrame.datoconstitucionSessionBean.setConGuardarRelaciones(false);
						//datoconstitucionBeanSwingJInternalFrame.datoconstitucionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					datoconstitucionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoCompania.cargarDatoConstitucionBeanSwingJInternalFrame(tipocompanias,this.tipocompania,datoconstitucionBeanSwingJInternalFrame,/*conInicializar,*/datoconstitucionBeanSwingJInternalFrame.datoconstitucionSessionBean.getConGuardarRelaciones(),datoconstitucionBeanSwingJInternalFrame.datoconstitucionSessionBean.getEsGuardarRelacionado());
					datoconstitucionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						datoconstitucionBeanSwingJInternalFrame.actualizarEstadoPanelsDatoConstitucion("no_relacionado");

						datoconstitucionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DatoConstitucionConstantesFunciones.ITAMANIOFILATABLA + (DatoConstitucionConstantesFunciones.ITAMANIOFILATABLA/2));

						datoconstitucionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoCompania=(TitledBorder)this.jScrollPanelDatosTipoCompania.getBorder();
						TitledBorder titledBorderDatoConstitucion=(TitledBorder)datoconstitucionBeanSwingJInternalFrame.jScrollPanelDatosDatoConstitucion.getBorder();

						titledBorderDatoConstitucion.setTitle(titledBorderTipoCompania.getTitle() + " -> Dato Constitucion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,datoconstitucionBeanSwingJInternalFrame);
						}

						datoconstitucionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(datoconstitucionBeanSwingJInternalFrame);

						datoconstitucionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipocompaniaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Dato Constitucion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompaniaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompaniaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompaniaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoCompania(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoCompania.setVisible((this.isVisibilidadCeldaNuevoTipoCompania && this.isPermisoNuevoTipoCompania));			
			this.jButtonDuplicarTipoCompania.setVisible((this.isVisibilidadCeldaDuplicarTipoCompania && this.isPermisoDuplicarTipoCompania));			
			this.jButtonCopiarTipoCompania.setVisible((this.isVisibilidadCeldaCopiarTipoCompania && this.isPermisoCopiarTipoCompania));
			this.jButtonVerFormTipoCompania.setVisible((this.isVisibilidadCeldaVerFormTipoCompania && this.isPermisoVerFormTipoCompania));
			
			this.jButtonAbrirOrderByTipoCompania.setVisible((this.isVisibilidadCeldaOrdenTipoCompania && this.isPermisoOrdenTipoCompania));			
			
			this.jButtonNuevoRelacionesTipoCompania.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCompania && this.isPermisoNuevoTipoCompania));			
			this.jButtonNuevoGuardarCambiosTipoCompania.setVisible((this.isVisibilidadCeldaNuevoTipoCompania && this.isPermisoNuevoTipoCompania && this.isPermisoGuardarCambiosTipoCompania));
			
			if(this.jInternalFrameDetalleFormTipoCompania!=null) {
			this.jInternalFrameDetalleFormTipoCompania.jButtonModificarTipoCompania.setVisible((this.isVisibilidadCeldaModificarTipoCompania && this.isPermisoActualizarTipoCompania));	
			this.jInternalFrameDetalleFormTipoCompania.jButtonActualizarTipoCompania.setVisible((this.isVisibilidadCeldaActualizarTipoCompania && this.isPermisoActualizarTipoCompania));	
			this.jInternalFrameDetalleFormTipoCompania.jButtonEliminarTipoCompania.setVisible((this.isVisibilidadCeldaEliminarTipoCompania && this.isPermisoEliminarTipoCompania));
			this.jInternalFrameDetalleFormTipoCompania.jButtonCancelarTipoCompania.setVisible(this.isVisibilidadCeldaCancelarTipoCompania);							
			this.jInternalFrameDetalleFormTipoCompania.jButtonGuardarCambiosTipoCompania.setVisible((this.isVisibilidadCeldaGuardarTipoCompania && this.isPermisoGuardarCambiosTipoCompania));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoCompania.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCompania && this.isPermisoGuardarCambiosTipoCompania));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoCompania.setVisible((this.isVisibilidadCeldaNuevoTipoCompania && this.isPermisoNuevoTipoCompania));						
			this.jButtonDuplicarToolBarTipoCompania.setVisible((this.isVisibilidadCeldaDuplicarTipoCompania && this.isPermisoDuplicarTipoCompania));						
			this.jButtonCopiarToolBarTipoCompania.setVisible((this.isVisibilidadCeldaCopiarTipoCompania && this.isPermisoCopiarTipoCompania));			
			this.jButtonVerFormToolBarTipoCompania.setVisible((this.isVisibilidadCeldaVerFormTipoCompania && this.isPermisoVerFormTipoCompania));			
			this.jButtonAbrirOrderByToolBarTipoCompania.setVisible((this.isVisibilidadCeldaOrdenTipoCompania && this.isPermisoOrdenTipoCompania));
			this.jButtonNuevoRelacionesToolBarTipoCompania.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCompania && this.isPermisoNuevoTipoCompania));			
			this.jButtonNuevoGuardarCambiosToolBarTipoCompania.setVisible((this.isVisibilidadCeldaNuevoTipoCompania && this.isPermisoNuevoTipoCompania && this.isPermisoGuardarCambiosTipoCompania));			
			
			if(this.jInternalFrameDetalleFormTipoCompania!=null) {
			this.jInternalFrameDetalleFormTipoCompania.jButtonModificarToolBarTipoCompania.setVisible((this.isVisibilidadCeldaModificarTipoCompania && this.isPermisoActualizarTipoCompania));	
			this.jInternalFrameDetalleFormTipoCompania.jButtonActualizarToolBarTipoCompania.setVisible((this.isVisibilidadCeldaActualizarTipoCompania  && this.isPermisoActualizarTipoCompania));	
			this.jInternalFrameDetalleFormTipoCompania.jButtonEliminarToolBarTipoCompania.setVisible((this.isVisibilidadCeldaEliminarTipoCompania && this.isPermisoEliminarTipoCompania));
			this.jInternalFrameDetalleFormTipoCompania.jButtonCancelarToolBarTipoCompania.setVisible(this.isVisibilidadCeldaCancelarTipoCompania);				
			this.jInternalFrameDetalleFormTipoCompania.jButtonGuardarCambiosToolBarTipoCompania.setVisible((this.isVisibilidadCeldaGuardarTipoCompania && this.isPermisoGuardarCambiosTipoCompania));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoCompania.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCompania && this.isPermisoGuardarCambiosTipoCompania));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoCompania.setVisible((this.isVisibilidadCeldaNuevoTipoCompania && this.isPermisoNuevoTipoCompania));			
			this.jMenuItemDuplicarTipoCompania.setVisible((this.isVisibilidadCeldaDuplicarTipoCompania && this.isPermisoDuplicarTipoCompania));			
			this.jMenuItemCopiarTipoCompania.setVisible((this.isVisibilidadCeldaCopiarTipoCompania && this.isPermisoCopiarTipoCompania));			
			this.jMenuItemVerFormTipoCompania.setVisible((this.isVisibilidadCeldaVerFormTipoCompania && this.isPermisoVerFormTipoCompania));			
			this.jMenuItemAbrirOrderByTipoCompania.setVisible((this.isVisibilidadCeldaOrdenTipoCompania && this.isPermisoOrdenTipoCompania));			
			//this.jMenuItemMostrarOcultarTipoCompania.setVisible((this.isVisibilidadCeldaOrdenTipoCompania && this.isPermisoOrdenTipoCompania));
			this.jMenuItemDetalleAbrirOrderByTipoCompania.setVisible((this.isVisibilidadCeldaOrdenTipoCompania && this.isPermisoOrdenTipoCompania));			
			//this.jMenuItemDetalleMostrarOcultarTipoCompania.setVisible((this.isVisibilidadCeldaOrdenTipoCompania && this.isPermisoOrdenTipoCompania));			
			this.jMenuItemNuevoRelacionesTipoCompania.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCompania && this.isPermisoNuevoTipoCompania));			
			this.jMenuItemNuevoGuardarCambiosTipoCompania.setVisible((this.isVisibilidadCeldaNuevoTipoCompania && this.isPermisoNuevoTipoCompania && this.isPermisoGuardarCambiosTipoCompania));									
			
			if(this.jInternalFrameDetalleFormTipoCompania!=null) {
			this.jInternalFrameDetalleFormTipoCompania.jMenuItemModificarTipoCompania.setVisible((this.isVisibilidadCeldaModificarTipoCompania && this.isPermisoActualizarTipoCompania));	
			this.jInternalFrameDetalleFormTipoCompania.jMenuItemActualizarTipoCompania.setVisible((this.isVisibilidadCeldaActualizarTipoCompania && this.isPermisoActualizarTipoCompania));	
			this.jInternalFrameDetalleFormTipoCompania.jMenuItemEliminarTipoCompania.setVisible((this.isVisibilidadCeldaEliminarTipoCompania && this.isPermisoEliminarTipoCompania));
			this.jInternalFrameDetalleFormTipoCompania.jMenuItemCancelarTipoCompania.setVisible(this.isVisibilidadCeldaCancelarTipoCompania);				
			}
			
			this.jMenuItemGuardarCambiosTipoCompania.setVisible((this.isVisibilidadCeldaGuardarTipoCompania && this.isPermisoGuardarCambiosTipoCompania));						
			this.jMenuItemGuardarCambiosTablaTipoCompania.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCompania && this.isPermisoGuardarCambiosTipoCompania));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoCompania=this.jButtonNuevoTipoCompania.isVisible();
			this.isVisibilidadCeldaDuplicarTipoCompania=this.jButtonDuplicarTipoCompania.isVisible();
			this.isVisibilidadCeldaCopiarTipoCompania=this.jButtonCopiarTipoCompania.isVisible();
			this.isVisibilidadCeldaVerFormTipoCompania=this.jButtonVerFormTipoCompania.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoCompania=this.jButtonAbrirOrderByTipoCompania.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoCompania=this.jButtonNuevoRelacionesTipoCompania.isVisible();
			this.isVisibilidadCeldaModificarTipoCompania=this.jButtonModificarTipoCompania.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCompania!=null) {
			this.isVisibilidadCeldaActualizarTipoCompania=this.jInternalFrameDetalleFormTipoCompania.jButtonActualizarTipoCompania.isVisible();
			this.isVisibilidadCeldaEliminarTipoCompania=this.jInternalFrameDetalleFormTipoCompania.jButtonEliminarTipoCompania.isVisible();
			this.isVisibilidadCeldaCancelarTipoCompania=this.jInternalFrameDetalleFormTipoCompania.jButtonCancelarTipoCompania.isVisible();
			this.isVisibilidadCeldaGuardarTipoCompania=this.jInternalFrameDetalleFormTipoCompania.jButtonGuardarCambiosTipoCompania.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoCompania=this.jButtonGuardarCambiosTablaTipoCompania.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoCompania=this.jButtonNuevoToolBarTipoCompania.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCompania=this.jButtonNuevoRelacionesToolBarTipoCompania.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCompania!=null) {
			this.isVisibilidadCeldaModificarTipoCompania=this.jInternalFrameDetalleFormTipoCompania.jButtonModificarToolBarTipoCompania.isVisible();
			this.isVisibilidadCeldaActualizarTipoCompania=this.jInternalFrameDetalleFormTipoCompania.jButtonActualizarToolBarTipoCompania.isVisible();
			this.isVisibilidadCeldaEliminarTipoCompania=this.jInternalFrameDetalleFormTipoCompania.jButtonEliminarToolBarTipoCompania.isVisible();
			this.isVisibilidadCeldaCancelarTipoCompania=this.jInternalFrameDetalleFormTipoCompania.jButtonCancelarToolBarTipoCompania.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCompania=this.jButtonGuardarCambiosToolBarTipoCompania.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCompania=this.jButtonGuardarCambiosTablaToolBarTipoCompania.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoCompania=this.jMenuItemNuevoTipoCompania.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCompania=this.jMenuItemNuevoRelacionesTipoCompania.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCompania!=null) {
			this.isVisibilidadCeldaModificarTipoCompania=this.jInternalFrameDetalleFormTipoCompania.jMenuItemModificarTipoCompania.isVisible();
			this.isVisibilidadCeldaActualizarTipoCompania=this.jInternalFrameDetalleFormTipoCompania.jMenuItemActualizarTipoCompania.isVisible();
			this.isVisibilidadCeldaEliminarTipoCompania=this.jInternalFrameDetalleFormTipoCompania.jMenuItemEliminarTipoCompania.isVisible();
			this.isVisibilidadCeldaCancelarTipoCompania=this.jInternalFrameDetalleFormTipoCompania.jMenuItemCancelarTipoCompania.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCompania=this.jMenuItemGuardarCambiosTipoCompania.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCompania=this.jMenuItemGuardarCambiosTablaTipoCompania.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoCompania(Boolean esInicializar) {
		if(TipoCompaniaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipocompaniaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCompania();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoCompania(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoCompania() {
		this.jButtonNuevoTipoCompania.setVisible(this.isPermisoNuevoTipoCompania);			
		this.jButtonDuplicarTipoCompania.setVisible(this.isPermisoDuplicarTipoCompania);			
		this.jButtonCopiarTipoCompania.setVisible(this.isPermisoCopiarTipoCompania);			
		this.jButtonVerFormTipoCompania.setVisible(this.isPermisoVerFormTipoCompania);			
		
		this.jButtonAbrirOrderByTipoCompania.setVisible(this.isPermisoOrdenTipoCompania);					
		
		this.jButtonNuevoRelacionesTipoCompania.setVisible(this.isPermisoNuevoTipoCompania);			
		
		if(this.jInternalFrameDetalleFormTipoCompania!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompania.jButtonModificarTipoCompania.setVisible(this.isPermisoActualizarTipoCompania);	
			this.jInternalFrameDetalleFormTipoCompania.jButtonActualizarTipoCompania.setVisible(this.isPermisoActualizarTipoCompania);	
			this.jInternalFrameDetalleFormTipoCompania.jButtonEliminarTipoCompania.setVisible(this.isPermisoEliminarTipoCompania);
			this.jInternalFrameDetalleFormTipoCompania.jButtonCancelarTipoCompania.setVisible(this.isVisibilidadCeldaCancelarTipoCompania);						
			this.jInternalFrameDetalleFormTipoCompania.jButtonGuardarCambiosTipoCompania.setVisible(this.isPermisoGuardarCambiosTipoCompania);							
		}
		
		this.jButtonGuardarCambiosTablaTipoCompania.setVisible(this.isPermisoActualizarTipoCompania);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCompania() {
		this.jInternalFrameDetalleFormTipoCompania.jButtonModificarTipoCompania.setVisible(this.isPermisoActualizarTipoCompania);	
		this.jInternalFrameDetalleFormTipoCompania.jButtonActualizarTipoCompania.setVisible(this.isPermisoActualizarTipoCompania);	
		this.jInternalFrameDetalleFormTipoCompania.jButtonEliminarTipoCompania.setVisible(this.isPermisoEliminarTipoCompania);
		this.jInternalFrameDetalleFormTipoCompania.jButtonCancelarTipoCompania.setVisible(this.isVisibilidadCeldaCancelarTipoCompania);							
		this.jInternalFrameDetalleFormTipoCompania.jButtonGuardarCambiosTipoCompania.setVisible((this.isVisibilidadCeldaGuardarTipoCompania && this.isPermisoGuardarCambiosTipoCompania));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoCompania() {
		if(TipoCompaniaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoCompania();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoCompania() {
	}
	
	public void jTableDatosTipoCompaniaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoCompania(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoCompaniaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompaniaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCompania.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCompania(this.gettipocompania(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCompania(this.tipocompania);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocompania =(TipoCompania) this.tipocompaniaLogic.getTipoCompanias().toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocompania =(TipoCompania) this.tipocompanias.toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocompania==null) {
						this.tipocompania = new TipoCompania();
					}

					this.setVariablesFormularioToObjetoActualTipoCompania(this.tipocompania,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCompania(this.tipocompania);
				}

				if(this.tipocompania.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipocompania.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCompania(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompaniaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompaniaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompaniaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoCompaniaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoCompania(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCompania.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoCompania.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoCompania.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompania =(TipoCompania) this.tipocompaniaLogic.getTipoCompanias().toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocompania =(TipoCompania) this.tipocompanias.toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoCompania(this.gettipocompania(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCompania(this.tipocompania);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipocompaniaLogic.getConnexion());

				if(this.tipocompania.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipocompania.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoCompania=(TitledBorder)this.jScrollPanelDatosTipoCompania.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoCompania.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoCompaniaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompaniaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCompania.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCompania(this.gettipocompania(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCompania(this.tipocompania);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocompania =(TipoCompania) this.tipocompaniaLogic.getTipoCompanias().toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocompania =(TipoCompania) this.tipocompanias.toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocompania==null) {
						this.tipocompania = new TipoCompania();
					}

					this.setVariablesFormularioToObjetoActualTipoCompania(this.tipocompania,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCompania(this.tipocompania);
				}

				if(this.tipocompania.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipocompania.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCompania(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompaniaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompaniaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompaniaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoCompaniaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompaniaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCompania.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCompania(this.gettipocompania(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCompania(this.tipocompania);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocompania =(TipoCompania) this.tipocompaniaLogic.getTipoCompanias().toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocompania =(TipoCompania) this.tipocompanias.toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocompania==null) {
						this.tipocompania = new TipoCompania();
					}

					this.setVariablesFormularioToObjetoActualTipoCompania(this.tipocompania,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCompania(this.tipocompania);
				}

				if(this.tipocompania.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipocompania.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCompania(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompaniaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompaniaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompaniaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoCompaniaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompaniaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCompania.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCompania(this.gettipocompania(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCompania(this.tipocompania);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocompania =(TipoCompania) this.tipocompaniaLogic.getTipoCompanias().toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocompania =(TipoCompania) this.tipocompanias.toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocompania==null) {
						this.tipocompania = new TipoCompania();
					}

					this.setVariablesFormularioToObjetoActualTipoCompania(this.tipocompania,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCompania(this.tipocompania);
				}

				if(this.tipocompania.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipocompania.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCompania(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompaniaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompaniaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompaniaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoCompaniaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoCompania(false,false);

			this.getTipoCompaniasFK_IdEmpresa();

			this.inicializarActualizarBindingTipoCompania(false);

			//if(TipoCompaniaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoCompania(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocompaniaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoCompania() {
		if(this.jInternalFrameDetalleFormTipoCompania!=null) {
		

		if(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoCompania!=null) {
			this.jInternalFrameDetalleFormTipoCompania.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoCompania.dispose();
			this.jInternalFrameDetalleFormTipoCompania=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoCompania!=null) {
			this.jInternalFrameReporteDinamicoTipoCompania.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoCompania.dispose();
			this.jInternalFrameReporteDinamicoTipoCompania=null;
		}
		
		if(this.jInternalFrameImportacionTipoCompania!=null) {
			this.jInternalFrameImportacionTipoCompania.setVisible(false);	    			
			this.jInternalFrameImportacionTipoCompania.dispose();
			this.jInternalFrameImportacionTipoCompania=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoCompania();
			
			TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoCompania")) {
				jButtonNuevoTipoCompaniaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoCompania")) {
				jButtonDuplicarTipoCompaniaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoCompania")) {
				jButtonCopiarTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoCompania")) {
				jButtonVerFormTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoCompania")) {
				jButtonNuevoTipoCompaniaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoCompania")) {
				jButtonDuplicarTipoCompaniaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoCompania")) {
				jButtonNuevoTipoCompaniaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoCompania")) {
				jButtonDuplicarTipoCompaniaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoCompania")) {
				jButtonNuevoTipoCompaniaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoCompania")) {
				jButtonNuevoTipoCompaniaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoCompania")) {
				jButtonNuevoTipoCompaniaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoCompania")) {
				jButtonModificarTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoCompania")) {
				jButtonModificarTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoCompania")) {
				jButtonModificarTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoCompania")) {
				jButtonActualizarTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoCompania")) {
				jButtonActualizarTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoCompania")) {
				jButtonActualizarTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoCompania")) {
				jButtonEliminarTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoCompania")) {
				jButtonEliminarTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoCompania")) {
				jButtonEliminarTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoCompania")) {
				jButtonCancelarTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoCompania")) {
				jButtonCancelarTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoCompania")) {
				jButtonCancelarTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoCompania")) {
				jButtonCerrarTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoCompania")) {
				jButtonCerrarTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoCompania")) {
				jButtonCerrarTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoCompania")) {
				jButtonMostrarOcultarTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoCompania")) {
				jButtonCancelarTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoCompania")) {
				jButtonGuardarCambiosTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoCompania")) {
				jButtonGuardarCambiosTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoCompania")) {
				jButtonCopiarTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoCompania")) {
				jButtonVerFormTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoCompania")) {
				jButtonGuardarCambiosTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoCompania")) {
				jButtonCopiarTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoCompania")) {
				jButtonVerFormTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoCompania")) {
				jButtonGuardarCambiosTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoCompania")) {
				jButtonGuardarCambiosTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoCompania")) {
				jButtonGuardarCambiosTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoCompania")) {
				jButtonRecargarInformacionTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoCompania")) {
				jButtonRecargarInformacionTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoCompania")) {
				jButtonRecargarInformacionTipoCompaniaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoCompania")) {
				jButtonAnterioresTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoCompania")) {
				jButtonAnterioresTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoCompania")) {
				jButtonAnterioresTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoCompania")) {
				jButtonSiguientesTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoCompania")) {
				jButtonSiguientesTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoCompania")) {
				jButtonSiguientesTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoCompania") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoCompania")) {
				jButtonAbrirOrderByTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoCompania") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoCompania")) {
				jButtonMostrarOcultarTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCompania")) {
				jButtonNuevoGuardarCambiosTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoCompania")) {
				jButtonNuevoGuardarCambiosTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoCompania")) {
				jButtonNuevoGuardarCambiosTipoCompaniaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoCompania")) {
				jButtonCerrarReporteDinamicoTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoCompania")) {
				jButtonGenerarReporteDinamicoTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoCompania")) {
				
				jButtonGenerarExcelReporteDinamicoTipoCompaniaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoCompania")) {
				jButtonCerrarImportacionTipoCompaniaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoCompania")) {
				
				jButtonGenerarImportacionTipoCompaniaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoCompania")) {
				
				jButtonAbrirImportacionTipoCompaniaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoCompania")) {
				jComboBoxTiposAccionesTipoCompaniaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoCompania")) {
				jComboBoxTiposRelacionesTipoCompaniaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoCompania")) {
				jComboBoxTiposAccionesTipoCompaniaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoCompania")) {
				
				jComboBoxTiposSeleccionarTipoCompaniaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoCompania")) {
				jTextFieldValorCampoGeneralTipoCompaniaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoCompania")) {
				jButtonAbrirOrderByTipoCompaniaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoCompania")) {
				jButtonAbrirOrderByTipoCompaniaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoCompania")) {
				jButtonCerrarOrderByTipoCompaniaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCompaniaBusqueda")) {
				this.jButtonidTipoCompaniaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoCompaniaUpdate")) {
				this.jButtonid_empresaTipoCompaniaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoCompaniaBusqueda")) {
				this.jButtonid_empresaTipoCompaniaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCompaniaBusqueda")) {
				this.jButtoncodigoTipoCompaniaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCompaniaBusqueda")) {
				this.jButtonnombreTipoCompaniaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoCompania();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCompaniaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompania);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocompania);
				
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
				
				


				
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCompania.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCompania.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoCompania tipocompaniaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipocompaniaLocal=this.tipocompania;
			} else {
				tipocompaniaLocal=this.tipocompaniaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompania);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocompania);
				
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
							
				
				


				
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCompania.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCompania.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCompaniaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCompania.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompaniaAnterior =(TipoCompania) this.tipocompaniaLogic.getTipoCompanias().toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocompaniaAnterior =(TipoCompania) this.tipocompanias.toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
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
			
			TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
			
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
			
			


			
			TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCompaniaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompania);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocompania);
				
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
								
						
				


				
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCompania.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCompania.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompania);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocompania);
				
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
								
				
				


				
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCompania.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCompania.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCompaniaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCompania.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompaniaAnterior =(TipoCompania) this.tipocompaniaLogic.getTipoCompanias().toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocompaniaAnterior =(TipoCompania) this.tipocompanias.toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompania);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocompania);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCompaniaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCompania.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompaniaAnterior =(TipoCompania) this.tipocompaniaLogic.getTipoCompanias().toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocompaniaAnterior =(TipoCompania) this.tipocompanias.toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCompaniaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompania);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocompania);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompania);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocompania);
				
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
							
				
				


				
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCompania.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCompania.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCompaniaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCompania.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocompaniaAnterior =(TipoCompania) this.tipocompaniaLogic.getTipoCompanias().toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocompaniaAnterior =(TipoCompania) this.tipocompanias.toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
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
			
			TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
			
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
			
			


			
			TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCompaniaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompania);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocompania);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompania);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocompania);
				
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
								
				
				


				
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCompania.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCompania.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCompaniaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCompania.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompaniaAnterior =(TipoCompania) this.tipocompaniaLogic.getTipoCompanias().toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocompaniaAnterior =(TipoCompania) this.tipocompanias.toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCompaniaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompania);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocompania);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCompaniaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompania);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocompania);
				
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoCompania")) {
					jCheckBoxSeleccionarTodosTipoCompaniaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoCompania")) {
					jCheckBoxSeleccionadosTipoCompaniaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoCompania")) {
					
				}
				
				


				
				
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCompania.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCompania.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompania);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipocompania);
				
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
												
				
				


				
				
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCompania.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCompania.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCompaniaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCompania.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocompaniaAnterior =(TipoCompania) this.tipocompaniaLogic.getTipoCompanias().toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocompaniaAnterior =(TipoCompania) this.tipocompanias.toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCompaniaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompania);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocompania);
				
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
				
				
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
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
			
			TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
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
			
			


			
			TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCompaniaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompania);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocompania);
				
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCompania.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCompania.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocompania);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocompania);
				
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
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
				
				


				
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCompania.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCompania.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCompaniaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCompania.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocompaniaAnterior =(TipoCompania) this.tipocompaniaLogic.getTipoCompanias().toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocompaniaAnterior =(TipoCompania) this.tipocompanias.toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoCompania")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoCompaniaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoCompania.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipocompania =(TipoCompania) this.tipocompaniaLogic.getTipoCompanias().toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipocompania =(TipoCompania) this.tipocompanias.toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipocompania);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoCompania")) {
				
				}
				
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoCompania")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoCompania.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoCompania")) {
			
			}
			
			TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoCompania();
			
			TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoCompania")) {
				jButtonNuevoTipoCompaniaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoCompania")) {
				jButtonDuplicarTipoCompaniaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoCompania")) {
				jButtonCopiarTipoCompaniaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoCompania")) {
				jButtonVerFormTipoCompaniaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoCompania")) {
				jButtonNuevoTipoCompaniaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoCompania")) {
				jButtonModificarTipoCompaniaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoCompania")) {
				jButtonActualizarTipoCompaniaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoCompania")) {
				jButtonEliminarTipoCompaniaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoCompania")) {
				jButtonGuardarCambiosTipoCompaniaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoCompania")) {
				jButtonCancelarTipoCompaniaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoCompania")) {
				jButtonCerrarTipoCompaniaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoCompania")) {
				jButtonGuardarCambiosTipoCompaniaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCompania")) {
				jButtonNuevoGuardarCambiosTipoCompaniaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoCompania")) {
				jButtonAbrirOrderByTipoCompaniaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoCompania")) {
				jButtonRecargarInformacionTipoCompaniaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoCompania")) {
				jButtonAnterioresTipoCompaniaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoCompania")) {
				jButtonSiguientesTipoCompaniaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCompaniaBusqueda")) {
				this.jButtonidTipoCompaniaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoCompaniaUpdate")) {
				this.jButtonid_empresaTipoCompaniaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoCompaniaBusqueda")) {
				this.jButtonid_empresaTipoCompaniaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCompaniaBusqueda")) {
				this.jButtoncodigoTipoCompaniaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCompaniaBusqueda")) {
				this.jButtonnombreTipoCompaniaBusquedaActionPerformed(evt);
			}
			
			TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoCompania();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoCompania")) {
				closingInternalFrameTipoCompania();
				
			} else if(sTipo.equals("jButtonCancelarTipoCompania")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoCompania = (JInternalFrameBase)evt.getSource();
	            	
	            TipoCompaniaBeanSwingJInternalFrame jInternalFrameParent=(TipoCompaniaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCompania.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoCompaniaActionPerformed(null);
			}
			
			TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocompania,new Object(),this.tipocompaniaParameterGeneral,this.tipocompaniaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoCompania(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoCompania(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoCompania(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipocompania)) {
			if(!esControlTabla) {
				if(TipoCompaniaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoCompania(this.tipocompania,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCompania(this.tipocompania);			
				}
				
				if(this.tipocompaniaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoCompania(this.tipocompania,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocompaniaReturnGeneral=tipocompaniaLogic.procesarEventosTipoCompaniasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocompaniaLogic.getTipoCompanias(),this.tipocompania,this.tipocompaniaParameterGeneral,this.isEsNuevoTipoCompania,classes);//this.tipocompaniaLogic.getTipoCompania()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoCompania(this.tipocompaniaReturnGeneral,this.tipocompaniaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipocompaniaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoCompania(classes,this.tipocompaniaReturnGeneral,this.tipocompaniaBean,false);
					}
						
					if(this.tipocompaniaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoCompania(this.tipocompaniaReturnGeneral.getTipoCompania());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoCompania(this.tipocompaniaReturnGeneral.getTipoCompania());	
					}
						
					if(this.tipocompaniaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoCompania(this.tipocompaniaReturnGeneral.getTipoCompania(),classes);//this.tipocompaniaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoCompania(this.tipocompania,classes);//this.tipocompaniaBean);									
				}
			
				if(TipoCompaniaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoCompania(this.tipocompania,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCompania(this.tipocompania);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipocompaniaAnterior!=null) {
						this.tipocompania=this.tipocompaniaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocompaniaReturnGeneral=tipocompaniaLogic.procesarEventosTipoCompaniasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocompaniaLogic.getTipoCompanias(),this.tipocompania,this.tipocompaniaParameterGeneral,this.isEsNuevoTipoCompania,classes);//this.tipocompaniaLogic.getTipoCompania()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocompaniaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocompaniaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipocompaniaReturnGeneral.getTipoCompania(),tipocompaniaLogic.getTipoCompanias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipocompaniaReturnGeneral.getTipoCompania(),this.tipocompanias);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoCompania.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoCompania.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoCompania();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoCompania() throws Exception {
		
		TipoCompaniaModel tipocompaniaModel=(TipoCompaniaModel)this.jTableDatosTipoCompania.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocompaniaModel.tipocompanias=this.tipocompaniaLogic.getTipoCompanias();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipocompaniaModel.tipocompanias=this.tipocompanias;
		}
		
		
		((TipoCompaniaModel) this.jTableDatosTipoCompania.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoCompania() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipocompaniaAnterior(),this.tipocompaniaLogic.getTipoCompanias());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipocompaniaAnterior(),this.tipocompanias);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoCompania();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoCompania(TipoCompania tipocompania,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DatoConstitucion.class)) {
					this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucionLogic.setDatoConstitucions(tipocompania.getDatoConstitucions());
					this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoConstitucion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
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
										
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocompania,new Object(),generalEntityParameterGeneral,this.tipocompaniaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipocompaniaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoCompaniaConstantesFunciones.getClassesRelationshipsOfTipoCompania(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoCompaniaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoCompania(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoCompania(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoCompaniaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocompania,new Object(),generalEntityParameterGeneral,this.tipocompaniaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoCompania(TipoCompaniaBean tipocompaniaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DatoConstitucion.class)) {
					this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucionLogic.setDatoConstitucions(tipocompania.getDatoConstitucions());
					this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoConstitucion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoCompania(ArrayList<Classe> classes,TipoCompaniaReturnGeneral tipocompaniaReturnGeneral,TipoCompaniaBean tipocompaniaBean,Boolean conDefault) throws Exception {
		
			this.tipocompaniaBean.setDatoConstitucions(tipocompaniaReturnGeneral.getTipoCompania().getDatoConstitucions());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoCompania(TipoCompania tipocompania,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DatoConstitucion.class)) {
					tipocompania.setDatoConstitucions(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionBeanSwingJInternalFrame.datoconstitucionLogic.getDatoConstitucions());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipocompania)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoCompania = new TipoCompaniaDetalleFormJInternalFrame(jDesktopPane,this.tipocompaniaSessionBean.getConGuardarRelaciones(),this.tipocompaniaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCompania);
		this.jInternalFrameDetalleFormTipoCompania.setVisible(false);
		this.jInternalFrameDetalleFormTipoCompania.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoCompania.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoCompania.tipocompaniaLogic=this.tipocompaniaLogic;
		
		this.cargarCombosFrameForeignKeyTipoCompania("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCompania();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCompania();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoCompania("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoCompania();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoCompania.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCompania"));
		
		this.jInternalFrameDetalleFormTipoCompania.jButtonModificarTipoCompania.addActionListener(new ButtonActionListener(this,"ModificarTipoCompania"));

		
		this.jInternalFrameDetalleFormTipoCompania.jButtonModificarToolBarTipoCompania.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCompania"));
					
		this.jInternalFrameDetalleFormTipoCompania.jMenuItemModificarTipoCompania.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCompania"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCompania.jButtonActualizarTipoCompania.addActionListener (new ButtonActionListener(this,"ActualizarTipoCompania"));
		
		
		this.jInternalFrameDetalleFormTipoCompania.jButtonActualizarToolBarTipoCompania.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCompania"));
						
		this.jInternalFrameDetalleFormTipoCompania.jMenuItemActualizarTipoCompania.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCompania"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCompania.jButtonEliminarTipoCompania.addActionListener (new ButtonActionListener(this,"EliminarTipoCompania"));
		
		
		this.jInternalFrameDetalleFormTipoCompania.jButtonEliminarToolBarTipoCompania.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCompania"));
								
		this.jInternalFrameDetalleFormTipoCompania.jMenuItemEliminarTipoCompania.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCompania"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCompania.jButtonCancelarTipoCompania.addActionListener (new ButtonActionListener(this,"CancelarTipoCompania"));
		
		
		this.jInternalFrameDetalleFormTipoCompania.jButtonCancelarToolBarTipoCompania.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCompania"));
					
		this.jInternalFrameDetalleFormTipoCompania.jMenuItemCancelarTipoCompania.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCompania"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoCompania.jMenuItemDetalleCerrarTipoCompania.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCompania"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCompania.jButtonGuardarCambiosToolBarTipoCompania.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCompania"));
		
		
		
		this.jInternalFrameDetalleFormTipoCompania.jButtonGuardarCambiosToolBarTipoCompania.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCompania"));
		
		
		
		this.jInternalFrameDetalleFormTipoCompania.jComboBoxTiposAccionesFormularioTipoCompania.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCompania"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCompania.jButtonidTipoCompaniaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCompaniaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCompania.jButtonid_empresaTipoCompaniaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoCompaniaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCompania.jButtonid_empresaTipoCompaniaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoCompaniaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCompania.jButtoncodigoTipoCompaniaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCompaniaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCompania.jButtonnombreTipoCompaniaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCompaniaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoCompania.jTabbedPaneRelacionesTipoCompania.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCompania"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoCompania"));
		
		if(this.jInternalFrameDetalleFormTipoCompania!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompania.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCompania"));
		}
		
		this.jTableDatosTipoCompania.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoCompania"));
		
		this.jTableDatosTipoCompania.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoCompania"));
		
		this.jButtonNuevoTipoCompania.addActionListener(new ButtonActionListener(this,"NuevoTipoCompania"));
		
		this.jButtonDuplicarTipoCompania.addActionListener(new ButtonActionListener(this,"DuplicarTipoCompania"));
		
		this.jButtonCopiarTipoCompania.addActionListener(new ButtonActionListener(this,"CopiarTipoCompania"));
		
		this.jButtonVerFormTipoCompania.addActionListener(new ButtonActionListener(this,"VerFormTipoCompania"));
		
		
		this.jButtonNuevoToolBarTipoCompania.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoCompania"));
			
		this.jButtonDuplicarToolBarTipoCompania.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoCompania"));
			
		this.jMenuItemNuevoTipoCompania.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoCompania"));
			
		this.jMenuItemDuplicarTipoCompania.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoCompania"));		
		
		
		this.jButtonNuevoRelacionesTipoCompania.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoCompania"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoCompania.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoCompania"));
			
		this.jMenuItemNuevoRelacionesTipoCompania.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoCompania"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCompania!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompania.jButtonModificarTipoCompania.addActionListener(new ButtonActionListener(this,"ModificarTipoCompania"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCompania!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompania.jButtonModificarToolBarTipoCompania.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCompania"));
			
			this.jInternalFrameDetalleFormTipoCompania.jMenuItemModificarTipoCompania.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCompania"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCompania!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoCompania.jButtonActualizarTipoCompania.addActionListener (new ButtonActionListener(this,"ActualizarTipoCompania"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCompania!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompania.jButtonActualizarToolBarTipoCompania.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCompania"));
				
			this.jInternalFrameDetalleFormTipoCompania.jMenuItemActualizarTipoCompania.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCompania"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCompania!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompania.jButtonEliminarTipoCompania.addActionListener (new ButtonActionListener(this,"EliminarTipoCompania"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCompania!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompania.jButtonEliminarToolBarTipoCompania.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCompania"));
						
			this.jInternalFrameDetalleFormTipoCompania.jMenuItemEliminarTipoCompania.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCompania"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCompania!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompania.jButtonCancelarTipoCompania.addActionListener (new ButtonActionListener(this,"CancelarTipoCompania"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCompania!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompania.jButtonCancelarToolBarTipoCompania.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCompania"));
			
			this.jInternalFrameDetalleFormTipoCompania.jMenuItemCancelarTipoCompania.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCompania"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoCompania.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoCompania"));		
		
		
		this.jButtonCerrarTipoCompania.addActionListener (new ButtonActionListener(this,"CerrarTipoCompania"));
		
		
		this.jButtonCerrarToolBarTipoCompania.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoCompania"));
			
		this.jMenuItemCerrarTipoCompania.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoCompania"));
			
		if(this.jInternalFrameDetalleFormTipoCompania!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompania.jMenuItemDetalleCerrarTipoCompania.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCompania"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCompania!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompania.jButtonGuardarCambiosTipoCompania.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoCompania"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCompania!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompania.jButtonGuardarCambiosToolBarTipoCompania.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCompania"));
		}
		
		this.jButtonCopiarToolBarTipoCompania.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoCompania"));
			
		this.jButtonVerFormToolBarTipoCompania.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoCompania"));
		
		this.jMenuItemGuardarCambiosTipoCompania.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoCompania"));
			
		this.jMenuItemCopiarTipoCompania.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoCompania"));		
		
		this.jMenuItemVerFormTipoCompania.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoCompania"));		
		
		
		this.jButtonGuardarCambiosTablaTipoCompania.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCompania"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCompania.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoCompania"));
			
		this.jMenuItemGuardarCambiosTablaTipoCompania.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCompania"));		
		
		
		
		this.jButtonRecargarInformacionTipoCompania.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoCompania"));
					
		this.jButtonRecargarInformacionToolBarTipoCompania.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoCompania"));
		
		this.jMenuItemRecargarInformacionTipoCompania.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoCompania"));		
		
		
		
		this.jButtonAnterioresTipoCompania.addActionListener (new ButtonActionListener(this,"AnterioresTipoCompania"));
		
		
		this.jButtonAnterioresToolBarTipoCompania.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoCompania"));
		
		this.jMenuItemAnterioresTipoCompania.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoCompania"));		
		
		
		this.jButtonSiguientesTipoCompania.addActionListener (new ButtonActionListener(this,"SiguientesTipoCompania"));
		
		
		this.jButtonSiguientesToolBarTipoCompania.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoCompania"));
			
		this.jMenuItemSiguientesTipoCompania.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoCompania"));
			
		this.jMenuItemAbrirOrderByTipoCompania.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoCompania"));
			
		this.jMenuItemMostrarOcultarTipoCompania.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoCompania"));
			
		this.jMenuItemDetalleAbrirOrderByTipoCompania.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoCompania"));
			
		this.jMenuItemDetalleMostarOcultarTipoCompania.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoCompania"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoCompania.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoCompania"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCompania.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoCompania"));
			
		this.jMenuItemNuevoGuardarCambiosTipoCompania.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoCompania"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoCompania.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoCompania"));

		this.jCheckBoxSeleccionadosTipoCompania.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoCompania"));
		
		if(this.jInternalFrameDetalleFormTipoCompania!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompania.jComboBoxTiposAccionesFormularioTipoCompania.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCompania"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoCompania.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoCompania"));
			
		this.jComboBoxTiposAccionesTipoCompania.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoCompania"));
					
		this.jComboBoxTiposSeleccionarTipoCompania.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoCompania"));
			
		this.jTextFieldValorCampoGeneralTipoCompania.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoCompania"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCompania!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCompania.jButtonidTipoCompaniaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCompaniaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCompania.jButtonid_empresaTipoCompaniaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoCompaniaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCompania.jButtonid_empresaTipoCompaniaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoCompaniaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCompania.jButtoncodigoTipoCompaniaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCompaniaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCompania.jButtonnombreTipoCompaniaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCompaniaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoCompania!=null) {
				this.jInternalFrameReporteDinamicoTipoCompania.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCompania"));
				this.jInternalFrameReporteDinamicoTipoCompania.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCompania"));
				this.jInternalFrameReporteDinamicoTipoCompania.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCompania"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoCompania.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCompania"));				
			//this.jButtonGenerarReporteDinamicoTipoCompania.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCompania"));
			//this.jButtonGenerarExcelReporteDinamicoTipoCompania.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCompania"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoCompania!=null) {
				this.jInternalFrameImportacionTipoCompania.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCompania"));
				this.jInternalFrameImportacionTipoCompania.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCompania"));
				this.jInternalFrameImportacionTipoCompania.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCompania"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoCompania.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoCompania"));
			
			this.jButtonAbrirOrderByToolBarTipoCompania.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoCompania"));			
			
			if(this.jInternalFrameOrderByTipoCompania!=null) {
				this.jInternalFrameOrderByTipoCompania.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCompania"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoCompania!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoCompania!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCompania.jTabbedPaneRelacionesTipoCompania.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCompania"));
		
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
            		closingInternalFrameTipoCompania();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoCompania.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoCompania = (JInternalFrameBase)event.getSource();
	            	
	            TipoCompaniaBeanSwingJInternalFrame jInternalFrameParent=(TipoCompaniaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCompania.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoCompaniaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoCompania.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoCompaniaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoCompania.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoCompania.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCompaniaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCompaniaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCompaniaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoCompania";
		inputMap = this.jButtonNuevoTipoCompania.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoCompania.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCompaniaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCompaniaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCompaniaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCompaniaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoCompania";
		inputMap = this.jButtonNuevoRelacionesTipoCompania.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoCompania.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCompaniaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoCompania";
		inputMap = this.jButtonModificarTipoCompania.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoCompania.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoCompaniaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoCompania";
		inputMap = this.jButtonActualizarTipoCompania.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoCompania.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoCompaniaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoCompania";
		inputMap = this.jButtonEliminarTipoCompania.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoCompania.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoCompaniaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoCompania";
		inputMap = this.jButtonCancelarTipoCompania.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoCompania.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoCompaniaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoCompania";
		inputMap = this.jButtonCerrarTipoCompania.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoCompania.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoCompaniaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoCompania.jButtonGuardarCambiosTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoCompania";
		inputMap = this.jInternalFrameDetalleFormTipoCompania.jButtonGuardarCambiosTipoCompania.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoCompania.jButtonGuardarCambiosTipoCompania.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoCompaniaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoCompania.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoCompaniaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoCompania.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoCompaniaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoCompania.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoCompaniaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoCompania.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoCompaniaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCompania.jButtonidTipoCompaniaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCompaniaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCompania.jButtonid_empresaTipoCompaniaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoCompaniaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCompania.jButtonid_empresaTipoCompaniaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoCompaniaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCompania.jButtoncodigoTipoCompaniaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCompaniaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCompania.jButtonnombreTipoCompaniaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCompaniaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoCompania.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoCompaniaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoCompaniaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoCompania.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoCompania(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoCompania tipocompaniaAux:this.tipocompaniaLogic.getTipoCompanias()) {
					tipocompaniaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCompania tipocompaniaAux:tipocompanias) {
					tipocompaniaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoCompaniaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCompania(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCompania tipocompaniaAux:this.tipocompaniaLogic.getTipoCompanias()) {
						tipocompaniaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCompania tipocompaniaAux:tipocompanias) {
						tipocompaniaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoCompania tipocompaniaAux:this.tipocompaniaLogic.getTipoCompanias()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCompania tipocompaniaAux:tipocompanias) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCompania(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCompania.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCompania.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCompania,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoCompaniaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCompania(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoCompania.getSelectedRows();
			
			TipoCompania tipocompaniaLocal=new TipoCompania();
			
			//this.seleccionarTodosTipoCompania(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocompaniaLocal =(TipoCompania) this.tipocompaniaLogic.getTipoCompanias().toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipocompaniaLocal =(TipoCompania) this.tipocompanias.toArray()[this.jTableDatosTipoCompania.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipocompaniaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCompania tipocompaniaAux:this.tipocompaniaLogic.getTipoCompanias()) {
						tipocompaniaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCompania tipocompaniaAux:tipocompanias) {
						tipocompaniaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoCompania(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCompania.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCompania.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCompania,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoCompaniaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoCompaniaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoCompaniaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoCompania(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoCompania.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCompania tipocompaniaAux:this.tipocompaniaLogic.getTipoCompanias()) {
				
						if(sTipoSeleccionar.equals(TipoCompaniaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocompaniaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCompaniaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocompaniaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCompania tipocompaniaAux:tipocompanias) {
					
						if(sTipoSeleccionar.equals(TipoCompaniaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocompaniaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCompaniaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocompaniaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCompania(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoCompaniaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoCompania(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoCompania=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoCompania.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoCompania.jComboBoxTiposAccionesFormularioTipoCompania.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoCompania) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoCompania(conSplash);
				
					this.generarReporteTipoCompaniasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCompania.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCompania.jComboBoxTiposAccionesFormularioTipoCompania.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoCompaniasSeleccionados();
				//this.jComboBoxTiposAccionesTipoCompania.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCompaniasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoCompania.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCompaniasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoCompania.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCompania();
				
				this.exportarTipoCompaniasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCompania.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCompania.jComboBoxTiposAccionesFormularioTipoCompania.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoCompanias();
				//this.importarTipoCompanias();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCompania.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCompania.jComboBoxTiposAccionesFormularioTipoCompania.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCompania();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoCompaniasSeleccionados();
				//this.jComboBoxTiposAccionesTipoCompania.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Compania", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoCompania();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoCompania)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoCompania(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Compania",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCompania.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCompania.jComboBoxTiposAccionesFormularioTipoCompania.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoCompaniaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoCompania) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoCompania(conSplash);
					
						//this.actualizarParametrosGeneralTipoCompania();
						
						this.generarReporteProcesoAccionTipoCompaniasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoCompania.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoCompania.jComboBoxTiposAccionesFormularioTipoCompania.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoCompaniaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo CompaniaS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Compania", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoCompania();
				
						this.actualizarParametrosGeneralTipoCompania();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipocompaniaReturnGeneral=tipocompaniaLogic.procesarAccionTipoCompaniasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipocompaniaLogic.getTipoCompanias(),this.tipocompaniaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoCompaniaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoCompania.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoCompania.jComboBoxTiposAccionesFormularioTipoCompania.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoCompania();
					
					TipoCompaniaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoCompaniaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoCompania.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoCompania.jComboBoxTiposAccionesFormularioTipoCompania.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoCompania(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoCompaniaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoCompania();
			
			if(this.jInternalFrameDetalleFormTipoCompania==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoCompania> tipocompaniasSeleccionados=new ArrayList<TipoCompania>();		
			TipoCompania tipocompania=new TipoCompania();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoCompania(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoCompania.getSelectedItem();
			
			
			
			
			tipocompaniasSeleccionados=this.getTipoCompaniasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipocompaniasSeleccionados.size()==1) {
				for(TipoCompania tipocompaniaAux:tipocompaniasSeleccionados) {
					tipocompania=tipocompaniaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Dato Constitucion")) {
					jButtonDatoConstitucionActionPerformed(null,rowIndex,true,false,tipocompania);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoCompania();
			
      		//this.finishProcessTipoCompania(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoCompaniaReturnGeneral() throws Exception {
		if(this.tipocompaniaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipocompaniaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipocompaniaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipocompaniaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipocompaniaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipocompaniaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoCompania(false);
		}
		
		if(this.tipocompaniaReturnGeneral.getConRetornoLista() || this.tipocompaniaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipocompaniaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocompaniaLogic.setTipoCompanias(this.tipocompaniaReturnGeneral.getTipoCompanias());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipocompaniaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocompaniaLogic.setTipoCompania(this.tipocompaniaReturnGeneral.getTipoCompania());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoCompania(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoCompania() throws Exception {
		
		
	}
	
	public ArrayList<TipoCompania> getTipoCompaniasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoCompania> tipocompaniasSeleccionados=new ArrayList<TipoCompania>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoCompania) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoCompania tipocompaniaAux:tipocompaniaLogic.getTipoCompanias()) {
					if(tipocompaniaAux.getIsSelected()) {
						tipocompaniasSeleccionados.add(tipocompaniaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCompania tipocompaniaAux:this.tipocompanias) {
					if(tipocompaniaAux.getIsSelected()) {
						tipocompaniasSeleccionados.add(tipocompaniaAux);				
					}
				}
			}
			
			if(tipocompaniasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipocompaniasSeleccionados.addAll(this.tipocompaniaLogic.getTipoCompanias());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipocompaniasSeleccionados.addAll(this.tipocompanias);				
					}
				}
			}
		} else {
			tipocompaniasSeleccionados.add(this.tipocompania);
		}
		
		return tipocompaniasSeleccionados;
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
	
	public void generarReporteTipoCompaniasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoCompaniasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoCompaniasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCompaniasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCompaniasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoCompaniasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Compania",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoCompaniasSeleccionados() throws Exception {
		ArrayList<TipoCompania> tipocompaniasSeleccionados=new ArrayList<TipoCompania>();		
		
		tipocompaniasSeleccionados=this.getTipoCompaniasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoCompanias("Todos",tipocompaniasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoCompaniasSeleccionados() throws Exception {
		ArrayList<TipoCompania> tipocompaniasSeleccionados=new ArrayList<TipoCompania>();		
		
		tipocompaniasSeleccionados=this.getTipoCompaniasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoCompanias("Todos",tipocompaniasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoCompaniasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoCompania> tipocompaniasSeleccionados=new ArrayList<TipoCompania>();
		
		tipocompaniasSeleccionados=this.getTipoCompaniasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoCompanias("Todos",tipocompaniasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoCompaniasSeleccionados() throws Exception {
		ArrayList<TipoCompania> tipocompaniasSeleccionados=new ArrayList<TipoCompania>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoCompania();
		
		
		tipocompaniasSeleccionados=this.getTipoCompaniasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoCompania();
		
		
		//this.generarReporteTipoCompanias("Todos",tipocompaniasSeleccionados ,tipocompaniaImplementable,tipocompaniaImplementableHome);
	}
	
	public void mostrarImportacionTipoCompanias() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoCompania();
		
		this.abrirFrameImportacionTipoCompania();		
		
			
		//this.generarReporteTipoCompanias("Todos",tipocompaniasSeleccionados ,tipocompaniaImplementable,tipocompaniaImplementableHome);
	}
	
	public void importarTipoCompanias() throws Exception {		
	
	}
	
	public void exportarTipoCompaniasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoCompaniasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoCompaniasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoCompaniasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Compania",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoCompaniasSeleccionados() throws Exception {
		ArrayList<TipoCompania> tipocompaniasSeleccionados=new ArrayList<TipoCompania>();		
		
		tipocompaniasSeleccionados=this.getTipoCompaniasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocompania."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoCompania(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoCompania tipocompaniaAux:tipocompaniasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoCompania(tipocompaniaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipocompaniaAux.setsDetalleGeneralEntityReporte(tipocompaniaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Compania",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoCompania(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoCompaniaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCompaniaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCompaniaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCompaniaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCompaniaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoCompania(TipoCompania tipocompania,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipocompania.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocompania.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocompania.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocompania.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocompania.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoCompaniasSeleccionados() throws Exception {
		ArrayList<TipoCompania> tipocompaniasSeleccionados=new ArrayList<TipoCompania>();		
		
		tipocompaniasSeleccionados=this.getTipoCompaniasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocompania.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoCompanias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoCompania(row);				
				iRow++;
			}				
			
			for(TipoCompania tipocompaniaAux:tipocompaniasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoCompania(tipocompaniaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Compania",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoCompaniasSeleccionados() throws Exception {
		ArrayList<TipoCompania> tipocompaniasSeleccionados=new ArrayList<TipoCompania>();		
		
		tipocompaniasSeleccionados=this.getTipoCompaniasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocompania.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipocompanias");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipocompania");
			//elementRoot.appendChild(element);
		
			for(TipoCompania tipocompaniaAux:tipocompaniasSeleccionados) {
				element = document.createElement("tipocompania");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoCompania(tipocompaniaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Compania",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoCompania(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCompaniaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCompaniaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoCompaniaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCompaniaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCompaniaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoCompania(TipoCompania tipocompania,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipocompania.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocompania.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocompania.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocompania.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoCompania(TipoCompania tipocompania,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoCompaniaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipocompania.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoCompaniaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipocompania.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoCompaniaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipocompania.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoCompaniaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipocompania.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoCompaniaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipocompania.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoCompaniasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoCompania> tipocompaniasSeleccionados=new ArrayList<TipoCompania>();
		
		tipocompaniasSeleccionados=this.getTipoCompaniasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoCompania(tipocompaniasSeleccionados);
		
		this.generarReporteTipoCompanias("Todos",tipocompaniasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoCompania(ArrayList<TipoCompania> tipocompaniasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoCompania tipocompaniaAux:tipocompaniasSeleccionados) {
				tipocompaniaAux.setsDetalleGeneralEntityReporte(tipocompaniaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoCompaniaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipocompaniaAux.setsDescripcionGeneralEntityReporte1(tipocompaniaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoCompaniaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipocompaniaAux.setsDescripcionGeneralEntityReporte1(tipocompaniaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoCompaniaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipocompaniaAux.setsDescripcionGeneralEntityReporte1(tipocompaniaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCompaniaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoCompania(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoCompania=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoCompania=true;
				this.isVisibilidadCeldaGuardarCambiosTipoCompania=true;
			}
			
			this.isVisibilidadCeldaModificarTipoCompania=false;
			this.isVisibilidadCeldaActualizarTipoCompania=false;
			this.isVisibilidadCeldaEliminarTipoCompania=false;
			this.isVisibilidadCeldaCancelarTipoCompania=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCompania=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCompania=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoCompania=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCompania=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCompania=false;
			this.isVisibilidadCeldaModificarTipoCompania=false;
			this.isVisibilidadCeldaActualizarTipoCompania=true;
			this.isVisibilidadCeldaEliminarTipoCompania=false;
			this.isVisibilidadCeldaCancelarTipoCompania=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCompania=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCompania=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoCompania=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCompania=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCompania=false;
			this.isVisibilidadCeldaModificarTipoCompania=false;
			this.isVisibilidadCeldaActualizarTipoCompania=true;
			this.isVisibilidadCeldaEliminarTipoCompania=true;
			this.isVisibilidadCeldaCancelarTipoCompania=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCompania=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCompania=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoCompania=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCompania=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCompania=false;
			this.isVisibilidadCeldaModificarTipoCompania=false;
			this.isVisibilidadCeldaActualizarTipoCompania=true;
			this.isVisibilidadCeldaEliminarTipoCompania=false;
			this.isVisibilidadCeldaCancelarTipoCompania=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCompania=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCompania=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoCompania=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCompania=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCompania=true;
			this.isVisibilidadCeldaModificarTipoCompania=false;
			this.isVisibilidadCeldaActualizarTipoCompania=false;
			this.isVisibilidadCeldaEliminarTipoCompania=false;
			this.isVisibilidadCeldaCancelarTipoCompania=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCompania=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCompania=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoCompania=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCompania=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCompania=false;
			this.isVisibilidadCeldaActualizarTipoCompania=false;
			this.isVisibilidadCeldaEliminarTipoCompania=false;
			this.isVisibilidadCeldaCancelarTipoCompania=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCompania=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCompania=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoCompania=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCompania=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCompania=false;
			this.isVisibilidadCeldaModificarTipoCompania=true;
			this.isVisibilidadCeldaActualizarTipoCompania=false;
			this.isVisibilidadCeldaEliminarTipoCompania=false;
			this.isVisibilidadCeldaCancelarTipoCompania=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCompania=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCompania=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoCompaniaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoCompania=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCompania=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCompania=true;
		} else {
			this.actualizarEstadoPanelsTipoCompania(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoCompania=false;
			//this.isVisibilidadCeldaVerFormTipoCompania=false;
			this.isVisibilidadCeldaDuplicarTipoCompania=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipocompaniaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCompania=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoCompania=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCompania=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipocompaniaSessionBean.getEsGuardarRelacionado()) {
			if(!tipocompaniaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoCompania=false;												
			}
			
			this.jButtonCerrarTipoCompania.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCompania=false;
		}
		
		if(!this.permiteMantenimiento(this.tipocompania)) {
			this.isVisibilidadCeldaActualizarTipoCompania=false;
			this.isVisibilidadCeldaEliminarTipoCompania=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCompania() {
		this.isVisibilidadCeldaNuevoTipoCompania=false;
		this.isVisibilidadCeldaGuardarCambiosTipoCompania=false;
	}
	
	public void actualizarEstadoPanelsTipoCompania(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoCompania!=null) {
				this.jScrollPanelDatosEdicionTipoCompania.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCompania!=null) {
				this.jTabbedPaneBusquedasTipoCompania.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCompania!=null) {
				this.jScrollPanelDatosTipoCompania.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCompania!=null) {
				this.jPanelPaginacionTipoCompania.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCompania!=null) {
				this.jPanelParametrosReportesTipoCompania.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoCompania!=null) {
				this.jScrollPanelDatosEdicionTipoCompania.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCompania!=null) {
				this.jTabbedPaneBusquedasTipoCompania.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoCompania!=null) {
				this.jScrollPanelDatosTipoCompania.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCompania!=null) {
				this.jPanelPaginacionTipoCompania.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCompania!=null) {
				this.jPanelParametrosReportesTipoCompania.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoCompania!=null) {
				this.jScrollPanelDatosEdicionTipoCompania.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCompania!=null) {
				this.jTabbedPaneBusquedasTipoCompania.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCompania!=null) {
				this.jScrollPanelDatosTipoCompania.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCompania!=null) {
				this.jPanelPaginacionTipoCompania.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCompania!=null) {
				this.jPanelParametrosReportesTipoCompania.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoCompania!=null) {
				this.jScrollPanelDatosEdicionTipoCompania.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCompania!=null) {
				this.jTabbedPaneBusquedasTipoCompania.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCompania!=null) {
				this.jScrollPanelDatosTipoCompania.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCompania!=null) {
				this.jPanelPaginacionTipoCompania.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCompania!=null) {
				this.jPanelParametrosReportesTipoCompania.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoCompania!=null) {
				this.jScrollPanelDatosEdicionTipoCompania.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCompania!=null) {
				this.jTabbedPaneBusquedasTipoCompania.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCompania!=null) {
				this.jScrollPanelDatosTipoCompania.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCompania!=null) {
				this.jPanelPaginacionTipoCompania.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCompania!=null) {
				this.jPanelParametrosReportesTipoCompania.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoCompania!=null) {
				this.jScrollPanelDatosEdicionTipoCompania.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCompania!=null) {
				this.jTabbedPaneBusquedasTipoCompania.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCompania!=null) {
				this.jScrollPanelDatosTipoCompania.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCompania!=null) {
				this.jPanelPaginacionTipoCompania.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCompania!=null) {
				this.jPanelParametrosReportesTipoCompania.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoCompania!=null) {
				this.jScrollPanelDatosEdicionTipoCompania.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCompania!=null) {
				this.jTabbedPaneBusquedasTipoCompania.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCompania!=null) {
				this.jScrollPanelDatosTipoCompania.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCompania!=null) {
				this.jPanelPaginacionTipoCompania.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCompania!=null) {
				this.jPanelParametrosReportesTipoCompania.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoCompania!=null) {
					this.jTabbedPaneBusquedasTipoCompania.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoCompania!=null) {
				this.jPanelParametrosReportesTipoCompania.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCompania!=null) {
				this.jTabbedPaneBusquedasTipoCompania.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoCompania!=null) {
				this.jPanelParametrosReportesTipoCompania.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoCompaniaParaDatoConstituciones() throws Exception {
		Boolean isPaginaPopupDatoConstitucion=false;

		try {

			if(this.tipocompaniaSessionBean==null) {
				this.tipocompaniaSessionBean=new TipoCompaniaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoCompania.datoconstitucionSessionBean==null) {
				this.jInternalFrameDetalleFormTipoCompania.datoconstitucionSessionBean=new DatoConstitucionSessionBean();
			}

			this.jInternalFrameDetalleFormTipoCompania.datoconstitucionSessionBean.setsPathNavegacionActual(tipocompaniaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoCompania.datoconstitucionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDatoConstitucion=this.jInternalFrameDetalleFormTipoCompania.datoconstitucionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoCompania.datoconstitucionSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormTipoCompania.datoconstitucionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDatoConstitucion(false);
			this.jInternalFrameDetalleFormTipoCompania.datoconstitucionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDatoConstitucion(TipoCompaniaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoCompania.datoconstitucionSessionBean.setisBusquedaDesdeForeignKeySesionTipoCompania(true);
			this.jInternalFrameDetalleFormTipoCompania.datoconstitucionSessionBean.setlidTipoCompaniaActual(this.idTipoCompaniaActual);

			tipocompaniaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoCompania(true);
			tipocompaniaSessionBean.setlIdTipoCompaniaActualForeignKey(this.idTipoCompaniaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoCompaniaSessionBean tipocompaniaSessionBean=new TipoCompaniaSessionBean();
		
		if(this.tipocompaniaSessionBean==null) {
			this.tipocompaniaSessionBean=new TipoCompaniaSessionBean();
		}
		
		this.tipocompaniaSessionBean.setsUltimaBusquedaTipoCompania(this.getsAccionBusqueda());
		this.tipocompaniaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipocompaniaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipocompaniaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoCompaniaSessionBean tipocompaniaSessionBean=new TipoCompaniaSessionBean();
		
		if(this.tipocompaniaSessionBean==null) {
			this.tipocompaniaSessionBean=new TipoCompaniaSessionBean();
		}
		
		if(this.tipocompaniaSessionBean.getsUltimaBusquedaTipoCompania()!=null&&!this.tipocompaniaSessionBean.getsUltimaBusquedaTipoCompania().equals("")) {
			this.setsAccionBusqueda(tipocompaniaSessionBean.getsUltimaBusquedaTipoCompania());
			this.setiNumeroPaginacion(tipocompaniaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipocompaniaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipocompaniaSessionBean.getid_empresa());
				tipocompaniaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipocompaniaSessionBean.setsUltimaBusquedaTipoCompania("");
		this.tipocompaniaSessionBean.setiNumeroPaginacion(TipoCompaniaConstantesFunciones.INUMEROPAGINACION);
		this.tipocompaniaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoCompania(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoCompania() {
		this.updateBorderResaltarBusquedasFormularioTipoCompania();
		this.updateVisibilidadBusquedasFormularioTipoCompania();
		this.updateHabilitarBusquedasFormularioTipoCompania();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoCompania() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoCompania.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoCompania() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoCompania.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoCompania() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoCompania.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoCompania(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoCompania.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoCompania() throws Exception {

		if(this.jInternalFrameDetalleFormTipoCompania==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoCompania();
		this.updateVisibilidadResaltarControlesFormularioTipoCompania();
		this.updateHabilitarResaltarControlesFormularioTipoCompania();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoCompania() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCompania==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipocompaniaConstantesFunciones.resaltaridTipoCompania!=null && this.jInternalFrameDetalleFormTipoCompania!=null) {this.jInternalFrameDetalleFormTipoCompania.jLabelidTipoCompania.setBorder(this.tipocompaniaConstantesFunciones.resaltaridTipoCompania);}
		if(this.tipocompaniaConstantesFunciones.resaltarid_empresaTipoCompania!=null && this.jInternalFrameDetalleFormTipoCompania!=null) {this.jInternalFrameDetalleFormTipoCompania.jComboBoxid_empresaTipoCompania.setBorder(this.tipocompaniaConstantesFunciones.resaltarid_empresaTipoCompania);}
		if(this.tipocompaniaConstantesFunciones.resaltarcodigoTipoCompania!=null && this.jInternalFrameDetalleFormTipoCompania!=null) {this.jInternalFrameDetalleFormTipoCompania.jTextFieldcodigoTipoCompania.setBorder(this.tipocompaniaConstantesFunciones.resaltarcodigoTipoCompania);}
		if(this.tipocompaniaConstantesFunciones.resaltarnombreTipoCompania!=null && this.jInternalFrameDetalleFormTipoCompania!=null) {this.jInternalFrameDetalleFormTipoCompania.jTextAreanombreTipoCompania.setBorder(this.tipocompaniaConstantesFunciones.resaltarnombreTipoCompania);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoCompania() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoCompania==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCompania!=null) {
	
		//this.jInternalFrameDetalleFormTipoCompania.jLabelidTipoCompania.setVisible(this.tipocompaniaConstantesFunciones.mostraridTipoCompania);
		this.jInternalFrameDetalleFormTipoCompania.jPanelidTipoCompania.setVisible(this.tipocompaniaConstantesFunciones.mostraridTipoCompania);
		//this.jInternalFrameDetalleFormTipoCompania.jComboBoxid_empresaTipoCompania.setVisible(this.tipocompaniaConstantesFunciones.mostrarid_empresaTipoCompania);
		this.jInternalFrameDetalleFormTipoCompania.jPanelid_empresaTipoCompania.setVisible(this.tipocompaniaConstantesFunciones.mostrarid_empresaTipoCompania);
		//this.jInternalFrameDetalleFormTipoCompania.jTextFieldcodigoTipoCompania.setVisible(this.tipocompaniaConstantesFunciones.mostrarcodigoTipoCompania);
		this.jInternalFrameDetalleFormTipoCompania.jPanelcodigoTipoCompania.setVisible(this.tipocompaniaConstantesFunciones.mostrarcodigoTipoCompania);
		//this.jInternalFrameDetalleFormTipoCompania.jTextAreanombreTipoCompania.setVisible(this.tipocompaniaConstantesFunciones.mostrarnombreTipoCompania);
		this.jInternalFrameDetalleFormTipoCompania.jPanelnombreTipoCompania.setVisible(this.tipocompaniaConstantesFunciones.mostrarnombreTipoCompania);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoCompania() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCompania==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCompania!=null) {
	
		this.jInternalFrameDetalleFormTipoCompania.jLabelidTipoCompania.setEnabled(this.tipocompaniaConstantesFunciones.activaridTipoCompania);
		this.jInternalFrameDetalleFormTipoCompania.jComboBoxid_empresaTipoCompania.setEnabled(this.tipocompaniaConstantesFunciones.activarid_empresaTipoCompania);
		this.jInternalFrameDetalleFormTipoCompania.jTextFieldcodigoTipoCompania.setEnabled(this.tipocompaniaConstantesFunciones.activarcodigoTipoCompania);
		this.jInternalFrameDetalleFormTipoCompania.jTextAreanombreTipoCompania.setEnabled(this.tipocompaniaConstantesFunciones.activarnombreTipoCompania);
		}
	}
	
		
}