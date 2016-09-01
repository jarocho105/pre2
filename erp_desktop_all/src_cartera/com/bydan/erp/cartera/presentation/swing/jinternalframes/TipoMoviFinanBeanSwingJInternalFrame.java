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

import com.bydan.erp.cartera.util.TipoMoviFinanConstantesFunciones;
import com.bydan.erp.cartera.util.TipoMoviFinanParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoMoviFinanParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoMoviFinanBean;
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
public class TipoMoviFinanBeanSwingJInternalFrame extends TipoMoviFinanJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoMoviFinanBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoMoviFinan> tipomovifinanValidator = new ClassValidator<TipoMoviFinan>(TipoMoviFinan.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoMoviFinan tipomovifinan;	
	public TipoMoviFinan tipomovifinanAux;
	public TipoMoviFinan tipomovifinanAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoMoviFinan tipomovifinanTotales;
	public Long idTipoMoviFinanActual;
	public Long iIdNuevoTipoMoviFinan=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosInformacionFinanciera=false;

	public Boolean getIsTienePermisosInformacionFinanciera() {
		return isTienePermisosInformacionFinanciera;
	}

	public void setIsTienePermisosInformacionFinanciera(Boolean isTienePermisosInformacionFinanciera) {
		this.isTienePermisosInformacionFinanciera= isTienePermisosInformacionFinanciera;
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
	
	public Boolean isPermisoTodoTipoMoviFinan;
	public Boolean isPermisoNuevoTipoMoviFinan;
	public Boolean isPermisoActualizarTipoMoviFinan;
	public Boolean isPermisoActualizarOriginalTipoMoviFinan;
	public Boolean isPermisoEliminarTipoMoviFinan;
	public Boolean isPermisoGuardarCambiosTipoMoviFinan;
	public Boolean isPermisoConsultaTipoMoviFinan;
	public Boolean isPermisoBusquedaTipoMoviFinan;
	public Boolean isPermisoReporteTipoMoviFinan;
	public Boolean isPermisoPaginacionMedioTipoMoviFinan;
	public Boolean isPermisoPaginacionAltoTipoMoviFinan;
	public Boolean isPermisoPaginacionTodoTipoMoviFinan;
	public Boolean isPermisoCopiarTipoMoviFinan;
	public Boolean isPermisoVerFormTipoMoviFinan;
	public Boolean isPermisoDuplicarTipoMoviFinan;
	public Boolean isPermisoOrdenTipoMoviFinan;
	
	
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
	
	public TipoMoviFinanParameterReturnGeneral tipomovifinanReturnGeneral;
	public TipoMoviFinanParameterReturnGeneral tipomovifinanParameterGeneral;
	
	

	public InformacionFinancieraLogic informacionfinancieraLogic=null;

	public InformacionFinancieraLogic getInformacionFinancieraLogic() {
		return informacionfinancieraLogic;
	}

	public void setInformacionFinancieraLogic(InformacionFinancieraLogic informacionfinancieraLogic) {
		this.informacionfinancieraLogic = informacionfinancieraLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoMoviFinan=false;
	public Boolean esParaAccionDesdeFormularioTipoMoviFinan=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoMoviFinanSessionBeanAdditional tipomovifinanSessionBeanAdditional=null;
	
	public TipoMoviFinanSessionBeanAdditional getTipoMoviFinanSessionBeanAdditional() {
		return this.tipomovifinanSessionBeanAdditional;
	}
	
	public void setTipoMoviFinanSessionBeanAdditional(TipoMoviFinanSessionBeanAdditional tipomovifinanSessionBeanAdditional) {
		try {
			this.tipomovifinanSessionBeanAdditional=tipomovifinanSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoMoviFinanBeanSwingJInternalFrameAdditional tipomovifinanBeanSwingJInternalFrameAdditional=null;
	//public class TipoMoviFinanBeanSwingJInternalFrame
	
	public TipoMoviFinanBeanSwingJInternalFrameAdditional getTipoMoviFinanBeanSwingJInternalFrameAdditional() {
		return this.tipomovifinanBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoMoviFinanBeanSwingJInternalFrameAdditional(TipoMoviFinanBeanSwingJInternalFrameAdditional tipomovifinanBeanSwingJInternalFrameAdditional) {
		try {
			this.tipomovifinanBeanSwingJInternalFrameAdditional=tipomovifinanBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoMoviFinanLogic tipomovifinanLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoMoviFinan tipomovifinanBean;
	public TipoMoviFinanConstantesFunciones tipomovifinanConstantesFunciones;
	//public TipoMoviFinanParameterReturnGeneral tipomovifinanReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoMoviFinan> tipomovifinans;	
	//public List<TipoMoviFinan> tipomovifinansEliminados;
	//public List<TipoMoviFinan> tipomovifinansAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoMoviFinan=false;
	public Boolean isVisibilidadCeldaDuplicarTipoMoviFinan=true;
	public Boolean isVisibilidadCeldaCopiarTipoMoviFinan=true;
	public Boolean isVisibilidadCeldaVerFormTipoMoviFinan=true;
	public Boolean isVisibilidadCeldaOrdenTipoMoviFinan=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoMoviFinan=false;
	public Boolean isVisibilidadCeldaModificarTipoMoviFinan=false;
	public Boolean isVisibilidadCeldaActualizarTipoMoviFinan=false;
	public Boolean isVisibilidadCeldaEliminarTipoMoviFinan=false;
	public Boolean isVisibilidadCeldaCancelarTipoMoviFinan=false;
	public Boolean isVisibilidadCeldaGuardarTipoMoviFinan=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoMoviFinan=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoMoviFinan() {
		return this.iIdNuevoTipoMoviFinan;
	}

	public void setiIdNuevoTipoMoviFinan(Long iIdNuevoTipoMoviFinan) {
		this.iIdNuevoTipoMoviFinan = iIdNuevoTipoMoviFinan;
	}
	
	public Long getidTipoMoviFinanActual() {
		return this.idTipoMoviFinanActual;
	}

	public void setidTipoMoviFinanActual(Long idTipoMoviFinanActual) {
		this.idTipoMoviFinanActual = idTipoMoviFinanActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoMoviFinan gettipomovifinan() {
		return this.tipomovifinan;
	}

	public void settipomovifinan(TipoMoviFinan tipomovifinan) {
		this.tipomovifinan = tipomovifinan;
	}
	
	public TipoMoviFinan gettipomovifinanAux() {
		return this.tipomovifinanAux;
	}

	public void settipomovifinanAux(TipoMoviFinan tipomovifinanAux) {
		this.tipomovifinanAux = tipomovifinanAux;
	}				
	
	public TipoMoviFinan gettipomovifinanAnterior() {
		return this.tipomovifinanAnterior;
	}

	public void settipomovifinanAnterior(TipoMoviFinan tipomovifinanAnterior) {
		this.tipomovifinanAnterior = tipomovifinanAnterior;
	}	
	
	public TipoMoviFinan gettipomovifinanTotales() {
		return this.tipomovifinanTotales;
	}

	public void settipomovifinanTotales(TipoMoviFinan tipomovifinanTotales) {
		this.tipomovifinanTotales = tipomovifinanTotales;
	}	
	
	public TipoMoviFinan gettipomovifinanBean() {
		return this.tipomovifinanBean;
	}

	public void settipomovifinanBean(TipoMoviFinan tipomovifinanBean) {
		this.tipomovifinanBean = tipomovifinanBean;
	}	
	
	public TipoMoviFinanParameterReturnGeneral gettipomovifinanReturnGeneral() {
		return this.tipomovifinanReturnGeneral;
	}

	public void settipomovifinanReturnGeneral(TipoMoviFinanParameterReturnGeneral tipomovifinanReturnGeneral) {
		this.tipomovifinanReturnGeneral = tipomovifinanReturnGeneral;
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
	
	
	public TipoMoviFinanLogic getTipoMoviFinanLogic()	{		
		return tipomovifinanLogic;
	}

	public void setTipoMoviFinanLogic(TipoMoviFinanLogic tipomovifinanLogic) {
		this.tipomovifinanLogic = tipomovifinanLogic;
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
	
	public Boolean getIsEsNuevoTipoMoviFinan() {
		return isEsNuevoTipoMoviFinan;
	}

	public void setIsEsNuevoTipoMoviFinan(Boolean isEsNuevoTipoMoviFinan) {
		this.isEsNuevoTipoMoviFinan = isEsNuevoTipoMoviFinan;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoMoviFinan() {
		return esParaAccionDesdeFormularioTipoMoviFinan;
	}
	
	public void setEsParaAccionDesdeFormularioTipoMoviFinan(Boolean esParaAccionDesdeFormularioTipoMoviFinan) {
		this.esParaAccionDesdeFormularioTipoMoviFinan = esParaAccionDesdeFormularioTipoMoviFinan;
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

			if(this.tipomovifinanSessionBean==null) {
				this.tipomovifinanSessionBean=new TipoMoviFinanSessionBean();
			}

			if(!this.tipomovifinanSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipomovifinanSessionBean.getlidEmpresaActual());
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

					if(this.tipomovifinan!=null) {
						this.tipomovifinan.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) {
						this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxid_empresaTipoMoviFinan.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoMoviFinan.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) {
						if(this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxid_empresaTipoMoviFinan.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxid_empresaTipoMoviFinan.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoMoviFinanGenerico)throws Exception
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
				jComboBoxid_empresaTipoMoviFinanGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoMoviFinanGenerico!=null && jComboBoxid_empresaTipoMoviFinanGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoMoviFinanGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoMoviFinan tipomovifinan,JComboBox jComboBoxid_empresaTipoMoviFinanGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoMoviFinanGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxid_empresaTipoMoviFinan.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoMoviFinanGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipomovifinan.setid_empresa(empresaAux.getId());
				tipomovifinan.setempresa_descripcion(TipoMoviFinanConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipomovifinan.setEmpresa(empresaAux);			}
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

					if(!TipoMoviFinanJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) { 
							this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxid_empresaTipoMoviFinan.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxid_empresaTipoMoviFinan.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) { 
					}

					if(!TipoMoviFinanJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) {
							this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxid_empresaTipoMoviFinan.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) {
							this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxid_empresaTipoMoviFinan.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoMoviFinan() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoMoviFinanConstantesFunciones.refrescarForeignKeysDescripcionesTipoMoviFinan(this.tipomovifinanLogic.getTipoMoviFinans());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoMoviFinanConstantesFunciones.refrescarForeignKeysDescripcionesTipoMoviFinan(this.tipomovifinans);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipomovifinanLogic.setTipoMoviFinans(this.tipomovifinans);
			tipomovifinanLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoMoviFinanParameterReturnGeneral getTipoMoviFinanParameterGeneral() {
		return this.tipomovifinanParameterGeneral;
	}
	
	public void setTipoMoviFinanParameterGeneral(TipoMoviFinanParameterReturnGeneral tipomovifinanParameterGeneral) {
		this.tipomovifinanParameterGeneral = tipomovifinanParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoMoviFinan() {
		return isPermisoTodoTipoMoviFinan;
	}

	public void setIsPermisoTodoTipoMoviFinan(Boolean isPermisoTodoTipoMoviFinan) {
		this.isPermisoTodoTipoMoviFinan = isPermisoTodoTipoMoviFinan;
	}

	public Boolean getIsPermisoNuevoTipoMoviFinan() {
		return isPermisoNuevoTipoMoviFinan;
	}

	public void setIsPermisoNuevoTipoMoviFinan(Boolean isPermisoNuevoTipoMoviFinan) {
		this.isPermisoNuevoTipoMoviFinan = isPermisoNuevoTipoMoviFinan;
	}

	public Boolean getIsPermisoActualizarTipoMoviFinan() {
		return isPermisoActualizarTipoMoviFinan;
	}

	public void setIsPermisoActualizarTipoMoviFinan(Boolean isPermisoActualizarTipoMoviFinan) {
		this.isPermisoActualizarTipoMoviFinan = isPermisoActualizarTipoMoviFinan;
	}

	public Boolean getIsPermisoEliminarTipoMoviFinan() {
		return isPermisoEliminarTipoMoviFinan;
	}

	public void setIsPermisoEliminarTipoMoviFinan(Boolean isPermisoEliminarTipoMoviFinan) {
		this.isPermisoEliminarTipoMoviFinan = isPermisoEliminarTipoMoviFinan;
	}

	public Boolean getIsPermisoGuardarCambiosTipoMoviFinan() {
		return isPermisoGuardarCambiosTipoMoviFinan;
	}

	public void setIsPermisoGuardarCambiosTipoMoviFinan(Boolean isPermisoGuardarCambiosTipoMoviFinan) {
		this.isPermisoGuardarCambiosTipoMoviFinan = isPermisoGuardarCambiosTipoMoviFinan;
	}
	
	public Boolean getIsPermisoConsultaTipoMoviFinan() {
		return isPermisoConsultaTipoMoviFinan;
	}

	public void setIsPermisoConsultaTipoMoviFinan(Boolean isPermisoConsultaTipoMoviFinan) {
		this.isPermisoConsultaTipoMoviFinan = isPermisoConsultaTipoMoviFinan;
	}

	public Boolean getIsPermisoBusquedaTipoMoviFinan() {
		return isPermisoBusquedaTipoMoviFinan;
	}

	public void setIsPermisoBusquedaTipoMoviFinan(Boolean isPermisoBusquedaTipoMoviFinan) {
		this.isPermisoBusquedaTipoMoviFinan = isPermisoBusquedaTipoMoviFinan;
	}

	public Boolean getIsPermisoReporteTipoMoviFinan() {
		return isPermisoReporteTipoMoviFinan;
	}

	public void setIsPermisoReporteTipoMoviFinan(Boolean isPermisoReporteTipoMoviFinan) {
		this.isPermisoReporteTipoMoviFinan = isPermisoReporteTipoMoviFinan;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoMoviFinan() {
		return isPermisoPaginacionMedioTipoMoviFinan;
	}

	public void setIsPermisoPaginacionMedioTipoMoviFinan(Boolean isPermisoPaginacionMedioTipoMoviFinan) {
		this.isPermisoPaginacionMedioTipoMoviFinan = isPermisoPaginacionMedioTipoMoviFinan;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoMoviFinan() {
		return isPermisoPaginacionTodoTipoMoviFinan;
	}

	public void setIsPermisoPaginacionTodoTipoMoviFinan(Boolean isPermisoPaginacionTodoTipoMoviFinan) {
		this.isPermisoPaginacionTodoTipoMoviFinan = isPermisoPaginacionTodoTipoMoviFinan;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoMoviFinan() {
		return isPermisoPaginacionAltoTipoMoviFinan;
	}

	public void setIsPermisoPaginacionAltoTipoMoviFinan(Boolean isPermisoPaginacionAltoTipoMoviFinan) {
		this.isPermisoPaginacionAltoTipoMoviFinan = isPermisoPaginacionAltoTipoMoviFinan;
	}
	
	public Boolean getIsPermisoCopiarTipoMoviFinan() {
		return isPermisoCopiarTipoMoviFinan;
	}

	public void setIsPermisoCopiarTipoMoviFinan(Boolean isPermisoCopiarTipoMoviFinan) {
		this.isPermisoCopiarTipoMoviFinan = isPermisoCopiarTipoMoviFinan;
	}
	
	public Boolean getIsPermisoVerFormTipoMoviFinan() {
		return isPermisoVerFormTipoMoviFinan;
	}

	public void setIsPermisoVerFormTipoMoviFinan(Boolean isPermisoVerFormTipoMoviFinan) {
		this.isPermisoVerFormTipoMoviFinan = isPermisoVerFormTipoMoviFinan;
	}
	
	public Boolean getIsPermisoDuplicarTipoMoviFinan() {
		return isPermisoDuplicarTipoMoviFinan;
	}

	public void setIsPermisoDuplicarTipoMoviFinan(Boolean isPermisoDuplicarTipoMoviFinan) {
		this.isPermisoDuplicarTipoMoviFinan = isPermisoDuplicarTipoMoviFinan;
	}
	
	public Boolean getIsPermisoOrdenTipoMoviFinan() {
		return isPermisoOrdenTipoMoviFinan;
	}

	public void setIsPermisoOrdenTipoMoviFinan(Boolean isPermisoOrdenTipoMoviFinan) {
		this.isPermisoOrdenTipoMoviFinan = isPermisoOrdenTipoMoviFinan;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoMoviFinan() {
		return isVisibilidadCeldaNuevoTipoMoviFinan;
	}

	public void setIsVisibilidadCeldaNuevoTipoMoviFinan(Boolean isVisibilidadCeldaNuevoTipoMoviFinan) {
		this.isVisibilidadCeldaNuevoTipoMoviFinan = isVisibilidadCeldaNuevoTipoMoviFinan;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoMoviFinan() {
		return isVisibilidadCeldaDuplicarTipoMoviFinan;
	}

	public void setIsVisibilidadCeldaDuplicarTipoMoviFinan(Boolean isVisibilidadCeldaDuplicarTipoMoviFinan) {
		this.isVisibilidadCeldaDuplicarTipoMoviFinan = isVisibilidadCeldaDuplicarTipoMoviFinan;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoMoviFinan() {
		return isVisibilidadCeldaCopiarTipoMoviFinan;
	}

	public void setIsVisibilidadCeldaCopiarTipoMoviFinan(Boolean isVisibilidadCeldaCopiarTipoMoviFinan) {
		this.isVisibilidadCeldaCopiarTipoMoviFinan = isVisibilidadCeldaCopiarTipoMoviFinan;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoMoviFinan() {
		return isVisibilidadCeldaVerFormTipoMoviFinan;
	}

	public void setIsVisibilidadCeldaVerFormTipoMoviFinan(Boolean isVisibilidadCeldaVerFormTipoMoviFinan) {
		this.isVisibilidadCeldaVerFormTipoMoviFinan = isVisibilidadCeldaVerFormTipoMoviFinan;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoMoviFinan() {
		return isVisibilidadCeldaOrdenTipoMoviFinan;
	}

	public void setIsVisibilidadCeldaOrdenTipoMoviFinan(Boolean isVisibilidadCeldaOrdenTipoMoviFinan) {
		this.isVisibilidadCeldaOrdenTipoMoviFinan = isVisibilidadCeldaOrdenTipoMoviFinan;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoMoviFinan() {
		return isVisibilidadCeldaNuevoRelacionesTipoMoviFinan;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoMoviFinan(Boolean isVisibilidadCeldaNuevoRelacionesTipoMoviFinan) {
		this.isVisibilidadCeldaNuevoRelacionesTipoMoviFinan = isVisibilidadCeldaNuevoRelacionesTipoMoviFinan;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoMoviFinan() {
		return isVisibilidadCeldaModificarTipoMoviFinan;
	}

	public void setIsVisibilidadCeldaModificarTipoMoviFinan(Boolean isVisibilidadCeldaModificarTipoMoviFinan) {
		this.isVisibilidadCeldaModificarTipoMoviFinan = isVisibilidadCeldaModificarTipoMoviFinan;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoMoviFinan() {
		return isVisibilidadCeldaActualizarTipoMoviFinan;
	}

	public void setIsVisibilidadCeldaActualizarTipoMoviFinan(Boolean isVisibilidadCeldaActualizarTipoMoviFinan) {
		this.isVisibilidadCeldaActualizarTipoMoviFinan = isVisibilidadCeldaActualizarTipoMoviFinan;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoMoviFinan() {
		return isVisibilidadCeldaEliminarTipoMoviFinan;
	}

	public void setIsVisibilidadCeldaEliminarTipoMoviFinan(Boolean isVisibilidadCeldaEliminarTipoMoviFinan) {
		this.isVisibilidadCeldaEliminarTipoMoviFinan = isVisibilidadCeldaEliminarTipoMoviFinan;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoMoviFinan() {
		return isVisibilidadCeldaCancelarTipoMoviFinan;
	}

	public void setIsVisibilidadCeldaCancelarTipoMoviFinan(Boolean isVisibilidadCeldaCancelarTipoMoviFinan) {
		this.isVisibilidadCeldaCancelarTipoMoviFinan = isVisibilidadCeldaCancelarTipoMoviFinan;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoMoviFinan() {
		return isVisibilidadCeldaGuardarTipoMoviFinan;
	}

	public void setIsVisibilidadCeldaGuardarTipoMoviFinan(Boolean isVisibilidadCeldaGuardarTipoMoviFinan) {
		this.isVisibilidadCeldaGuardarTipoMoviFinan = isVisibilidadCeldaGuardarTipoMoviFinan;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoMoviFinan() {
		return isVisibilidadCeldaGuardarCambiosTipoMoviFinan;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoMoviFinan(Boolean isVisibilidadCeldaGuardarCambiosTipoMoviFinan) {
		this.isVisibilidadCeldaGuardarCambiosTipoMoviFinan = isVisibilidadCeldaGuardarCambiosTipoMoviFinan;
	}
		
	public TipoMoviFinanSessionBean gettipomovifinanSessionBean() {
		return this.tipomovifinanSessionBean;
	}
	
	public void settipomovifinanSessionBean(TipoMoviFinanSessionBean tipomovifinanSessionBean) {
		this.tipomovifinanSessionBean=tipomovifinanSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoMoviFinan(TipoMoviFinan tipomovifinan)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipomovifinan,null);
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
	
	public void bugActualizarReferenciaActual(TipoMoviFinan tipomovifinan,TipoMoviFinan tipomovifinanAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoMoviFinan(tipomovifinan);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipomovifinanAux.setId(tipomovifinan.getId());
		tipomovifinanAux.setVersionRow(tipomovifinan.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoMoviFinan();
		
			int intSelectedRow = this.jTableDatosTipoMoviFinan.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinan =(TipoMoviFinan) this.tipomovifinanLogic.getTipoMoviFinans().toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipomovifinan =(TipoMoviFinan) this.tipomovifinans.toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoMoviFinanJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoMoviFinan(this.tipomovifinan,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMoviFinan(this.tipomovifinan);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipomovifinanValidator.getInvalidValues(this.tipomovifinan);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipomovifinanLogic.setDatosCliente(datosCliente);
			tipomovifinanLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipomovifinanAux=new  TipoMoviFinan();
				
				tipomovifinanAux.setIsNew(true);
				tipomovifinanAux.setIsChanged(true);
				
				tipomovifinanAux.setTipoMoviFinanOriginal(this.tipomovifinan);
				
				tipomovifinanAux.setId(this.tipomovifinan.getId());	
				tipomovifinanAux.setVersionRow(this.tipomovifinan.getVersionRow());	
				tipomovifinanAux.setid_empresa(this.tipomovifinan.getid_empresa());	
				tipomovifinanAux.setcodigo(this.tipomovifinan.getcodigo());	
				tipomovifinanAux.setnombre(this.tipomovifinan.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipomovifinanSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipomovifinanSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipomovifinanAux,tipomovifinanLogic.getTipoMoviFinans());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomovifinanAux,tipomovifinans);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipomovifinanSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomovifinanSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovifinanLogic.saveTipoMoviFinans();//WithConnection
						//tipomovifinanLogic.getSetVersionRowTipoMoviFinans();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipomovifinan,tipomovifinanAux);
					
					this.refrescarForeignKeysDescripcionesTipoMoviFinan();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipomovifinanSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraLogic.getInformacionFinancieras().addAll(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancierasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancieras.addAll(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancierasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipomovifinanLogic.saveTipoMoviFinanRelaciones(tipomovifinanAux,this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraLogic.getInformacionFinancieras());//WithConnection
								//tipomovifinanLogic.getSetVersionRowTipoMoviFinans();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipomovifinan,tipomovifinanAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraLogic.setInformacionFinancieras(new ArrayList<InformacionFinanciera>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancieras= new ArrayList<InformacionFinanciera>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.quitarFilaTotales();}
							tipomovifinanAux.setInformacionFinancieras(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraLogic.getInformacionFinancieras());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipomovifinanSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipomovifinanSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipomovifinanAux,tipomovifinanLogic.getTipoMoviFinans());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipomovifinanAux,tipomovifinans);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipomovifinan,tipomovifinanAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipomovifinanAux=new  TipoMoviFinan();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipomovifinanSessionBean.getEsGuardarRelacionado() 
					|| (this.tipomovifinanSessionBean.getEsGuardarRelacionado() && this.tipomovifinan.getId()>=0)) {
						
					tipomovifinanAux.setIsNew(false);
				}
				
				tipomovifinanAux.setIsDeleted(false);
			
				tipomovifinanAux.setId(this.tipomovifinan.getId());	
				tipomovifinanAux.setVersionRow(this.tipomovifinan.getVersionRow());	
				tipomovifinanAux.setid_empresa(this.tipomovifinan.getid_empresa());	
				tipomovifinanAux.setcodigo(this.tipomovifinan.getcodigo());	
				tipomovifinanAux.setnombre(this.tipomovifinan.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipomovifinanAux,tipomovifinanLogic.getTipoMoviFinans());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomovifinanAux,tipomovifinans);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipomovifinanSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomovifinanSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovifinanLogic.saveTipoMoviFinans();//WithConnection
						//tipomovifinanLogic.getSetVersionRowTipoMoviFinans();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipomovifinan,tipomovifinanAux);
					
					this.refrescarForeignKeysDescripcionesTipoMoviFinan();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipomovifinanSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraLogic.getInformacionFinancieras().addAll(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancierasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancieras.addAll(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancierasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipomovifinanLogic.saveTipoMoviFinanRelaciones(tipomovifinanAux,this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraLogic.getInformacionFinancieras());//WithConnection
								//tipomovifinanLogic.getSetVersionRowTipoMoviFinans();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipomovifinan,tipomovifinanAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraLogic.setInformacionFinancieras(new ArrayList<InformacionFinanciera>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancieras= new ArrayList<InformacionFinanciera>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.quitarFilaTotales();}
							tipomovifinanAux.setInformacionFinancieras(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraLogic.getInformacionFinancieras());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipomovifinanSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipomovifinanSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipomovifinanAux,tipomovifinanLogic.getTipoMoviFinans());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipomovifinanAux,tipomovifinans);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipomovifinan,tipomovifinanAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipomovifinanAux=new  TipoMoviFinan();
				
				tipomovifinanAux.setIsNew(false);
				tipomovifinanAux.setIsChanged(false);
				
				tipomovifinanAux.setIsDeleted(true);
				
				tipomovifinanAux.setId(this.tipomovifinan.getId());	
				tipomovifinanAux.setVersionRow(this.tipomovifinan.getVersionRow());	
				tipomovifinanAux.setid_empresa(this.tipomovifinan.getid_empresa());	
				tipomovifinanAux.setcodigo(this.tipomovifinan.getcodigo());	
				tipomovifinanAux.setnombre(this.tipomovifinan.getnombre());	
				
				if(this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipomovifinanAux.getId()>=0) {	
						this.tipomovifinansEliminados.add(tipomovifinanAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipomovifinanAux,tipomovifinanLogic.getTipoMoviFinans());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomovifinanAux,tipomovifinans);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipomovifinanSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomovifinanSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovifinanLogic.saveTipoMoviFinans();//WithConnection
						//tipomovifinanLogic.getSetVersionRowTipoMoviFinans();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipomovifinanSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraLogic.getInformacionFinancieras().addAll(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancierasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancieras.addAll(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancierasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipomovifinanLogic.saveTipoMoviFinanRelaciones(tipomovifinanAux,this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraLogic.getInformacionFinancieras());//WithConnection
								//tipomovifinanLogic.getSetVersionRowTipoMoviFinans();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraLogic.setInformacionFinancieras(new ArrayList<InformacionFinanciera>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancieras= new ArrayList<InformacionFinanciera>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.quitarFilaTotales();}
							tipomovifinanAux.setInformacionFinancieras(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraLogic.getInformacionFinancieras());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipomovifinanSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipomovifinanSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipomovifinanAux,tipomovifinanLogic.getTipoMoviFinans());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipomovifinanAux,tipomovifinans);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinanLogic.getTipoMoviFinans().addAll(this.tipomovifinansEliminados);
					
					tipomovifinanLogic.saveTipoMoviFinans();//WithConnection
					//tipomovifinanLogic.getSetVersionRowTipoMoviFinans();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoMoviFinan();
				
				this.tipomovifinansEliminados= new ArrayList<TipoMoviFinan>();		
			}
			
			if(this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Movi Finan GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Movi Finan",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipomovifinan=tipomovifinanAux;
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
      		//this.finishProcessTipoMoviFinan();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoMoviFinan tipomovifinanLocal) throws Exception {
		
		if(this.tipomovifinanSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipomovifinanLocal.setInformacionFinancieras(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraLogic.getInformacionFinancieras());
			
			} else {
			
				tipomovifinanLocal.setInformacionFinancieras(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancieras);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoMoviFinan tipomovifinanLocal) throws Exception {	
		if(this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipomovifinanLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoMoviFinanActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoMoviFinan.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipomovifinan =(TipoMoviFinan) this.tipomovifinanLogic.getTipoMoviFinans().toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipomovifinan =(TipoMoviFinan) this.tipomovifinans.toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipomovifinanValidator.getInvalidValues(this.tipomovifinan);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoMoviFinan tipomovifinan,List<TipoMoviFinan> tipomovifinans) throws Exception {
		try	{		
			TipoMoviFinanConstantesFunciones.actualizarLista(tipomovifinan,tipomovifinans,this.tipomovifinanSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoMoviFinan tipomovifinan,List<TipoMoviFinan> tipomovifinans) throws Exception {
		try	{			
			TipoMoviFinanConstantesFunciones.actualizarSelectedLista(tipomovifinan,tipomovifinans);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoMoviFinan> tipomovifinansLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipomovifinansLocal=this.tipomovifinanLogic.getTipoMoviFinans();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipomovifinansLocal=this.tipomovifinans;
			}
			//ARCHITECTURE
		
			for(TipoMoviFinan tipomovifinanLocal:tipomovifinansLocal) {
				if(this.permiteMantenimiento(tipomovifinanLocal) && tipomovifinanLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoMoviFinanConstantesFunciones.getTipoMoviFinanLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoMoviFinanConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMoviFinan.jLabelid_empresaTipoMoviFinan,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoMoviFinanConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMoviFinan.jLabelcodigoTipoMoviFinan,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoMoviFinanConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMoviFinan.jLabelnombreTipoMoviFinan,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMoviFinan.jLabelid_empresaTipoMoviFinan,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMoviFinan.jLabelcodigoTipoMoviFinan,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMoviFinan.jLabelnombreTipoMoviFinan,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("InformacionFinanciera")) {
			if(this.tipomovifinan==null) {
				this.tipomovifinan= new TipoMoviFinan();
			}

			if(this.tipomovifinanSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoMoviFinan
				this.setVariablesFormularioToObjetoActualTipoMoviFinan(this.tipomovifinan,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMoviFinan(this.tipomovifinan);

				this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.getinformacionfinanciera().setTipoMoviFinan(this.tipomovifinan);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoMoviFinan--;	
		
		
		this.tipomovifinanAux=new TipoMoviFinan();
		
		this.tipomovifinanAux.setId(this.iIdNuevoTipoMoviFinan);
		this.tipomovifinanAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipomovifinanLogic.getTipoMoviFinans().add(this.tipomovifinanAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipomovifinans.add(this.tipomovifinanAux);
		}
		//ARCHITECTURE
		
		this.tipomovifinan=this.tipomovifinanAux;
		
		if(TipoMoviFinanJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoMoviFinan(this.tipomovifinan);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoMoviFinan(this.tipomovifinan);
		}
				
		//this.setDefaultControlesTipoMoviFinan();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoMoviFinan();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoMoviFinan();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoMoviFinan();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoMoviFinan(this.tipomovifinanBean,this.tipomovifinan,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoMoviFinan(this.tipomovifinan);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoMoviFinanConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipomovifinanSessionBean.getConGuardarRelaciones()) {
			classes=TipoMoviFinanConstantesFunciones.getClassesRelationshipsOfTipoMoviFinan(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipomovifinanReturnGeneral=tipomovifinanLogic.procesarEventosTipoMoviFinansWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomovifinanLogic.getTipoMoviFinans(),this.tipomovifinan,this.tipomovifinanParameterGeneral,this.isEsNuevoTipoMoviFinan,classes);//this.tipomovifinanLogic.getTipoMoviFinan()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoMoviFinan(this.tipomovifinanReturnGeneral,this.tipomovifinanBean,false);
		
		if(this.tipomovifinanReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoMoviFinan(this.tipomovifinanReturnGeneral.getTipoMoviFinan());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoMoviFinan(this.tipomovifinanReturnGeneral.getTipoMoviFinan());
		}
		
		if(this.tipomovifinanReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoMoviFinan(this.tipomovifinanReturnGeneral.getTipoMoviFinan(),classes);//this.tipomovifinanBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoMoviFinan(this.tipomovifinan,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoMoviFinan();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoMoviFinan();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoMoviFinanBeanSwingJInternalFrameAdditional.RecargarFormTipoMoviFinan(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoMoviFinan(false);
						
			if(tipomovifinanSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraSessionBean.getEsGuardarRelacionado() && InformacionFinancieraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonInformacionFinancieraActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoMoviFinanJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoMoviFinan();
			}
			
			this.actualizarVisualTableDatosTipoMoviFinan();
			
			this.jTableDatosTipoMoviFinan.setRowSelectionInterval(this.getIndiceNuevoTipoMoviFinan(), this.getIndiceNuevoTipoMoviFinan());
			
			this.seleccionarFilaTablaTipoMoviFinanActual();
						
			this.actualizarEstadoCeldasBotonesTipoMoviFinan("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoMoviFinan(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoMoviFinan.jTextFieldcodigoTipoMoviFinan.setEnabled(isHabilitar && this.tipomovifinanConstantesFunciones.activarcodigoTipoMoviFinan);
		this.jInternalFrameDetalleFormTipoMoviFinan.jTextAreanombreTipoMoviFinan.setEnabled(isHabilitar && this.tipomovifinanConstantesFunciones.activarnombreTipoMoviFinan);	
		//
		this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxid_empresaTipoMoviFinan.setEnabled(isHabilitar && this.tipomovifinanConstantesFunciones.activarid_empresaTipoMoviFinan);
	};
	
	public void setDefaultControlesTipoMoviFinan() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoMoviFinan(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipomovifinanSessionBean.setConGuardarRelaciones(true);			
			this.tipomovifinanSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoMoviFinan.jTabbedPaneRelacionesTipoMoviFinan.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipomovifinanSessionBean.setConGuardarRelaciones(false);			
			this.tipomovifinanSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoMoviFinan.jTabbedPaneRelacionesTipoMoviFinan.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoMoviFinan() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMoviFinan tipomovifinanAux:this.tipomovifinanLogic.getTipoMoviFinans()) {
				if(tipomovifinanAux.getId().equals(this.iIdNuevoTipoMoviFinan)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMoviFinan tipomovifinanAux:this.tipomovifinans) {
				if(tipomovifinanAux.getId().equals(this.iIdNuevoTipoMoviFinan)) {
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
	
	public int getIndiceActualTipoMoviFinan(TipoMoviFinan tipomovifinan,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMoviFinan tipomovifinanAux:this.tipomovifinanLogic.getTipoMoviFinans()) {
				if(tipomovifinanAux.getId().equals(tipomovifinan.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMoviFinan tipomovifinanAux:this.tipomovifinans) {
				if(tipomovifinanAux.getId().equals(tipomovifinan.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoMoviFinan(TipoMoviFinan tipomovifinanOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMoviFinan tipomovifinanAux:this.tipomovifinanLogic.getTipoMoviFinans()) {
				if(tipomovifinanAux.getTipoMoviFinanOriginal().getId().equals(tipomovifinanOriginal.getId())) {
					existe=true;
					tipomovifinanOriginal.setId(tipomovifinanAux.getId());
					tipomovifinanOriginal.setVersionRow(tipomovifinanAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMoviFinan tipomovifinanAux:this.tipomovifinans) {
				if(tipomovifinanAux.getTipoMoviFinanOriginal().getId().equals(tipomovifinanOriginal.getId())) {
					existe=true;
					tipomovifinanOriginal.setId(tipomovifinanAux.getId());
					tipomovifinanOriginal.setVersionRow(tipomovifinanAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoMoviFinan(Boolean esParaCancelar) throws Exception {
		tipomovifinansAux=new ArrayList<TipoMoviFinan>();
		tipomovifinanAux=new TipoMoviFinan();
		
		if(!this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoMoviFinan tipomovifinanAux:this.tipomovifinanLogic.getTipoMoviFinans()) {
					if(tipomovifinanAux.getId()<0) {
						tipomovifinansAux.add(tipomovifinanAux);
					}		
				}
				this.iIdNuevoTipoMoviFinan=0L;
				this.tipomovifinanLogic.getTipoMoviFinans().removeAll(tipomovifinansAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMoviFinan tipomovifinanAux:this.tipomovifinans) {
					if(tipomovifinanAux.getId()<0) {
						tipomovifinansAux.add(tipomovifinanAux);
					}		
				}
				this.iIdNuevoTipoMoviFinan=0L;
				this.tipomovifinans.removeAll(tipomovifinansAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoMoviFinan 
					&& this.tipomovifinanLogic.getTipoMoviFinans().size()>0
					) {
					tipomovifinanAux=this.tipomovifinanLogic.getTipoMoviFinans().get(this.tipomovifinanLogic.getTipoMoviFinans().size() - 1);
				
					if(tipomovifinanAux.getId()<0) {
						this.tipomovifinanLogic.getTipoMoviFinans().remove(tipomovifinanAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoMoviFinan && this.tipomovifinans.size()>0) {
					tipomovifinanAux=this.tipomovifinans.get(this.tipomovifinans.size() - 1);
				
					if(tipomovifinanAux.getId()<0) {
						this.tipomovifinans.remove(tipomovifinanAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoMoviFinan(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipomovifinan.getId()<0) {
				this.tipomovifinanLogic.getTipoMoviFinans().remove(this.tipomovifinan);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipomovifinan.getId()<0) {
				this.tipomovifinans.remove(this.tipomovifinan);
			}
		}			
	}
	
	public void setEstadosInicialesTipoMoviFinan(List<TipoMoviFinan> tipomovifinansAux) throws Exception {
		TipoMoviFinanConstantesFunciones.setEstadosInicialesTipoMoviFinan(tipomovifinansAux);
	}
	
	public void setEstadosInicialesTipoMoviFinan(TipoMoviFinan tipomovifinanAux) throws Exception {
		TipoMoviFinanConstantesFunciones.setEstadosInicialesTipoMoviFinan(tipomovifinanAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoMoviFinanActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoMoviFinan("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoMoviFinanActual()) {
				if(!this.isEsNuevoTipoMoviFinan) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoMoviFinan("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoMoviFinan=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoMoviFinanActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Movi Finan ?", "MANTENIMIENTO DE Tipo Movi Finan", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoMoviFinan("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoMoviFinan tipomovifinan) throws Exception {
		TipoMoviFinanConstantesFunciones.seleccionarAsignar(this.tipomovifinan,tipomovifinan);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoMoviFinan=this.isPermisoActualizarOriginalTipoMoviFinan;
			
			
			this.seleccionarAsignar(tipomovifinan);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoMoviFinanConstantesFunciones.quitarEspaciosTipoMoviFinan(this.tipomovifinan,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoMoviFinan("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipomovifinanSessionBean.setsFuncionBusquedaRapida(this.tipomovifinanSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoMoviFinan) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoMoviFinan(esParaCancelar);				
				this.cancelarNuevoTipoMoviFinan(esParaCancelar);								
			}
			
			this.tipomovifinan=new TipoMoviFinan();
			
			this.inicializarTipoMoviFinan();
			
			this.actualizarEstadoCeldasBotonesTipoMoviFinan("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoMoviFinan() throws Exception {
		try {
			TipoMoviFinanConstantesFunciones.inicializarTipoMoviFinan(this.tipomovifinan);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipomovifinanLogic.getTipoMoviFinans().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoMoviFinans(String sAccionBusqueda,List<TipoMoviFinan> tipomovifinansParaReportes) throws Exception {
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
					sPathReporteFinal="TipoMoviFinan"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoMoviFinanMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoMoviFinanMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoMoviFinan"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Movi Finanes");		
		parameters.put("busquedapor", TipoMoviFinanConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(InformacionFinanciera.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoMoviFinanLogic tipomovifinanLogicAuxiliar=new TipoMoviFinanLogic();
					tipomovifinanLogicAuxiliar.setDatosCliente(tipomovifinanLogic.getDatosCliente());				
					tipomovifinanLogicAuxiliar.setTipoMoviFinans(tipomovifinansParaReportes);
					
					tipomovifinanLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoMoviFinanWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipomovifinansParaReportes=tipomovifinanLogicAuxiliar.getTipoMoviFinans();
					
					//tipomovifinanLogic.getNewConnexionToDeep();
					
					//for (TipoMoviFinan tipomovifinan:tipomovifinansParaReportes) {
					//	tipomovifinanLogic.deepLoad(tipomovifinan, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipomovifinanLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipomovifinanLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileInformacionFinanciera = AuxiliarReportes.class.getResourceAsStream("InformacionFinancieraDetalleRelacionesDesign.jasper");
			parameters.put("subreport_informacionfinanciera", reportFileInformacionFinanciera);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoMoviFinan=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoMoviFinanConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoMoviFinanConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoMoviFinan=new JRBeanArrayDataSource(TipoMoviFinanJInternalFrame.TraerTipoMoviFinanBeans(tipomovifinansParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoMoviFinan);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoMoviFinanConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoMoviFinanConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoMoviFinanBean.TraerTipoMoviFinanBeans(tipomovifinansParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoMoviFinans(sAccionBusqueda,sTipoArchivoReporte,tipomovifinansParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoMoviFinans(sAccionBusqueda,sTipoArchivoReporte,tipomovifinansParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoMoviFinanActionPerformed(null);
					//this.generarExcelReporteTipoMoviFinans(sAccionBusqueda,sTipoArchivoReporte,tipomovifinansParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoMoviFinans(sAccionBusqueda,sTipoArchivoReporte,tipomovifinansParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoMoviFinans(sAccionBusqueda,sTipoArchivoReporte,tipomovifinansParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoMoviFinans(sAccionBusqueda,sTipoArchivoReporte,tipomovifinansParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoMoviFinans(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoMoviFinan> tipomovifinansParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovifinan";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoMoviFinans");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoMoviFinan("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoMoviFinan tipomovifinan : tipomovifinansParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoMoviFinanConstantesFunciones.generarExcelReporteDataTipoMoviFinan("NORMAL",row,workbook,tipomovifinan,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movi Finan",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoMoviFinan(String sTipo,Row row,Workbook workbook) {
		
		TipoMoviFinanConstantesFunciones.generarExcelReporteHeaderTipoMoviFinan(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoMoviFinans(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoMoviFinan> tipomovifinansParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovifinan_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoMoviFinans");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoMoviFinan tipomovifinan : tipomovifinansParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoMoviFinanConstantesFunciones.getTipoMoviFinanDescripcion(tipomovifinan));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMoviFinanConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMoviFinanConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomovifinan.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMoviFinanConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMoviFinanConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomovifinan.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMoviFinanConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMoviFinanConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomovifinan.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movi Finan",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoMoviFinans(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoMoviFinan> tipomovifinansParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoMoviFinan> tipomovifinansRespaldo=null;
		
		classes=TipoMoviFinanConstantesFunciones.getClassesRelationshipsOfTipoMoviFinan(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipomovifinanLogic.setDatosCliente(this.datosCliente);
		this.tipomovifinanLogic.setDatosDeep(this.datosDeep);
		this.tipomovifinanLogic.setIsConDeep(true);
		
		tipomovifinansRespaldo=this.tipomovifinanLogic.getTipoMoviFinans();
		
		this.tipomovifinanLogic.setTipoMoviFinans(tipomovifinansParaReportes);	
		this.tipomovifinanLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipomovifinansParaReportes=this.tipomovifinanLogic.getTipoMoviFinans();
		this.tipomovifinanLogic.setTipoMoviFinans(tipomovifinansRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovifinan_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoMoviFinans");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoMoviFinan("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoMoviFinan tipomovifinan : tipomovifinansParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoMoviFinan("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoMoviFinanConstantesFunciones.generarExcelReporteDataTipoMoviFinan("NORMAL",row,workbook,tipomovifinan,cellStyleDataAux);
		
			
			


				//InformacionFinanciera
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipomovifinan.getInformacionFinancieras()!=null && tipomovifinan.getInformacionFinancieras().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					InformacionFinancieraConstantesFunciones.generarExcelReporteHeaderInformacionFinanciera("RELACIONADO",row,workbook);
				}

				if(tipomovifinan.getInformacionFinancieras()!=null) {
					i2=0;
					for(InformacionFinanciera informacionfinanciera : tipomovifinan.getInformacionFinancieras()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						InformacionFinancieraConstantesFunciones.generarExcelReporteDataInformacionFinanciera("RELACIONADO",row,workbook,informacionfinanciera,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoMoviFinanConstantesFunciones.getTipoMoviFinanDescripcion(tipomovifinan));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movi Finan",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoMoviFinan.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMoviFinan.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoMoviFinan.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMoviFinan.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoMoviFinan() throws Exception {		
		this.startProcessTipoMoviFinan(true);
	}
	
	public void startProcessTipoMoviFinan(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoMoviFinan ,this.jPanelParametrosReportesTipoMoviFinan, this.jScrollPanelDatosTipoMoviFinan,this.jPanelPaginacionTipoMoviFinan, this.jScrollPanelDatosEdicionTipoMoviFinan, this.jPanelAccionesTipoMoviFinan,this.jPanelAccionesFormularioTipoMoviFinan,this.jmenuBarTipoMoviFinan,this.jmenuBarDetalleTipoMoviFinan,this.jTtoolBarTipoMoviFinan,this.jTtoolBarDetalleTipoMoviFinan);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoMoviFinan=this.jTabbedPaneBusquedasTipoMoviFinan; 
		
		final JPanel jPanelParametrosReportesTipoMoviFinan=this.jPanelParametrosReportesTipoMoviFinan;
		//final JScrollPane jScrollPanelDatosTipoMoviFinan=this.jScrollPanelDatosTipoMoviFinan;
		final JTable jTableDatosTipoMoviFinan=this.jTableDatosTipoMoviFinan;		
		final JPanel jPanelPaginacionTipoMoviFinan=this.jPanelPaginacionTipoMoviFinan;
		//final JScrollPane jScrollPanelDatosEdicionTipoMoviFinan=this.jScrollPanelDatosEdicionTipoMoviFinan;
		final JPanel jPanelAccionesTipoMoviFinan=this.jPanelAccionesTipoMoviFinan;
		
		JPanel jPanelCamposAuxiliarTipoMoviFinan=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoMoviFinan=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) {
			jPanelCamposAuxiliarTipoMoviFinan=this.jInternalFrameDetalleFormTipoMoviFinan.jPanelCamposTipoMoviFinan;
			jPanelAccionesFormularioAuxiliarTipoMoviFinan=this.jInternalFrameDetalleFormTipoMoviFinan.jPanelAccionesFormularioTipoMoviFinan;
		}
		
		final JPanel jPanelCamposTipoMoviFinan=jPanelCamposAuxiliarTipoMoviFinan;
		final JPanel jPanelAccionesFormularioTipoMoviFinan=jPanelAccionesFormularioAuxiliarTipoMoviFinan;
		
		
		final JMenuBar jmenuBarTipoMoviFinan=this.jmenuBarTipoMoviFinan;
		final JToolBar jTtoolBarTipoMoviFinan=this.jTtoolBarTipoMoviFinan;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoMoviFinan=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoMoviFinan=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) {
			jmenuBarDetalleAuxiliarTipoMoviFinan=this.jInternalFrameDetalleFormTipoMoviFinan.jmenuBarDetalleTipoMoviFinan;
			jTtoolBarDetalleAuxiliarTipoMoviFinan=this.jInternalFrameDetalleFormTipoMoviFinan.jTtoolBarDetalleTipoMoviFinan;
		}
		
		final JMenuBar jmenuBarDetalleTipoMoviFinan=jmenuBarDetalleAuxiliarTipoMoviFinan;
		final JToolBar jTtoolBarDetalleTipoMoviFinan=jTtoolBarDetalleAuxiliarTipoMoviFinan;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoMoviFinan;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoMoviFinan;
			processRunnable.jTableDatos=jTableDatosTipoMoviFinan;
			processRunnable.jPanelCampos=jPanelCamposTipoMoviFinan;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoMoviFinan;
			processRunnable.jPanelAcciones=jPanelAccionesTipoMoviFinan;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoMoviFinan;
			
			
			processRunnable.jmenuBar=jmenuBarTipoMoviFinan;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoMoviFinan;
			processRunnable.jTtoolBar=jTtoolBarTipoMoviFinan;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoMoviFinan;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoMoviFinan ,jPanelParametrosReportesTipoMoviFinan,jTableDatosTipoMoviFinan, /*jScrollPanelDatosTipoMoviFinan,*/jPanelCamposTipoMoviFinan,jPanelPaginacionTipoMoviFinan, /*jScrollPanelDatosEdicionTipoMoviFinan,*/ jPanelAccionesTipoMoviFinan,jPanelAccionesFormularioTipoMoviFinan,jmenuBarTipoMoviFinan,jmenuBarDetalleTipoMoviFinan,jTtoolBarTipoMoviFinan,jTtoolBarDetalleTipoMoviFinan);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoMoviFinan ,jPanelParametrosReportesTipoMoviFinan, jScrollPanelDatosTipoMoviFinan,jPanelPaginacionTipoMoviFinan, jScrollPanelDatosEdicionTipoMoviFinan, jPanelAccionesTipoMoviFinan,jPanelAccionesFormularioTipoMoviFinan,jmenuBarTipoMoviFinan,jmenuBarDetalleTipoMoviFinan,jTtoolBarTipoMoviFinan,jTtoolBarDetalleTipoMoviFinan);
						
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
	
	public void finishProcessTipoMoviFinan() {// throws Exception 
		this.finishProcessTipoMoviFinan(true);
	}
	
	public void finishProcessTipoMoviFinan(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoMoviFinan ,this.jPanelParametrosReportesTipoMoviFinan, this.jScrollPanelDatosTipoMoviFinan,this.jPanelPaginacionTipoMoviFinan, this.jScrollPanelDatosEdicionTipoMoviFinan, this.jPanelAccionesTipoMoviFinan,this.jPanelAccionesFormularioTipoMoviFinan,this.jmenuBarTipoMoviFinan,this.jmenuBarDetalleTipoMoviFinan,this.jTtoolBarTipoMoviFinan,this.jTtoolBarDetalleTipoMoviFinan);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoMoviFinan=this.jTabbedPaneBusquedasTipoMoviFinan; 
		
		final JPanel jPanelParametrosReportesTipoMoviFinan=this.jPanelParametrosReportesTipoMoviFinan;
		//final JScrollPane jScrollPanelDatosTipoMoviFinan=this.jScrollPanelDatosTipoMoviFinan;
		final JTable jTableDatosTipoMoviFinan=this.jTableDatosTipoMoviFinan;		
		final JPanel jPanelPaginacionTipoMoviFinan=this.jPanelPaginacionTipoMoviFinan;
		//final JScrollPane jScrollPanelDatosEdicionTipoMoviFinan=this.jScrollPanelDatosEdicionTipoMoviFinan;
		final JPanel jPanelAccionesTipoMoviFinan=this.jPanelAccionesTipoMoviFinan;
		
		JPanel jPanelCamposAuxiliarTipoMoviFinan=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoMoviFinan=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) {
			jPanelCamposAuxiliarTipoMoviFinan=this.jInternalFrameDetalleFormTipoMoviFinan.jPanelCamposTipoMoviFinan;
			jPanelAccionesFormularioAuxiliarTipoMoviFinan=this.jInternalFrameDetalleFormTipoMoviFinan.jPanelAccionesFormularioTipoMoviFinan;
		}
		
		final JPanel jPanelCamposTipoMoviFinan=jPanelCamposAuxiliarTipoMoviFinan;
		final JPanel jPanelAccionesFormularioTipoMoviFinan=jPanelAccionesFormularioAuxiliarTipoMoviFinan;
		
		
		final JMenuBar jmenuBarTipoMoviFinan=this.jmenuBarTipoMoviFinan;		
		final JToolBar jTtoolBarTipoMoviFinan=this.jTtoolBarTipoMoviFinan;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoMoviFinan=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoMoviFinan=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) {
			jmenuBarDetalleAuxiliarTipoMoviFinan=this.jInternalFrameDetalleFormTipoMoviFinan.jmenuBarDetalleTipoMoviFinan;
			jTtoolBarDetalleAuxiliarTipoMoviFinan=this.jInternalFrameDetalleFormTipoMoviFinan.jTtoolBarDetalleTipoMoviFinan;		
		}
		
		final JMenuBar jmenuBarDetalleTipoMoviFinan=jmenuBarDetalleAuxiliarTipoMoviFinan;
		final JToolBar jTtoolBarDetalleTipoMoviFinan=jTtoolBarDetalleAuxiliarTipoMoviFinan;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoMoviFinan;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoMoviFinan;
			processRunnable.jTableDatos=jTableDatosTipoMoviFinan;
			processRunnable.jPanelCampos=jPanelCamposTipoMoviFinan;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoMoviFinan;
			processRunnable.jPanelAcciones=jPanelAccionesTipoMoviFinan;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoMoviFinan;
			
			
			processRunnable.jmenuBar=jmenuBarTipoMoviFinan;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoMoviFinan;
			processRunnable.jTtoolBar=jTtoolBarTipoMoviFinan;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoMoviFinan;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoMoviFinan ,jPanelParametrosReportesTipoMoviFinan, jTableDatosTipoMoviFinan,/*jScrollPanelDatosTipoMoviFinan,*/jPanelCamposTipoMoviFinan,jPanelPaginacionTipoMoviFinan, /*jScrollPanelDatosEdicionTipoMoviFinan,*/ jPanelAccionesTipoMoviFinan,jPanelAccionesFormularioTipoMoviFinan,jmenuBarTipoMoviFinan,jmenuBarDetalleTipoMoviFinan,jTtoolBarTipoMoviFinan,jTtoolBarDetalleTipoMoviFinan));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoMoviFinan(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoMoviFinan(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoMoviFinan(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoMoviFinan(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoMoviFinan,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoMoviFinan,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoMoviFinan(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoMoviFinan,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoMoviFinan,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipomovifinanConstantesFunciones.getsFinalQueryTipoMoviFinan();
		String  finalQueryPaginacionTodos=this.tipomovifinanConstantesFunciones.getsFinalQueryTipoMoviFinan();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoMoviFinanConstantesFunciones.getArrayColumnasGlobalesNoTipoMoviFinan(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoMoviFinanConstantesFunciones.getArrayColumnasGlobalesTipoMoviFinan(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoMoviFinanConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipomovifinansEliminados= new ArrayList<TipoMoviFinan>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoMoviFinan();
		
				///*TipoMoviFinanSessionBean*/this.tipomovifinanSessionBean=new TipoMoviFinanSessionBean();
			
			if(this.tipomovifinanSessionBean==null) {
				this.tipomovifinanSessionBean=new TipoMoviFinanSessionBean();
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
					this.iNumeroPaginacion=TipoMoviFinanConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoMoviFinanConstantesFunciones.getClassesForeignKeysOfTipoMoviFinan(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipomovifinan."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipomovifinansAux= new ArrayList<TipoMoviFinan>();
			
				
			tipomovifinanLogic.setDatosCliente(this.datosCliente);
			tipomovifinanLogic.setDatosDeep(this.datosDeep);
			tipomovifinanLogic.setIsConDeep(true);
			
			
			tipomovifinanLogic.getTipoMoviFinanDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipomovifinanLogic.getTodosTipoMoviFinans(finalQueryGlobal,pagination);
					
					//tipomovifinanLogic.getTodosTipoMoviFinansWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipomovifinanLogic.getTipoMoviFinans()==null|| tipomovifinanLogic.getTipoMoviFinans().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomovifinansAux= new ArrayList<TipoMoviFinan>();
							tipomovifinansAux.addAll(tipomovifinanLogic.getTipoMoviFinans());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomovifinansAux= new ArrayList<TipoMoviFinan>();
							tipomovifinansAux.addAll(tipomovifinans);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomovifinanLogic.getTodosTipoMoviFinans(finalQueryGlobal+"",this.pagination);												
							
							//tipomovifinanLogic.getTodosTipoMoviFinansWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoMoviFinans("Todos",tipomovifinanLogic.getTipoMoviFinans() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomovifinanLogic.setTipoMoviFinans(new ArrayList<TipoMoviFinan>());					
							tipomovifinanLogic.getTipoMoviFinans().addAll(tipomovifinansAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomovifinans=new ArrayList<TipoMoviFinan>();
							tipomovifinans.addAll(tipomovifinansAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoMoviFinan=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoMoviFinan=this.idActual;
				
				} else if(this.idTipoMoviFinanActual!=null && this.idTipoMoviFinanActual!=0L) {
					idTipoMoviFinan=idTipoMoviFinanActual;
				}
				
					
				this.sDetalleReporte=TipoMoviFinanConstantesFunciones.getDetalleIndicePorId(idTipoMoviFinan);
				
				this.tipomovifinans=new ArrayList<TipoMoviFinan>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipomovifinanLogic.getEntity(idTipoMoviFinan);
					
					//tipomovifinanLogic.getEntityWithConnection(idTipoMoviFinan);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomovifinanLogic.setTipoMoviFinans(new ArrayList<TipoMoviFinan>());
					tipomovifinanLogic.getTipoMoviFinans().add(tipomovifinanLogic.getTipoMoviFinan());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomovifinans=new ArrayList<TipoMoviFinan>();
					this.tipomovifinans.add(tipomovifinan);
				}
				
				if(tipomovifinanLogic.getTipoMoviFinan()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoMoviFinanConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipomovifinanLogic.getTipoMoviFinansFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMoviFinanConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMoviFinanConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipomovifinanLogic.getTipoMoviFinans()==null||tipomovifinanLogic.getTipoMoviFinans().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipomovifinans==null|| tipomovifinans.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovifinansAux=new ArrayList<TipoMoviFinan>();
						tipomovifinansAux.addAll(tipomovifinanLogic.getTipoMoviFinans());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomovifinansAux=new ArrayList<TipoMoviFinan>();
							tipomovifinansAux.addAll(tipomovifinans);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipomovifinanLogic.getTipoMoviFinansFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMoviFinanConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMoviFinanConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoMoviFinans("FK_IdEmpresa",tipomovifinanLogic.getTipoMoviFinans());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoMoviFinans("FK_IdEmpresa",tipomovifinans);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovifinanLogic.setTipoMoviFinans(new ArrayList<TipoMoviFinan>());
						tipomovifinanLogic.getTipoMoviFinans().addAll(tipomovifinansAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomovifinans=new ArrayList<TipoMoviFinan>();
							tipomovifinans.addAll(tipomovifinansAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoMoviFinan();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoMoviFinan();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipomovifinanLogic.getTipoMoviFinans().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomovifinans.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipomovifinanLogic.getTipoMoviFinans().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomovifinans.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoMoviFinan tipomovifinan) {
		Boolean permite=true;
		
		if(this.tipomovifinan.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoMoviFinanConstantesFunciones.getOrderByListaTipoMoviFinan();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoMoviFinanConstantesFunciones.getOrderByListaTipoMoviFinan();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMoviFinan tipomovifinan:tipomovifinanLogic.getTipoMoviFinans()) {
				if(tipomovifinan.getsType().equals(Constantes2.S_TOTALES)) {
					tipomovifinanTotales=tipomovifinan;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMoviFinan tipomovifinan:this.tipomovifinans) {
				if(tipomovifinan.getsType().equals(Constantes2.S_TOTALES)) {
					tipomovifinanTotales=tipomovifinan;
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
			this.tipomovifinanAux=new TipoMoviFinan();
			this.tipomovifinanAux.setsType(Constantes2.S_TOTALES);
			this.tipomovifinanAux.setIsNew(false);
			this.tipomovifinanAux.setIsChanged(false);
			this.tipomovifinanAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoMoviFinanConstantesFunciones.TotalizarValoresFilaTipoMoviFinan(this.tipomovifinanLogic.getTipoMoviFinans(),this.tipomovifinanAux);
				
				this.tipomovifinanLogic.getTipoMoviFinans().add(this.tipomovifinanAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoMoviFinanConstantesFunciones.TotalizarValoresFilaTipoMoviFinan(this.tipomovifinans,this.tipomovifinanAux);
				
				this.tipomovifinans.add(this.tipomovifinanAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipomovifinanTotales=new TipoMoviFinan();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipomovifinanLogic.getTipoMoviFinans().remove(tipomovifinanTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipomovifinans.remove(tipomovifinanTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipomovifinanTotales=new TipoMoviFinan();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMoviFinan tipomovifinan:tipomovifinanLogic.getTipoMoviFinans()) {
				if(tipomovifinan.getsType().equals(Constantes2.S_TOTALES)) {
					tipomovifinanTotales=tipomovifinan;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoMoviFinanConstantesFunciones.TotalizarValoresFilaTipoMoviFinan(this.tipomovifinanLogic.getTipoMoviFinans(),tipomovifinanTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMoviFinan tipomovifinan:this.tipomovifinans) {
				if(tipomovifinan.getsType().equals(Constantes2.S_TOTALES)) {
					tipomovifinanTotales=tipomovifinan;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoMoviFinanConstantesFunciones.TotalizarValoresFilaTipoMoviFinan(this.tipomovifinans,tipomovifinanTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoMoviFinansFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoMoviFinansFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomovifinanLogic.getTipoMoviFinansFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoMoviFinan() {
		this.isPermisoTodoTipoMoviFinan=false;
		this.isPermisoNuevoTipoMoviFinan=false;
		this.isPermisoActualizarTipoMoviFinan=false;
		this.isPermisoActualizarOriginalTipoMoviFinan=false;
		this.isPermisoEliminarTipoMoviFinan=false;
		this.isPermisoGuardarCambiosTipoMoviFinan=false;
		this.isPermisoConsultaTipoMoviFinan=false;
		this.isPermisoBusquedaTipoMoviFinan=false;
		this.isPermisoReporteTipoMoviFinan=false;		
		this.isPermisoOrdenTipoMoviFinan=false;		
		this.isPermisoPaginacionMedioTipoMoviFinan=false;		
		this.isPermisoPaginacionAltoTipoMoviFinan=false;
		this.isPermisoPaginacionTodoTipoMoviFinan=false;
		this.isPermisoCopiarTipoMoviFinan=false;		
		this.isPermisoVerFormTipoMoviFinan=false;		
		this.isPermisoDuplicarTipoMoviFinan=false;		
		this.isPermisoOrdenTipoMoviFinan=false;		
	}
	
	public void setPermisosUsuarioTipoMoviFinan(Boolean isPermiso) {
		this.isPermisoTodoTipoMoviFinan=isPermiso;
		this.isPermisoNuevoTipoMoviFinan=isPermiso;
		this.isPermisoActualizarTipoMoviFinan=isPermiso;
		this.isPermisoActualizarOriginalTipoMoviFinan=isPermiso;
		this.isPermisoEliminarTipoMoviFinan=isPermiso;
		this.isPermisoGuardarCambiosTipoMoviFinan=isPermiso;
		this.isPermisoConsultaTipoMoviFinan=isPermiso;
		this.isPermisoBusquedaTipoMoviFinan=isPermiso;
		this.isPermisoReporteTipoMoviFinan=isPermiso;
		this.isPermisoOrdenTipoMoviFinan=isPermiso;		
		this.isPermisoPaginacionMedioTipoMoviFinan=isPermiso;		
		this.isPermisoPaginacionAltoTipoMoviFinan=isPermiso;		
		this.isPermisoPaginacionTodoTipoMoviFinan=isPermiso;		
		this.isPermisoCopiarTipoMoviFinan=isPermiso;		
		this.isPermisoVerFormTipoMoviFinan=isPermiso;		
		this.isPermisoDuplicarTipoMoviFinan=isPermiso;
		this.isPermisoOrdenTipoMoviFinan=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoMoviFinan(Boolean isPermiso) {
		//this.isPermisoTodoTipoMoviFinan=isPermiso;
		this.isPermisoNuevoTipoMoviFinan=isPermiso;
		this.isPermisoActualizarTipoMoviFinan=isPermiso;
		this.isPermisoActualizarOriginalTipoMoviFinan=isPermiso;
		this.isPermisoEliminarTipoMoviFinan=isPermiso;
		this.isPermisoGuardarCambiosTipoMoviFinan=isPermiso;
		//this.isPermisoConsultaTipoMoviFinan=isPermiso;
		//this.isPermisoBusquedaTipoMoviFinan=isPermiso;
		//this.isPermisoReporteTipoMoviFinan=isPermiso;
		//this.isPermisoOrdenTipoMoviFinan=isPermiso;		
		//this.isPermisoPaginacionMedioTipoMoviFinan=isPermiso;		
		//this.isPermisoPaginacionAltoTipoMoviFinan=isPermiso;		
		//this.isPermisoPaginacionTodoTipoMoviFinan=isPermiso;		
		//this.isPermisoCopiarTipoMoviFinan=isPermiso;		
		//this.isPermisoDuplicarTipoMoviFinan=isPermiso;
		//this.isPermisoOrdenTipoMoviFinan=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoMoviFinanClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(InformacionFinancieraConstantesFunciones.SNOMBREOPCION);
		
		if(TipoMoviFinanJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosInformacionFinanciera=false;
		this.isTienePermisosInformacionFinanciera=this.verificarGetPermisosUsuarioOpcionTipoMoviFinanClaseRelacionada(this.opcionsRelacionadas,InformacionFinancieraConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoMoviFinan(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoMoviFinanClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosInformacionFinanciera=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoMoviFinanClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoMoviFinanClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoMoviFinanClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosInformacionFinanciera && this.jInternalFrameDetalleFormTipoMoviFinan!=null && this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoMoviFinan.jTabbedPaneRelacionesTipoMoviFinan.remove(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoMoviFinan() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoMoviFinanJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoMoviFinanConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoMoviFinan=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoMoviFinan=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoMoviFinan=this.isPermisoActualizarTipoMoviFinan;
			this.isPermisoEliminarTipoMoviFinan=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoMoviFinan=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoMoviFinan=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoMoviFinan=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoMoviFinan=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoMoviFinan=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoMoviFinan=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoMoviFinan=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoMoviFinan=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoMoviFinan=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoMoviFinan=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoMoviFinan=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoMoviFinan=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoMoviFinan=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoMoviFinan.setToolTipText(this.jTableDatosTipoMoviFinan.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoMoviFinan(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoMoviFinan(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoMoviFinanJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoMoviFinanJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoMoviFinan() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosInformacionFinanciera && this.tipomovifinanConstantesFunciones.mostrarInformacionFinancieraTipoMoviFinan && !TipoMoviFinanConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Informacion Financiera");
			reporte.setsDescripcion("Informacion Financiera");
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
	public void inicializarCombosForeignKeyTipoMoviFinanListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoMoviFinanListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoMoviFinanJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoMoviFinanListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoMoviFinanListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoMoviFinanParameterReturnGeneral tipomovifinanReturnGeneral=new TipoMoviFinanParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipomovifinanConstantesFunciones.cargarid_empresaTipoMoviFinan)
					 || (this.esRecargarFks && this.tipomovifinanConstantesFunciones.cargarid_empresaTipoMoviFinan)) {

					if(!this.tipomovifinanSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipomovifinanSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipomovifinanReturnGeneral=tipomovifinanLogic.cargarCombosLoteForeignKeyTipoMoviFinan(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipomovifinanReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoMoviFinan()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipomovifinanSessionBean==null) {
				this.tipomovifinanSessionBean=new TipoMoviFinanSessionBean();
			}

			if(!this.tipomovifinanSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoMoviFinan()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoMoviFinan(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoMoviFinan()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoMoviFinan();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoMoviFinan(TipoMoviFinan tipomovifinan)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoMoviFinan(TipoMoviFinan tipomovifinan,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoMoviFinan()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoMoviFinan()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoMoviFinan()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoMoviFinan()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoMoviFinan()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoMoviFinan()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoMoviFinan(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoMoviFinan()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxid_empresaTipoMoviFinan!=null && this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxid_empresaTipoMoviFinan.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxid_empresaTipoMoviFinan.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoMoviFinanBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoMoviFinanBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoMoviFinanBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipomovifinanSessionBean=new TipoMoviFinanSessionBean(); 
		this.tipomovifinanConstantesFunciones=new TipoMoviFinanConstantesFunciones(); 
		this.tipomovifinanBean=new TipoMoviFinan();//(this.tipomovifinanConstantesFunciones); 		
		this.tipomovifinanReturnGeneral=new TipoMoviFinanParameterReturnGeneral(); 
		
		this.tipomovifinanSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomovifinanSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoMoviFinanBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoMoviFinanBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoMoviFinanBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoMoviFinan(true);
			
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
			
			this.tipomovifinanConstantesFunciones=new TipoMoviFinanConstantesFunciones(); 
			this.tipomovifinanBean=new TipoMoviFinan();//this.tipomovifinanConstantesFunciones); 			
			this.tipomovifinanReturnGeneral=new TipoMoviFinanParameterReturnGeneral(); 
		
			TipoMoviFinanBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Movi Finan Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipomovifinan=new TipoMoviFinan();
			this.tipomovifinans = new ArrayList<TipoMoviFinan>();
			this.tipomovifinansAux = new ArrayList<TipoMoviFinan>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic=new TipoMoviFinanLogic();
				this.tipomovifinanLogic.getNewConnexionToDeep("");
			}
			
			//this.tipomovifinanSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipomovifinanSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoMoviFinan);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoMoviFinan!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoMoviFinan);	
					}
					
					if(this.jInternalFrameImportacionTipoMoviFinan!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoMoviFinan);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoMoviFinan!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoMoviFinan);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoMoviFinan);
				this.jInternalFrameDetalleFormTipoMoviFinan.setVisible(false);
				this.jInternalFrameDetalleFormTipoMoviFinan.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoMoviFinan!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoMoviFinan);
					this.jInternalFrameReporteDinamicoTipoMoviFinan.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoMoviFinan.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoMoviFinan!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoMoviFinan);
					this.jInternalFrameImportacionTipoMoviFinan.setVisible(false);
					this.jInternalFrameImportacionTipoMoviFinan.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoMoviFinan!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoMoviFinan);
					this.jInternalFrameOrderByTipoMoviFinan.setVisible(false);
					this.jInternalFrameOrderByTipoMoviFinan.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoMoviFinanActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoMoviFinanConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipomovifinanReturnGeneral=new TipoMoviFinanParameterReturnGeneral();
			
			this.tipomovifinanParameterGeneral=new TipoMoviFinanParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipomovifinanLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoMoviFinanJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(InformacionFinancieraConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoMoviFinanConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipomovifinanSessionBean.getEsGuardarRelacionado(),this.tipomovifinanSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoMoviFinanConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipomovifinanSessionBean.getEsGuardarRelacionado(),this.tipomovifinanSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoMoviFinan=false;
			this.isVisibilidadCeldaDuplicarTipoMoviFinan=true;
			this.isVisibilidadCeldaCopiarTipoMoviFinan=true;
			this.isVisibilidadCeldaVerFormTipoMoviFinan=true;
			this.isVisibilidadCeldaOrdenTipoMoviFinan=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoMoviFinan=false;
			this.isVisibilidadCeldaModificarTipoMoviFinan=false;
			this.isVisibilidadCeldaActualizarTipoMoviFinan=false;
			this.isVisibilidadCeldaEliminarTipoMoviFinan=false;
			this.isVisibilidadCeldaCancelarTipoMoviFinan=false;
			this.isVisibilidadCeldaGuardarTipoMoviFinan=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMoviFinan=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoMoviFinan("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoMoviFinan();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoMoviFinan(false);
			
			this.setPermisosUsuarioTipoMoviFinan();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomovifinanSessionBean.getEsGuardarRelacionado() 
				|| (this.tipomovifinanSessionBean.getEsGuardarRelacionado() && this.tipomovifinanSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoMoviFinanClasesRelacionadas();
			}
			
			if(this.tipomovifinanSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoMoviFinanClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoMoviFinanJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoMoviFinan();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoMoviFinan();
			}
			
			if(!this.isPermisoBusquedaTipoMoviFinan) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoMoviFinan.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoMoviFinan,this.isPermisoPaginacionMedioTipoMoviFinan,this.isPermisoPaginacionTodoTipoMoviFinan);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoMoviFinanConstantesFunciones.getTiposSeleccionarTipoMoviFinan());
				
				this.tiposColumnasSelect=TipoMoviFinanConstantesFunciones.getTiposSeleccionarTipoMoviFinan(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoMoviFinan();				
				//this.tiposRelacionesSelect=TipoMoviFinanConstantesFunciones.getTiposRelacionesTipoMoviFinan(true);
				
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
			//if(!this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoMoviFinan();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoMoviFinan(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoMoviFinan(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoMoviFinan() ;
			
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
			
			
			this.informacionfinancieraLogic=new InformacionFinancieraLogic(); 
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
				tipomovifinanImplementable= (TipoMoviFinanImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoMoviFinanConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipomovifinanImplementableHome= (TipoMoviFinanImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoMoviFinanConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipomovifinans= new ArrayList<TipoMoviFinan>();
			this.tipomovifinansEliminados= new ArrayList<TipoMoviFinan>();
						
			this.isEsNuevoTipoMoviFinan=false;
			this.esParaAccionDesdeFormularioTipoMoviFinan=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoMoviFinan(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoMoviFinan();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoMoviFinanBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoMoviFinanConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoMoviFinan("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoMoviFinan(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoMoviFinan();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoMoviFinan();
			}
			
			TipoMoviFinanBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoMoviFinan.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoMoviFinan.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoMoviFinan.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoMoviFinan(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoMoviFinan: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoMoviFinan() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoMoviFinan")) {
				iIndex=this.jInternalFrameDetalleFormTipoMoviFinan.jTabbedPaneRelacionesTipoMoviFinan.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoMoviFinan.jTabbedPaneRelacionesTipoMoviFinan.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoMoviFinan.getSelectedRow();	
				
				

				if(sTitle.equals("Informacion Financieras")) {
					if(!InformacionFinancieraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoMoviFinan();

						this.cargarParteTabPanelRelacionadaInformacionFinanciera(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoMoviFinan();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaInformacionFinanciera(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoMoviFinan.cargarSessionConBeanSwingJInternalFrameInformacionFinanciera(false,true,iIndex);
		this.jButtonInformacionFinancieraActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaInformacionFinanciera();

		//this.jTabbedPaneRelacionesTipoMoviFinan.updateUI();
		//this.jTabbedPaneRelacionesTipoMoviFinan.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoMoviFinan.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("InformacionFinanciera")) {
				int row=this.jTableDatosTipoMoviFinan.getSelectedRow();
				jButtonInformacionFinancieraActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Informacion Financiera")) {

					if(this.isTienePermisosInformacionFinanciera && this.tipomovifinanConstantesFunciones.mostrarInformacionFinancieraTipoMoviFinan && !TipoMoviFinanConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Informacion Financieras"+"("+InformacionFinancieraConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Informacion Financieras");

						if(tipomovifinanConstantesFunciones.resaltarInformacionFinancieraTipoMoviFinan!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipomovifinanConstantesFunciones.resaltarInformacionFinancieraTipoMoviFinan);
						}

						jmenuItem.setEnabled(this.tipomovifinanConstantesFunciones.activarInformacionFinancieraTipoMoviFinan);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"InformacionFinanciera"));

						

						this.jInternalFrameDetalleFormTipoMoviFinan.jmenuDetalleTipoMoviFinan.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoMoviFinan(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoMoviFinan(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoMoviFinan(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoMoviFinanListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoMoviFinan();
		
		this.cargarCombosFrameForeignKeyTipoMoviFinan();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoMoviFinan();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoMoviFinan();
		}
	}
	
	
	
	public void jButtonNuevoTipoMoviFinanActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipomovifinanSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoMoviFinan==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
			
			
			if(jTableDatosTipoMoviFinan.getRowCount()>=1) {
				jTableDatosTipoMoviFinan.removeRowSelectionInterval(0, jTableDatosTipoMoviFinan.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoMoviFinan=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoMoviFinan(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoMoviFinan(true);			
			//this.tipomovifinan=new TipoMoviFinan();
			//this.tipomovifinan.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoMoviFinan(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMoviFinan() ;
			
			if(TipoMoviFinanJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoMoviFinan(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipomovifinan);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipomovifinan);				
			
			TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
			
			if(this.tipomovifinanSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoMoviFinan: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoMoviFinanActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoMoviFinan> tipomovifinansSeleccionados=new ArrayList<TipoMoviFinan>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoMoviFinan.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoMoviFinan.getSelectedRows().length;			
			}
			
			tipomovifinansSeleccionados=this.getTipoMoviFinansSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoMoviFinan--;			
				//TipoMoviFinan tipomovifinanAux= new TipoMoviFinan();			
				//tipomovifinanAux.setId(this.iIdNuevoTipoMoviFinan);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoMoviFinan tipomovifinanOrigen=new TipoMoviFinan();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoMoviFinan tipomovifinanOrigen : tipomovifinansSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoMoviFinan.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipomovifinanOrigen =(TipoMoviFinan) this.tipomovifinanLogic.getTipoMoviFinans().toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomovifinanOrigen =(TipoMoviFinan) this.tipomovifinans.toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoMoviFinan();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipomovifinan.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoMoviFinan(tipomovifinanOrigen,this.tipomovifinan,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMoviFinan(this.tipomovifinan);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipomovifinanLogic.getTipoMoviFinans().add(this.tipomovifinanAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipomovifinans.add(this.tipomovifinanAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoMoviFinan(false);
				
				this.jTableDatosTipoMoviFinan.setRowSelectionInterval(this.getIndiceNuevoTipoMoviFinan(), this.getIndiceNuevoTipoMoviFinan());
				
				int iLastRow =  this.jTableDatosTipoMoviFinan.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoMoviFinan.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoMoviFinan.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoMoviFinan(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoMoviFinanActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoMoviFinan> tipomovifinansSeleccionados=new ArrayList<TipoMoviFinan>();									
		
			TipoMoviFinan tipomovifinanOrigen=new TipoMoviFinan();
			TipoMoviFinan tipomovifinanDestino=new TipoMoviFinan();
				
			tipomovifinansSeleccionados=this.getTipoMoviFinansSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoMoviFinan.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipomovifinansSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoMoviFinan.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovifinanOrigen =(TipoMoviFinan) this.tipomovifinanLogic.getTipoMoviFinans().toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipomovifinanOrigen =(TipoMoviFinan) this.tipomovifinans.toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovifinanDestino =(TipoMoviFinan) this.tipomovifinanLogic.getTipoMoviFinans().toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipomovifinanDestino =(TipoMoviFinan) this.tipomovifinans.toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipomovifinanOrigen =tipomovifinansSeleccionados.get(0);
				tipomovifinanDestino =tipomovifinansSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoMoviFinan(tipomovifinanOrigen,tipomovifinanDestino,true,false);
				
				tipomovifinanDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipomovifinanDestino,tipomovifinanLogic.getTipoMoviFinans());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomovifinanDestino,tipomovifinans);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoMoviFinan(false);
				
				//this.jTableDatosTipoMoviFinan.setRowSelectionInterval(this.getIndiceNuevoTipoMoviFinan(), this.getIndiceNuevoTipoMoviFinan());
				
				int iLastRow =  this.jTableDatosTipoMoviFinan.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoMoviFinan.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoMoviFinan.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoMoviFinan(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoMoviFinanActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoMoviFinan==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoMoviFinan.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoMoviFinanActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoMoviFinan.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoMoviFinan.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoMoviFinan.setVisible(!isVisible);
			this.jPanelPaginacionTipoMoviFinan.setVisible(!isVisible);
			this.jPanelAccionesTipoMoviFinan.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoMoviFinanActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoMoviFinan();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoMoviFinanActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoMoviFinan();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoMoviFinanActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoMoviFinan();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoMoviFinanActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoMoviFinan();
			
			this.abrirFrameOrderByTipoMoviFinan();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoMoviFinanActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoMoviFinan();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoMoviFinan(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoMoviFinan);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoMoviFinan.isMaximum()) {
					this.jInternalFrameDetalleFormTipoMoviFinan.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoMoviFinan.setSize(this.jInternalFrameDetalleFormTipoMoviFinan.iWidthFormulario,this.jInternalFrameDetalleFormTipoMoviFinan.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoMoviFinan.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoMoviFinan.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoMoviFinan.isMaximum()) {
						this.jInternalFrameDetalleFormTipoMoviFinan.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoMoviFinan.jContentPaneDetalleTipoMoviFinan.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoMoviFinan.jTabbedPaneRelacionesTipoMoviFinan.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoMoviFinan.jContentPaneDetalleTipoMoviFinan.getWidth(),TipoMoviFinanConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoMoviFinan.jTabbedPaneRelacionesTipoMoviFinan.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoMoviFinan.jContentPaneDetalleTipoMoviFinan.getWidth(),TipoMoviFinanConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoMoviFinan.jTabbedPaneRelacionesTipoMoviFinan.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoMoviFinan.jContentPaneDetalleTipoMoviFinan.getWidth(),TipoMoviFinanConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(InformacionFinancieraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaInformacionFinanciera();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoMoviFinan.setVisible(true);
	        this.jInternalFrameDetalleFormTipoMoviFinan.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoMoviFinan() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoMoviFinan==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoMoviFinan=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMoviFinan,false,this);
				} else {
					this.jInternalFrameOrderByTipoMoviFinan=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMoviFinan,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoMoviFinan);
				this.jInternalFrameOrderByTipoMoviFinan.setVisible(false);
				this.jInternalFrameOrderByTipoMoviFinan.setSelected(false);
				
				this.jInternalFrameOrderByTipoMoviFinan.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoMoviFinan"));
				
				this.inicializarActualizarBindingTablaOrderByTipoMoviFinan();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoMoviFinan() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoMoviFinan==null) {
				
				this.jInternalFrameImportacionTipoMoviFinan=new ImportacionJInternalFrame(TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoMoviFinan);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoMoviFinan);
				this.jInternalFrameImportacionTipoMoviFinan.setVisible(false);
				this.jInternalFrameImportacionTipoMoviFinan.setSelected(false);


				this.jInternalFrameImportacionTipoMoviFinan.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoMoviFinan"));
				this.jInternalFrameImportacionTipoMoviFinan.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoMoviFinan"));
				this.jInternalFrameImportacionTipoMoviFinan.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoMoviFinan"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoMoviFinan() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoMoviFinan==null) {
				this.jInternalFrameReporteDinamicoTipoMoviFinan=new ReporteDinamicoJInternalFrame(TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoMoviFinan);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoMoviFinan);
				this.jInternalFrameReporteDinamicoTipoMoviFinan.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoMoviFinan.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoMoviFinan.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoMoviFinan"));
				this.jInternalFrameReporteDinamicoTipoMoviFinan.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoMoviFinan"));
				this.jInternalFrameReporteDinamicoTipoMoviFinan.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoMoviFinan"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoMoviFinan();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaInformacionFinanciera() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.jScrollPanelDatosInformacionFinanciera.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoMoviFinan.jContentPaneDetalleTipoMoviFinan.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.jScrollPanelDatosInformacionFinanciera.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.jScrollPanelDatosInformacionFinanciera.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.jScrollPanelDatosInformacionFinanciera.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoMoviFinan() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoMoviFinan);
			
	       	this.jInternalFrameDetalleFormTipoMoviFinan.setVisible(false);
	        this.jInternalFrameDetalleFormTipoMoviFinan.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoMoviFinan.dispose();
			//this.jInternalFrameDetalleFormTipoMoviFinan=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoMoviFinan() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoMoviFinan.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoMoviFinan.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoMoviFinan() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoMoviFinan.setVisible(true);
	        this.jInternalFrameImportacionTipoMoviFinan.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoMoviFinan() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoMoviFinan.setVisible(true);
	        this.jInternalFrameOrderByTipoMoviFinan.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoMoviFinan() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoMoviFinan.setVisible(false);
	        this.jInternalFrameOrderByTipoMoviFinan.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoMoviFinan() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoMoviFinan.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoMoviFinan.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoMoviFinan() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoMoviFinan.setVisible(false);
	        this.jInternalFrameImportacionTipoMoviFinan.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoMoviFinanActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoMoviFinan(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoMoviFinan(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoMoviFinan.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoMoviFinan(true);
			//this.isEsNuevoTipoMoviFinan=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinan =(TipoMoviFinan) this.tipomovifinanLogic.getTipoMoviFinans().toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomovifinan =(TipoMoviFinan) this.tipomovifinans.toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoMoviFinan("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoMoviFinan(false) ;
			
			if(tipomovifinanSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraSessionBean.getEsGuardarRelacionado() && InformacionFinancieraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonInformacionFinancieraActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoMoviFinanJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoMoviFinan(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMoviFinan(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoMoviFinanActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoMoviFinan.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinan =(TipoMoviFinan) this.tipomovifinanLogic.getTipoMoviFinans().toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovifinan =(TipoMoviFinan) this.tipomovifinans.toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoMoviFinan(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoMoviFinan==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoMoviFinan.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoMoviFinan(true);
			//this.isEsNuevoTipoMoviFinan=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinan =(TipoMoviFinan) this.tipomovifinanLogic.getTipoMoviFinans().toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomovifinan =(TipoMoviFinan) this.tipomovifinans.toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipomovifinan.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoMoviFinan("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoMoviFinan(false) ;
			
			if(TipoMoviFinanJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoMoviFinan(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMoviFinan(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoMoviFinanActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoMoviFinan(false);
			
			//if(!this.isEsNuevoTipoMoviFinan) {								
				int intSelectedRow = this.jTableDatosTipoMoviFinan.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinan =(TipoMoviFinan) this.tipomovifinanLogic.getTipoMoviFinans().toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomovifinan =(TipoMoviFinan) this.tipomovifinans.toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoMoviFinanJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoMoviFinan(this.tipomovifinan,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMoviFinan(this.tipomovifinan);
				
			}
			
			if(this.permiteMantenimiento(this.tipomovifinan)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoMoviFinan=true;
					this.inicializarActualizarBindingTablaTipoMoviFinan(false);
					this.isEsNuevoTipoMoviFinan=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoMoviFinan=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoMoviFinan=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoMoviFinan(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoMoviFinan(false);
				
				this.habilitarDeshabilitarControlesTipoMoviFinan(false);
			
												
				
				if(TipoMoviFinanJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoMoviFinan();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoMoviFinanActionPerformed(evt,tipomovifinanSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoMoviFinan(this.tipomovifinan,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoMoviFinan.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipomovifinanSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipomovifinan.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoMoviFinan.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMoviFinan.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoMoviFinanActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoMoviFinan.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinan =(TipoMoviFinan) this.tipomovifinanLogic.getTipoMoviFinans().toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
				this.tipomovifinan.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomovifinan =(TipoMoviFinan) this.tipomovifinans.toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
				this.tipomovifinan.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipomovifinan)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoMoviFinanModel) this.jTableDatosTipoMoviFinan.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoMoviFinan=true;
				this.inicializarActualizarBindingTablaTipoMoviFinan(false);
				this.isEsNuevoTipoMoviFinan=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoMoviFinan(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoMoviFinan(false);
				
				this.habilitarDeshabilitarControlesTipoMoviFinan(false);
				
				
				
				if(TipoMoviFinanJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoMoviFinan();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoMoviFinanActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoMoviFinan.getRowCount()>=1) {
				jTableDatosTipoMoviFinan.removeRowSelectionInterval(0, jTableDatosTipoMoviFinan.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoMoviFinan(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoMoviFinan(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoMoviFinan(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMoviFinan(false) ;
			
			this.isEsNuevoTipoMoviFinan=false;
			
			if(TipoMoviFinanJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoMoviFinan();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoMoviFinanActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoMoviFinan(false);
				
				//SI ES MANUAL
				if(TipoMoviFinanJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoMoviFinan();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoMoviFinanActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoMoviFinan--;			
			//TipoMoviFinan tipomovifinanAux= new TipoMoviFinan();			
			//tipomovifinanAux.setId(this.iIdNuevoTipoMoviFinan);
			
			if(this.jInternalFrameDetalleFormTipoMoviFinan==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoMoviFinan();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoMoviFinan(this.tipomovifinan);
			
			this.tipomovifinan.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipomovifinanLogic.getTipoMoviFinans().add(this.tipomovifinanAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipomovifinans.add(this.tipomovifinanAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoMoviFinan(false);
			
			this.jTableDatosTipoMoviFinan.setRowSelectionInterval(this.getIndiceNuevoTipoMoviFinan(), this.getIndiceNuevoTipoMoviFinan());
			
			int iLastRow =  this.jTableDatosTipoMoviFinan.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoMoviFinan.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoMoviFinan.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoMoviFinan(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoMoviFinanActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoMoviFinan(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMoviFinan(false);
			
			//SI ES MANUAL
			if(TipoMoviFinanJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoMoviFinan();
			}
			
			//this.abrirFrameTreeTipoMoviFinan();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoMoviFinanActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Movi FinanES ?", "MANTENIMIENTO DE Tipo Movi Finan", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoMoviFinan.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoMoviFinan();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipomovifinanReturnGeneral=tipomovifinanLogic.procesarImportacionTipoMoviFinansWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipomovifinanParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoMoviFinanReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoMoviFinanActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoMoviFinan.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoMoviFinan.setFileImportacion(this.jInternalFrameImportacionTipoMoviFinan.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoMoviFinan.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoMoviFinan.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoMoviFinan.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoMoviFinan.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoMoviFinanActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoMoviFinan> tipomovifinansSeleccionados=new ArrayList<TipoMoviFinan>();		

		tipomovifinansSeleccionados=this.getTipoMoviFinansSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMoviFinan.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMoviFinan.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoMoviFinanBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoMoviFinanBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoMoviFinans("Todos",tipomovifinansSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movi Finan",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoMoviFinan.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMoviFinan.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoMoviFinanConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoMoviFinanConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoMoviFinanConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoMoviFinan.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoMoviFinan.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoMoviFinan.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoMoviFinanConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoMoviFinanConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoMoviFinanConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoMoviFinan.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoMoviFinanConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoMoviFinanConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoMoviFinanConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoMoviFinan.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMoviFinan.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoMoviFinanConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoMoviFinanConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoMoviFinanConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoMoviFinanActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoMoviFinan> tipomovifinansSeleccionados=new ArrayList<TipoMoviFinan>();		
		
		tipomovifinansSeleccionados=this.getTipoMoviFinansSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovifinan";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoMoviFinans");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoMoviFinan.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMoviFinan.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoMoviFinanConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMoviFinanConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoMoviFinan tipomovifinan:tipomovifinansSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomovifinan.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoMoviFinanConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMoviFinanConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoMoviFinan tipomovifinan:tipomovifinansSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomovifinan.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoMoviFinanConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMoviFinanConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoMoviFinan tipomovifinan:tipomovifinansSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomovifinan.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoMoviFinan(row);				
			//	iRow++;
			//}				
			
			//for(TipoMoviFinan tipomovifinanAux:tipomovifinansSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoMoviFinan(tipomovifinanAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movi Finan",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipomovifinanLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMoviFinan(false);
			
			//SI ES MANUAL
			if(TipoMoviFinanJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoMoviFinan();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoMoviFinanActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMoviFinan(false);
			
			//SI ES MANUAL
			if(TipoMoviFinanJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoMoviFinan();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoMoviFinanActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMoviFinan(false);
			
			//SI ES MANUAL
			if(TipoMoviFinanJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoMoviFinan();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoMoviFinan() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoMoviFinan.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoMoviFinan.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoMoviFinan.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoMoviFinan.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoMoviFinan.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoMoviFinan.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoMoviFinan.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoMoviFinan(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoMoviFinan(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoMoviFinan(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoMoviFinan(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoMoviFinan(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoMoviFinan(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoMoviFinan(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoMoviFinan(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoMoviFinanJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoMoviFinanJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoMoviFinan() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoMoviFinan();
		
		this.inicializarActualizarBindingBotonesManualTipoMoviFinan(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoMoviFinan();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoMoviFinan() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoMoviFinan(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoMoviFinan(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoMoviFinan.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoMoviFinan.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoMoviFinan.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoMoviFinan.jCheckBoxPostAccionNuevoTipoMoviFinan.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoMoviFinan.jCheckBoxPostAccionSinCerrarTipoMoviFinan.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoMoviFinan.jCheckBoxPostAccionSinMensajeTipoMoviFinan.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoMoviFinan.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoMoviFinan.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoMoviFinan.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) {
				this.jInternalFrameDetalleFormTipoMoviFinan.jCheckBoxPostAccionNuevoTipoMoviFinan.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoMoviFinan.jCheckBoxPostAccionSinCerrarTipoMoviFinan.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoMoviFinan.jCheckBoxPostAccionSinMensajeTipoMoviFinan.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoMoviFinan.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoMoviFinan.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxTiposAccionesFormularioTipoMoviFinan.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoMoviFinan.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoMoviFinan!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMoviFinan.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoMoviFinan.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoMoviFinan.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoMoviFinan.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoMoviFinan.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoMoviFinan!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMoviFinan.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoMoviFinan.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoMoviFinan.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoMoviFinan(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoMoviFinanJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoMoviFinan(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoMoviFinan() throws Exception {
		try	{
			if(TipoMoviFinanJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoMoviFinan();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoMoviFinan() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxTiposAccionesFormularioTipoMoviFinan.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxTiposAccionesFormularioTipoMoviFinan.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoMoviFinan() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoMoviFinan.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoMoviFinan.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoMoviFinan.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoMoviFinan.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoMoviFinan.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoMoviFinan.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoMoviFinan.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoMoviFinan.addItem(reporte);
			}
			
			
			if(!this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoMoviFinan.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoMoviFinan.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoMoviFinan.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoMoviFinan.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoMoviFinan.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoMoviFinan.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxTiposAccionesFormularioTipoMoviFinan.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxTiposAccionesFormularioTipoMoviFinan.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoMoviFinan.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoMoviFinan.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoMoviFinan.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoMoviFinan();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoMoviFinan() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoMoviFinan!=null) {
				this.jInternalFrameReporteDinamicoTipoMoviFinan.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoMoviFinan.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoMoviFinan!=null) {
				this.jInternalFrameReporteDinamicoTipoMoviFinan.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoMoviFinan.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoMoviFinan!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoMoviFinan.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoMoviFinan.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoMoviFinan.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoMoviFinan.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoMoviFinan.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoMoviFinan.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoMoviFinan()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoMoviFinan(Boolean esInicializar) throws Exception {				
		if(TipoMoviFinanJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoMoviFinan();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoMoviFinan() throws Exception {
		this.inicializarActualizarBindingTablaTipoMoviFinan(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoMoviFinan() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoMoviFinan.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoMoviFinan.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoMoviFinan.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoMoviFinanPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoMoviFinan.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoMoviFinan.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoMoviFinanPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoMoviFinanOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMoviFinanOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoMoviFinanPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoMoviFinan.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoMoviFinan.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoMoviFinanPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoMoviFinan.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoMoviFinan(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipomovifinanLogic.getTipoMoviFinans().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipomovifinans.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoMoviFinanJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoMoviFinan.setModel(new TipoMoviFinanModel(this.tipomovifinanLogic.getTipoMoviFinans(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoMoviFinan.setModel(new TipoMoviFinanModel(this.tipomovifinans,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoMoviFinan!=null && this.jInternalFrameOrderByTipoMoviFinan.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoMoviFinan();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoMoviFinan.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMoviFinan,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoMoviFinanPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO,tipomovifinanConstantesFunciones.resaltarSeleccionarTipoMoviFinan,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO,tipomovifinanConstantesFunciones.resaltarSeleccionarTipoMoviFinan,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoMoviFinan.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMoviFinan,TipoMoviFinanConstantesFunciones.LABEL_ID));

		if(this.tipomovifinanConstantesFunciones.mostraridTipoMoviFinan && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMoviFinanConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipomovifinanConstantesFunciones.resaltaridTipoMoviFinan,this.tipomovifinanConstantesFunciones.activaridTipoMoviFinan,this,true,"idTipoMoviFinan","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomovifinanConstantesFunciones.resaltaridTipoMoviFinan,this.tipomovifinanConstantesFunciones.activaridTipoMoviFinan,this,true,"idTipoMoviFinan","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMoviFinan.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMoviFinan,TipoMoviFinanConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipomovifinanConstantesFunciones.mostrarid_empresaTipoMoviFinan && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMoviFinanConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipomovifinanConstantesFunciones.resaltarid_empresaTipoMoviFinan,this,this.tipomovifinanConstantesFunciones.activarid_empresaTipoMoviFinan));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipomovifinanConstantesFunciones.resaltarid_empresaTipoMoviFinan,this,this.tipomovifinanConstantesFunciones.activarid_empresaTipoMoviFinan,false,"id_empresaTipoMoviFinan","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoMoviFinanPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMoviFinan.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMoviFinan,TipoMoviFinanConstantesFunciones.LABEL_CODIGO));

		if(this.tipomovifinanConstantesFunciones.mostrarcodigoTipoMoviFinan && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMoviFinanConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipomovifinanConstantesFunciones.resaltarcodigoTipoMoviFinan,this.tipomovifinanConstantesFunciones.activarcodigoTipoMoviFinan,this,true,"codigoTipoMoviFinan","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomovifinanConstantesFunciones.resaltarcodigoTipoMoviFinan,this.tipomovifinanConstantesFunciones.activarcodigoTipoMoviFinan,this,true,"codigoTipoMoviFinan","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoMoviFinanPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMoviFinan.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMoviFinan,TipoMoviFinanConstantesFunciones.LABEL_NOMBRE));

		if(this.tipomovifinanConstantesFunciones.mostrarnombreTipoMoviFinan && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMoviFinanConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipomovifinanConstantesFunciones.resaltarnombreTipoMoviFinan,this.tipomovifinanConstantesFunciones.activarnombreTipoMoviFinan,this,true,"nombreTipoMoviFinan","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomovifinanConstantesFunciones.resaltarnombreTipoMoviFinan,this.tipomovifinanConstantesFunciones.activarnombreTipoMoviFinan,this,true,"nombreTipoMoviFinan","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoMoviFinanPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipomovifinanSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosInformacionFinanciera && this.tipomovifinanConstantesFunciones.mostrarInformacionFinancieraTipoMoviFinan && !TipoMoviFinanConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Informacion Financieras");
				tableColumn.setHeaderValue("Informacion Financieras");
				tableColumn.setCellRenderer(new InformacionFinancieraTableCell(tipomovifinanConstantesFunciones.resaltarInformacionFinancieraTipoMoviFinan,this,this.tipomovifinanConstantesFunciones.activarInformacionFinancieraTipoMoviFinan));
				tableColumn.setCellEditor(new InformacionFinancieraTableCell(tipomovifinanConstantesFunciones.resaltarInformacionFinancieraTipoMoviFinan,this,this.tipomovifinanConstantesFunciones.activarInformacionFinancieraTipoMoviFinan));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoMoviFinan.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipomovifinanSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipomovifinanSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoMoviFinan.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipomovifinanSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipomovifinanSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoMoviFinan.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoMoviFinan && this.isPermisoGuardarCambiosTipoMoviFinan) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipomovifinanSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipomovifinanSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoMoviFinan.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipomovifinanSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoMoviFinan.addColumn(tableColumn);
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
			
			this.jTableDatosTipoMoviFinan.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoMoviFinan && this.isPermisoGuardarCambiosTipoMoviFinan) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipomovifinanSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoMoviFinan && this.isPermisoGuardarCambiosTipoMoviFinan) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoMoviFinan.moveColumn(this.jTableDatosTipoMoviFinan.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoMoviFinan.moveColumn(this.jTableDatosTipoMoviFinan.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipomovifinanSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoMoviFinan.moveColumn(this.jTableDatosTipoMoviFinan.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoMoviFinan.moveColumn(this.jTableDatosTipoMoviFinan.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoMoviFinan.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoMoviFinan.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoMoviFinan,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoMoviFinanJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoMoviFinan.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoMoviFinan.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoMoviFinanJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoMoviFinanJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoMoviFinan.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoMoviFinan.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoMoviFinan.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipomovifinanLogic.getTipoMoviFinans().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipomovifinans.size()-1;
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
		//this.jTableDatosTipoMoviFinan.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoMoviFinan.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoMoviFinan();
			
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
				
				//this.isEsNuevoTipoMoviFinan=false;
					
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
			
				if(this.tipomovifinanSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoMoviFinan==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoMoviFinan.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoMoviFinan.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinan =(TipoMoviFinan) this.tipomovifinanLogic.getTipoMoviFinans().toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovifinan =(TipoMoviFinan) this.tipomovifinans.toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipomovifinan.getsType().equals("DUPLICADO")
				   || this.tipomovifinan.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoMoviFinan=true;
				
				} else {
					this.isEsNuevoTipoMoviFinan=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
					if(this.tipomovifinan.getId()>=0 && !this.tipomovifinan.getIsNew()) {						
						this.isEsNuevoTipoMoviFinan=false;
						
					} else {
						this.isEsNuevoTipoMoviFinan=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoMoviFinan(esRelaciones);						
				
				this.seleccionarTipoMoviFinan(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipomovifinan.getId()<0) {
					this.isEsNuevoTipoMoviFinan=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoMoviFinan(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoMoviFinan(evt,rowIndex);
				}	
				
				if(this.tipomovifinanSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoMoviFinan: " + this.dDif); 
					}
				}								
				
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoMoviFinan(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipomovifinan)) {
					if(this.tipomovifinan.getId()>0) {
						this.tipomovifinan.setIsDeleted(true);
						
						this.tipomovifinansEliminados.add(this.tipomovifinan);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipomovifinanLogic.getTipoMoviFinans().remove(this.tipomovifinan);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipomovifinans.remove(this.tipomovifinan);				
					}
					
					
					((TipoMoviFinanModel) this.jTableDatosTipoMoviFinan.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoMoviFinan(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoMoviFinan(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoMoviFinan) {
			
			if(this.jInternalFrameDetalleFormTipoMoviFinan==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoMoviFinan.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoMoviFinan.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinan =(TipoMoviFinan) this.tipomovifinanLogic.getTipoMoviFinans().toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovifinan =(TipoMoviFinan) this.tipomovifinans.toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoMoviFinanJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoMoviFinan(this.tipomovifinan);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipomovifinanConstantesFunciones.cargarid_empresaTipoMoviFinan || this.tipomovifinanConstantesFunciones.event_dependid_empresaTipoMoviFinan) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipomovifinan.getid_empresa());
									//this.inicializarActualizarBindingTipoMoviFinan(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipomovifinan.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipomovifinan.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipomovifinan.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoMoviFinan("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoMoviFinan(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoMoviFinan() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoMoviFinan(TipoMoviFinan tipomovifinan) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoMoviFinan(tipomovifinan,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoMoviFinan(TipoMoviFinan tipomovifinan,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoMoviFinan(tipomovifinan);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoMoviFinan(tipomovifinan,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoMoviFinan(tipomovifinan);
	}
	
	public void setVariablesObjetoActualToFormularioTipoMoviFinan(TipoMoviFinan tipomovifinan) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoMoviFinan==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoMoviFinan.jLabelidTipoMoviFinan.setText(tipomovifinan.getId().toString());
			this.jInternalFrameDetalleFormTipoMoviFinan.jTextFieldcodigoTipoMoviFinan.setText(tipomovifinan.getcodigo());
			this.jInternalFrameDetalleFormTipoMoviFinan.jTextAreanombreTipoMoviFinan.setText(tipomovifinan.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoMoviFinan tipomovifinanLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipomovifinanLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoMoviFinan tipomovifinanLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipomovifinanLocal=this.tipomovifinan;
			} else {
				tipomovifinanLocal=this.tipomovifinanAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipomovifinanLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoMoviFinan(tipomovifinanLocal,true);
					
					if(tipomovifinanSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipomovifinanLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipomovifinanLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoMoviFinan(TipoMoviFinan tipomovifinan,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoMoviFinan(tipomovifinan,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoMoviFinan(tipomovifinan);
	}
	
	public void setVariablesFormularioToObjetoActualTipoMoviFinan(TipoMoviFinan tipomovifinan,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoMoviFinan(tipomovifinan,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoMoviFinan(TipoMoviFinan tipomovifinan,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoMoviFinan==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoMoviFinan.jLabelidTipoMoviFinan.getText()==null || this.jInternalFrameDetalleFormTipoMoviFinan.jLabelidTipoMoviFinan.getText()=="" || this.jInternalFrameDetalleFormTipoMoviFinan.jLabelidTipoMoviFinan.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoMoviFinan.jLabelidTipoMoviFinan.setText("0");
			}

			if(conColumnasBase) {tipomovifinan.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoMoviFinan.jLabelidTipoMoviFinan.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMoviFinanConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMoviFinan.jLabelIdTipoMoviFinan,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipomovifinan.setcodigo(this.jInternalFrameDetalleFormTipoMoviFinan.jTextFieldcodigoTipoMoviFinan.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMoviFinanConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMoviFinan.jLabelcodigoTipoMoviFinan,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipomovifinan.setnombre(this.jInternalFrameDetalleFormTipoMoviFinan.jTextAreanombreTipoMoviFinan.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMoviFinanConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMoviFinan.jLabelnombreTipoMoviFinan,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoMoviFinan(TipoMoviFinan tipomovifinanBean,TipoMoviFinan tipomovifinan,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoMoviFinan(TipoMoviFinan tipomovifinanOrigen,TipoMoviFinan tipomovifinan,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipomovifinanOrigen.getId()!=null && !tipomovifinanOrigen.getId().equals(0L))) {tipomovifinan.setId(tipomovifinanOrigen.getId());}}
			if(conDefault || (!conDefault && tipomovifinanOrigen.getcodigo()!=null && !tipomovifinanOrigen.getcodigo().equals(""))) {tipomovifinan.setcodigo(tipomovifinanOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipomovifinanOrigen.getnombre()!=null && !tipomovifinanOrigen.getnombre().equals(""))) {tipomovifinan.setnombre(tipomovifinanOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoMoviFinan(TipoMoviFinan tipomovifinan) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoMoviFinan.jLabelidTipoMoviFinan.setText(tipomovifinan.getId().toString());
			this.jInternalFrameDetalleFormTipoMoviFinan.jTextFieldcodigoTipoMoviFinan.setText(tipomovifinan.getcodigo());
			this.jInternalFrameDetalleFormTipoMoviFinan.jTextAreanombreTipoMoviFinan.setText(tipomovifinan.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoMoviFinan(TipoMoviFinanBean tipomovifinanBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoMoviFinan.jLabelidTipoMoviFinan.setText(tipomovifinanBean.getId().toString());
			this.jInternalFrameDetalleFormTipoMoviFinan.jTextFieldcodigoTipoMoviFinan.setText(tipomovifinanBean.getcodigo());
			this.jInternalFrameDetalleFormTipoMoviFinan.jTextAreanombreTipoMoviFinan.setText(tipomovifinanBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoMoviFinan(TipoMoviFinanParameterReturnGeneral tipomovifinanReturnGeneral,TipoMoviFinanBean tipomovifinanBean,Boolean conDefault) throws Exception { 
		try {
			TipoMoviFinan tipomovifinanLocal=new TipoMoviFinan();
			
			tipomovifinanLocal=tipomovifinanReturnGeneral.getTipoMoviFinan();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipomovifinanLocal.getId()!=null && !tipomovifinanLocal.getId().equals(0L))) {tipomovifinanBean.setId(tipomovifinanLocal.getId());}}
			if(conDefault || (!conDefault && tipomovifinanLocal.getcodigo()!=null && !tipomovifinanLocal.getcodigo().equals(""))) {tipomovifinanBean.setcodigo(tipomovifinanLocal.getcodigo());}
			if(conDefault || (!conDefault && tipomovifinanLocal.getnombre()!=null && !tipomovifinanLocal.getnombre().equals(""))) {tipomovifinanBean.setnombre(tipomovifinanLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoMoviFinanGenerico(Long idTipoMoviFinanSeleccionado,JComboBox jComboBoxTipoMoviFinan,List<TipoMoviFinan> tipomovifinansLocal)throws Exception {
		try {
			TipoMoviFinan  tipomovifinanTemp=null;

			for(TipoMoviFinan tipomovifinanAux:tipomovifinansLocal) {
				if(tipomovifinanAux.getId()!=null && tipomovifinanAux.getId().equals(idTipoMoviFinanSeleccionado)) {
					tipomovifinanTemp=tipomovifinanAux;
					break;
				}
			}

			jComboBoxTipoMoviFinan.setSelectedItem(tipomovifinanTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoMoviFinanGenerico(JComboBox jComboBoxTipoMoviFinan,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoMoviFinan.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoMoviFinan.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoMoviFinan.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoMoviFinan.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoMoviFinan.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoMoviFinan.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoMoviFinan.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoMoviFinan.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoMoviFinan.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoMoviFinan.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("InformacionFinanciera")) {
			jButtonInformacionFinancieraActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomovifinan=(TipoMoviFinan) tipomovifinanLogic.getTipoMoviFinans().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipomovifinan =(TipoMoviFinan) tipomovifinans.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipomovifinan.getIsNew() && !tipomovifinan.getIsChanged() && !tipomovifinan.getIsDeleted()) {
				sDescripcion=tipomovifinan.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipomovifinan.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoMoviFinan tipomovifinanRow=new TipoMoviFinan();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomovifinanRow=(TipoMoviFinan) tipomovifinanLogic.getTipoMoviFinans().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipomovifinanRow=(TipoMoviFinan) tipomovifinans.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonInformacionFinancieraActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoMoviFinan tipomovifinan) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoMoviFinan==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinanLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovifinan = (TipoMoviFinan)this.tipomovifinanLogic.getTipoMoviFinans().toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipomovifinan = (TipoMoviFinan)this.tipomovifinans.toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipomovifinan!=null) {
						this.tipomovifinan = tipomovifinan;
					} else {
						this.tipomovifinan = new TipoMoviFinan();
					}
				}

				if(this.isTienePermisosInformacionFinanciera && this.permiteMantenimiento(this.tipomovifinan)) {
					InformacionFinancieraBeanSwingJInternalFrame informacionfinancieraBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFramePopup=new InformacionFinancieraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						informacionfinancieraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFramePopup;
					} else {
						informacionfinancieraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame;
					}

					List<TipoMoviFinan> tipomovifinans=new ArrayList<TipoMoviFinan>();
					tipomovifinans.add(this.tipomovifinan);
					if(!esRelacionado) {
						//informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraSessionBean.setConGuardarRelaciones(false);
						//informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					informacionfinancieraBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoMoviFinan.cargarInformacionFinancieraBeanSwingJInternalFrame(tipomovifinans,this.tipomovifinan,informacionfinancieraBeanSwingJInternalFrame,/*conInicializar,*/informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraSessionBean.getConGuardarRelaciones(),informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraSessionBean.getEsGuardarRelacionado());
					informacionfinancieraBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						informacionfinancieraBeanSwingJInternalFrame.actualizarEstadoPanelsInformacionFinanciera("no_relacionado");

						informacionfinancieraBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(InformacionFinancieraConstantesFunciones.ITAMANIOFILATABLA + (InformacionFinancieraConstantesFunciones.ITAMANIOFILATABLA/2));

						informacionfinancieraBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoMoviFinan=(TitledBorder)this.jScrollPanelDatosTipoMoviFinan.getBorder();
						TitledBorder titledBorderInformacionFinanciera=(TitledBorder)informacionfinancieraBeanSwingJInternalFrame.jScrollPanelDatosInformacionFinanciera.getBorder();

						titledBorderInformacionFinanciera.setTitle(titledBorderTipoMoviFinan.getTitle() + " -> Informacion Financiera");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,informacionfinancieraBeanSwingJInternalFrame);
						}

						informacionfinancieraBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(informacionfinancieraBeanSwingJInternalFrame);

						informacionfinancieraBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipomovifinanSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Informacion Financiera",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinanLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinanLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinanLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoMoviFinan(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoMoviFinan.setVisible((this.isVisibilidadCeldaNuevoTipoMoviFinan && this.isPermisoNuevoTipoMoviFinan));			
			this.jButtonDuplicarTipoMoviFinan.setVisible((this.isVisibilidadCeldaDuplicarTipoMoviFinan && this.isPermisoDuplicarTipoMoviFinan));			
			this.jButtonCopiarTipoMoviFinan.setVisible((this.isVisibilidadCeldaCopiarTipoMoviFinan && this.isPermisoCopiarTipoMoviFinan));
			this.jButtonVerFormTipoMoviFinan.setVisible((this.isVisibilidadCeldaVerFormTipoMoviFinan && this.isPermisoVerFormTipoMoviFinan));
			
			this.jButtonAbrirOrderByTipoMoviFinan.setVisible((this.isVisibilidadCeldaOrdenTipoMoviFinan && this.isPermisoOrdenTipoMoviFinan));			
			
			this.jButtonNuevoRelacionesTipoMoviFinan.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoMoviFinan && this.isPermisoNuevoTipoMoviFinan));			
			this.jButtonNuevoGuardarCambiosTipoMoviFinan.setVisible((this.isVisibilidadCeldaNuevoTipoMoviFinan && this.isPermisoNuevoTipoMoviFinan && this.isPermisoGuardarCambiosTipoMoviFinan));
			
			if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) {
			this.jInternalFrameDetalleFormTipoMoviFinan.jButtonModificarTipoMoviFinan.setVisible((this.isVisibilidadCeldaModificarTipoMoviFinan && this.isPermisoActualizarTipoMoviFinan));	
			this.jInternalFrameDetalleFormTipoMoviFinan.jButtonActualizarTipoMoviFinan.setVisible((this.isVisibilidadCeldaActualizarTipoMoviFinan && this.isPermisoActualizarTipoMoviFinan));	
			this.jInternalFrameDetalleFormTipoMoviFinan.jButtonEliminarTipoMoviFinan.setVisible((this.isVisibilidadCeldaEliminarTipoMoviFinan && this.isPermisoEliminarTipoMoviFinan));
			this.jInternalFrameDetalleFormTipoMoviFinan.jButtonCancelarTipoMoviFinan.setVisible(this.isVisibilidadCeldaCancelarTipoMoviFinan);							
			this.jInternalFrameDetalleFormTipoMoviFinan.jButtonGuardarCambiosTipoMoviFinan.setVisible((this.isVisibilidadCeldaGuardarTipoMoviFinan && this.isPermisoGuardarCambiosTipoMoviFinan));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoMoviFinan.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoMoviFinan && this.isPermisoGuardarCambiosTipoMoviFinan));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoMoviFinan.setVisible((this.isVisibilidadCeldaNuevoTipoMoviFinan && this.isPermisoNuevoTipoMoviFinan));						
			this.jButtonDuplicarToolBarTipoMoviFinan.setVisible((this.isVisibilidadCeldaDuplicarTipoMoviFinan && this.isPermisoDuplicarTipoMoviFinan));						
			this.jButtonCopiarToolBarTipoMoviFinan.setVisible((this.isVisibilidadCeldaCopiarTipoMoviFinan && this.isPermisoCopiarTipoMoviFinan));			
			this.jButtonVerFormToolBarTipoMoviFinan.setVisible((this.isVisibilidadCeldaVerFormTipoMoviFinan && this.isPermisoVerFormTipoMoviFinan));			
			this.jButtonAbrirOrderByToolBarTipoMoviFinan.setVisible((this.isVisibilidadCeldaOrdenTipoMoviFinan && this.isPermisoOrdenTipoMoviFinan));
			this.jButtonNuevoRelacionesToolBarTipoMoviFinan.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoMoviFinan && this.isPermisoNuevoTipoMoviFinan));			
			this.jButtonNuevoGuardarCambiosToolBarTipoMoviFinan.setVisible((this.isVisibilidadCeldaNuevoTipoMoviFinan && this.isPermisoNuevoTipoMoviFinan && this.isPermisoGuardarCambiosTipoMoviFinan));			
			
			if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) {
			this.jInternalFrameDetalleFormTipoMoviFinan.jButtonModificarToolBarTipoMoviFinan.setVisible((this.isVisibilidadCeldaModificarTipoMoviFinan && this.isPermisoActualizarTipoMoviFinan));	
			this.jInternalFrameDetalleFormTipoMoviFinan.jButtonActualizarToolBarTipoMoviFinan.setVisible((this.isVisibilidadCeldaActualizarTipoMoviFinan  && this.isPermisoActualizarTipoMoviFinan));	
			this.jInternalFrameDetalleFormTipoMoviFinan.jButtonEliminarToolBarTipoMoviFinan.setVisible((this.isVisibilidadCeldaEliminarTipoMoviFinan && this.isPermisoEliminarTipoMoviFinan));
			this.jInternalFrameDetalleFormTipoMoviFinan.jButtonCancelarToolBarTipoMoviFinan.setVisible(this.isVisibilidadCeldaCancelarTipoMoviFinan);				
			this.jInternalFrameDetalleFormTipoMoviFinan.jButtonGuardarCambiosToolBarTipoMoviFinan.setVisible((this.isVisibilidadCeldaGuardarTipoMoviFinan && this.isPermisoGuardarCambiosTipoMoviFinan));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoMoviFinan.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoMoviFinan && this.isPermisoGuardarCambiosTipoMoviFinan));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoMoviFinan.setVisible((this.isVisibilidadCeldaNuevoTipoMoviFinan && this.isPermisoNuevoTipoMoviFinan));			
			this.jMenuItemDuplicarTipoMoviFinan.setVisible((this.isVisibilidadCeldaDuplicarTipoMoviFinan && this.isPermisoDuplicarTipoMoviFinan));			
			this.jMenuItemCopiarTipoMoviFinan.setVisible((this.isVisibilidadCeldaCopiarTipoMoviFinan && this.isPermisoCopiarTipoMoviFinan));			
			this.jMenuItemVerFormTipoMoviFinan.setVisible((this.isVisibilidadCeldaVerFormTipoMoviFinan && this.isPermisoVerFormTipoMoviFinan));			
			this.jMenuItemAbrirOrderByTipoMoviFinan.setVisible((this.isVisibilidadCeldaOrdenTipoMoviFinan && this.isPermisoOrdenTipoMoviFinan));			
			//this.jMenuItemMostrarOcultarTipoMoviFinan.setVisible((this.isVisibilidadCeldaOrdenTipoMoviFinan && this.isPermisoOrdenTipoMoviFinan));
			this.jMenuItemDetalleAbrirOrderByTipoMoviFinan.setVisible((this.isVisibilidadCeldaOrdenTipoMoviFinan && this.isPermisoOrdenTipoMoviFinan));			
			//this.jMenuItemDetalleMostrarOcultarTipoMoviFinan.setVisible((this.isVisibilidadCeldaOrdenTipoMoviFinan && this.isPermisoOrdenTipoMoviFinan));			
			this.jMenuItemNuevoRelacionesTipoMoviFinan.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoMoviFinan && this.isPermisoNuevoTipoMoviFinan));			
			this.jMenuItemNuevoGuardarCambiosTipoMoviFinan.setVisible((this.isVisibilidadCeldaNuevoTipoMoviFinan && this.isPermisoNuevoTipoMoviFinan && this.isPermisoGuardarCambiosTipoMoviFinan));									
			
			if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) {
			this.jInternalFrameDetalleFormTipoMoviFinan.jMenuItemModificarTipoMoviFinan.setVisible((this.isVisibilidadCeldaModificarTipoMoviFinan && this.isPermisoActualizarTipoMoviFinan));	
			this.jInternalFrameDetalleFormTipoMoviFinan.jMenuItemActualizarTipoMoviFinan.setVisible((this.isVisibilidadCeldaActualizarTipoMoviFinan && this.isPermisoActualizarTipoMoviFinan));	
			this.jInternalFrameDetalleFormTipoMoviFinan.jMenuItemEliminarTipoMoviFinan.setVisible((this.isVisibilidadCeldaEliminarTipoMoviFinan && this.isPermisoEliminarTipoMoviFinan));
			this.jInternalFrameDetalleFormTipoMoviFinan.jMenuItemCancelarTipoMoviFinan.setVisible(this.isVisibilidadCeldaCancelarTipoMoviFinan);				
			}
			
			this.jMenuItemGuardarCambiosTipoMoviFinan.setVisible((this.isVisibilidadCeldaGuardarTipoMoviFinan && this.isPermisoGuardarCambiosTipoMoviFinan));						
			this.jMenuItemGuardarCambiosTablaTipoMoviFinan.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoMoviFinan && this.isPermisoGuardarCambiosTipoMoviFinan));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoMoviFinan=this.jButtonNuevoTipoMoviFinan.isVisible();
			this.isVisibilidadCeldaDuplicarTipoMoviFinan=this.jButtonDuplicarTipoMoviFinan.isVisible();
			this.isVisibilidadCeldaCopiarTipoMoviFinan=this.jButtonCopiarTipoMoviFinan.isVisible();
			this.isVisibilidadCeldaVerFormTipoMoviFinan=this.jButtonVerFormTipoMoviFinan.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoMoviFinan=this.jButtonAbrirOrderByTipoMoviFinan.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoMoviFinan=this.jButtonNuevoRelacionesTipoMoviFinan.isVisible();
			this.isVisibilidadCeldaModificarTipoMoviFinan=this.jButtonModificarTipoMoviFinan.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) {
			this.isVisibilidadCeldaActualizarTipoMoviFinan=this.jInternalFrameDetalleFormTipoMoviFinan.jButtonActualizarTipoMoviFinan.isVisible();
			this.isVisibilidadCeldaEliminarTipoMoviFinan=this.jInternalFrameDetalleFormTipoMoviFinan.jButtonEliminarTipoMoviFinan.isVisible();
			this.isVisibilidadCeldaCancelarTipoMoviFinan=this.jInternalFrameDetalleFormTipoMoviFinan.jButtonCancelarTipoMoviFinan.isVisible();
			this.isVisibilidadCeldaGuardarTipoMoviFinan=this.jInternalFrameDetalleFormTipoMoviFinan.jButtonGuardarCambiosTipoMoviFinan.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoMoviFinan=this.jButtonGuardarCambiosTablaTipoMoviFinan.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoMoviFinan=this.jButtonNuevoToolBarTipoMoviFinan.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoMoviFinan=this.jButtonNuevoRelacionesToolBarTipoMoviFinan.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) {
			this.isVisibilidadCeldaModificarTipoMoviFinan=this.jInternalFrameDetalleFormTipoMoviFinan.jButtonModificarToolBarTipoMoviFinan.isVisible();
			this.isVisibilidadCeldaActualizarTipoMoviFinan=this.jInternalFrameDetalleFormTipoMoviFinan.jButtonActualizarToolBarTipoMoviFinan.isVisible();
			this.isVisibilidadCeldaEliminarTipoMoviFinan=this.jInternalFrameDetalleFormTipoMoviFinan.jButtonEliminarToolBarTipoMoviFinan.isVisible();
			this.isVisibilidadCeldaCancelarTipoMoviFinan=this.jInternalFrameDetalleFormTipoMoviFinan.jButtonCancelarToolBarTipoMoviFinan.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoMoviFinan=this.jButtonGuardarCambiosToolBarTipoMoviFinan.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoMoviFinan=this.jButtonGuardarCambiosTablaToolBarTipoMoviFinan.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoMoviFinan=this.jMenuItemNuevoTipoMoviFinan.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoMoviFinan=this.jMenuItemNuevoRelacionesTipoMoviFinan.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) {
			this.isVisibilidadCeldaModificarTipoMoviFinan=this.jInternalFrameDetalleFormTipoMoviFinan.jMenuItemModificarTipoMoviFinan.isVisible();
			this.isVisibilidadCeldaActualizarTipoMoviFinan=this.jInternalFrameDetalleFormTipoMoviFinan.jMenuItemActualizarTipoMoviFinan.isVisible();
			this.isVisibilidadCeldaEliminarTipoMoviFinan=this.jInternalFrameDetalleFormTipoMoviFinan.jMenuItemEliminarTipoMoviFinan.isVisible();
			this.isVisibilidadCeldaCancelarTipoMoviFinan=this.jInternalFrameDetalleFormTipoMoviFinan.jMenuItemCancelarTipoMoviFinan.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoMoviFinan=this.jMenuItemGuardarCambiosTipoMoviFinan.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoMoviFinan=this.jMenuItemGuardarCambiosTablaTipoMoviFinan.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoMoviFinan(Boolean esInicializar) {
		if(TipoMoviFinanJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipomovifinanSessionBean.getConGuardarRelaciones()) {
				//if(this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoMoviFinan();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoMoviFinan(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoMoviFinan() {
		this.jButtonNuevoTipoMoviFinan.setVisible(this.isPermisoNuevoTipoMoviFinan);			
		this.jButtonDuplicarTipoMoviFinan.setVisible(this.isPermisoDuplicarTipoMoviFinan);			
		this.jButtonCopiarTipoMoviFinan.setVisible(this.isPermisoCopiarTipoMoviFinan);			
		this.jButtonVerFormTipoMoviFinan.setVisible(this.isPermisoVerFormTipoMoviFinan);			
		
		this.jButtonAbrirOrderByTipoMoviFinan.setVisible(this.isPermisoOrdenTipoMoviFinan);					
		
		this.jButtonNuevoRelacionesTipoMoviFinan.setVisible(this.isPermisoNuevoTipoMoviFinan);			
		
		if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoviFinan.jButtonModificarTipoMoviFinan.setVisible(this.isPermisoActualizarTipoMoviFinan);	
			this.jInternalFrameDetalleFormTipoMoviFinan.jButtonActualizarTipoMoviFinan.setVisible(this.isPermisoActualizarTipoMoviFinan);	
			this.jInternalFrameDetalleFormTipoMoviFinan.jButtonEliminarTipoMoviFinan.setVisible(this.isPermisoEliminarTipoMoviFinan);
			this.jInternalFrameDetalleFormTipoMoviFinan.jButtonCancelarTipoMoviFinan.setVisible(this.isVisibilidadCeldaCancelarTipoMoviFinan);						
			this.jInternalFrameDetalleFormTipoMoviFinan.jButtonGuardarCambiosTipoMoviFinan.setVisible(this.isPermisoGuardarCambiosTipoMoviFinan);							
		}
		
		this.jButtonGuardarCambiosTablaTipoMoviFinan.setVisible(this.isPermisoActualizarTipoMoviFinan);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoMoviFinan() {
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonModificarTipoMoviFinan.setVisible(this.isPermisoActualizarTipoMoviFinan);	
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonActualizarTipoMoviFinan.setVisible(this.isPermisoActualizarTipoMoviFinan);	
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonEliminarTipoMoviFinan.setVisible(this.isPermisoEliminarTipoMoviFinan);
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonCancelarTipoMoviFinan.setVisible(this.isVisibilidadCeldaCancelarTipoMoviFinan);							
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonGuardarCambiosTipoMoviFinan.setVisible((this.isVisibilidadCeldaGuardarTipoMoviFinan && this.isPermisoGuardarCambiosTipoMoviFinan));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoMoviFinan() {
		if(TipoMoviFinanJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoMoviFinan();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoMoviFinan() {
	}
	
	public void jTableDatosTipoMoviFinanListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoMoviFinan(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoMoviFinanBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinanLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMoviFinan.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMoviFinan(this.gettipomovifinan(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMoviFinan(this.tipomovifinan);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovifinan =(TipoMoviFinan) this.tipomovifinanLogic.getTipoMoviFinans().toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomovifinan =(TipoMoviFinan) this.tipomovifinans.toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomovifinan==null) {
						this.tipomovifinan = new TipoMoviFinan();
					}

					this.setVariablesFormularioToObjetoActualTipoMoviFinan(this.tipomovifinan,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMoviFinan(this.tipomovifinan);
				}

				if(this.tipomovifinan.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipomovifinan.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMoviFinan(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinanLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinanLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinanLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoMoviFinanUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoMoviFinan(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMoviFinan.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoMoviFinan.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoMoviFinan.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinan =(TipoMoviFinan) this.tipomovifinanLogic.getTipoMoviFinans().toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomovifinan =(TipoMoviFinan) this.tipomovifinans.toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoMoviFinan(this.gettipomovifinan(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMoviFinan(this.tipomovifinan);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipomovifinanLogic.getConnexion());

				if(this.tipomovifinan.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipomovifinan.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoMoviFinan=(TitledBorder)this.jScrollPanelDatosTipoMoviFinan.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoMoviFinan.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoMoviFinanBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinanLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMoviFinan.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMoviFinan(this.gettipomovifinan(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMoviFinan(this.tipomovifinan);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovifinan =(TipoMoviFinan) this.tipomovifinanLogic.getTipoMoviFinans().toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomovifinan =(TipoMoviFinan) this.tipomovifinans.toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomovifinan==null) {
						this.tipomovifinan = new TipoMoviFinan();
					}

					this.setVariablesFormularioToObjetoActualTipoMoviFinan(this.tipomovifinan,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMoviFinan(this.tipomovifinan);
				}

				if(this.tipomovifinan.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipomovifinan.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMoviFinan(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinanLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinanLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinanLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoMoviFinanBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinanLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMoviFinan.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMoviFinan(this.gettipomovifinan(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMoviFinan(this.tipomovifinan);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovifinan =(TipoMoviFinan) this.tipomovifinanLogic.getTipoMoviFinans().toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomovifinan =(TipoMoviFinan) this.tipomovifinans.toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomovifinan==null) {
						this.tipomovifinan = new TipoMoviFinan();
					}

					this.setVariablesFormularioToObjetoActualTipoMoviFinan(this.tipomovifinan,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMoviFinan(this.tipomovifinan);
				}

				if(this.tipomovifinan.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipomovifinan.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMoviFinan(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinanLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinanLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinanLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoMoviFinanBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinanLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMoviFinan.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMoviFinan(this.gettipomovifinan(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMoviFinan(this.tipomovifinan);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovifinan =(TipoMoviFinan) this.tipomovifinanLogic.getTipoMoviFinans().toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomovifinan =(TipoMoviFinan) this.tipomovifinans.toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomovifinan==null) {
						this.tipomovifinan = new TipoMoviFinan();
					}

					this.setVariablesFormularioToObjetoActualTipoMoviFinan(this.tipomovifinan,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMoviFinan(this.tipomovifinan);
				}

				if(this.tipomovifinan.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipomovifinan.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMoviFinan(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinanLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinanLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinanLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoMoviFinanActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoMoviFinan(false,false);

			this.getTipoMoviFinansFK_IdEmpresa();

			this.inicializarActualizarBindingTipoMoviFinan(false);

			//if(TipoMoviFinanBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoMoviFinan(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovifinanLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoMoviFinan() {
		if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) {
		

		if(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) {
			this.jInternalFrameDetalleFormTipoMoviFinan.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoMoviFinan.dispose();
			this.jInternalFrameDetalleFormTipoMoviFinan=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoMoviFinan!=null) {
			this.jInternalFrameReporteDinamicoTipoMoviFinan.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoMoviFinan.dispose();
			this.jInternalFrameReporteDinamicoTipoMoviFinan=null;
		}
		
		if(this.jInternalFrameImportacionTipoMoviFinan!=null) {
			this.jInternalFrameImportacionTipoMoviFinan.setVisible(false);	    			
			this.jInternalFrameImportacionTipoMoviFinan.dispose();
			this.jInternalFrameImportacionTipoMoviFinan=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoMoviFinan();
			
			TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoMoviFinan")) {
				jButtonNuevoTipoMoviFinanActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoMoviFinan")) {
				jButtonDuplicarTipoMoviFinanActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoMoviFinan")) {
				jButtonCopiarTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoMoviFinan")) {
				jButtonVerFormTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoMoviFinan")) {
				jButtonNuevoTipoMoviFinanActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoMoviFinan")) {
				jButtonDuplicarTipoMoviFinanActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoMoviFinan")) {
				jButtonNuevoTipoMoviFinanActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoMoviFinan")) {
				jButtonDuplicarTipoMoviFinanActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoMoviFinan")) {
				jButtonNuevoTipoMoviFinanActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoMoviFinan")) {
				jButtonNuevoTipoMoviFinanActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoMoviFinan")) {
				jButtonNuevoTipoMoviFinanActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoMoviFinan")) {
				jButtonModificarTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoMoviFinan")) {
				jButtonModificarTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoMoviFinan")) {
				jButtonModificarTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoMoviFinan")) {
				jButtonActualizarTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoMoviFinan")) {
				jButtonActualizarTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoMoviFinan")) {
				jButtonActualizarTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoMoviFinan")) {
				jButtonEliminarTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoMoviFinan")) {
				jButtonEliminarTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoMoviFinan")) {
				jButtonEliminarTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoMoviFinan")) {
				jButtonCancelarTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoMoviFinan")) {
				jButtonCancelarTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoMoviFinan")) {
				jButtonCancelarTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoMoviFinan")) {
				jButtonCerrarTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoMoviFinan")) {
				jButtonCerrarTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoMoviFinan")) {
				jButtonCerrarTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoMoviFinan")) {
				jButtonMostrarOcultarTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoMoviFinan")) {
				jButtonCancelarTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoMoviFinan")) {
				jButtonGuardarCambiosTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoMoviFinan")) {
				jButtonGuardarCambiosTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoMoviFinan")) {
				jButtonCopiarTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoMoviFinan")) {
				jButtonVerFormTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoMoviFinan")) {
				jButtonGuardarCambiosTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoMoviFinan")) {
				jButtonCopiarTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoMoviFinan")) {
				jButtonVerFormTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoMoviFinan")) {
				jButtonGuardarCambiosTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoMoviFinan")) {
				jButtonGuardarCambiosTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoMoviFinan")) {
				jButtonGuardarCambiosTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoMoviFinan")) {
				jButtonRecargarInformacionTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoMoviFinan")) {
				jButtonRecargarInformacionTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoMoviFinan")) {
				jButtonRecargarInformacionTipoMoviFinanActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoMoviFinan")) {
				jButtonAnterioresTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoMoviFinan")) {
				jButtonAnterioresTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoMoviFinan")) {
				jButtonAnterioresTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoMoviFinan")) {
				jButtonSiguientesTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoMoviFinan")) {
				jButtonSiguientesTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoMoviFinan")) {
				jButtonSiguientesTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoMoviFinan") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoMoviFinan")) {
				jButtonAbrirOrderByTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoMoviFinan") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoMoviFinan")) {
				jButtonMostrarOcultarTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoMoviFinan")) {
				jButtonNuevoGuardarCambiosTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoMoviFinan")) {
				jButtonNuevoGuardarCambiosTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoMoviFinan")) {
				jButtonNuevoGuardarCambiosTipoMoviFinanActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoMoviFinan")) {
				jButtonCerrarReporteDinamicoTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoMoviFinan")) {
				jButtonGenerarReporteDinamicoTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoMoviFinan")) {
				
				jButtonGenerarExcelReporteDinamicoTipoMoviFinanActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoMoviFinan")) {
				jButtonCerrarImportacionTipoMoviFinanActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoMoviFinan")) {
				
				jButtonGenerarImportacionTipoMoviFinanActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoMoviFinan")) {
				
				jButtonAbrirImportacionTipoMoviFinanActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoMoviFinan")) {
				jComboBoxTiposAccionesTipoMoviFinanActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoMoviFinan")) {
				jComboBoxTiposRelacionesTipoMoviFinanActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoMoviFinan")) {
				jComboBoxTiposAccionesTipoMoviFinanActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoMoviFinan")) {
				
				jComboBoxTiposSeleccionarTipoMoviFinanActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoMoviFinan")) {
				jTextFieldValorCampoGeneralTipoMoviFinanActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoMoviFinan")) {
				jButtonAbrirOrderByTipoMoviFinanActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoMoviFinan")) {
				jButtonAbrirOrderByTipoMoviFinanActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoMoviFinan")) {
				jButtonCerrarOrderByTipoMoviFinanActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoMoviFinanBusqueda")) {
				this.jButtonidTipoMoviFinanBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoMoviFinanUpdate")) {
				this.jButtonid_empresaTipoMoviFinanUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoMoviFinanBusqueda")) {
				this.jButtonid_empresaTipoMoviFinanBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoMoviFinanBusqueda")) {
				this.jButtoncodigoTipoMoviFinanBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoMoviFinanBusqueda")) {
				this.jButtonnombreTipoMoviFinanBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoMoviFinan();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMoviFinanActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovifinan);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovifinan);
				
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
				
				


				
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMoviFinan.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMoviFinan.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoMoviFinan tipomovifinanLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipomovifinanLocal=this.tipomovifinan;
			} else {
				tipomovifinanLocal=this.tipomovifinanAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovifinan);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovifinan);
				
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
							
				
				


				
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMoviFinan.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMoviFinan.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMoviFinanActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMoviFinan.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinanAnterior =(TipoMoviFinan) this.tipomovifinanLogic.getTipoMoviFinans().toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovifinanAnterior =(TipoMoviFinan) this.tipomovifinans.toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
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
			
			TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
			
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
			
			


			
			TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMoviFinanActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovifinan);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovifinan);
				
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
								
						
				


				
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMoviFinan.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMoviFinan.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovifinan);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovifinan);
				
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
								
				
				


				
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMoviFinan.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMoviFinan.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMoviFinanActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMoviFinan.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinanAnterior =(TipoMoviFinan) this.tipomovifinanLogic.getTipoMoviFinans().toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovifinanAnterior =(TipoMoviFinan) this.tipomovifinans.toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovifinan);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovifinan);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMoviFinanActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMoviFinan.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinanAnterior =(TipoMoviFinan) this.tipomovifinanLogic.getTipoMoviFinans().toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovifinanAnterior =(TipoMoviFinan) this.tipomovifinans.toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMoviFinanActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovifinan);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomovifinan);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovifinan);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovifinan);
				
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
							
				
				


				
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMoviFinan.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMoviFinan.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMoviFinanActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoMoviFinan.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovifinanAnterior =(TipoMoviFinan) this.tipomovifinanLogic.getTipoMoviFinans().toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipomovifinanAnterior =(TipoMoviFinan) this.tipomovifinans.toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
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
			
			TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
			
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
			
			


			
			TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMoviFinanActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovifinan);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomovifinan);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovifinan);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovifinan);
				
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
								
				
				


				
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMoviFinan.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMoviFinan.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMoviFinanActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMoviFinan.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinanAnterior =(TipoMoviFinan) this.tipomovifinanLogic.getTipoMoviFinans().toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovifinanAnterior =(TipoMoviFinan) this.tipomovifinans.toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMoviFinanActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovifinan);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomovifinan);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMoviFinanActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovifinan);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovifinan);
				
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoMoviFinan")) {
					jCheckBoxSeleccionarTodosTipoMoviFinanItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoMoviFinan")) {
					jCheckBoxSeleccionadosTipoMoviFinanItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoMoviFinan")) {
					
				}
				
				


				
				
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMoviFinan.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMoviFinan.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovifinan);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipomovifinan);
				
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
												
				
				


				
				
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMoviFinan.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMoviFinan.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMoviFinanActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoMoviFinan.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovifinanAnterior =(TipoMoviFinan) this.tipomovifinanLogic.getTipoMoviFinans().toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipomovifinanAnterior =(TipoMoviFinan) this.tipomovifinans.toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMoviFinanActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovifinan);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovifinan);
				
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
				
				
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
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
			
			TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
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
			
			


			
			TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMoviFinanActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovifinan);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovifinan);
				
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMoviFinan.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMoviFinan.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovifinan);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovifinan);
				
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
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
				
				


				
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMoviFinan.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMoviFinan.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMoviFinanActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMoviFinan.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovifinanAnterior =(TipoMoviFinan) this.tipomovifinanLogic.getTipoMoviFinans().toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovifinanAnterior =(TipoMoviFinan) this.tipomovifinans.toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoMoviFinan")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoMoviFinanListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoMoviFinan.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipomovifinan =(TipoMoviFinan) this.tipomovifinanLogic.getTipoMoviFinans().toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipomovifinan =(TipoMoviFinan) this.tipomovifinans.toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipomovifinan);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoMoviFinan")) {
				
				}
				
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoMoviFinan")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoMoviFinan.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoMoviFinan")) {
			
			}
			
			TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoMoviFinan();
			
			TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
			
			if(sTipo.equals("NuevoTipoMoviFinan")) {
				jButtonNuevoTipoMoviFinanActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoMoviFinan")) {
				jButtonDuplicarTipoMoviFinanActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoMoviFinan")) {
				jButtonCopiarTipoMoviFinanActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoMoviFinan")) {
				jButtonVerFormTipoMoviFinanActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoMoviFinan")) {
				jButtonNuevoTipoMoviFinanActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoMoviFinan")) {
				jButtonModificarTipoMoviFinanActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoMoviFinan")) {
				jButtonActualizarTipoMoviFinanActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoMoviFinan")) {
				jButtonEliminarTipoMoviFinanActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoMoviFinan")) {
				jButtonGuardarCambiosTipoMoviFinanActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoMoviFinan")) {
				jButtonCancelarTipoMoviFinanActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoMoviFinan")) {
				jButtonCerrarTipoMoviFinanActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoMoviFinan")) {
				jButtonGuardarCambiosTipoMoviFinanActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoMoviFinan")) {
				jButtonNuevoGuardarCambiosTipoMoviFinanActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoMoviFinan")) {
				jButtonAbrirOrderByTipoMoviFinanActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoMoviFinan")) {
				jButtonRecargarInformacionTipoMoviFinanActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoMoviFinan")) {
				jButtonAnterioresTipoMoviFinanActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoMoviFinan")) {
				jButtonSiguientesTipoMoviFinanActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoMoviFinanBusqueda")) {
				this.jButtonidTipoMoviFinanBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoMoviFinanUpdate")) {
				this.jButtonid_empresaTipoMoviFinanUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoMoviFinanBusqueda")) {
				this.jButtonid_empresaTipoMoviFinanBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoMoviFinanBusqueda")) {
				this.jButtoncodigoTipoMoviFinanBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoMoviFinanBusqueda")) {
				this.jButtonnombreTipoMoviFinanBusquedaActionPerformed(evt);
			}
			
			TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoMoviFinan();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoMoviFinan")) {
				closingInternalFrameTipoMoviFinan();
				
			} else if(sTipo.equals("jButtonCancelarTipoMoviFinan")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoMoviFinan = (JInternalFrameBase)evt.getSource();
	            	
	            TipoMoviFinanBeanSwingJInternalFrame jInternalFrameParent=(TipoMoviFinanBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoMoviFinan.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoMoviFinanActionPerformed(null);
			}
			
			TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipomovifinan,new Object(),this.tipomovifinanParameterGeneral,this.tipomovifinanReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoMoviFinan(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoMoviFinan(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoMoviFinan(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipomovifinan)) {
			if(!esControlTabla) {
				if(TipoMoviFinanJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoMoviFinan(this.tipomovifinan,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMoviFinan(this.tipomovifinan);			
				}
				
				if(this.tipomovifinanSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoMoviFinan(this.tipomovifinan,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipomovifinanReturnGeneral=tipomovifinanLogic.procesarEventosTipoMoviFinansWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomovifinanLogic.getTipoMoviFinans(),this.tipomovifinan,this.tipomovifinanParameterGeneral,this.isEsNuevoTipoMoviFinan,classes);//this.tipomovifinanLogic.getTipoMoviFinan()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoMoviFinan(this.tipomovifinanReturnGeneral,this.tipomovifinanBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipomovifinanSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoMoviFinan(classes,this.tipomovifinanReturnGeneral,this.tipomovifinanBean,false);
					}
						
					if(this.tipomovifinanReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoMoviFinan(this.tipomovifinanReturnGeneral.getTipoMoviFinan());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoMoviFinan(this.tipomovifinanReturnGeneral.getTipoMoviFinan());	
					}
						
					if(this.tipomovifinanReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoMoviFinan(this.tipomovifinanReturnGeneral.getTipoMoviFinan(),classes);//this.tipomovifinanBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoMoviFinan(this.tipomovifinan,classes);//this.tipomovifinanBean);									
				}
			
				if(TipoMoviFinanJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoMoviFinan(this.tipomovifinan,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMoviFinan(this.tipomovifinan);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipomovifinanAnterior!=null) {
						this.tipomovifinan=this.tipomovifinanAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipomovifinanReturnGeneral=tipomovifinanLogic.procesarEventosTipoMoviFinansWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomovifinanLogic.getTipoMoviFinans(),this.tipomovifinan,this.tipomovifinanParameterGeneral,this.isEsNuevoTipoMoviFinan,classes);//this.tipomovifinanLogic.getTipoMoviFinan()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipomovifinanSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipomovifinanSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipomovifinanReturnGeneral.getTipoMoviFinan(),tipomovifinanLogic.getTipoMoviFinans());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipomovifinanReturnGeneral.getTipoMoviFinan(),this.tipomovifinans);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoMoviFinan.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoMoviFinan.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoMoviFinan();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoMoviFinan() throws Exception {
		
		TipoMoviFinanModel tipomovifinanModel=(TipoMoviFinanModel)this.jTableDatosTipoMoviFinan.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomovifinanModel.tipomovifinans=this.tipomovifinanLogic.getTipoMoviFinans();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipomovifinanModel.tipomovifinans=this.tipomovifinans;
		}
		
		
		((TipoMoviFinanModel) this.jTableDatosTipoMoviFinan.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoMoviFinan() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipomovifinanAnterior(),this.tipomovifinanLogic.getTipoMoviFinans());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipomovifinanAnterior(),this.tipomovifinans);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoMoviFinan();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoMoviFinan(TipoMoviFinan tipomovifinan,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(InformacionFinanciera.class)) {
					this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraLogic.setInformacionFinancieras(tipomovifinan.getInformacionFinancieras());
					this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.inicializarActualizarBindingTablaInformacionFinanciera(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
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
										
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomovifinan,new Object(),generalEntityParameterGeneral,this.tipomovifinanReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipomovifinanSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoMoviFinanConstantesFunciones.getClassesRelationshipsOfTipoMoviFinan(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoMoviFinanConstantesFunciones.getClassesRelationshipsFromStringsOfTipoMoviFinan(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoMoviFinan(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoMoviFinanBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomovifinan,new Object(),generalEntityParameterGeneral,this.tipomovifinanReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoMoviFinan(TipoMoviFinanBean tipomovifinanBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(InformacionFinanciera.class)) {
					this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraLogic.setInformacionFinancieras(tipomovifinan.getInformacionFinancieras());
					this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.inicializarActualizarBindingTablaInformacionFinanciera(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoMoviFinan(ArrayList<Classe> classes,TipoMoviFinanReturnGeneral tipomovifinanReturnGeneral,TipoMoviFinanBean tipomovifinanBean,Boolean conDefault) throws Exception {
		
			this.tipomovifinanBean.setInformacionFinancieras(tipomovifinanReturnGeneral.getTipoMoviFinan().getInformacionFinancieras());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoMoviFinan(TipoMoviFinan tipomovifinan,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(InformacionFinanciera.class)) {
					tipomovifinan.setInformacionFinancieras(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraLogic.getInformacionFinancieras());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipomovifinan)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoMoviFinan = new TipoMoviFinanDetalleFormJInternalFrame(jDesktopPane,this.tipomovifinanSessionBean.getConGuardarRelaciones(),this.tipomovifinanSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoMoviFinan);
		this.jInternalFrameDetalleFormTipoMoviFinan.setVisible(false);
		this.jInternalFrameDetalleFormTipoMoviFinan.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoMoviFinan.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoMoviFinan.tipomovifinanLogic=this.tipomovifinanLogic;
		
		this.cargarCombosFrameForeignKeyTipoMoviFinan("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoMoviFinan();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoMoviFinan();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoMoviFinan("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoMoviFinan();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoMoviFinan.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoMoviFinan"));
		
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonModificarTipoMoviFinan.addActionListener(new ButtonActionListener(this,"ModificarTipoMoviFinan"));

		
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonModificarToolBarTipoMoviFinan.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoMoviFinan"));
					
		this.jInternalFrameDetalleFormTipoMoviFinan.jMenuItemModificarTipoMoviFinan.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoMoviFinan"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonActualizarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"ActualizarTipoMoviFinan"));
		
		
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonActualizarToolBarTipoMoviFinan.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoMoviFinan"));
						
		this.jInternalFrameDetalleFormTipoMoviFinan.jMenuItemActualizarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoMoviFinan"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonEliminarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"EliminarTipoMoviFinan"));
		
		
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonEliminarToolBarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoMoviFinan"));
								
		this.jInternalFrameDetalleFormTipoMoviFinan.jMenuItemEliminarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoMoviFinan"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonCancelarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"CancelarTipoMoviFinan"));
		
		
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonCancelarToolBarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoMoviFinan"));
					
		this.jInternalFrameDetalleFormTipoMoviFinan.jMenuItemCancelarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoMoviFinan"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoMoviFinan.jMenuItemDetalleCerrarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoMoviFinan"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonGuardarCambiosToolBarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoMoviFinan"));
		
		
		
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonGuardarCambiosToolBarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoMoviFinan"));
		
		
		
		this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxTiposAccionesFormularioTipoMoviFinan.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoMoviFinan"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonidTipoMoviFinanBusqueda.addActionListener(new ButtonActionListener(this,"idTipoMoviFinanBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonid_empresaTipoMoviFinanUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoMoviFinanUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonid_empresaTipoMoviFinanBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoMoviFinanBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtoncodigoTipoMoviFinanBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoMoviFinanBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonnombreTipoMoviFinanBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoMoviFinanBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoMoviFinan.jTabbedPaneRelacionesTipoMoviFinan.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoMoviFinan"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoMoviFinan"));
		
		if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoviFinan.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoMoviFinan"));
		}
		
		this.jTableDatosTipoMoviFinan.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoMoviFinan"));
		
		this.jTableDatosTipoMoviFinan.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoMoviFinan"));
		
		this.jButtonNuevoTipoMoviFinan.addActionListener(new ButtonActionListener(this,"NuevoTipoMoviFinan"));
		
		this.jButtonDuplicarTipoMoviFinan.addActionListener(new ButtonActionListener(this,"DuplicarTipoMoviFinan"));
		
		this.jButtonCopiarTipoMoviFinan.addActionListener(new ButtonActionListener(this,"CopiarTipoMoviFinan"));
		
		this.jButtonVerFormTipoMoviFinan.addActionListener(new ButtonActionListener(this,"VerFormTipoMoviFinan"));
		
		
		this.jButtonNuevoToolBarTipoMoviFinan.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoMoviFinan"));
			
		this.jButtonDuplicarToolBarTipoMoviFinan.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoMoviFinan"));
			
		this.jMenuItemNuevoTipoMoviFinan.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoMoviFinan"));
			
		this.jMenuItemDuplicarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoMoviFinan"));		
		
		
		this.jButtonNuevoRelacionesTipoMoviFinan.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoMoviFinan"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoMoviFinan.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoMoviFinan"));
			
		this.jMenuItemNuevoRelacionesTipoMoviFinan.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoMoviFinan"));		
		
		
		if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoviFinan.jButtonModificarTipoMoviFinan.addActionListener(new ButtonActionListener(this,"ModificarTipoMoviFinan"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoviFinan.jButtonModificarToolBarTipoMoviFinan.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoMoviFinan"));
			
			this.jInternalFrameDetalleFormTipoMoviFinan.jMenuItemModificarTipoMoviFinan.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoMoviFinan"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoMoviFinan.jButtonActualizarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"ActualizarTipoMoviFinan"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoviFinan.jButtonActualizarToolBarTipoMoviFinan.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoMoviFinan"));
				
			this.jInternalFrameDetalleFormTipoMoviFinan.jMenuItemActualizarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoMoviFinan"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoviFinan.jButtonEliminarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"EliminarTipoMoviFinan"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoviFinan.jButtonEliminarToolBarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoMoviFinan"));
						
			this.jInternalFrameDetalleFormTipoMoviFinan.jMenuItemEliminarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoMoviFinan"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoviFinan.jButtonCancelarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"CancelarTipoMoviFinan"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoviFinan.jButtonCancelarToolBarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoMoviFinan"));
			
			this.jInternalFrameDetalleFormTipoMoviFinan.jMenuItemCancelarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoMoviFinan"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoMoviFinan"));		
		
		
		this.jButtonCerrarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"CerrarTipoMoviFinan"));
		
		
		this.jButtonCerrarToolBarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoMoviFinan"));
			
		this.jMenuItemCerrarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoMoviFinan"));
			
		if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoviFinan.jMenuItemDetalleCerrarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoMoviFinan"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoviFinan.jButtonGuardarCambiosTipoMoviFinan.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoMoviFinan"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoviFinan.jButtonGuardarCambiosToolBarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoMoviFinan"));
		}
		
		this.jButtonCopiarToolBarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoMoviFinan"));
			
		this.jButtonVerFormToolBarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoMoviFinan"));
		
		this.jMenuItemGuardarCambiosTipoMoviFinan.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoMoviFinan"));
			
		this.jMenuItemCopiarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoMoviFinan"));		
		
		this.jMenuItemVerFormTipoMoviFinan.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoMoviFinan"));		
		
		
		this.jButtonGuardarCambiosTablaTipoMoviFinan.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoMoviFinan"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoMoviFinan"));
			
		this.jMenuItemGuardarCambiosTablaTipoMoviFinan.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoMoviFinan"));		
		
		
		
		this.jButtonRecargarInformacionTipoMoviFinan.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoMoviFinan"));
					
		this.jButtonRecargarInformacionToolBarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoMoviFinan"));
		
		this.jMenuItemRecargarInformacionTipoMoviFinan.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoMoviFinan"));		
		
		
		
		this.jButtonAnterioresTipoMoviFinan.addActionListener (new ButtonActionListener(this,"AnterioresTipoMoviFinan"));
		
		
		this.jButtonAnterioresToolBarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoMoviFinan"));
		
		this.jMenuItemAnterioresTipoMoviFinan.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoMoviFinan"));		
		
		
		this.jButtonSiguientesTipoMoviFinan.addActionListener (new ButtonActionListener(this,"SiguientesTipoMoviFinan"));
		
		
		this.jButtonSiguientesToolBarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoMoviFinan"));
			
		this.jMenuItemSiguientesTipoMoviFinan.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoMoviFinan"));
			
		this.jMenuItemAbrirOrderByTipoMoviFinan.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoMoviFinan"));
			
		this.jMenuItemMostrarOcultarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoMoviFinan"));
			
		this.jMenuItemDetalleAbrirOrderByTipoMoviFinan.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoMoviFinan"));
			
		this.jMenuItemDetalleMostarOcultarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoMoviFinan"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoMoviFinan.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoMoviFinan"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoMoviFinan"));
			
		this.jMenuItemNuevoGuardarCambiosTipoMoviFinan.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoMoviFinan"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoMoviFinan.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoMoviFinan"));

		this.jCheckBoxSeleccionadosTipoMoviFinan.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoMoviFinan"));
		
		if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxTiposAccionesFormularioTipoMoviFinan.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoMoviFinan"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoMoviFinan.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoMoviFinan"));
			
		this.jComboBoxTiposAccionesTipoMoviFinan.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoMoviFinan"));
					
		this.jComboBoxTiposSeleccionarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoMoviFinan"));
			
		this.jTextFieldValorCampoGeneralTipoMoviFinan.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoMoviFinan"));		
		
		
		if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonidTipoMoviFinanBusqueda.addActionListener(new ButtonActionListener(this,"idTipoMoviFinanBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonid_empresaTipoMoviFinanUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoMoviFinanUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonid_empresaTipoMoviFinanBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoMoviFinanBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtoncodigoTipoMoviFinanBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoMoviFinanBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonnombreTipoMoviFinanBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoMoviFinanBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoMoviFinan!=null) {
				this.jInternalFrameReporteDinamicoTipoMoviFinan.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoMoviFinan"));
				this.jInternalFrameReporteDinamicoTipoMoviFinan.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoMoviFinan"));
				this.jInternalFrameReporteDinamicoTipoMoviFinan.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoMoviFinan"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoMoviFinan.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoMoviFinan"));				
			//this.jButtonGenerarReporteDinamicoTipoMoviFinan.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoMoviFinan"));
			//this.jButtonGenerarExcelReporteDinamicoTipoMoviFinan.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoMoviFinan"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoMoviFinan!=null) {
				this.jInternalFrameImportacionTipoMoviFinan.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoMoviFinan"));
				this.jInternalFrameImportacionTipoMoviFinan.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoMoviFinan"));
				this.jInternalFrameImportacionTipoMoviFinan.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoMoviFinan"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoMoviFinan.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoMoviFinan"));
			
			this.jButtonAbrirOrderByToolBarTipoMoviFinan.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoMoviFinan"));			
			
			if(this.jInternalFrameOrderByTipoMoviFinan!=null) {
				this.jInternalFrameOrderByTipoMoviFinan.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoMoviFinan"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMoviFinan.jTabbedPaneRelacionesTipoMoviFinan.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoMoviFinan"));
		
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
            		closingInternalFrameTipoMoviFinan();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoMoviFinan.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoMoviFinan = (JInternalFrameBase)event.getSource();
	            	
	            TipoMoviFinanBeanSwingJInternalFrame jInternalFrameParent=(TipoMoviFinanBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoMoviFinan.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoMoviFinanActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoMoviFinan.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoMoviFinanListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoMoviFinan.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoMoviFinan.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMoviFinanActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMoviFinanActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMoviFinanActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoMoviFinan";
		inputMap = this.jButtonNuevoTipoMoviFinan.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoMoviFinan.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoMoviFinanActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMoviFinanActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMoviFinanActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMoviFinanActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoMoviFinan";
		inputMap = this.jButtonNuevoRelacionesTipoMoviFinan.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoMoviFinan.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoMoviFinanActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoMoviFinan";
		inputMap = this.jButtonModificarTipoMoviFinan.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoMoviFinan.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoMoviFinanActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoMoviFinan";
		inputMap = this.jButtonActualizarTipoMoviFinan.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoMoviFinan.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoMoviFinanActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoMoviFinan";
		inputMap = this.jButtonEliminarTipoMoviFinan.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoMoviFinan.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoMoviFinanActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoMoviFinan";
		inputMap = this.jButtonCancelarTipoMoviFinan.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoMoviFinan.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoMoviFinanActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoMoviFinan";
		inputMap = this.jButtonCerrarTipoMoviFinan.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoMoviFinan.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoMoviFinanActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonGuardarCambiosTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoMoviFinan";
		inputMap = this.jInternalFrameDetalleFormTipoMoviFinan.jButtonGuardarCambiosTipoMoviFinan.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonGuardarCambiosTipoMoviFinan.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoMoviFinanActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoMoviFinan.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoMoviFinanItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoMoviFinan.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoMoviFinanActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoMoviFinan.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoMoviFinanActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoMoviFinan.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoMoviFinanActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonidTipoMoviFinanBusqueda.addActionListener(new ButtonActionListener(this,"idTipoMoviFinanBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonid_empresaTipoMoviFinanUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoMoviFinanUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonid_empresaTipoMoviFinanBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoMoviFinanBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtoncodigoTipoMoviFinanBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoMoviFinanBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMoviFinan.jButtonnombreTipoMoviFinanBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoMoviFinanBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoMoviFinan.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoMoviFinanActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoMoviFinanActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoMoviFinan.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoMoviFinan(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoMoviFinan tipomovifinanAux:this.tipomovifinanLogic.getTipoMoviFinans()) {
					tipomovifinanAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMoviFinan tipomovifinanAux:tipomovifinans) {
					tipomovifinanAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoMoviFinanItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoMoviFinan(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoMoviFinan tipomovifinanAux:this.tipomovifinanLogic.getTipoMoviFinans()) {
						tipomovifinanAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoMoviFinan tipomovifinanAux:tipomovifinans) {
						tipomovifinanAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoMoviFinan tipomovifinanAux:this.tipomovifinanLogic.getTipoMoviFinans()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoMoviFinan tipomovifinanAux:tipomovifinans) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoMoviFinan(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoMoviFinan.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoMoviFinan.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoMoviFinan,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoMoviFinanItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoMoviFinan(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoMoviFinan.getSelectedRows();
			
			TipoMoviFinan tipomovifinanLocal=new TipoMoviFinan();
			
			//this.seleccionarTodosTipoMoviFinan(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomovifinanLocal =(TipoMoviFinan) this.tipomovifinanLogic.getTipoMoviFinans().toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipomovifinanLocal =(TipoMoviFinan) this.tipomovifinans.toArray()[this.jTableDatosTipoMoviFinan.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipomovifinanLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoMoviFinan tipomovifinanAux:this.tipomovifinanLogic.getTipoMoviFinans()) {
						tipomovifinanAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoMoviFinan tipomovifinanAux:tipomovifinans) {
						tipomovifinanAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoMoviFinan(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoMoviFinan.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoMoviFinan.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoMoviFinan,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoMoviFinanItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoMoviFinanParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoMoviFinanActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoMoviFinan(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoMoviFinan.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoMoviFinan tipomovifinanAux:this.tipomovifinanLogic.getTipoMoviFinans()) {
				
						if(sTipoSeleccionar.equals(TipoMoviFinanConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipomovifinanAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoMoviFinanConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipomovifinanAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMoviFinan tipomovifinanAux:tipomovifinans) {
					
						if(sTipoSeleccionar.equals(TipoMoviFinanConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipomovifinanAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoMoviFinanConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipomovifinanAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoMoviFinan(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoMoviFinanActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoMoviFinan(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoMoviFinan=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoMoviFinan.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxTiposAccionesFormularioTipoMoviFinan.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoMoviFinan) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoMoviFinan(conSplash);
				
					this.generarReporteTipoMoviFinansSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMoviFinan.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxTiposAccionesFormularioTipoMoviFinan.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoMoviFinansSeleccionados();
				//this.jComboBoxTiposAccionesTipoMoviFinan.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoMoviFinansSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoMoviFinan.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoMoviFinansSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoMoviFinan.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoMoviFinan();
				
				this.exportarTipoMoviFinansSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMoviFinan.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxTiposAccionesFormularioTipoMoviFinan.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoMoviFinans();
				//this.importarTipoMoviFinans();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMoviFinan.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxTiposAccionesFormularioTipoMoviFinan.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoMoviFinan();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoMoviFinansSeleccionados();
				//this.jComboBoxTiposAccionesTipoMoviFinan.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Movi Finan", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoMoviFinan();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoMoviFinan)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoMoviFinan(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Movi Finan",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMoviFinan.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxTiposAccionesFormularioTipoMoviFinan.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoMoviFinanBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoMoviFinan) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoMoviFinan(conSplash);
					
						//this.actualizarParametrosGeneralTipoMoviFinan();
						
						this.generarReporteProcesoAccionTipoMoviFinansSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoMoviFinan.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxTiposAccionesFormularioTipoMoviFinan.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoMoviFinanBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Movi FinanES SELECCIONADOS?", "MANTENIMIENTO DE Tipo Movi Finan", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoMoviFinan();
				
						this.actualizarParametrosGeneralTipoMoviFinan();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipomovifinanReturnGeneral=tipomovifinanLogic.procesarAccionTipoMoviFinansWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipomovifinanLogic.getTipoMoviFinans(),this.tipomovifinanParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoMoviFinanReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoMoviFinan.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxTiposAccionesFormularioTipoMoviFinan.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoMoviFinan();
					
					TipoMoviFinanBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoMoviFinanReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoMoviFinan.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxTiposAccionesFormularioTipoMoviFinan.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoMoviFinan(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoMoviFinanActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoMoviFinan();
			
			if(this.jInternalFrameDetalleFormTipoMoviFinan==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoMoviFinan> tipomovifinansSeleccionados=new ArrayList<TipoMoviFinan>();		
			TipoMoviFinan tipomovifinan=new TipoMoviFinan();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoMoviFinan(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoMoviFinan.getSelectedItem();
			
			
			
			
			tipomovifinansSeleccionados=this.getTipoMoviFinansSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipomovifinansSeleccionados.size()==1) {
				for(TipoMoviFinan tipomovifinanAux:tipomovifinansSeleccionados) {
					tipomovifinan=tipomovifinanAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Informacion Financiera")) {
					jButtonInformacionFinancieraActionPerformed(null,rowIndex,true,false,tipomovifinan);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoMoviFinan();
			
      		//this.finishProcessTipoMoviFinan(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoMoviFinanReturnGeneral() throws Exception {
		if(this.tipomovifinanReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipomovifinanReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipomovifinanReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipomovifinanReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipomovifinanReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipomovifinanReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoMoviFinan(false);
		}
		
		if(this.tipomovifinanReturnGeneral.getConRetornoLista() || this.tipomovifinanReturnGeneral.getConRetornoObjeto()) {
			if(this.tipomovifinanReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipomovifinanLogic.setTipoMoviFinans(this.tipomovifinanReturnGeneral.getTipoMoviFinans());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipomovifinanReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipomovifinanLogic.setTipoMoviFinan(this.tipomovifinanReturnGeneral.getTipoMoviFinan());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoMoviFinan(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoMoviFinan() throws Exception {
		
		
	}
	
	public ArrayList<TipoMoviFinan> getTipoMoviFinansSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoMoviFinan> tipomovifinansSeleccionados=new ArrayList<TipoMoviFinan>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoMoviFinan) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoMoviFinan tipomovifinanAux:tipomovifinanLogic.getTipoMoviFinans()) {
					if(tipomovifinanAux.getIsSelected()) {
						tipomovifinansSeleccionados.add(tipomovifinanAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMoviFinan tipomovifinanAux:this.tipomovifinans) {
					if(tipomovifinanAux.getIsSelected()) {
						tipomovifinansSeleccionados.add(tipomovifinanAux);				
					}
				}
			}
			
			if(tipomovifinansSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipomovifinansSeleccionados.addAll(this.tipomovifinanLogic.getTipoMoviFinans());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipomovifinansSeleccionados.addAll(this.tipomovifinans);				
					}
				}
			}
		} else {
			tipomovifinansSeleccionados.add(this.tipomovifinan);
		}
		
		return tipomovifinansSeleccionados;
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
	
	public void generarReporteTipoMoviFinansSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoMoviFinansSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoMoviFinansSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoMoviFinansSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoMoviFinansSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoMoviFinansSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Movi Finan",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoMoviFinansSeleccionados() throws Exception {
		ArrayList<TipoMoviFinan> tipomovifinansSeleccionados=new ArrayList<TipoMoviFinan>();		
		
		tipomovifinansSeleccionados=this.getTipoMoviFinansSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoMoviFinans("Todos",tipomovifinansSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoMoviFinansSeleccionados() throws Exception {
		ArrayList<TipoMoviFinan> tipomovifinansSeleccionados=new ArrayList<TipoMoviFinan>();		
		
		tipomovifinansSeleccionados=this.getTipoMoviFinansSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoMoviFinans("Todos",tipomovifinansSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoMoviFinansSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoMoviFinan> tipomovifinansSeleccionados=new ArrayList<TipoMoviFinan>();
		
		tipomovifinansSeleccionados=this.getTipoMoviFinansSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoMoviFinans("Todos",tipomovifinansSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoMoviFinansSeleccionados() throws Exception {
		ArrayList<TipoMoviFinan> tipomovifinansSeleccionados=new ArrayList<TipoMoviFinan>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoMoviFinan();
		
		
		tipomovifinansSeleccionados=this.getTipoMoviFinansSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoMoviFinan();
		
		
		//this.generarReporteTipoMoviFinans("Todos",tipomovifinansSeleccionados ,tipomovifinanImplementable,tipomovifinanImplementableHome);
	}
	
	public void mostrarImportacionTipoMoviFinans() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoMoviFinan();
		
		this.abrirFrameImportacionTipoMoviFinan();		
		
			
		//this.generarReporteTipoMoviFinans("Todos",tipomovifinansSeleccionados ,tipomovifinanImplementable,tipomovifinanImplementableHome);
	}
	
	public void importarTipoMoviFinans() throws Exception {		
	
	}
	
	public void exportarTipoMoviFinansSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoMoviFinansSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoMoviFinansSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoMoviFinansSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Movi Finan",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoMoviFinansSeleccionados() throws Exception {
		ArrayList<TipoMoviFinan> tipomovifinansSeleccionados=new ArrayList<TipoMoviFinan>();		
		
		tipomovifinansSeleccionados=this.getTipoMoviFinansSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovifinan."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoMoviFinan(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoMoviFinan tipomovifinanAux:tipomovifinansSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoMoviFinan(tipomovifinanAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipomovifinanAux.setsDetalleGeneralEntityReporte(tipomovifinanAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movi Finan",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoMoviFinan(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoMoviFinanConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMoviFinanConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMoviFinanConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMoviFinanConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMoviFinanConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoMoviFinan(TipoMoviFinan tipomovifinan,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipomovifinan.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomovifinan.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomovifinan.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomovifinan.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomovifinan.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoMoviFinansSeleccionados() throws Exception {
		ArrayList<TipoMoviFinan> tipomovifinansSeleccionados=new ArrayList<TipoMoviFinan>();		
		
		tipomovifinansSeleccionados=this.getTipoMoviFinansSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovifinan.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoMoviFinans");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoMoviFinan(row);				
				iRow++;
			}				
			
			for(TipoMoviFinan tipomovifinanAux:tipomovifinansSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoMoviFinan(tipomovifinanAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movi Finan",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoMoviFinansSeleccionados() throws Exception {
		ArrayList<TipoMoviFinan> tipomovifinansSeleccionados=new ArrayList<TipoMoviFinan>();		
		
		tipomovifinansSeleccionados=this.getTipoMoviFinansSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovifinan.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipomovifinans");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipomovifinan");
			//elementRoot.appendChild(element);
		
			for(TipoMoviFinan tipomovifinanAux:tipomovifinansSeleccionados) {
				element = document.createElement("tipomovifinan");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoMoviFinan(tipomovifinanAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movi Finan",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoMoviFinan(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMoviFinanConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMoviFinanConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoMoviFinanConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMoviFinanConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMoviFinanConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoMoviFinan(TipoMoviFinan tipomovifinan,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipomovifinan.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomovifinan.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomovifinan.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomovifinan.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoMoviFinan(TipoMoviFinan tipomovifinan,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoMoviFinanConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipomovifinan.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoMoviFinanConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipomovifinan.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoMoviFinanConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipomovifinan.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoMoviFinanConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipomovifinan.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoMoviFinanConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipomovifinan.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoMoviFinansSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoMoviFinan> tipomovifinansSeleccionados=new ArrayList<TipoMoviFinan>();
		
		tipomovifinansSeleccionados=this.getTipoMoviFinansSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoMoviFinan(tipomovifinansSeleccionados);
		
		this.generarReporteTipoMoviFinans("Todos",tipomovifinansSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoMoviFinan(ArrayList<TipoMoviFinan> tipomovifinansSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoMoviFinan tipomovifinanAux:tipomovifinansSeleccionados) {
				tipomovifinanAux.setsDetalleGeneralEntityReporte(tipomovifinanAux.toString());
			
				if(sTipoSeleccionar.equals(TipoMoviFinanConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipomovifinanAux.setsDescripcionGeneralEntityReporte1(tipomovifinanAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoMoviFinanConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipomovifinanAux.setsDescripcionGeneralEntityReporte1(tipomovifinanAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoMoviFinanConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipomovifinanAux.setsDescripcionGeneralEntityReporte1(tipomovifinanAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMoviFinanConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoMoviFinan(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoMoviFinan=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoMoviFinan=true;
				this.isVisibilidadCeldaGuardarCambiosTipoMoviFinan=true;
			}
			
			this.isVisibilidadCeldaModificarTipoMoviFinan=false;
			this.isVisibilidadCeldaActualizarTipoMoviFinan=false;
			this.isVisibilidadCeldaEliminarTipoMoviFinan=false;
			this.isVisibilidadCeldaCancelarTipoMoviFinan=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMoviFinan=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMoviFinan=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoMoviFinan=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMoviFinan=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMoviFinan=false;
			this.isVisibilidadCeldaModificarTipoMoviFinan=false;
			this.isVisibilidadCeldaActualizarTipoMoviFinan=true;
			this.isVisibilidadCeldaEliminarTipoMoviFinan=false;
			this.isVisibilidadCeldaCancelarTipoMoviFinan=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMoviFinan=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMoviFinan=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoMoviFinan=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMoviFinan=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMoviFinan=false;
			this.isVisibilidadCeldaModificarTipoMoviFinan=false;
			this.isVisibilidadCeldaActualizarTipoMoviFinan=true;
			this.isVisibilidadCeldaEliminarTipoMoviFinan=true;
			this.isVisibilidadCeldaCancelarTipoMoviFinan=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMoviFinan=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMoviFinan=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoMoviFinan=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMoviFinan=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMoviFinan=false;
			this.isVisibilidadCeldaModificarTipoMoviFinan=false;
			this.isVisibilidadCeldaActualizarTipoMoviFinan=true;
			this.isVisibilidadCeldaEliminarTipoMoviFinan=false;
			this.isVisibilidadCeldaCancelarTipoMoviFinan=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMoviFinan=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoMoviFinan=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoMoviFinan=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoMoviFinan=true;
			this.isVisibilidadCeldaGuardarCambiosTipoMoviFinan=true;
			this.isVisibilidadCeldaModificarTipoMoviFinan=false;
			this.isVisibilidadCeldaActualizarTipoMoviFinan=false;
			this.isVisibilidadCeldaEliminarTipoMoviFinan=false;
			this.isVisibilidadCeldaCancelarTipoMoviFinan=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMoviFinan=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMoviFinan=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoMoviFinan=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMoviFinan=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMoviFinan=false;
			this.isVisibilidadCeldaActualizarTipoMoviFinan=false;
			this.isVisibilidadCeldaEliminarTipoMoviFinan=false;
			this.isVisibilidadCeldaCancelarTipoMoviFinan=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMoviFinan=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoMoviFinan=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoMoviFinan=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMoviFinan=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMoviFinan=false;
			this.isVisibilidadCeldaModificarTipoMoviFinan=true;
			this.isVisibilidadCeldaActualizarTipoMoviFinan=false;
			this.isVisibilidadCeldaEliminarTipoMoviFinan=false;
			this.isVisibilidadCeldaCancelarTipoMoviFinan=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMoviFinan=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoMoviFinan=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoMoviFinanJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoMoviFinan=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoMoviFinan=true;
			this.isVisibilidadCeldaGuardarCambiosTipoMoviFinan=true;
		} else {
			this.actualizarEstadoPanelsTipoMoviFinan(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoMoviFinan=false;
			//this.isVisibilidadCeldaVerFormTipoMoviFinan=false;
			this.isVisibilidadCeldaDuplicarTipoMoviFinan=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipomovifinanSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoMoviFinan=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoMoviFinan=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMoviFinan=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipomovifinanSessionBean.getEsGuardarRelacionado()) {
			if(!tipomovifinanSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoMoviFinan=false;												
			}
			
			this.jButtonCerrarTipoMoviFinan.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoMoviFinan=false;
		}
		
		if(!this.permiteMantenimiento(this.tipomovifinan)) {
			this.isVisibilidadCeldaActualizarTipoMoviFinan=false;
			this.isVisibilidadCeldaEliminarTipoMoviFinan=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoMoviFinan() {
		this.isVisibilidadCeldaNuevoTipoMoviFinan=false;
		this.isVisibilidadCeldaGuardarCambiosTipoMoviFinan=false;
	}
	
	public void actualizarEstadoPanelsTipoMoviFinan(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoMoviFinan!=null) {
				this.jScrollPanelDatosEdicionTipoMoviFinan.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMoviFinan!=null) {
				this.jTabbedPaneBusquedasTipoMoviFinan.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMoviFinan!=null) {
				this.jScrollPanelDatosTipoMoviFinan.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMoviFinan!=null) {
				this.jPanelPaginacionTipoMoviFinan.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMoviFinan!=null) {
				this.jPanelParametrosReportesTipoMoviFinan.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoMoviFinan!=null) {
				this.jScrollPanelDatosEdicionTipoMoviFinan.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMoviFinan!=null) {
				this.jTabbedPaneBusquedasTipoMoviFinan.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoMoviFinan!=null) {
				this.jScrollPanelDatosTipoMoviFinan.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoMoviFinan!=null) {
				this.jPanelPaginacionTipoMoviFinan.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoMoviFinan!=null) {
				this.jPanelParametrosReportesTipoMoviFinan.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoMoviFinan!=null) {
				this.jScrollPanelDatosEdicionTipoMoviFinan.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMoviFinan!=null) {
				this.jTabbedPaneBusquedasTipoMoviFinan.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoMoviFinan!=null) {
				this.jScrollPanelDatosTipoMoviFinan.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoMoviFinan!=null) {
				this.jPanelPaginacionTipoMoviFinan.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoMoviFinan!=null) {
				this.jPanelParametrosReportesTipoMoviFinan.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoMoviFinan!=null) {
				this.jScrollPanelDatosEdicionTipoMoviFinan.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMoviFinan!=null) {
				this.jTabbedPaneBusquedasTipoMoviFinan.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoMoviFinan!=null) {
				this.jScrollPanelDatosTipoMoviFinan.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoMoviFinan!=null) {
				this.jPanelPaginacionTipoMoviFinan.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoMoviFinan!=null) {
				this.jPanelParametrosReportesTipoMoviFinan.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoMoviFinan!=null) {
				this.jScrollPanelDatosEdicionTipoMoviFinan.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMoviFinan!=null) {
				this.jTabbedPaneBusquedasTipoMoviFinan.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMoviFinan!=null) {
				this.jScrollPanelDatosTipoMoviFinan.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMoviFinan!=null) {
				this.jPanelPaginacionTipoMoviFinan.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMoviFinan!=null) {
				this.jPanelParametrosReportesTipoMoviFinan.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoMoviFinan!=null) {
				this.jScrollPanelDatosEdicionTipoMoviFinan.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMoviFinan!=null) {
				this.jTabbedPaneBusquedasTipoMoviFinan.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMoviFinan!=null) {
				this.jScrollPanelDatosTipoMoviFinan.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMoviFinan!=null) {
				this.jPanelPaginacionTipoMoviFinan.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMoviFinan!=null) {
				this.jPanelParametrosReportesTipoMoviFinan.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoMoviFinan!=null) {
				this.jScrollPanelDatosEdicionTipoMoviFinan.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMoviFinan!=null) {
				this.jTabbedPaneBusquedasTipoMoviFinan.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMoviFinan!=null) {
				this.jScrollPanelDatosTipoMoviFinan.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMoviFinan!=null) {
				this.jPanelPaginacionTipoMoviFinan.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMoviFinan!=null) {
				this.jPanelParametrosReportesTipoMoviFinan.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoMoviFinan!=null) {
					this.jTabbedPaneBusquedasTipoMoviFinan.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoMoviFinan!=null) {
				this.jPanelParametrosReportesTipoMoviFinan.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMoviFinan!=null) {
				this.jTabbedPaneBusquedasTipoMoviFinan.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoMoviFinan!=null) {
				this.jPanelParametrosReportesTipoMoviFinan.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoMoviFinanParaInformacionFinancieras() throws Exception {
		Boolean isPaginaPopupInformacionFinanciera=false;

		try {

			if(this.tipomovifinanSessionBean==null) {
				this.tipomovifinanSessionBean=new TipoMoviFinanSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraSessionBean==null) {
				this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraSessionBean=new InformacionFinancieraSessionBean();
			}

			this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraSessionBean.setsPathNavegacionActual(tipomovifinanSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupInformacionFinanciera=this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeInformacionFinanciera(false);
			this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeInformacionFinanciera(TipoMoviFinanConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraSessionBean.setisBusquedaDesdeForeignKeySesionTipoMoviFinan(true);
			this.jInternalFrameDetalleFormTipoMoviFinan.informacionfinancieraSessionBean.setlidTipoMoviFinanActual(this.idTipoMoviFinanActual);

			tipomovifinanSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoMoviFinan(true);
			tipomovifinanSessionBean.setlIdTipoMoviFinanActualForeignKey(this.idTipoMoviFinanActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoMoviFinanSessionBean tipomovifinanSessionBean=new TipoMoviFinanSessionBean();
		
		if(this.tipomovifinanSessionBean==null) {
			this.tipomovifinanSessionBean=new TipoMoviFinanSessionBean();
		}
		
		this.tipomovifinanSessionBean.setsUltimaBusquedaTipoMoviFinan(this.getsAccionBusqueda());
		this.tipomovifinanSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipomovifinanSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipomovifinanSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoMoviFinanSessionBean tipomovifinanSessionBean=new TipoMoviFinanSessionBean();
		
		if(this.tipomovifinanSessionBean==null) {
			this.tipomovifinanSessionBean=new TipoMoviFinanSessionBean();
		}
		
		if(this.tipomovifinanSessionBean.getsUltimaBusquedaTipoMoviFinan()!=null&&!this.tipomovifinanSessionBean.getsUltimaBusquedaTipoMoviFinan().equals("")) {
			this.setsAccionBusqueda(tipomovifinanSessionBean.getsUltimaBusquedaTipoMoviFinan());
			this.setiNumeroPaginacion(tipomovifinanSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipomovifinanSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipomovifinanSessionBean.getid_empresa());
				tipomovifinanSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipomovifinanSessionBean.setsUltimaBusquedaTipoMoviFinan("");
		this.tipomovifinanSessionBean.setiNumeroPaginacion(TipoMoviFinanConstantesFunciones.INUMEROPAGINACION);
		this.tipomovifinanSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoMoviFinan(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoMoviFinan() {
		this.updateBorderResaltarBusquedasFormularioTipoMoviFinan();
		this.updateVisibilidadBusquedasFormularioTipoMoviFinan();
		this.updateHabilitarBusquedasFormularioTipoMoviFinan();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoMoviFinan() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoMoviFinan.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoMoviFinan() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoMoviFinan.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoMoviFinan() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoMoviFinan.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoMoviFinan(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoMoviFinan.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoMoviFinan() throws Exception {

		if(this.jInternalFrameDetalleFormTipoMoviFinan==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoMoviFinan();
		this.updateVisibilidadResaltarControlesFormularioTipoMoviFinan();
		this.updateHabilitarResaltarControlesFormularioTipoMoviFinan();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoMoviFinan() throws Exception {
		if(this.jInternalFrameDetalleFormTipoMoviFinan==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipomovifinanConstantesFunciones.resaltaridTipoMoviFinan!=null && this.jInternalFrameDetalleFormTipoMoviFinan!=null) {this.jInternalFrameDetalleFormTipoMoviFinan.jLabelidTipoMoviFinan.setBorder(this.tipomovifinanConstantesFunciones.resaltaridTipoMoviFinan);}
		if(this.tipomovifinanConstantesFunciones.resaltarid_empresaTipoMoviFinan!=null && this.jInternalFrameDetalleFormTipoMoviFinan!=null) {this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxid_empresaTipoMoviFinan.setBorder(this.tipomovifinanConstantesFunciones.resaltarid_empresaTipoMoviFinan);}
		if(this.tipomovifinanConstantesFunciones.resaltarcodigoTipoMoviFinan!=null && this.jInternalFrameDetalleFormTipoMoviFinan!=null) {this.jInternalFrameDetalleFormTipoMoviFinan.jTextFieldcodigoTipoMoviFinan.setBorder(this.tipomovifinanConstantesFunciones.resaltarcodigoTipoMoviFinan);}
		if(this.tipomovifinanConstantesFunciones.resaltarnombreTipoMoviFinan!=null && this.jInternalFrameDetalleFormTipoMoviFinan!=null) {this.jInternalFrameDetalleFormTipoMoviFinan.jTextAreanombreTipoMoviFinan.setBorder(this.tipomovifinanConstantesFunciones.resaltarnombreTipoMoviFinan);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoMoviFinan() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoMoviFinan==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) {
	
		//this.jInternalFrameDetalleFormTipoMoviFinan.jLabelidTipoMoviFinan.setVisible(this.tipomovifinanConstantesFunciones.mostraridTipoMoviFinan);
		this.jInternalFrameDetalleFormTipoMoviFinan.jPanelidTipoMoviFinan.setVisible(this.tipomovifinanConstantesFunciones.mostraridTipoMoviFinan);
		//this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxid_empresaTipoMoviFinan.setVisible(this.tipomovifinanConstantesFunciones.mostrarid_empresaTipoMoviFinan);
		this.jInternalFrameDetalleFormTipoMoviFinan.jPanelid_empresaTipoMoviFinan.setVisible(this.tipomovifinanConstantesFunciones.mostrarid_empresaTipoMoviFinan);
		//this.jInternalFrameDetalleFormTipoMoviFinan.jTextFieldcodigoTipoMoviFinan.setVisible(this.tipomovifinanConstantesFunciones.mostrarcodigoTipoMoviFinan);
		this.jInternalFrameDetalleFormTipoMoviFinan.jPanelcodigoTipoMoviFinan.setVisible(this.tipomovifinanConstantesFunciones.mostrarcodigoTipoMoviFinan);
		//this.jInternalFrameDetalleFormTipoMoviFinan.jTextAreanombreTipoMoviFinan.setVisible(this.tipomovifinanConstantesFunciones.mostrarnombreTipoMoviFinan);
		this.jInternalFrameDetalleFormTipoMoviFinan.jPanelnombreTipoMoviFinan.setVisible(this.tipomovifinanConstantesFunciones.mostrarnombreTipoMoviFinan);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoMoviFinan() throws Exception {
		if(this.jInternalFrameDetalleFormTipoMoviFinan==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoMoviFinan!=null) {
	
		this.jInternalFrameDetalleFormTipoMoviFinan.jLabelidTipoMoviFinan.setEnabled(this.tipomovifinanConstantesFunciones.activaridTipoMoviFinan);
		this.jInternalFrameDetalleFormTipoMoviFinan.jComboBoxid_empresaTipoMoviFinan.setEnabled(this.tipomovifinanConstantesFunciones.activarid_empresaTipoMoviFinan);
		this.jInternalFrameDetalleFormTipoMoviFinan.jTextFieldcodigoTipoMoviFinan.setEnabled(this.tipomovifinanConstantesFunciones.activarcodigoTipoMoviFinan);
		this.jInternalFrameDetalleFormTipoMoviFinan.jTextAreanombreTipoMoviFinan.setEnabled(this.tipomovifinanConstantesFunciones.activarnombreTipoMoviFinan);
		}
	}
	
		
}